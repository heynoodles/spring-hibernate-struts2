/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50527
Source Host           : localhost:3306
Source Database       : hibernatedemo

Target Server Type    : MYSQL
Target Server Version : 50527
File Encoding         : 65001

Date: 2013-08-03 16:35:18
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `tmp_emp`
-- ----------------------------
DROP TABLE IF EXISTS `tmp_emp`;
CREATE TABLE `tmp_emp` (
  `ID` int(4) NOT NULL,
  `NAME` varchar(50) DEFAULT NULL,
  `BIRTHDAY` date DEFAULT NULL,
  `SEX` char(1) DEFAULT NULL,
  `SALARY` float(8,2) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of tmp_emp
-- ----------------------------
INSERT INTO `tmp_emp` VALUES ('1', 'ly', null, 'm', '2000.00');
INSERT INTO `tmp_emp` VALUES ('5', 'yz', null, null, null);
