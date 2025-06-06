DROP TABLE tb_avaliacao;
DROP TABLE tb_pedido;
DROP TABLE tb_motoboy;
DROP TABLE tb_cliente;
DROP TABLE tb_colaborador;
DROP TABLE tb_pessoa;
DROP TABLE tb_campanha;

CREATE TABLE IF NOT EXISTS tb_pessoa (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(50) NOT NULL,
    cpf VARCHAR(11) NOT NULL,
    telefone VARCHAR(11) NOT NULL,
    createdAt TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE IF NOT EXISTS tb_colaborador (
    id SERIAL PRIMARY KEY,
    cargo VARCHAR(50) NOT NULL,
    id_pessoa INTEGER NOT NULL,
    FOREIGN KEY (id_pessoa) REFERENCES tb_pessoa (id)
);

CREATE TABLE IF NOT EXISTS tb_cliente (
    id SERIAL PRIMARY KEY,
    endereco VARCHAR(50) NOT NULL,
    id_pessoa INTEGER NOT NULL,
    FOREIGN KEY (id_pessoa) REFERENCES tb_pessoa (id)
);

CREATE TABLE IF NOT EXISTS tb_motoboy (
    id SERIAL PRIMARY KEY,
    id_pessoa INTEGER NOT NULL,
    placa_moto VARCHAR(7) NOT NULL,
    modelo_moto VARCHAR(20),
    marca_moto VARCHAR(20),
    cor_moto VARCHAR(20) NOT NULL,
    FOREIGN KEY (id_pessoa) REFERENCES tb_pessoa (id)
);

CREATE TABLE IF NOT EXISTS tb_campanha (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(50) NOT NULL,
    dt_inicio INTEGER NOT NULL,
    dt_fim INTEGER NOT NULL,
    midia_comunicacao INTEGER NOT NULL
);

CREATE TABLE IF NOT EXISTS tb_pedido (
    id SERIAL PRIMARY KEY,
    descricao VARCHAR(150),
    id_cliente INTEGER NOT NULL,
    id_colaborador INTEGER NOT NULL,
    id_motoboy INTEGER NOT NULL,
    id_campanha INTEGER,
    dt_pedido TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (id_cliente) REFERENCES tb_cliente (id),
    FOREIGN KEY (id_colaborador) REFERENCES tb_colaborador (id),
    FOREIGN KEY (id_motoboy) REFERENCES tb_motoboy (id),
    FOREIGN KEY (id_campanha) REFERENCES tb_campanha (id)
);

CREATE TABLE IF NOT EXISTS tb_avaliacao (
    id SERIAL PRIMARY KEY,
    id_pedido INTEGER NOT NULL,
    avaliador INTEGER NOT NULL,
    avaliado INTEGER NOT NULL,
    nota INTEGER NOT NULL,
    comentario VARCHAR(150),
    FOREIGN KEY (id_pedido) REFERENCES tb_cliente (id),
    FOREIGN KEY (avaliador) REFERENCES tb_pessoa (id),
    FOREIGN KEY (avaliado) REFERENCES tb_pessoa (id)
);

SELECT * FROM tb_avaliacao;
SELECT * FROM tb_pedido;
SELECT * FROM tb_motoboy;
SELECT * FROM tb_cliente;
SELECT * FROM tb_colaborador;
SELECT * FROM tb_pessoa;
SELECT * FROM tb_campanha;

INSERT INTO	tb_pessoa (nome, cpf, telefone) VALUES('Lucas Pereira', '67291580432', '56382917402');
INSERT INTO	tb_pessoa (nome, cpf, telefone) VALUES('Mariana Silva', '91028473651', '28475910236');
INSERT INTO	tb_pessoa (nome, cpf, telefone) VALUES('Rafael Costa', '56382917402', '34829105743');
INSERT INTO	tb_pessoa (nome, cpf, telefone) VALUES('Bianca Rocha', '71938462015', '67291580432');
INSERT INTO	tb_pessoa (nome, cpf, telefone) VALUES('André Lima', '12548930674', '30817629450');
INSERT INTO	tb_pessoa (nome, cpf, telefone) VALUES('Camila Fernandes', '34829105743', '95172860314');
INSERT INTO	tb_pessoa (nome, cpf, telefone) VALUES('Bruno Oliveira', '28475910236', '84029376158');
INSERT INTO	tb_pessoa (nome, cpf, telefone) VALUES('Juliana Souza', '95172860314', '71938462015');
INSERT INTO	tb_pessoa (nome, cpf, telefone) VALUES('Felipe Almeida', '84029376158', '91028473651');
INSERT INTO	tb_pessoa (nome, cpf, telefone) VALUES('Larissa Ribeiro', '30817629450', '12548930674');

INSERT INTO	tb_colaborador (cargo, id_cliente) VALUES('Atendente', 5);
INSERT INTO	tb_colaborador (cargo, id_cliente) VALUES('Atendente', 7);
INSERT INTO	tb_colaborador (cargo, id_cliente) VALUES('Atendente', 2);

INSERT INTO	tb_cliente (endereco, id_pessoa) VALUES('Rua A, 174', 8);
INSERT INTO	tb_cliente (endereco, id_pessoa) VALUES('Rua B, 134', 9);
INSERT INTO	tb_cliente (endereco, id_pessoa) VALUES('Rua C, 567', 1);
INSERT INTO	tb_cliente (endereco, id_pessoa) VALUES('Rua D, 93', 4);

INSERT INTO	tb_motoboy (placa_moto,	modelo_moto,marca_moto,	cor_moto,id_pessoa) VALUES('AJD2E35', 'FZ25', 'yamaha', 'azul', 3);
INSERT INTO	tb_motoboy (placa_moto,	modelo_moto,marca_moto,	cor_moto,id_pessoa) VALUES('ORJ7A58', 'CB300', 'honda', 'cinza', 6);
INSERT INTO	tb_motoboy (placa_moto,	modelo_moto,marca_moto,	cor_moto,id_pessoa) VALUES('SLE6B23', 'CB160', 'honda', 'vermelha', 10);

INSERT INTO	tb_campanha (nome, dt_inicio, dt_fim, midia_comunicacao) VALUES();

INSERT INTO	tb_pedido (	descricao,	id_cliente,	id_colaborador,	id_motoboy,	id_campanha,dt_pedido) VALUES();

INSERT INTO	tb_avaliacao (id_pedido, avaliador, avaliado, nota, comentario)VALUES();