create table user_profile(
	id int primary key,
	name varchar(20),
	email varchar(30) not null unique,
	password varchar(256) not null 
);

insert into user_profile values(1,"Saravesh Kumar","sarvesh.kumar@quovantis.com","12345");
insert into user_profile values(1,"Jatin Sehgal","jatin.sehgal@quovantis.com","12345");