
INSERT INTO STUDENT VALUES (10001, 'Colombo', 'john@gmail.com', 'Class 10', 'John Frank');
INSERT INTO STUDENT VALUES (10002, 'Matara', 'anne@gmail.com', 'Class 10', 'Anne Perera');
INSERT INTO STUDENT VALUES (10003, 'Galle', 'sam@gmail.com', 'Class 11', 'Sam Perera');
INSERT INTO STUDENT VALUES (10004, 'Kandy', 'jane@gmail.com', 'Class 8', 'Jane Dias');
INSERT INTO STUDENT VALUES (10005, 'Colombo', 'supun@gmail.com', 'Class 10', 'Supun Perera');


insert into assignment
values(1006, 'Maths',DATE '2020-01-30','A','Maths Assignment', 'Completed', DATE '2020-01-15',10002 );

insert into assignment
values(1007, 'Science',DATE '2020-01-20','B','Science Assignment', 'Completed', DATE '2020-01-10',10002);

insert into assignment
values(1008, 'History',DATE '2020-02-10', 'B','Science Assignment', 'Completed', DATE '2020-01-30',10002);

insert into assignment
values(1009, 'English',DATE '2020-03-15', 'B','English Assignment', 'Completed', DATE '2020-03-01',10002);

insert into assignment
values(10010, 'Science',DATE '2020-01-20','B','Science Assignment', 'Completed', DATE '2020-01-10',10001);

insert into assignment
values(10011, 'History',DATE '2020-02-10', 'B','Science Assignment', 'Completed', DATE '2020-01-30',10001);

insert into assignment
values(10012, 'English',DATE '2020-03-15', 'B','English Assignment', 'Completed', DATE '2020-03-01',10001);


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



insert into question
values(06, 1 ,'QUESTION - 01','RIGHT','2 minutes ', 1007);

insert into question
values(07, 1 ,'QUESTION - 02','RIGHT','1 minutes ', 1007);

insert into question
values(08, 3 ,'QUESTION - 03','WRONG','1 minutes ', 1007);

insert into question
values(09, 2 ,'QUESTION - 04','PARTIAL','2 minutes ', 1007);

insert into question
values(10, 1 ,'QUESTION - 05','RIGHT','3 minutes ', 1007);


insert into question
values(11, 1 ,'QUESTION - 01','RIGHT','2 minutes ', 10010);

insert into question
values(12, 1 ,'QUESTION - 02','RIGHT','1 minutes ', 10010);

insert into question
values(13, 3 ,'QUESTION - 03','RIGHT','1 minutes ', 10010);

insert into question
values(14, 2 ,'QUESTION - 04','PARTIAL','2 minutes ', 10010);

insert into question
values(15, 1 ,'QUESTION - 05','WRONG','3 minutes ', 10010);


insert into question
values(16, 1 ,'QUESTION - 01','RIGHT','2 minutes ', 10011);

insert into question
values(17, 1 ,'QUESTION - 02','RIGHT','1 minutes ', 10011);

insert into question
values(18, 3 ,'QUESTION - 03','RIGHT','1 minutes ', 10011);

insert into question
values(19, 2 ,'QUESTION - 04','PARTIAL','2 minutes ', 10011);

insert into question
values(20, 1 ,'QUESTION - 05','WRONG','3 minutes ', 10011);


