SHOW DATABASES;
CREATE DATABASE Training;
USE Training;
SHOW TABLES;
SELECT * FROM student;

CREATE TABLE Images (
	imgID INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    pic MEDIUMBLOB NOT NULL
);

SELECT * FROM Images;    

DROP TABLE Images;

ALTER TABLE Images MODIFY pic LONGBLOB NOT NULL;
DESC Images;
DESC student;