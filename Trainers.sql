create database SCHOOL;
 use SCHOOL;
 
CREATE TABLE trainers (
T_ID VARCHAR(20) PRIMARY KEY,
T_FNAME VARCHAR(20),
T_LNAME VARCHAR(20),
T_EMAIL VARCHAR(50),
T_SUBJECT VARCHAR(30)

);
INSERT INTO trainers VALUES
('T1','GEORGE','PAPAS','george@ga.com','JAVA-PART-TIME'),
('T2','PANOS','PAPADOPOULOS','PANOS@gb.com','JAVA-FULL-TIME'),
('T3','MARIA','KARRA','MARIA@gc.com','PYTHON-PART-TIME');

SELECT * FROM school.trainers;