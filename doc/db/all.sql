drop table if exists `chapter`;
create table `chapter`(
    `id` char(8) not null default '' comment 'id',
    `course_id` char(8) comment '课程id',
    `name` varchar(255) comment '名称',
    primary key (`id`)
) engine = innodb default charset = utf8mb4 comment '大章';

insert into `test` (`id`, `name`) values (1, '测试');
insert into `test` (`id`, `name`) values (2, '测试2');