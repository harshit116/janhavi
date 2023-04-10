use mydb;
create table Shoes( id int auto_increment PRIMARY key , brand varchar(50) ,  size int , category varchar(50) ,  Price int );


use mydb;
SELECT category,count(category) FROM Shoes  Group BY category;



use mydb;


insert into shoes (brand,size,category,Price) values("Puma",10,"Sport",9000);
insert into shoes (brand,size,category,Price) values("Nike",8,"Running",5000);
insert into shoes (brand,size,category,Price) values("Bata",7,"Sneakers",7000);
insert into shoes (brand,size,category,Price) values("WoodLand",8,"Formal",5500);

select * from shoes;