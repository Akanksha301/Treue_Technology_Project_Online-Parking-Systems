use OnlineParkingSystem ;


Create table register(
Name Varchar(30) not null ,
Contact char(10) not null ,
email varchar(50) not null,
username varchar(30) not null ,
password varchar(20) not null,
constraint pk primary key (username),
constraint u1 unique(contact),
constraint u2 unique(email),
constraint ck1 check(length(contact)=10)
);

 
 Create table BookParking(
username varchar(30) not null ,
a_date varchar(30) not null ,
d_date varchar(30) not null ,
a_time varchar(30) not null ,
d_time varchar(30) not null ,
VechicleNo Varchar(16) not null ,
location Varchar(20) not null ,
slot_no int 
);



 
 