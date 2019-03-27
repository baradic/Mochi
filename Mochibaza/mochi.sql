drop database if exists spotif;
create database spotif character set utf8 collate utf8_general_ci;
use spotif;


create table izvodac(
sifra int not null primary key auto_increment,
ime varchar (50) not null,
info varchar (100)
);

create table pjesma(
sifra		 	int not null primary key auto_increment,
naziv 			varchar(70) not null,
zanr 			int not null,
godinaizdanja 	varchar(10) not null,
info 			varchar (250) not null
);

create table izvodac_pjesma(
sifra int not null primary key auto_increment,
izvodac int not null,
pjesma int not null
);


create table zanr (
sifra 	int not null primary key auto_increment,
vrsta 	varchar(50) not null
);

create table lista_pov(
sifra int not null primary key auto_increment,
pjesma int not null,
izvor int not null,
vrijeme datetime not null
);

create table izvor(
sifra int not null primary key auto_increment,
naziv varchar(50) not null,
);


alter table izvodac_pjesma add foreign key (izvodac) references izvodac(sifra);
alter table izvodac_pjesma add foreign key (pjesma) references pjesma(sifra);
alter table pjesma add foreign key (zanr) references zanr(sifra);
alter table pjesma add foreign key (izvodac) references izvodac(sifra);
alter table lista_pov add foreign key (pjesma) references pjesma(sifra);
alter table lista_pov add foreign key (izvor) references izvor(sifra);
