/*
SQLyog Ultimate v11.33 (64 bit)
MySQL - 5.7.17-log : Database - kaka
*********************************************************************
*/


/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
/*Table structure for table `sys_menu` */

DROP TABLE IF EXISTS `sys_menu`;

CREATE TABLE `sys_menu` (
   `id` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT '菜单ID',
   `name` VARCHAR(10) DEFAULT NULL COMMENT '菜单名称',
   `perm` VARCHAR(100) DEFAULT NULL COMMENT 'WildcardPermission',
   `url` VARCHAR(100) DEFAULT NULL COMMENT '菜单url',
   `action` VARCHAR(100) DEFAULT NULL COMMENT '菜单url',
   `iconcls` VARCHAR(50) DEFAULT NULL COMMENT '菜单图标',
   `grade` TINYINT(1) DEFAULT NULL COMMENT '级别',
   `state` TINYINT(1) DEFAULT NULL COMMENT '菜单状态',
   `isleaf` TINYINT(1) DEFAULT NULL COMMENT '叶子节点',
   `parentid` INT(11) DEFAULT NULL COMMENT '父菜单ID',
   `remark` VARCHAR(100) DEFAULT NULL COMMENT '备注',
   `create_by` VARCHAR(20) DEFAULT NULL COMMENT '创建数据用户',
   `update_by` VARCHAR(20) DEFAULT NULL COMMENT '更新数据用户',
   `create_date` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建数据时间',
   `update_date` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新数据时间',
   `del_flag` INT(1) NOT NULL DEFAULT '0' COMMENT '删除标记：0正常 1不正常',
   `version` INT(5) NOT NULL DEFAULT '0' COMMENT '数据版本',
   PRIMARY KEY (`id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT='菜单表：用来添加菜单';

/*Table structure for table `sys_perm` */

DROP TABLE IF EXISTS `sys_perm`;

CREATE TABLE `sys_perm` (
   `id` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT '权限ID',
   `menuid` BIGINT(20) NOT NULL COMMENT '菜单ID',
   `roleid` BIGINT(20) NOT NULL COMMENT '角色ID',
   `remark` VARCHAR(100) DEFAULT NULL COMMENT '备注',
   `create_by` VARCHAR(20) DEFAULT NULL COMMENT '创建数据用户',
   `update_by` VARCHAR(20) DEFAULT NULL COMMENT '更新数据用户',
   `create_date` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建数据时间',
   `update_date` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新数据时间',
   `del_flag` INT(1) NOT NULL DEFAULT '0' COMMENT '删除标记：0正常 1不正常',
   `version` INT(5) NOT NULL DEFAULT '0' COMMENT '数据版本',
   PRIMARY KEY (`id`),
   KEY `fk_perm_role` (`roleid`),
   KEY `fk_perm_menu` (`menuid`),
   CONSTRAINT `fk_perm_menu` FOREIGN KEY (`menuid`) REFERENCES `sys_menu` (`id`),
   CONSTRAINT `fk_perm_role` FOREIGN KEY (`roleid`) REFERENCES `sys_role` (`id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT='权限表：关联角色表和菜单表';

/*Table structure for table `sys_role` */

DROP TABLE IF EXISTS `sys_role`;

CREATE TABLE `sys_role` (
   `id` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT '角色ID',
   `rolename` VARCHAR(20) DEFAULT NULL COMMENT '角色名',
   `description` VARCHAR(50) DEFAULT NULL COMMENT '描述',
   `parent_id` INT(11) DEFAULT NULL COMMENT '角色父id',
   `remark` VARCHAR(100) DEFAULT NULL COMMENT '备注',
   `state` TINYINT(2) DEFAULT NULL COMMENT '状态',
   `create_by` VARCHAR(20) DEFAULT NULL COMMENT '创建数据用户',
   `update_by` VARCHAR(20) DEFAULT NULL COMMENT '更新数据用户',
   `create_date` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建数据时间',
   `update_date` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新数据时间',
   `del_flag` INT(1) NOT NULL DEFAULT '0' COMMENT '删除标记：0正常 1不正常',
   `version` INT(5) NOT NULL DEFAULT '0' COMMENT '数据版本',
   PRIMARY KEY (`id`)
) ENGINE=INNODB  DEFAULT CHARSET=utf8 COMMENT='角色表';

/*Table structure for table `sys_user` */

DROP TABLE IF EXISTS `sys_user`;

CREATE TABLE `sys_user` (
   `id` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT '用户ID',
   `username` VARCHAR(20) DEFAULT NULL COMMENT '用户名',
   `usertype` TINYINT(2) DEFAULT NULL COMMENT '用户类型',
   `password` VARCHAR(100) DEFAULT NULL COMMENT '用户密码',
   `nickname` VARCHAR(20) DEFAULT NULL COMMENT '昵称',
   `sex` TINYINT(1) DEFAULT NULL COMMENT '性别',
   `phone` INT(11) DEFAULT NULL COMMENT '手机号',
   `email` VARCHAR(100) DEFAULT NULL COMMENT '邮箱',
   `alias` VARCHAR(100) DEFAULT NULL COMMENT '用户头像',
   `login_address` VARCHAR(32) DEFAULT NULL COMMENT '最近登陆地址',
   `login_date` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最近登陆时间',
   `ip` VARCHAR(32) DEFAULT NULL COMMENT '登陆IP',
   `state` INT(1) DEFAULT NULL COMMENT '用户状态',
   `remark` VARCHAR(100) DEFAULT NULL COMMENT '备注',
   `create_by` VARCHAR(20) DEFAULT NULL COMMENT '创建数据用户',
   `update_by` VARCHAR(20) DEFAULT NULL COMMENT '更新数据用户',
   `create_date` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建数据时间',
   `update_date` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新数据时间',
   `del_flag` INT(1) NOT NULL DEFAULT '0' COMMENT '删除标记：0正常 1不正常',
   `version` INT(5) NOT NULL DEFAULT '0' COMMENT '数据版本',
   PRIMARY KEY (`id`)
) ENGINE=INNODB  DEFAULT CHARSET=utf8 COMMENT='用户表';

/*Table structure for table `sys_group` */

DROP TABLE IF EXISTS `sys_group`;

CREATE TABLE `sys_group` (
   `id` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
   `roleid` BIGINT(20) NOT NULL COMMENT '角色ID',
   `userid` BIGINT(20) NOT NULL COMMENT '用户ID',
   `remark` VARCHAR(100) DEFAULT NULL COMMENT '备注',
   `create_by` VARCHAR(20) DEFAULT NULL COMMENT '创建数据用户',
   `update_by` VARCHAR(20) DEFAULT NULL COMMENT '更新数据用户',
   `create_date` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建数据时间',
   `update_date` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新数据时间',
   `del_flag` INT(1) NOT NULL DEFAULT '0' COMMENT '删除标记：0正常 1不正常',
   `version` INT(5) NOT NULL DEFAULT '0' COMMENT '数据版本',
   PRIMARY KEY (`id`),
   KEY `fk_group_user` (`userid`),
   KEY `fk_group_role` (`roleid`),
   CONSTRAINT `fk_group_role` FOREIGN KEY (`roleid`) REFERENCES `sys_role` (`id`),
   CONSTRAINT `fk_group_user` FOREIGN KEY (`userid`) REFERENCES `sys_user` (`id`)
) ENGINE=INNODB  DEFAULT CHARSET=utf8 COMMENT='用户角色表：用户表和角色表的中间表';


/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
