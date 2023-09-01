create database bd_programa_tv;
use bd_programa_tv;

create table tipo(
id_tipo int not null auto_increment primary key, 
nome varchar(60)
);

create table pais(
id_pais int not null auto_increment,
nome varchar(60),
primary key(id_pais)
);

create table ator(
id_ator int not null auto_increment,
nome varchar(60),
fk_id_pais int,
primary key(id_ator),
foreign key (fk_id_pais) references pais(id_pais) on update cascade on delete restrict
);

create table programatv(
id_programa int not null auto_increment,
titulo varchar(60),
ano year,
fk_id_tipo int not null,
primary key (id_programa),
foreign key (fk_id_tipo) references tipo(id_tipo) on update cascade on delete restrict
);

create table pro_elenco(
chk_ator boolean,
chk_diretor boolean,
fk_id_programa int not null,
fk_id_ator int not null,
primary key (fk_id_programa,fk_id_ator),
foreign key (fk_id_programa) references programatv(id_programa) on update cascade on delete cascade,
foreign key (fk_id_ator) references ator(id_ator) on update cascade on delete cascade
);

create table genero(
id_genero int not null auto_increment primary key,
nome varchar(60)
);

create table plataforma(
id_plataforma int not null auto_increment primary key,
nome varchar(60)
);

create table contatos(
id_contato int not null auto_increment primary key,
nome varchar(60),
email varchar(60),
senha varchar(15)
);

create table prog_informacoes(
id_prog_inf int not null auto_increment primary key,
titulo varchar(60),
sinopse text,
fk_id_programa int not null,
fk_id_pais int,
foreign key (fk_id_programa) references programatv(id_programa) on update cascade on delete cascade,
foreign key (fk_id_pais) references pais(id_pais) on update cascade on delete cascade
);

create table avaliacao(
nota decimal (15,2),
fk_id_contato int not null,
fk_id_programa int not null,
primary key(fk_id_contato, fk_id_programa),
foreign key (fk_id_programa) references programatv(id_programa) on update cascade on delete cascade,
foreign key (fk_id_contato) references contatos(id_contato) on update cascade on delete cascade
);

create table prog_genero(
fk_id_programa int not null,
fk_id_genero int not null,
primary key (fk_id_programa, fk_id_genero),
foreign key (fk_id_programa) references programatv(id_programa) on update cascade on delete cascade,
foreign key (fk_id_genero) references genero(id_genero) on update cascade on delete cascade
);



