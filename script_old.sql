SELECT *
FROM pg_catalog.pg_tables
WHERE schemaname != 'pg_catalog' AND
    schemaname != 'information_schema';

SELECT column_name, data_type, character_maximum_length
FROM INFORMATION_SCHEMA.COLUMNS 
WHERE table_name = 'tb_pessoa';

SELECT column_name, data_type, character_maximum_length
FROM INFORMATION_SCHEMA.COLUMNS 
WHERE table_name = 'tb_colaborador';

SELECT column_name, data_type, character_maximum_length
FROM INFORMATION_SCHEMA.COLUMNS 
WHERE table_name = 'tb_cliente';

SELECT column_name, data_type, character_maximum_length
FROM INFORMATION_SCHEMA.COLUMNS 
WHERE table_name = 'tb_motoboy';

SELECT column_name, data_type, character_maximum_length
FROM INFORMATION_SCHEMA.COLUMNS 
WHERE table_name = 'tb_pedido';

SELECT column_name, data_type, character_maximum_length
FROM INFORMATION_SCHEMA.COLUMNS 
WHERE table_name = 'tb_campanha';

SELECT column_name, data_type, character_maximum_length
FROM INFORMATION_SCHEMA.COLUMNS 
WHERE table_name = 'tb_avaliacao';
