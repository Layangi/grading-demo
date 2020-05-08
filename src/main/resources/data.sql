
INSERT INTO STUDENT VALUES (10001, 'Colombo', 'john@gmail.com', 'Class 10', 'John Frank');
INSERT INTO STUDENT VALUES (10002, 'Matara', 'anne@gmail.com', 'Class 10', 'Anne Perera');
INSERT INTO STUDENT VALUES (10003, 'Galle', 'sam@gmail.com', 'Class 11', 'Sam Perera');

insert into assignment
values(1006, 'Maths',DATE '2020-01-30','A','Maths Assignment', 'Completed', DATE '2020-01-15',10002 );

insert into assignment
values(1007, 'Science',DATE '2020-01-20','B','Science Assignment', 'Completed', DATE '2020-01-10',10002);

insert into assignment
values(1008, 'History',DATE '2020-02-10', 'B','Science Assignment', 'Completed', DATE '2020-01-30',10002);


insert into question
values(01, 1 ,'QUESTION - 01','RIGHT','2 minutes ', 1006);

insert into question
values(02, 1 ,'QUESTION - 02','RIGHT','1 minutes ', 1006);

insert into question
values(03, 3 ,'QUESTION - 03','WRONG','1 minutes ', 1006);

insert into question
values(04, 2 ,'QUESTION - 04','PARTIAL','2 minutes ', 1006);

insert into question
values(05, 1 ,'QUESTION - 05','RIGHT','3 minutes ', 1006);

