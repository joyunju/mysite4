-- 테이블 삭제 
drop table users;

-- 시퀀스 삭제 
drop sequence seq_users_no;

-- 테이블 생성 
create table users (
    no number,
    id varchar2(20) unique not null,
    password varchar2(20) not null,
    name varchar2(20),
    gender varchar2(10),
    primary key(no)
);

-- 시퀀스 생성 
create sequence seq_users_no
increment by 1
start with 1
nocache;

-- insert 추가 
insert into users
values(seq_users_no.nextval,'hijava','1234','구웅','male');

insert into users
values(seq_users_no.nextval,'hellojava','1234','유미','female');

insert into users
values(seq_users_no.nextval,'dog','1234','hamog','female');

-- delete
delete from users
where no= 3
and password= '1234';

delete from users
where no= 4;

--update문
update users 
set id = 'hisql',
    password = '1111',
    name = '루비',
    gender='female'
where no = 1;

-- id 수정
update users 
set id = 'gu'
where no = 1;


-- 테이블 확인 
select * from users;

-- select all
SELECT
    -- seq_users_no.nextval,
    no,
    id,
    password,
    name,
    gender
FROM
    users
order by no desc;
    
-- 커밋 
commit;

-- 롤백 
rollback;

-- 확인
SELECT
    *
FROM
    users
ORDER BY no ASC;

-- no 번호로 확인 
select  no,
        id,
        name,
        password,
        gender
from users
where no = 1;


