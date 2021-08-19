DROP TABLE IF EXISTS articulos;
DROP table IF EXISTS fabricantes;


CREATE TABLE `fabricantes` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
);

CREATE TABLE `articulos` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(100) DEFAULT NULL,
  `precio` int(11) DEFAULT NULL,
  `fab_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `articulos_fk` FOREIGN KEY (`fab_id`) REFERENCES `fabricantes` (`id`)
);


insert into fabricantes (nombre)values('Jhon');
insert into fabricantes (nombre)values('Kevin');
insert into fabricantes (nombre)values('Pedro');
insert into fabricantes (nombre)values('Richi');
insert into fabricantes (nombre)values('Sofia');

insert into articulos (nombre, precio,fab_id) values ('Art1',100,1);
insert into articulos (nombre, precio,fab_id) values ('Art2',140,2);
insert into articulos (nombre, precio,fab_id) values ('Art3',130,3);
insert into articulos (nombre, precio,fab_id) values ('Art4',106,4);
insert into articulos (nombre, precio,fab_id) values ('Art5',200,5);