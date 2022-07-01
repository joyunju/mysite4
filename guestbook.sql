-- 테이블 삭제 
drop table guestbook;

-- 시퀀스 삭제 
drop sequence seq_guestbook_no;

-- 테이블 생성
create table guestbook (
  no        number,
  name      varchar2(80),
  password  varchar2(20),
  content   varchar2(2000),
  reg_date  date,
  primary key(no)	
);

-- no number 뒤에 데이터값을 할당하지 않으면 자동으로 38개로 설정된다

-- 시쿼스 생성 
create sequence seq_guestbook_no
increment by 1 
start with 1 
nocache ;

-- insert 생성 
insert into guestbook
			       (no,
			        name,
			        password,	
			        content,
			        reg_date)
values (seq_guestbook_no.nextval, 
        '이정재', 
        '1234', 
        '방문합니다.',
        sysdate);
 
insert into guestbook
values (seq_guestbook_no.nextval, 
        '정우성', 
        '1234', 
        '방문합니다.',
        sysdate);  
        
-- 커밋
commit;

-- 롤백
rollback;

-- delete : 삭제
delete from guestbook
where no= 1 
and password= '1234';

delete from guestbook
where no= 4;

--select all
select 	no,
        name,
        password,	
        content,
        reg_date
from guestbook
order by no desc;

-- 확인
SELECT
    *
FROM
    guestbook;

--password 가져오기
SELECT
    password
FROM
    guestbook
WHERE
    no = 1;

--패스워드 ,no 삭제
DELETE FROM guestbook
WHERE
        no = 2
    AND password = 'qkqh';
