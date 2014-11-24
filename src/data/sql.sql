
/**
 * Laver student tabellen
 */
CREATE TABLE user (
	id INT(10) NOT NULL AUTO_INCREMENT,
	FirstName varchar(30) NOT NULL,
	LastName varchar(30) NOT NULL,
	UserName varchar(50) NOT NULL,
	passWord varchar(30) NOT NULL,
	PRIMARY KEY (id),
	balance DOUBLE,
	admin BOOLEAN
);

CREATE TABLE rate (
rate DOUBLE
);


/**
 * Kommando til at indsætte værdiere i studenter tabel
 */


insert into `user` (`FirstName`, `LastName`, `UserName`, `passWord`, `balance`, admin) values('Mathias', 'Munk', 'mamu13ag', 'hej123', 1.0, true);
insert into `user` (`FirstName`, `LastName`, `UserName`, `passWord`, `balance`, admin) values('Anne', 'Rahbek', 'hehe13ag', 'hej123', 1.0, false);
insert into `user` (`FirstName`, `LastName`, `UserName`, `passWord`, `balance`, admin) values('Nicky', 'Syntelli', 'hoho13ag', 'hej123', 1.0, false);
insert into `user` (`FirstName`, `LastName`, `UserName`, `passWord`, `balance`, admin) values('Stefan', 'Lulo', 'hehe123ag', 'hej123', 1.0, false);
insert into `user` (`FirstName`, `LastName`, `UserName`, `passWord`, `balance`, admin) values('Rasmus', 'Boss', 'hehe123ag', 'hej123', 1.0, true);
Data successfully saved.
Inserted 4 row(s)
Updated 0 row(s)
Deleted 0 row(s)



/**
 * arbejder på noget auto update om dagen
 */
CREATE PROCEDURE UpdateMessages
AS
UPDATE Messages SET Status = 'Expired' WHERE EndDate > GETDATE()
GO

/**
 * indsættet værdien i admin tabel
 */
insert into `admin` (`FirstName`, `MiddleName`, `LastName`, `UserName`, `passWord`, `rate`, `balance`) values('Rasmus', 'Die', 'Joyn', 'Master', 'hej123', 100.0, 1.0)
);

/**
 * sletter en forkert tabel
 */
DROP TABLE `mathias`.`user`;

/**
 * set rate
 */
insert into `rate` (`rate`) values(200.0)
UPDATE rate SET rate='300';

/**
 * Laver ny column og som primary
 */
ALTER TABLE student 
ADD PRIMARY KEY (id)

/**
 * dropper den igen
 */
ALTER TABLE student
DROP COLUMN id;

/**
 * arbejder på trigger
 */
CREATE TRIGGER user
BEFORE INSERT ON user
FOR EACH ROW
BEGIN
  INSERT INTO user VALUES (NULL);
  SET NEW.id = CONCAT('id', LPAD(LAST_INSERT_ID(), 3, '0'));
END |


SELECT UserName, passWord FROM user WHERE UserName = 'mamu13ag' AND passWord = 'hej123';



SELECT FirstName, LastName, UserName, balance, admin FROM user WHERE UserName = 'mamu13ag';


SELECT UserName FROM user;


INSERT INTO user FirstName, LastName, UserName, passWord VALUES ?, ?,?,?;

