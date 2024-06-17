CREATE TABLE  IF NOT EXISTS address(
    id INTEGER NOT NULL PRIMARY KEY,
    cep VARCHAR(255)  NOT NULL ,
    city VARCHAR(255)  NOT NULL,
    state VARCHAR(255)  NOT NULL,
    neighborhood VARCHAR(255)  NOT NULL,
    road VARCHAR(255) NOT NULL,
    number INTEGER
    );

CREATE TABLE IF NOT EXISTS users(
    id INTEGER NOT NULL PRIMARY KEY,
    email VARCHAR(255) NOT NULL,
    fone VARCHAR(255) NOT NULL,
    name VARCHAR(255) NOT NULL ,
    password VARCHAR(255) NOT NULL,
    cpf VARCHAR(255) NOT NULL,
    role smallint
    );

INSERT INTO address(id,cep,city,state,neighborhood,road,number
)VALUES (1,'55555-000','TEST','TEST','TEST TEST','test',123);

INSERT INTO users( id,email,fone, name, password, cpf, role)
VALUES (1,'admin@admin.com','83999999999','admin',
        '$2a$10$itNNzHsSahZpTVJBoDr3eeJGqp8290sBdBp7c3/Cc9mNlYVavoiP2','0000000000',1);