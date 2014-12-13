----Product Entity----------
insert into `product` (`id`, `amount`, `detail`, `discount`, `id_product`, `name`, `picture`, `price`) values('1','1','soup','10','A1','KOK LIANG',NULL,'40')
insert into `product` (`id`, `amount`, `detail`, `discount`, `id_product`, `name`, `picture`, `price`) values('2','2','white teeth','10','B1','Congate',NULL,'10')
insert into `product` (`id`, `amount`, `detail`, `discount`, `id_product`, `name`, `picture`, `price`) values('3','1','wear smooth','5','A2','concept',NULL,'100')
insert into `product` (`id`, `amount`, `detail`, `discount`, `id_product`, `name`, `picture`, `price`) values('4','1','lklkjlkj','3','A3','LKJLKJ',NULL,'300')
------ProductType Entity---------
insert into `product_type` (`id`, `id_type`, `name`) values('1','A0','Cloth')
insert into `product_type` (`id`, `id_type`, `name`) values('2','A1','food')
insert into `product_type` (`id`, `id_type`, `name`) values('3','A2','other')
--------ProductType have Products------------
insert into `product_type_have` (`product_type_id`, `have_id`) values('1','1')
insert into `product_type_have` (`product_type_id`, `have_id`) values('2','2')
insert into `product_type_have` (`product_type_id`, `have_id`) values('1','3')
insert into `product_type_have` (`product_type_id`, `have_id`) values('1','4')
-------Admin-------------
insert into `admin` (`id`, `email`, `lastname`, `level`, `name`, `pass_word`, `sex`, `tel`, `user_name`) values('1','a@hotmail.com','lookkaew','ADMIN','kaew','1234','MALE','087643','admin')
---------Member-------
insert into `member` (`id`, `email`, `lastname`, `level`, `name`, `pass_word`, `sex`, `tel`, `user_name`, `member_id`) values('1','k@hotmail.com','siri','USER','mallika','4321','MALE','12344','Member','A0')