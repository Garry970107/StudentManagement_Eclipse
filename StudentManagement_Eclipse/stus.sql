create database stus;
use stus;
create table stu (
sid int primary key auto_increment,
sname varchar(20),
gender varchar(5),
phone varchar(20),
birthday Date,
hobby varchar(50),
info varchar(200)
);