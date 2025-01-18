create table respuestas(

    id bigint not null auto_increment,
    mensaje varchar(200) not null,
    fechaCreacion datetime not null,
    autor_id bigint not null,
    solucion varchar(200) not null,

    primary key(id),
    constraint fk_respuestas_usuario_id foreign key(autor_id) references usuarios(id)

);