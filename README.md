# crud
Prueba4


CREATE TABLE rol
(
id_Rol int primary key,--Para poder crear la llave foránea
nombre varchar(50),
);


CREATE TABLE usuario
(
id_Usuario,
id_Rol int,
nombre varchar(50),
activo char(20),
CONSTRAINT fk_idRol FOREIGN KEY (id_Rol) REFERENCES dbo.rol(id_Rol)
);

--El ID usado fue eclipse
-- Se creó un controller rest que se encarga de las request

insert into USUARIO(id_Usuario, activo, id_Rol, nombre)
values ('3', 'Si', 2, 'asdf');

--Para añadir json elaborado
{
    "id_Usuario":1,
    "activo": 13,
    "id_Rol":2,
    "nombre":"gilbert"
}

{
    "id_Usuario":2,
    "activo": 13,
    "id_Rol":1,
    "nombre":"laura"
}

{
    "id_Usuario":3,
    "activo": 14,
    "id_Rol":3,
    "nombre":"jaimitoelcarterito"
}

--base de datos 
--http://localhost:8085/h2-console/login.do?jsessionid=c20114de8a0e9eb9f27198691f341e32
--Repo backend: https://github.com/gilbertrendon/crud
--Repo frontend: https://github.com/gilbertrendon/crudui

--Para crear en src/app un componente para usuario ng g c appusuario

--esto va en el usuariolist.component.ts::::::::::: //import {Usuario} from '../usuario';
--import {Router} from '@angular/router';


--PARA CREAR LOS TRES REGISTROS EN LA TABLA ROL
insert into ROL(id_Rol, nombre)
values (1, 'ADMINISTRADOR'),
	   (2, 'AUDITOR'),
	   (3, 'AUXILIAR');







