CREATE TABLE seekeeper_user (
  ID int(11) NOT NULL AUTO_INCREMENT,
  NAME varchar(128) NOT NULL,
  PRIMARY KEY (ID),
  UNIQUE KEY USERUNIQUE (NAME)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;