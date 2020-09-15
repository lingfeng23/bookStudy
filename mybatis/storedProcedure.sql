-- 第一个存储过程，根据用户ID查信息
DROP PROCEDURE IF Exists 'select_user_by_id';

DELIMITER ;;
CREATE PROCEDURE 'select_user_by_id'(
    IN id int,
    OUT name VARCHAR(50),
    OUT password VARCHAR(50),
    OUT email VARCHAR(50)
)
BEGIN
-- 根据用户ID查询其他数据
select name, password, email, info
INTO name, password, email, info
from sys_user
WHERE id = userId;
END
;;
DELIMITER ;

-- 第二个存储过程，查询总数和分页
DROP PROCEDURE IF EXISTS 'select_user_page';
DELIMITER ;;
CREATE PROCEDURE 'select_user_page'(
    IN id int,
    IN _offset BIGINT,
    IN _limit BIGINT,
    OUT total BIGINT
)
BEGIN
-- 查询数据总数
select count(*)
INTO total
from sys_user
WHERE name like concat('%','name','%');

select *
from sys_user
WHERE name like concat('%','name','%');
limit _offset , _limit;
END
;;
DELIMITER ;