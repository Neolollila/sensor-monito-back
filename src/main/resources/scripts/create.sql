CREATE TABLE users (
                       id SERIAL PRIMARY KEY ,
                       user_name VARCHAR(64) NOT NULL UNIQUE ,
                       password VARCHAR(64) ,
                       email VARCHAR(64) NOT NULL UNIQUE
);

ALTER SEQUENCE users_id_seq RESTART WITH 3;

CREATE TABLE sensor (
                       id SERIAL PRIMARY KEY ,
                       name VARCHAR(64) NOT NULL ,
                       model VARCHAR(64) NOT NULL ,
                       range_from BIGINT ,
                       range_to BIGINT ,
                       type VARCHAR(64) NOT NULL ,
                       unit VARCHAR(64) NOT NULL ,
                       location VARCHAR(64) ,
                       description VARCHAR(64)
);

ALTER SEQUENCE sensor_id_seq RESTART WITH 10;

CREATE TABLE type (
                       id SERIAL PRIMARY KEY ,
                       name VARCHAR(64) NOT NULL UNIQUE
);

CREATE TABLE unit (
                      id SERIAL PRIMARY KEY ,
                      name VARCHAR(64) NOT NULL UNIQUE
);

CREATE TABLE roles (
                       id SERIAL PRIMARY KEY ,
                       name VARCHAR(64) NOT NULL UNIQUE
);

CREATE TABLE user_roles (
    users_id BIGINT NOT NULL ,
    roles_id BIGINT NOT NULL ,
    FOREIGN KEY (users_id) REFERENCES users(id),
    FOREIGN KEY (roles_id) REFERENCES roles(id),
    PRIMARY KEY (users_id, roles_id)
);