-- 系统用户表
create table if not exists t_syst_user(
	id int not null auto_increment,
	username varchar(20) not null comment '用户名',
	password varchar(20) not null comment '密码',
	mobile varchar(15) comment '手机号',
	email varchar(50) comment '邮箱',
	type int(50) comment '用户类别',
	crate_time datetime comment '创建日期',
	state int default 0 comment '状态 0=正常/1=删除',
	primary key(id)
)engine=innoDB default charset=utf8 comment '系统用户表';