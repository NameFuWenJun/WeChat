/*
SQLyog 企业版 - MySQL GUI v8.14 
MySQL - 5.7.17-log : Database - fisher
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`fisher` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `fisher`;

/*Table structure for table `cart` */

DROP TABLE IF EXISTS `cart`;

CREATE TABLE `cart` (
  `cart_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`cart_id`),
  KEY `FK_Reference_7` (`user_id`),
  CONSTRAINT `FK_Reference_7` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `cart` */

/*Table structure for table `cartmessage` */

DROP TABLE IF EXISTS `cartmessage`;

CREATE TABLE `cartmessage` (
  `merchandise_id` int(11) DEFAULT NULL,
  `cart_id` int(11) DEFAULT NULL,
  `merchandise_nums` int(11) DEFAULT NULL,
  `putTime` varchar(20) DEFAULT NULL,
  KEY `cartMerchandise_index` (`merchandise_id`),
  KEY `cartId_index` (`cart_id`),
  CONSTRAINT `FK_Reference_8` FOREIGN KEY (`merchandise_id`) REFERENCES `merchandise` (`merchandise_id`),
  CONSTRAINT `FK_Reference_9` FOREIGN KEY (`cart_id`) REFERENCES `cart` (`cart_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `cartmessage` */

/*Table structure for table `comment` */

DROP TABLE IF EXISTS `comment`;

CREATE TABLE `comment` (
  `comment_id` int(11) NOT NULL AUTO_INCREMENT,
  `merchandise_id` int(11) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  `comment_level` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`comment_id`),
  KEY `FK_Reference_3` (`merchandise_id`),
  KEY `FK_Reference_5` (`user_id`),
  CONSTRAINT `FK_Reference_3` FOREIGN KEY (`merchandise_id`) REFERENCES `merchandise` (`merchandise_id`),
  CONSTRAINT `FK_Reference_5` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `comment` */

/*Table structure for table `image` */

DROP TABLE IF EXISTS `image`;

CREATE TABLE `image` (
  `image_id` int(11) NOT NULL AUTO_INCREMENT,
  `image_path` varchar(50) DEFAULT NULL,
  `image_name` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`image_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `image` */

/*Table structure for table `merchandise` */

DROP TABLE IF EXISTS `merchandise`;

CREATE TABLE `merchandise` (
  `merchandise_id` int(11) NOT NULL AUTO_INCREMENT,
  `image_id` int(11) DEFAULT NULL,
  `describe_id` int(11) DEFAULT NULL,
  `comment_id` int(11) DEFAULT NULL,
  `merchandise_name` varchar(20) DEFAULT NULL,
  `merchandise_price` double DEFAULT NULL,
  `merchandise_attribute` varchar(20) DEFAULT NULL,
  `merchandise_priceScope` varchar(20) DEFAULT NULL,
  `merchandise_inventory` int(11) DEFAULT NULL,
  PRIMARY KEY (`merchandise_id`),
  KEY `merchandisName` (`merchandise_name`),
  KEY `FK_Reference_1` (`image_id`),
  KEY `FK_Reference_2` (`describe_id`),
  KEY `FK_Reference_4` (`comment_id`),
  CONSTRAINT `FK_Reference_1` FOREIGN KEY (`image_id`) REFERENCES `image` (`image_id`),
  CONSTRAINT `FK_Reference_2` FOREIGN KEY (`describe_id`) REFERENCES `user_describe` (`describe_id`),
  CONSTRAINT `FK_Reference_4` FOREIGN KEY (`comment_id`) REFERENCES `comment` (`comment_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `merchandise` */

/*Table structure for table `path` */

DROP TABLE IF EXISTS `path`;

CREATE TABLE `path` (
  `path_id` int(11) NOT NULL AUTO_INCREMENT,
  `image_id` int(11) DEFAULT NULL,
  `path_value` varchar(30) DEFAULT NULL,
  `path_name` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`path_id`),
  KEY `FK_Reference_6` (`image_id`),
  CONSTRAINT `FK_Reference_6` FOREIGN KEY (`image_id`) REFERENCES `image` (`image_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `path` */

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(20) DEFAULT NULL,
  `user_password` varchar(30) DEFAULT NULL,
  `openid` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`user_id`),
  UNIQUE KEY `openidIndex` (`openid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `user` */

/*Table structure for table `user_describe` */

DROP TABLE IF EXISTS `user_describe`;

CREATE TABLE `user_describe` (
  `describe_id` int(11) NOT NULL AUTO_INCREMENT,
  `describe_text` text,
  PRIMARY KEY (`describe_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `user_describe` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
