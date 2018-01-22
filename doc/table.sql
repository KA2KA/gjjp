DROP TABLE IF EXISTS sys_perm;

DROP TABLE IF EXISTS sys_menu;

DROP TABLE IF EXISTS sys_role;

DROP TABLE IF EXISTS sys_group;

DROP TABLE IF EXISTS sys_user;

/*==============================================================*/
/* Table: sys_perm                                        */
/*==============================================================*/
CREATE TABLE sys_perm
(
   ID                   INT NOT NULL   AUTO_INCREMENT COMMENT '权限ID',
   MENUID               INT NOT NULL COMMENT '菜单ID',
   ROLEID               INT NOT NULL COMMENT '角色ID',
   PRIMARY KEY (ID)
);

ALTER TABLE sys_perm COMMENT '权限表：关联角色表和菜单表
';

/*==============================================================*/
/* Table: sys_menu                                            */
/*==============================================================*/
CREATE TABLE sys_menu
(
   ID                   INT NOT NULL AUTO_INCREMENT COMMENT '菜单ID' ,
   MENUNAME             VARCHAR(10) COMMENT '菜单名称',
   PARENT_MENUID         INT COMMENT '父菜单ID',
   PRIMARY KEY (ID)
);

ALTER TABLE sys_menu COMMENT '菜单表：用来添加菜单';

/*==============================================================*/
/* Table: sys_role                                            */
/*==============================================================*/
CREATE TABLE sys_role
(
   ID                   INT NOT NULL   AUTO_INCREMENT COMMENT '角色ID',
   ROLENAME             VARCHAR(20) COMMENT '角色名',
   DESCRIPTION          VARCHAR(50) COMMENT '描述',
   PRIMARY KEY (ID)
);

ALTER TABLE sys_role COMMENT '角色表';

/*==============================================================*/
/* Table: sys_group                                        */
/*==============================================================*/
CREATE TABLE sys_group
(
   ID                   INT NOT NULL   AUTO_INCREMENT COMMENT '主键ID',
   ROLEID               INT NOT NULL COMMENT '角色ID',
   USERID               INT NOT NULL COMMENT '用户ID',
   PRIMARY KEY (ID)
);

ALTER TABLE sys_group COMMENT '用户角色表：用户表和角色表的中间表';

/*==============================================================*/
/* Table: sys_user                                            */
/*==============================================================*/
CREATE TABLE sys_user
(
   ID                   INT NOT NULL   AUTO_INCREMENT COMMENT '用户ID',
   USERNAME             VARCHAR(20) COMMENT '用户名',
   PASSWORD             VARCHAR(20) COMMENT '用户密码',
   NICKNAME             VARCHAR(20) COMMENT '昵称',
   PRIMARY KEY (ID)
);

ALTER TABLE sys_user COMMENT '用户表';

ALTER TABLE sys_perm ADD CONSTRAINT perm_menuid FOREIGN KEY (MENUID)
      REFERENCES sys_menu(ID) ON DELETE RESTRICT ON UPDATE RESTRICT;

ALTER TABLE sys_perm ADD CONSTRAINT perm_roleid FOREIGN KEY (ROLEID)
      REFERENCES sys_role (ID) ON DELETE RESTRICT ON UPDATE RESTRICT;

ALTER TABLE sys_group ADD CONSTRAINT group_userid FOREIGN KEY (USERID)
      REFERENCES sys_user (ID) ON DELETE RESTRICT ON UPDATE RESTRICT;

ALTER TABLE sys_group ADD CONSTRAINT group_roleid FOREIGN KEY (ROLEID)
      REFERENCES sys_role (ID) ON DELETE RESTRICT ON UPDATE RESTRICT;