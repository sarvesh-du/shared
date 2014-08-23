

insert into user_profile values(1,"Saravesh Kumar","sarvesh.kumar@quovantis.com","12345","ADMIN");
insert into user_profile values(1,"Jatin Sehgal","jatin.sehgal@quovantis.com","12345");

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
