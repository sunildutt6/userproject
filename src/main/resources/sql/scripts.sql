use everyproject;
create table users
(
   id int primary key not null auto_increment,
   username varchar (45) not null,
   password varchar (45) not null,
   enabled int not null
);
create table authorities
(
   id int primary key not null auto_increment,
   username varchar (45) not null,
   authority varchar (45) not null
);
create table customer
(
   id int primary key not null auto_increment,
   email varchar (45) not null,
   pwd varchar (200) not null,
   role varchar (45) not null
);

insert ignore into users values(null, 'sunil','12345','1');
insert ignore into authorities values(null,'sunil','write');

insert into customer(email,pwd,role) values('s@d.com', '12345','admin');