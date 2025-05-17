create database selva;
use selva;
-- create table selva_details(id int auto_increment primary key, student_name varchar(50),student_age int,student_DOB date,Student_email varchar(100));
-- insert into selva_details(student_name,student_age,student_DOB,student_email,student_grade)values('selva',15,'2001-06-21','selva@gmail.com','A'),('murugaaa',21,'2001-07-22','murugan@gmail.com','D'),('raven',10,'2002-08-22','raven@gamil.com','D'),('starfire',25,'2000-03-22','starfire@gmail.com','B'),('beastboy',26,'2004-09-27','besti@gmail.com','C');
-- SET SQL_SAFE_UPDATES = 0;
-- delete from selva_details
-- where id =6;
-- select *from students;
-- select *from courses;

-- where student_age>20 or
--  student_grade='A';

-- alter table selva_details
-- add student_grade varchar(2);
-- create table employees(emp_id int,emp_name varchar(20),d_dept_id int);
-- insert into employees(emp_id,emp_name,d_dept_id) values (101,'Alice',1),(102,'Bob',2),(103,'charlie',null);
select emp_name,dept_name
from employees
right join departments d on dept_id=d_dept_id;
CREATE TABLE courses (
    id INT ,
    course_name VARCHAR(50)
);

CREATE TABLE students (
    id INT ,
    student_name VARCHAR(50),course_id int);
 set sql_safe_updates=1;
 drop table students; 
drop table courses;
INSERT INTO courses (id, course_name) VALUES
(1, 'Mathematics'),
(2, 'Physics'),
(3, 'Chemistry'),
(4, 'Biology'),
(66, 'Computer Science'),
(68, 'English'),
(null, 'History'),
(88, 'Economics'),
(null, 'Art'),
(null, 'Music');
INSERT INTO students (id, student_name, course_id) VALUES
(1, 'Alice', 1),
(2, 'Bob', 2),
(3, 'Charlie', 3),
(4, 'David', 4),
(5, 'Eva',null ),
(6, 'Frank', 1),
(7, 'Grace', 2),
(8, 'Helen', 3),
(9, 'Ian', null),
(10, 'Jack',null );
select course_name,student_name
from courses f
right join students d on f.id=d.course_id;

