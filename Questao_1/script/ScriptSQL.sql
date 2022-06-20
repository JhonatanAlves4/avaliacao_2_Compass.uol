create database questao1;
use questao1;

create table produto(
	id int auto_increment not null primary key,
    nome varchar(100) not null,
    descricao varchar(150) not null,
    quantidade int not null,
    preco float not null
);
