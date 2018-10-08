/*
 Navicat Premium Data Transfer

 Source Server         : Mac's Mysql
 Source Server Type    : MySQL
 Source Server Version : 50717
 Source Host           : localhost
 Source Database       : dbtest

 Target Server Type    : MySQL
 Target Server Version : 50717
 File Encoding         : utf-8

 Date: 10/09/2018 00:23:20 AM
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `Profile`
-- ----------------------------
DROP TABLE IF EXISTS `Profile`;
CREATE TABLE `Profile` (
  `ID` char(36) NOT NULL,
  `ProfileData` varchar(16) DEFAULT NULL,
  `CreateTime` datetime DEFAULT NULL,
  `UpdateTime` datetime DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `User`
-- ----------------------------
DROP TABLE IF EXISTS `User`;
CREATE TABLE `User` (
  `ID` varchar(36) NOT NULL,
  `UserName` varchar(16) DEFAULT NULL,
  `Password` varchar(16) DEFAULT NULL,
  `FullName` varchar(16) DEFAULT NULL,
  `Description` varchar(32) DEFAULT NULL,
  `AccountStatus` int(11) DEFAULT NULL,
  `AccountDisableDate` datetime DEFAULT NULL,
  `IsBuildIn` bit(1) DEFAULT NULL,
  `IsVisbile` bit(1) DEFAULT NULL,
  `CreateTime` datetime DEFAULT NULL,
  `UpdateTime` datetime DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `User`
-- ----------------------------
BEGIN;
INSERT INTO `User` VALUES ('1', null, null, null, null, null, null, null, null, null, null);
COMMIT;

-- ----------------------------
--  Table structure for `class_c`
-- ----------------------------
DROP TABLE IF EXISTS `class_c`;
CREATE TABLE `class_c` (
  `CLASS_ID` varchar(40) NOT NULL,
  `TEACHER_ID` varchar(40) DEFAULT NULL,
  `NAME` varchar(30) DEFAULT NULL,
  `CLASS_YEAR` varchar(4) DEFAULT NULL,
  PRIMARY KEY (`CLASS_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `class_c`
-- ----------------------------
BEGIN;
INSERT INTO `class_c` VALUES ('001', '001', 'j2ee就业班', '2013');
COMMIT;

-- ----------------------------
--  Table structure for `orders`
-- ----------------------------
DROP TABLE IF EXISTS `orders`;
CREATE TABLE `orders` (
  `orderid` varchar(36) NOT NULL,
  `orderno` varchar(10) DEFAULT NULL,
  `price` decimal(11,0) DEFAULT NULL,
  `personid` varchar(36) DEFAULT NULL,
  PRIMARY KEY (`orderid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `orders`
-- ----------------------------
BEGIN;
INSERT INTO `orders` VALUES ('1', 'n1', '180', '1'), ('2', 'n2', '200', '1');
COMMIT;

-- ----------------------------
--  Table structure for `person`
-- ----------------------------
DROP TABLE IF EXISTS `person`;
CREATE TABLE `person` (
  `id` varchar(36) NOT NULL,
  `name` varchar(30) DEFAULT NULL,
  `address` varchar(200) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `person`
-- ----------------------------
BEGIN;
INSERT INTO `person` VALUES ('1', 'tony', 'beijing', '18'), ('2', 'jenny', 'xi\'an', '12');
COMMIT;

-- ----------------------------
--  Table structure for `teacher_c`
-- ----------------------------
DROP TABLE IF EXISTS `teacher_c`;
CREATE TABLE `teacher_c` (
  `TEACHER_ID` varchar(40) NOT NULL,
  `NAME` varchar(30) DEFAULT NULL,
  `SEX` varchar(2) DEFAULT NULL,
  `BIRTHDAY` datetime DEFAULT NULL,
  `WORK_DATE` datetime DEFAULT NULL,
  `PROFESSIONAL` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`TEACHER_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `teacher_c`
-- ----------------------------
BEGIN;
INSERT INTO `teacher_c` VALUES ('001', '刘小曲', '女', '1990-06-01 00:00:00', '2010-07-01 00:00:00', '教育学');
COMMIT;

-- ----------------------------
--  Table structure for `user_c`
-- ----------------------------
DROP TABLE IF EXISTS `user_c`;
CREATE TABLE `user_c` (
  `id` varchar(40) NOT NULL,
  `name` varchar(30) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `address` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `user_c`
-- ----------------------------
BEGIN;
INSERT INTO `user_c` VALUES ('1', '夏言', '73', '桂州村'), ('2', '严嵩', '87', '分宜县城介桥村'), ('3', '徐阶', '80', '明松江府华亭县'), ('4', '高拱', '66', '河南省新郑市高老庄村'), ('5', '张居正', '58', '江陵');
COMMIT;

-- ----------------------------
--  View structure for `viewusermodel`
-- ----------------------------
DROP VIEW IF EXISTS `viewusermodel`;
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `viewusermodel` AS select `user`.`ID` AS `UserID`,`profile`.`ID` AS `ProfileUserID`,`profile`.`ProfileData` AS `ProfileData`,`profile`.`CreateTime` AS `CreateTime`,`profile`.`UpdateTime` AS `UpdateTime`,`user`.`UserName` AS `UserName`,`user`.`Password` AS `Password`,`user`.`FullName` AS `FullName`,`user`.`Description` AS `Description`,`user`.`AccountStatus` AS `AccountStatus` from (`profile` join `user` on((`profile`.`ID` = `user`.`ID`)));

SET FOREIGN_KEY_CHECKS = 1;
