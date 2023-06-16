Create database sql12624803;
use sql12624803;

create table tbl_person(
	pid int(11) not null,
    name varchar(50) not null,
    address varchar(50) not null
);

alter table tbl_person
	add constraint pkpid
		primary key(pid);

insert into tbl_person values(1, 'Raj Rai', 'Lalitpur');
select * from tbl_person;