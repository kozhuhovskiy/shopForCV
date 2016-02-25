CREATE TABLE categories
(
  id integer not null auto_increment primary key,
  category_name varchar(40)
);

CREATE TABLE product
(
  id integer not null auto_increment primary key,
  title varchar(40),
  price  integer,
  p_status  varchar(40)
);

CREATE TABLE shop
(
  id integer not null auto_increment primary key,
  shop_name varchar(250),
  categories_id int(10),
  products_id int(10)
);


insert into category (category_type) values
  ("CARS", "Smartphones");
  insert into category (category_type) values
  ("Smartphones");
insert into product (product_title, products_price,products_status) values
  ("WV PASSSAT B8", 32000, "AVAILABLE");
  
insert into shop (shop_name, categories_id, products_id) values
  ("Shop №2 *AUTO-RIA.UA*", 1);

