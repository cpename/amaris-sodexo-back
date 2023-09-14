DROP TABLE IF EXISTS usuario;
DROP SEQUENCE IF EXISTS usuario_id_seq;


CREATE TABLE usuario(
  usuario_id INT AUTO_INCREMENT PRIMARY KEY,
  nombre VARCHAR(50) NOT NULL,
  apellido VARCHAR(50) NOT NUll,
  telefono INT,
  fecha_create TIMESTAMP, 
  fecha_update  TIMESTAMP,
  cod_comuna VARCHAR(25)  
);


