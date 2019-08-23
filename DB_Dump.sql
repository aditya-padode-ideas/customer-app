CREATE DATABASE IF NOT EXISTS`mydb` ;

USE `mydb`;

/*Table structure for table `customer` */

DROP TABLE IF EXISTS `customer`;

CREATE TABLE `customer` (
  `customer_id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `city` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`customer_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

/*Data for the table `customer` */

insert  into `customer`(`customer_id`,`name`,`email`,`city`) values 
(1,'Sam','sam@gmail.com','New York'),
(2,'Tom','tom@gmail.com','Miami'),
(3,'Taeyon','jerry@gmail.com','Hong Kong');
