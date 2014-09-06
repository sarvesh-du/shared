
drop database if exists OLE;

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
 
 
 create table question (
 	question_id integer primary key,
 	question_text varchar(500) not null,
 	question_type varchar(10),
 	qestion_category varchar(50),
 	difficulty_level varchar(15),
 	question_sub_category varchar(50),
 	answer varchar(20) not null
 );
 
create table options (
	option_id integer primary key,
	option_text varchar(100) not null
);

create table question_options(
	question_options_id integer primary key,
	question_id integer,
	option_id integer,
	constraint foreign key (option_id) references options(option_id),
	constraint foreign key (question_id) references question(question_id)
);
create table test(
	test_id integer primary key,
	test_name varchar(20),
	number_of_questions integer,
	test_category varchar(50),
	test_sub_category varchar(50)
);

create table test_question(
	test_question_id integer primary key,
	test_id integer,
	question_id integer,
	constraint foreign key (test_id) references test(test_id),
	constraint foreign key (question_id) references question(question_id)
);


