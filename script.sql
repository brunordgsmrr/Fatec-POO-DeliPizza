DROP TABLE IF EXISTS tb_avaliacoes;
DROP TABLE IF EXISTS tb_pedido;
DROP TABLE IF EXISTS tb_pizzaria;
DROP TABLE IF EXISTS tb_motoboy;
DROP TABLE IF EXISTS tb_cliente;

CREATE TABLE IF NOT EXISTS tb_cliente (
	id SERIAL PRIMARY KEY,
	nome VARCHAR(50) NOT NULL,
	cpf VARCHAR(11) NOT NULL,
	telefone VARCHAR(11) NOT NULL,
	endereco VARCHAR(50) NOT NULL
);

CREATE TABLE IF NOT EXISTS tb_motoboy (
	id SERIAL PRIMARY KEY,
	nome VARCHAR(50) NOT NULL,
	cpf VARCHAR(11) NOT NULL,
	telefone VARCHAR(11) NOT NULL,
	placa_moto VARCHAR(7) NOT NULL,
	marca_moto VARCHAR(15) NOT NULL,
	modelo_moto VARCHAR(15) NOT NULL,
	cor_moto VARCHAR(15) NOT NULL
);


CREATE TABLE IF NOT EXISTS tb_pizzaria(
	id SERIAL PRIMARY KEY,
	nome VARCHAR(50) NOT NULL,
	telefone VARCHAR(11) NOT NULL
);

CREATE TABLE IF NOT EXISTS tb_pedido(
	id SERIAL PRIMARY KEY,
	descricao VARCHAR(50) NOT NULL,
	cliente_id INTEGER NOT NULL,
	motoboy_id INTEGER NOT NULL,
	dt_pedido DATE DEFAULT CURRENT_TIMESTAMP,
	FOREIGN KEY (cliente_id) REFERENCES tb_cliente(id),
	FOREIGN KEY (motoboy_id) REFERENCES tb_motoboy(id)	
);



CREATE TABLE IF NOT EXISTS tb_avaliacoes(
	id SERIAL PRIMARY KEY,
	pedido_id INTEGER NOT NULL,
	avaliador VARCHAR(15) NOT NULL,
	avaliador_id INTEGER NOT NULL,
	avaliado VARCHAR(15) NOT NULL,
	avaliado_id INTEGER NOT NULL,
	nota INTEGER NOT NULL,
	comentario VARCHAR(100) NOT NULL,
	FOREIGN KEY (pedido_id) REFERENCES tb_pedido(id)
);

INSERT INTO tb_cliente(nome, cpf, telefone, endereco) VALUES ('Bruno', '12345678901', '11987654321', 'Rua A, 123');
INSERT INTO tb_cliente(nome, cpf, telefone, endereco) VALUES ('Ana', '12365498778', '11911223344', 'Rua B, 456');
INSERT INTO tb_cliente(nome, cpf, telefone, endereco) VALUES ('Alan', '54672648215', '11922665544', 'Rua C, 789');

INSERT INTO tb_motoboy(nome, cpf, telefone, placa_moto, marca_moto, modelo_moto, cor_moto) VALUES ('Carlos', '98765432100', '11999887766', 'ABC1234', 'Honda', 'CB500', 'Preto');
INSERT INTO tb_motoboy(nome, cpf, telefone, placa_moto, marca_moto, modelo_moto, cor_moto) VALUES ('Fernanda', '87654321009', '11988776655', 'XYZ5678', 'Yamaha', 'MT-03', 'Azul');
INSERT INTO tb_motoboy(nome, cpf, telefone, placa_moto, marca_moto, modelo_moto, cor_moto) VALUES ('Leticia', '76543210998', 'LMN9012', 'Suzuki', 'GSX-R150', 'Vermelho');

INSERT INTO tb_pizzaria(nome, telefone) VALUES ('DeliPizza', '11912345678');

INSERT INTO tb_pedido(descricao, cliente_id, motoboy_id) VALUES ('Pizza Margherita', 1, 1);
INSERT INTO tb_pedido(descricao, cliente_id, motoboy_id) VALUES ('Pizza Pepperoni', 2, 2);
INSERT INTO tb_pedido(descricao, cliente_id, motoboy_id) VALUES ('Pizza Pepperoni', 1, 2);
INSERT INTO tb_pedido(descricao, cliente_id, motoboy_id) VALUES ('Pizza Quatro Queijos', 3, 3);

INSERT INTO tb_avaliacoes(pedido_id, avaliador, avaliador_id, avaliado, avaliado_id, nota, comentario) VALUES (1, 'Cliente', 1, 'Motoboy', 1, 5, 'Entrega rápida e pizza deliciosa!');
INSERT INTO tb_avaliacoes(pedido_id, avaliador, avaliador_id, avaliado, avaliado_id, nota, comentario) VALUES (2, 'Cliente', 2, 'Motoboy', 2, 4, 'Boa entrega, mas a pizza estava fria.');
INSERT INTO tb_avaliacoes(pedido_id, avaliador, avaliador_id, avaliado, avaliado_id, nota, comentario) VALUES (3, 'Cliente', 1, 'Motoboy', 2, 3, 'Entrega ok, mas a pizza demorou um pouco.');


SELECT * FROM tb_motoboy;

