drop schema if exists Product cascade;
create schema if not exists Product;

CREATE TABLE Product.phone (
                           Id SERIAL PRIMARY KEY,
                           Company varchar(50) NOT NULL,
                           Model VARCHAR(50) NOT NULL,
                           Price int NOT NULL
);