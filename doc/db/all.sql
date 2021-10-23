drop table if exists `chapter`;
create table `chapter`(
    `id` char(8) not null default '' comment 'id',
    `course_id` char(8) comment '课程id',
    `name` varchar(255) comment '名称',
    primary key (`id`)
) engine = innodb default charset = utf8mb4 comment '大章';

insert into `chapter` (`id`, `course_id`, `name`) values (000000, 000000, '测试大章1');
insert into `chapter` (`id`, `course_id`, `name`) values (000001, 000000, '测试大章2');