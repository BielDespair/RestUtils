CREATE TABLE users (
    user_id  BIGSERIAL PRIMARY KEY,
    username VARCHAR(50)  NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL,
    enabled  BOOLEAN DEFAULT true
);

CREATE TABLE roles (
    role_id BIGSERIAL PRIMARY KEY,
    name    VARCHAR(50) NOT NULL UNIQUE
);

CREATE TABLE user_roles (
    user_id BIGINT NOT NULL,
    role_id BIGINT NOT NULL,
    PRIMARY KEY (user_id, role_id),
    FOREIGN KEY (user_id) REFERENCES users (user_id) ON DELETE CASCADE,
    FOREIGN KEY (role_id) REFERENCES roles (role_id) ON DELETE CASCADE
);

CREATE TABLE enderecos (
    cep         VARCHAR(20) PRIMARY KEY,
    logradouro  varchar(255),
    complemento varchar(255),
    unidade     varchar(50),
    bairro      varchar(100),
    localidade  varchar(100),
    uf          varchar(2),
    estado      varchar(100),
    regiao      varchar(100),
    ibge        varchar(20),
    gia         varchar(20),
    ddd         varchar(5),
    siafi       varchar(20)
);
