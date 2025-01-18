create table usuarios(

    id bigint not null auto_increment,
    nombre varchar(100) not null,
    correo_electronico varchar(100) not null,
    password varchar(8) not null,
    perfil_id bigint not null,

    primary key(id),
    constraint fk_usuario_perfil_id foreign key(perfil_id) references perfiles(id)

);