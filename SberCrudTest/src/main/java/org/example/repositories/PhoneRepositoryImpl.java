package org.example.repositories;

import org.example.models.Phone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.List;

@Component("jdbcTemplateRepository")
public class PhoneRepositoryImpl implements PhoneCrudRepository{
    private NamedParameterJdbcTemplate jdbcTemplate;

    @Autowired
    public PhoneRepositoryImpl(@Qualifier("driverManagerDataSource")DataSource dataSource) {
        this.jdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }


    @Override
    public Phone findById(Long id) {
        Phone phone =jdbcTemplate.query("SELECT * FROM phone WHERE id=:id",
                new MapSqlParameterSource().addValue("id", id),
                new BeanPropertyRowMapper<>(Phone.class)).stream().findFirst().orElse(null);
        return phone;
    }

    @Override
    public List<Phone> findAll() {
        List<Phone> phones = jdbcTemplate.query("SELECT * FROM phone",
                new BeanPropertyRowMapper<>(Phone.class));
        return phones.isEmpty() ? null : phones;

    }

    @Override
    public void save(Phone entity) {
        jdbcTemplate.update("INSERT INTO phone(id, company, model, price) VALUES (:id, :company, :model, :price)",
        new MapSqlParameterSource()
                .addValue("id",entity.getId())
                .addValue("company", entity.getCompany())
                .addValue("model", entity.getModel())
                .addValue("price", entity.getPrice()));

    }

    @Override
    public void update(Phone entity) {
        jdbcTemplate.update("UPDATE phone SET company = :company, model = :model, price = :price WHERE id = :id",
                new MapSqlParameterSource()
                        .addValue("company", entity.getCompany())
                        .addValue("model", entity.getModel())
                        .addValue("price", entity.getPrice())
                        .addValue("id",entity.getId()));

    }

    @Override
    public void delete(Long id) {
        jdbcTemplate.update("DELETE FROM phone WHERE id = :id",
                new MapSqlParameterSource().addValue("id", id));

    }
}
