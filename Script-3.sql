SELECT id_radicado, fecha_radicado, estado_radicado, tipo_radicado, comentario, anexos, justificacion, id_user
FROM pqrs_database.radicado;





create table pruebaT.Artistas(
id int  primary key auto_increment,
tipo_ide varchar(5),
numero_ide varchar(20),
nombres varchar(30),
apellido varchar(30)

);


create table  pruebaT.Obras(
id int primary key auto_increment,
nombre varchar (20),
pais varchar (30),
id_artista int
);

create table  pruebaT.Museos_x_obras(
id_museo int,
id_obra int
);


create table  pruebaT.Museos(
id int primary key auto_increment,
nombre varchar (30),
pais varchar(30),
ciudad varchar(30),
direccion varchar(30)
);


alter table pruebaT.obras  add constraint obras_artista_fk foreign key (id_artista) references pruebaT.artistas(id);
alter table pruebaT.Museos_x_obras  add constraint obras_Museos_x_obras_fk foreign key (id_obra) references pruebaT.obras(id);
alter table pruebaT.Museos_x_obras  add constraint museos_Museos_x_obras_fk foreign key (id_museo) references pruebaT.museos(id);

select * from pruebaT.artistas; 
select * from pruebaT.obras;
select * from pruebaT.museos;
select * from pruebaT.Museos_x_obras;


INSERT INTO pruebat.artistas
(tipo_ide, numero_ide, nombres, apellido)
VALUES('cc', '12344', 'Fernando', 'Lopez');


INSERT INTO pruebat.artistas
(tipo_ide, numero_ide, nombres, apellido)
VALUES('cc', '32455', 'Camila', 'Velez');

INSERT INTO pruebat.museos
(nombre, pais, ciudad, direccion)
VALUES('Oro', 'Colombia', 'Bogota', 'Carrera 5');

INSERT INTO pruebat.museos
(nombre, pais, ciudad, direccion)
VALUES('Neon', 'Colombia', 'Medellin', 'Barrio new Esperanza')


INSERT INTO pruebat.museos
(nombre, pais, ciudad, direccion)
VALUES('Nexus', 'Colombia', 'Medellin', 'Carrera 6')

INSERT INTO pruebat.museos
(nombre, pais, ciudad, direccion)
VALUES('Norte', 'Colombia', 'Medellin', 'Calle 24')

INSERT INTO pruebat.museos
(nombre, pais, ciudad, direccion)
VALUES('Nariño', 'Colombia', 'Medellin', 'Barrio Coliceo')

INSERT INTO pruebat.museos
(nombre, pais, ciudad, direccion)
VALUES('Londres Museo', 'Colombia', 'Barranquilla', 'Area Metropolitana')



INSERT INTO pruebat.museos
(nombre, pais, ciudad, direccion)
VALUES('Botero', 'Peru', 'Lima', 'Carrera 23')

INSERT INTO pruebat.obras
(nombre, pais, id_artista)
VALUES('Nature', 'Colombia', 1);

INSERT INTO pruebat.obras
(nombre, pais, id_artista)
VALUES('Muerte anunciada', 'Colombia', 1);


INSERT INTO pruebat.museos_x_obras
(id_museo, id_obra)
VALUES(1, 1);


INSERT INTO pruebat.museos_x_obras
(id_museo, id_obra)
VALUES(2, 2);



##Consultas para los servicio

select id_artista ,nombres,nombre, pais from pruebat.obras o,pruebat.artistas a
where a.id=1 and o.pais = 'Colombia';

select   id_artista ,nombres,nombre, pais from pruebat.obras o ,pruebat.artistas a
where a.id=1 and o.pais = 'Colombia'
and o.id_artista =a.id ;

select  nombre from pruebat.obras o ,pruebat.artistas a
where a.id=1 and o.pais = 'Colombia'
and o.id_artista =a.id ;

###Este es
select  nombre from pruebat.obras o ,pruebat.artistas a
where (o.id_artista =a.id)
and (a.id=1 and o.pais = 'Colombia');

select  * from pruebat.obras o
where o.id_artista like 1  and o.pais like 'Colombia';

select id,nombre ciudad from pruebaT.museos m
where m.ciudad="Medellin" and m.nombre like 'L%';


select nombre ciudad from pruebaT.museos m
where m.ciudad="Medellin" ;

select * from pruebaT.museos;
select * from pruebaT.obras;
