drop table if exists phone;
create table if not exists phone;

CREATE TABLE phone (
                           Id SERIAL PRIMARY KEY,
                           Company varchar(50) NOT NULL,
                           Model VARCHAR(50) NOT NULL,
                           Price int NOT NULL
);