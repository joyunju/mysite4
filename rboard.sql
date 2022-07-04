-- 테이블 삭제 
drop table rboard;

-- 시퀀스 삭제 
drop sequence seq_rboard_no;

-- 테이블 생성 
create table rboard(
    no number,
    user_no number not null,
    title varchar2(500),
    content varchar2(4000),
    hit number,
    reg_date date not null,
    group_no number,
    order_no number,
    depth number,
    primary key(no),
    constraint rboard_fk foreign key (user_no)
    references users(no)
);

-- 시퀀스 생성 
create sequence seq_rboard_no
increment by 1
start with 1
nocache;

-- select 전체 확인
select *
from rboard;

--