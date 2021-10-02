/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  USER
 * Created: 16 Ιουν 2021
 */

create database SCHOOL;
 use SCHOOL;
 
CREATE TABLE trainers (
T_ID VARCHAR(20) PRIMARY KEY,
T_FNAME VARCHAR(20),
T_LNAME VARCHAR(20),
T_EMAIL VARCHAR(50),
T_SUBJECT VARCHAR(30)

);