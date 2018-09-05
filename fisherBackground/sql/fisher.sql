/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2018/9/5 17:23:06                            */
/*===
DROP DATABASE fisher;CREATE DATABASE fisher
===========================================================*/

DROP TABLE IF EXISTS cart;

DROP INDEX cartId_index ON cartMessage;

DROP INDEX cartMerchandise_index ON cartMessage;

DROP TABLE IF EXISTS cartMessage;

DROP TABLE IF EXISTS COMMENT;

DROP TABLE IF EXISTS image;

DROP INDEX merchandisName ON merchandise;

DROP TABLE IF EXISTS merchandise;

DROP TABLE IF EXISTS path;

DROP INDEX openidIndex ON USER;

DROP TABLE IF EXISTS USER;

DROP TABLE IF EXISTS user_describe;

/*==============================================================*/
/* Table: cart                                                  */
/*==============================================================*/
CREATE TABLE cart
(
   cart_id              INT NOT NULL AUTO_INCREMENT,
   user_id              INT,
   PRIMARY KEY (cart_id)
);

/*==============================================================*/
/* Table: cartMessage                                           */
/*==============================================================*/
CREATE TABLE cartMessage
(
   merchandise_id       INT,
   cart_id              INT,
   merchandise_nums     INT,
   putTime              VARCHAR(20)
);

/*==============================================================*/
/* Index: cartMerchandise_index                                 */
/*==============================================================*/
CREATE INDEX cartMerchandise_index ON cartMessage
(
   merchandise_id
);

/*==============================================================*/
/* Index: cartId_index                                          */
/*==============================================================*/
CREATE INDEX cartId_index ON cartMessage
(
   cart_id
);

/*==============================================================*/
/* Table: comment                                               */
/*==============================================================*/
CREATE TABLE COMMENT
(
   comment_id           INT NOT NULL AUTO_INCREMENT,
   merchandise_id       INT,
   user_id              INT,
   comment_level        VARCHAR(30),
   PRIMARY KEY (comment_id)
);

/*==============================================================*/
/* Table: image                                                 */
/*==============================================================*/
CREATE TABLE image
(
   image_id             INT NOT NULL AUTO_INCREMENT,
   merchandise_id       INT,
   image_path           VARCHAR(50),
   image_name           VARCHAR(20),
   PRIMARY KEY (image_id)
);

/*==============================================================*/
/* Table: merchandise                                           */
/*==============================================================*/
CREATE TABLE merchandise
(
   merchandise_id       INT NOT NULL AUTO_INCREMENT,
   merchandise_name     VARCHAR(20),
   merchandise_price    DOUBLE,
   merchandise_attribute VARCHAR(20),
   merchandise_priceScope VARCHAR(20),
   merchandise_inventory INT,
   PRIMARY KEY (merchandise_id)
);

/*==============================================================*/
/* Index: merchandisName                                        */
/*==============================================================*/
CREATE INDEX merchandisName ON merchandise
(
   merchandise_name
);

/*==============================================================*/
/* Table: path                                                  */
/*==============================================================*/
CREATE TABLE path
(
   path_id              INT NOT NULL AUTO_INCREMENT,
   image_id             INT,
   path_value           VARCHAR(30),
   path_name            VARCHAR(20),
   PRIMARY KEY (path_id)
);

/*==============================================================*/
/* Table: user                                                  */
/*==============================================================*/
CREATE TABLE USER
(
   user_id              INT NOT NULL AUTO_INCREMENT,
   user_name            VARCHAR(20),
   user_password        VARCHAR(30),
   openid               VARCHAR(30),
   PRIMARY KEY (user_id)
);

/*==============================================================*/
/* Index: openidIndex                                           */
/*==============================================================*/
CREATE UNIQUE INDEX openidIndex ON USER
(
   openid
);

/*==============================================================*/
/* Table: user_describe                                         */
/*==============================================================*/
CREATE TABLE user_describe
(
   describe_id          INT NOT NULL AUTO_INCREMENT,
   merchandise_id       INT,
   describe_text        TEXT,
   PRIMARY KEY (describe_id)
);

ALTER TABLE cart ADD CONSTRAINT FK_Reference_7 FOREIGN KEY (user_id)
      REFERENCES USER (user_id) ON DELETE RESTRICT ON UPDATE RESTRICT;

ALTER TABLE cartMessage ADD CONSTRAINT FK_Reference_8 FOREIGN KEY (merchandise_id)
      REFERENCES merchandise (merchandise_id) ON DELETE RESTRICT ON UPDATE RESTRICT;

ALTER TABLE cartMessage ADD CONSTRAINT FK_Reference_9 FOREIGN KEY (cart_id)
      REFERENCES cart (cart_id) ON DELETE RESTRICT ON UPDATE RESTRICT;

ALTER TABLE COMMENT ADD CONSTRAINT FK_Reference_3 FOREIGN KEY (merchandise_id)
      REFERENCES merchandise (merchandise_id) ON DELETE RESTRICT ON UPDATE RESTRICT;

ALTER TABLE COMMENT ADD CONSTRAINT FK_Reference_5 FOREIGN KEY (user_id)
      REFERENCES USER (user_id) ON DELETE RESTRICT ON UPDATE RESTRICT;

ALTER TABLE image ADD CONSTRAINT FK_Reference_10 FOREIGN KEY (merchandise_id)
      REFERENCES merchandise (merchandise_id) ON DELETE RESTRICT ON UPDATE RESTRICT;

ALTER TABLE path ADD CONSTRAINT FK_Reference_6 FOREIGN KEY (image_id)
      REFERENCES image (image_id) ON DELETE RESTRICT ON UPDATE RESTRICT;

ALTER TABLE user_describe ADD CONSTRAINT FK_Reference_11 FOREIGN KEY (merchandise_id)
      REFERENCES merchandise (merchandise_id) ON DELETE RESTRICT ON UPDATE RESTRICT;

