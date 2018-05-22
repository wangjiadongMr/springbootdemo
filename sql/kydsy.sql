/*
 Navicat MySQL Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50718
 Source Host           : localhost
 Source Database       : kydsy

 Target Server Type    : MySQL
 Target Server Version : 50718
 File Encoding         : utf-8

 Date: 05/22/2018 10:43:59 AM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `admin`
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `pwd` varchar(20) DEFAULT NULL,
  `name` varchar(12) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='系统管理员';

-- ----------------------------
--  Records of `admin`
-- ----------------------------
BEGIN;
INSERT INTO `admin` VALUES ('1', 'root1234', 'admin'), ('2', '11111', 'ssss');
COMMIT;

-- ----------------------------
--  Table structure for `areach`
-- ----------------------------
DROP TABLE IF EXISTS `areach`;
CREATE TABLE `areach` (
  `treid` int(11) NOT NULL AUTO_INCREMENT COMMENT '论文成果id',
  `tretitle` varchar(12) DEFAULT NULL COMMENT '论文题目',
  `tretime` varchar(12) DEFAULT NULL COMMENT '论文出版时间',
  `trefaut` varchar(12) DEFAULT NULL COMMENT '论文第一作者',
  `allaut` varchar(50) DEFAULT NULL COMMENT '论文所有作者',
  `inspectorId` int(11) DEFAULT NULL COMMENT '审核人id',
  PRIMARY KEY (`treid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='成果收获';

-- ----------------------------
--  Table structure for `artclass`
-- ----------------------------
DROP TABLE IF EXISTS `artclass`;
CREATE TABLE `artclass` (
  `artid` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `artclassname` varchar(24) DEFAULT NULL COMMENT '著作类别名字',
  PRIMARY KEY (`artid`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='著作类别';

-- ----------------------------
--  Records of `artclass`
-- ----------------------------
BEGIN;
INSERT INTO `artclass` VALUES ('1', '科研'), ('2', '学术');
COMMIT;

-- ----------------------------
--  Table structure for `artname`
-- ----------------------------
DROP TABLE IF EXISTS `artname`;
CREATE TABLE `artname` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `aname` varchar(12) DEFAULT NULL COMMENT '著作名称',
  `worker` varchar(24) DEFAULT NULL COMMENT '参编作者',
  `publictime` varchar(12) DEFAULT NULL COMMENT '出版时间',
  `inspstate` int(11) DEFAULT '0' COMMENT '审核状态',
  `artclassid` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='著作';

-- ----------------------------
--  Records of `artname`
-- ----------------------------
BEGIN;
INSERT INTO `artname` VALUES ('1', '如何学习编程', 'wwww', '20180420', '1', '1'), ('2', '如何学习java', 'wwww', '20180422', '1', '1');
COMMIT;

-- ----------------------------
--  Table structure for `belongone`
-- ----------------------------
DROP TABLE IF EXISTS `belongone`;
CREATE TABLE `belongone` (
  `teacherid` int(11) DEFAULT NULL COMMENT '教师编号',
  `disid` int(11) DEFAULT NULL COMMENT '论文编号',
  `recordtime` varchar(255) DEFAULT NULL COMMENT '录入时间'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `belongthree`
-- ----------------------------
DROP TABLE IF EXISTS `belongthree`;
CREATE TABLE `belongthree` (
  `teacherid` int(11) DEFAULT NULL COMMENT '教师编号',
  `autid` int(11) DEFAULT NULL COMMENT '著作编号',
  `recordtime` varchar(255) DEFAULT NULL COMMENT '录入时间'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `belongtwo`
-- ----------------------------
DROP TABLE IF EXISTS `belongtwo`;
CREATE TABLE `belongtwo` (
  `teacherid` int(11) DEFAULT NULL COMMENT '教师编号',
  `award` varchar(255) DEFAULT NULL COMMENT '获奖成果',
  `awardtime` varchar(255) DEFAULT NULL COMMENT '获奖时间'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `claim`
-- ----------------------------
DROP TABLE IF EXISTS `claim`;
CREATE TABLE `claim` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(255) DEFAULT NULL,
  `pername` varchar(255) DEFAULT NULL COMMENT '发表刊物',
  `recordname` varchar(255) DEFAULT NULL COMMENT '收录名称',
  `publishtime` varchar(255) DEFAULT NULL,
  `personname` varchar(255) DEFAULT NULL,
  `claimtime` varchar(255) DEFAULT NULL,
  `state` int(11) DEFAULT NULL,
  `type` varchar(12) DEFAULT NULL COMMENT '发表期刊物/论文集',
  PRIMARY KEY (`id`),
  KEY `claim_id_index` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `claim`
-- ----------------------------
BEGIN;
INSERT INTO `claim` VALUES ('1', 'hhaha', 'ssss', 'zhongg', '201803033', '王家', '20180403', '1', 'djdjjdjd'), ('2', '教师', '第一刊', '中话', '20180330', '往西', '20180404', '1', '不知道是啥');
COMMIT;

-- ----------------------------
--  Table structure for `cluster`
-- ----------------------------
DROP TABLE IF EXISTS `cluster`;
CREATE TABLE `cluster` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '论文集主键',
  `cluname` varchar(24) DEFAULT NULL COMMENT '论文集名字',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='论文集';

-- ----------------------------
--  Records of `cluster`
-- ----------------------------
BEGIN;
INSERT INTO `cluster` VALUES ('1', '期刊');
COMMIT;

-- ----------------------------
--  Table structure for `crossproject`
-- ----------------------------
DROP TABLE IF EXISTS `crossproject`;
CREATE TABLE `crossproject` (
  `id` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL COMMENT '项目名称',
  `personname` varchar(255) DEFAULT NULL COMMENT '项目参与人员',
  `pulishtime` varchar(255) DEFAULT NULL,
  `award` varchar(255) DEFAULT NULL COMMENT '奖项成果',
  `insptid` int(11) DEFAULT NULL COMMENT '审核人员id',
  `tid` int(11) DEFAULT NULL COMMENT '老师id',
  `state` int(11) DEFAULT NULL COMMENT '审核状态',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='横向研究';

-- ----------------------------
--  Records of `crossproject`
-- ----------------------------
BEGIN;
INSERT INTO `crossproject` VALUES ('1', '中国复兴之路', '王先生', '20180400', '一等奖', '1', '1', '1');
COMMIT;

-- ----------------------------
--  Table structure for `dissertation`
-- ----------------------------
DROP TABLE IF EXISTS `dissertation`;
CREATE TABLE `dissertation` (
  `id` int(11) NOT NULL COMMENT '论文id',
  `insid` int(11) DEFAULT NULL COMMENT '审核人id',
  `title` varchar(12) DEFAULT NULL COMMENT '题目',
  `firstwriter` varchar(255) DEFAULT NULL COMMENT '第一作者',
  `publishtime` varchar(255) DEFAULT NULL COMMENT '发表时间',
  `bat` varchar(255) DEFAULT NULL COMMENT '备份',
  `percla` varchar(255) DEFAULT NULL COMMENT '发表刊物',
  `state` int(11) DEFAULT NULL COMMENT '审核状态',
  `allwriter` varchar(255) DEFAULT NULL COMMENT '所有作者',
  `clusterid` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `dissertation`
-- ----------------------------
BEGIN;
INSERT INTO `dissertation` VALUES ('1', '1', '哈哈哈', 'wwww', '20180422', '什么东西这么着急', 'ddddd', '1', '我啊爱啊', '1');
COMMIT;

-- ----------------------------
--  Table structure for `dissertationcla`
-- ----------------------------
DROP TABLE IF EXISTS `dissertationcla`;
CREATE TABLE `dissertationcla` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '论文集id',
  `classname` varchar(24) DEFAULT NULL COMMENT '论文类别名字',
  `cluid` int(11) DEFAULT NULL COMMENT '论文集id',
  `preid` int(11) DEFAULT NULL COMMENT '期刊id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='论文';

-- ----------------------------
--  Table structure for `info`
-- ----------------------------
DROP TABLE IF EXISTS `info`;
CREATE TABLE `info` (
  `id` int(11) DEFAULT NULL COMMENT '公布信息id',
  `pubtitle` varchar(255) DEFAULT NULL COMMENT '公布标题',
  `resource` varchar(255) DEFAULT NULL COMMENT '来源',
  `document` varchar(255) DEFAULT NULL,
  `time` varchar(255) DEFAULT NULL COMMENT '时间'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `inspector`
-- ----------------------------
DROP TABLE IF EXISTS `inspector`;
CREATE TABLE `inspector` (
  `inspid` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `ipsname` varchar(12) DEFAULT NULL COMMENT '审计人名字',
  `ipstitle` varchar(24) DEFAULT NULL COMMENT '审计人头衔',
  `pwd` varchar(255) DEFAULT NULL COMMENT '密码',
  PRIMARY KEY (`inspid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='审计员';

-- ----------------------------
--  Table structure for `periodicla`
-- ----------------------------
DROP TABLE IF EXISTS `periodicla`;
CREATE TABLE `periodicla` (
  `perid` int(11) NOT NULL AUTO_INCREMENT COMMENT '期刊主键',
  `perclasslname` varchar(24) DEFAULT NULL COMMENT '期刊名字',
  PRIMARY KEY (`perid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='期刊类别';

-- ----------------------------
--  Table structure for `project`
-- ----------------------------
DROP TABLE IF EXISTS `project`;
CREATE TABLE `project` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `proname` varchar(12) DEFAULT NULL COMMENT '名称',
  `ptime` varchar(24) DEFAULT NULL COMMENT '时期',
  `bat` varchar(24) DEFAULT NULL COMMENT '备注',
  `pstate` int(11) DEFAULT '0' COMMENT '审核状态',
  `tid` int(11) DEFAULT NULL,
  `insid` int(11) DEFAULT NULL,
  `proclaid` int(11) DEFAULT NULL COMMENT '项目类别编号',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='项目名称';

-- ----------------------------
--  Records of `project`
-- ----------------------------
BEGIN;
INSERT INTO `project` VALUES ('1', '学习的道路', '20180422', '哈啊哈', '1', '1', '1', '1');
COMMIT;

-- ----------------------------
--  Table structure for `projectcla`
-- ----------------------------
DROP TABLE IF EXISTS `projectcla`;
CREATE TABLE `projectcla` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '项目类别主键',
  `proclassname` varchar(24) DEFAULT NULL COMMENT '项目类型',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='项目类别';

-- ----------------------------
--  Table structure for `reachaward`
-- ----------------------------
DROP TABLE IF EXISTS `reachaward`;
CREATE TABLE `reachaward` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '成果获奖id',
  `reachname` varchar(12) DEFAULT NULL COMMENT '成果名字',
  `awardname` varchar(12) DEFAULT NULL COMMENT '奖励名称',
  `awardtime` varchar(12) DEFAULT NULL COMMENT '获奖日期',
  `awardperson` varchar(24) DEFAULT NULL COMMENT '获奖人',
  `state` int(11) DEFAULT '0' COMMENT '审核状态',
  `awardlevel` varchar(20) DEFAULT NULL,
  `insid` int(12) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='成果获奖';

-- ----------------------------
--  Table structure for `researchdetail`
-- ----------------------------
DROP TABLE IF EXISTS `researchdetail`;
CREATE TABLE `researchdetail` (
  `id` int(11) NOT NULL,
  `name` varchar(24) DEFAULT NULL COMMENT '科研名称',
  `aname` varchar(25) DEFAULT NULL COMMENT '奖励名称',
  `alevel` varchar(20) DEFAULT NULL COMMENT '获奖等级',
  `atime` varchar(25) DEFAULT NULL COMMENT '获奖日期',
  `inspstate` int(11) DEFAULT NULL COMMENT '审核状态',
  `teacherid` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `researchdetail`
-- ----------------------------
BEGIN;
INSERT INTO `researchdetail` VALUES ('1', 'hhhhh', '特别', '特别奖', 'ddd', '1', '1');
COMMIT;

-- ----------------------------
--  Table structure for `teacher`
-- ----------------------------
DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(24) DEFAULT NULL COMMENT '老师名字',
  `sex` varchar(24) DEFAULT NULL COMMENT '老师性别',
  `educational` varchar(24) DEFAULT NULL COMMENT '老师的学历',
  `phone` varchar(24) DEFAULT NULL COMMENT '老师手机号',
  `mail` varchar(50) DEFAULT NULL COMMENT '老师邮箱',
  `age` varchar(24) DEFAULT NULL COMMENT '老师年龄',
  `title` varchar(12) DEFAULT NULL COMMENT '老师职称',
  `pwd` varchar(24) DEFAULT NULL COMMENT '密码',
  `workId` int(11) DEFAULT NULL COMMENT '所属单位id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `teacher`
-- ----------------------------
BEGIN;
INSERT INTO `teacher` VALUES ('2', '李老师', '女', '博士', '1328888888', 'li@163.com', '23', '教授vip', '22222', '333'), ('3', '张老师', '男', '博士', '3333333333', 'zhang@163.com', '23', 'vim', '333333', '2222');
COMMIT;

-- ----------------------------
--  Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `name` varchar(20) DEFAULT NULL COMMENT '用户名',
  `telephone` varchar(20) DEFAULT NULL COMMENT '手机号',
  `pwd` varchar(20) DEFAULT NULL COMMENT '密码',
  `mail` varchar(20) DEFAULT NULL COMMENT '邮箱',
  `title` varchar(12) DEFAULT NULL COMMENT '职称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `workplace`
-- ----------------------------
DROP TABLE IF EXISTS `workplace`;
CREATE TABLE `workplace` (
  `wid` int(20) NOT NULL AUTO_INCREMENT COMMENT '单位主键',
  `wname` varchar(24) DEFAULT NULL COMMENT '单位名字',
  PRIMARY KEY (`wid`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='工作单位';

-- ----------------------------
--  Records of `workplace`
-- ----------------------------
BEGIN;
INSERT INTO `workplace` VALUES ('1', '清华');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
