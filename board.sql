-- 테이블 삭제 
drop table board;

-- 시퀀스 삭제 
drop sequence seq_board_no;

-- 테이블 생성 
create table board(
    no number,
    title varchar2(500) not null,
    content varchar2(4000),
    hit number,
    reg_date date not null,
    user_no number not null,
    primary key(no),
    constraint board_fk foreign key (user_no)
    references users(no)
);

-- 시퀀스 생성 
create sequence seq_board_no
increment by 1
start with 1
nocache;

--select문(리스트)
select  b.no,
        b.title,
        u.name,
        b.hit,
        to_char(b.reg_date, 'yy-mm-dd hh:mi') regDate,
        b.user_no userNo
from board b, users u
where b.user_no = u.no
and b.title like '%안녕%'
order by no desc;

-- insert 추가 
insert into board
values (seq_board_no.nextval, '제목fdf2', '내용fdfd2', 0, sysdate, 3);

insert into board
values (seq_board_no.nextval, '2번째 제목입니다.', '2번째 내용입니다.', 0, sysdate, 2);

-- delete : t삭제
delete from board
where no =1;

delete from users
where no= 4;

--update문
update board
set title = '야호',
    content = 'adadewrw'
where no = '8';

-- 테이블 확인 
select * from board;

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
    board
ORDER BY no ASC;

--한명 selest
 
select  b.no,
        u.name,
        b.hit,
        b.title,
        to_char(b.reg_date, 'yy-mm-dd') regDate,
        b.content,
        b.user_no userNo
from board b, users u
where b.user_no = u.no
and b.no = 16;

-- board 테이블과 users 테이블에서 no가 같은 select 확인 
select *
from board b, users u
where b.user_no = u.no;

-- board 테이블과 users 테이블에서 no가 같은 select 확인 
select  b.no,
        b.title,
        b.content,
        b.hit,
        b.reg_date,
        b.user_no,
        u.name
from board b, users u
where b.user_no = u.no;

-- 조건 : 제목 이라는 단어를 타이틀에서 포함하고 있는지
select *
from board
where title like '%제목%';















