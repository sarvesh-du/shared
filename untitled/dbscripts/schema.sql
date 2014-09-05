
DROP DATABASE IF EXISTS OLE;

create database OLE;

use OLE;

CREATE TABLE users (
  USER_ID int(10) unsigned NOT NULL,
  USERNAME varchar(40) NOT NULL,
  PASSWORD varchar(256) NOT NULL,
  ACTIVE tinyint(1) NOT NULL,
  PRIMARY KEY  (USER_ID)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


CREATE TABLE user_roles (
  USER_ROLE_ID int(10) unsigned NOT NULL,
  USER_ID int(10) unsigned NOT NULL,
  AUTHORITY varchar(45) NOT NULL,
  PRIMARY KEY  (USER_ROLE_ID),
  KEY FK_user_roles (USER_ID),
  CONSTRAINT FK_user_roles FOREIGN KEY (USER_ID) REFERENCES users (USER_ID)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


INSERT INTO `users` 
 (`USER_ID`,  `USERNAME`,  `PASSWORD`, `ACTIVE`) VALUES ('1',  'sarvesh', 'kumar', '1');
 
 INSERT INTO `user_roles` 
 (`USER_ROLE_ID`, `USER_ID`, `AUTHORITY`) VALUES ('1',  '1', 'ROLE_USER');

 
 create table question(
 	q_id int  primary key,
 	q_text varchar(500) not null unique,
 	q_type smallint,
 	options smallint not null default 4,
 	answer varchar(20) not null
 );
 
 insert into question(q_id,q_text,q_type,options,answer)
 values (1,'Is java platform independent?', 0, 2,'1');
 
 insert into question(q_id,q_text,q_type,options,answer)
 values (2,'Latest version of java is ?', 0, 4,'2');

 
 create table questions_options (
 	q_id int ,
 	o_no int ,
 	o_text varchar(100) not null,
 	foreign key (q_id) references question(q_id)
 );
 
 insert into questions_options(q_id,o_no,o_text) 
 values (1, 1, 'True');
 
  insert into questions_options(q_id,o_no,o_text) 
 values (1, 2, 'False');
 
  insert into questions_options(q_id,o_no,o_text) 
 values (2, 1, 'JDK 7');
 
  insert into questions_options(q_id,o_no,o_text) 
 values (2, 2, 'JDK 8');
 
   insert into questions_options(q_id,o_no,o_text) 
 values (2, 3, 'JDK 6');
 
 create table test (
 	t_id int AUTO_INCREMENT primary key,
 	questions smallint not null default 10,
 	startdate date not null,
 	duedate date not null
 );
 
 create table test_question(
 	t_id int,
 	q_id int,
 	foreign key (q_id) references question(q_id),
 	foreign key (t_id) references test(t_id)
 )
 
 
 