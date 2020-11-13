# gym-managment-system
# GYM Managment System using Java Swing and MySql
## Video Demo: https://youtu.be/hnn98S4nY0A
## For running my Application in your Local Machine,
### Download(.jar): https://drive.google.com/drive/folders/1AELIypbAxekhWWyBK9HTeYaNC85wvIR4?usp=sharing
### MySql(installation and configuration): https://www.digitalocean.com/community/tutorials/how-to-install-mysql-on-ubuntu-18-04

Enter in your MySql community-server as root and Create a user as gms with password admin@123
```bash
create user 'gms'@'localhost' identified by 'admin@123';
```

Enter in your MySql community-server as gms user
```bash
$sudo mysql -u gms -p
```

Create database as gms
```bash
create database gms;
```

Create table for member(New Memer and List of Member)
```bash
create table member(id int,name varchar(200),mobilenumber bigint,email varchar(200),gender varchar(200),fathername varchar (200),mothername varchar(200),gymtime varchar(50),aadharnumber bigint,age int amount int);
```

Create table for payment(Fee Payment)
```bash
create table payment(id int,month varchar(50),amount int);
```

<img src="demo_images/0.png">

<img src="demo_images/1.png">

<img src="demo_images/2.png">

<img src="demo_images/3.png">

<img src="demo_images/4.png">

<img src="demo_images/5.png">

<img src="demo_images/6.png">
