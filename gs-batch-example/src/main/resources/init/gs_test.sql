/*
navicat mysql data transfer

source server         : me
source server version : 80013
source host           : localhost:3306
source database       : gs

target server type    : mysql
target server version : 80013
file encoding         : 65001

date: 2019-03-28 17:01:16
*/

--set foreign_key_checks=0;

-- ----------------------------
-- table structure for gs_test
-- ----------------------------
--drop table if exists `gs_test`;
create table `gs_test` (
  `id` int(11) not null auto_increment,
  `name` varchar(255) collate utf8mb4_unicode_ci not null,
  primary key (`id`)
) engine=innodb auto_increment=1 default charset=utf8mb4 collate=utf8mb4_unicode_ci;

-- ----------------------------
-- records of gs_test
-- ----------------------------
insert into `gs_test` values ('1', '2we');
insert into `gs_test` values ('2', 'wer');
insert into `gs_test` values ('3', 'sd');
insert into `gs_test` values ('4', 'sdfasd');
insert into `gs_test` values ('5', 'asdf');
insert into `gs_test` values ('6', 'sf');
insert into `gs_test` values ('7', '3sdf');
insert into `gs_test` values ('8', 'fsda');
