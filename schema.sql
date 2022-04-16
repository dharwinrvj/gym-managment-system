create table if not exists member(
    id int,
    name varchar(200),
    mobilenumber bigint,
    email varchar(200),
    gender varchar(200),
    fathername varchar (200),
    mothername varchar(200),
    gymtime varchar(50),
    aadharnumber bigint,
    age int,
    amount int
);
create table if not exists payment(id int, month varchar(50), amount int);