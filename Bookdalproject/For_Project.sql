CREATE TABLE MEMBER(
ID VARCHAR2(30) NOT NULL,
PW VARCHAR2(25) NOT NULL,
NAME VARCHAR2(10) NOT NULL,
AGE NUMBER(5) NOT NULL,
PHONE VARCHAR2(30) NOT NULL,
GENDER NUMBER(2) NOT NULL,
CONSTRAINT MEMBER_ID_PK PRIMARY KEY(ID)
)

Select * from MEMBERs;
drop table members cascade constraints;
drop table members

update MEMBERs set phone = '010-7176-0953' where name = '김명주';
update MEMBERs set sex = 'M' where name = '김명주';
update MEMBERs set phone = '010-1111-2222' where name = '정재원';
update MEMBERs set sex = 'F' where name = '박수진';
update MEMBERs set sex = 'F' where name = '이은지';
update MEMBERs set phone = '010-2222-3333' where name = '박수진';
update MEMBERs set phone = '010-3333-4444' where name = '이은지';

/*Create table Reserved_book(
   User_name varchar2(100),
   book_name varchar2(100),
   book_id varchar2(100),
   author_Publisher varchar2(100),
   Day_to_Expire number(24),
   LIB_NAME VARCHAR2(30)
);*/

CREATE TABLE BOOK(
BOOK_NAME VARCHAR2(100) NOT NULL,
CODE NUMBER(30) NOT NULL,
PRICE NUMBER(20),
WRITER VARCHAR2(30),
PUBLISHER VARCHAR2(30),
LIB_NAME VARCHAR2(30) NOT NULL,
RENTAL_OK VARCHAR2(10) NOT NULL,
RENTAL_SUM NUMBER(10),
CONSTRAINT BOOK_nameCode_PK PRIMARY KEY(BOOK_NAME, CODE),
CONSTRAINT BOOK_LIBNAME_FK FOREIGN KEY(LIB_NAME)
	REFERENCES LIB(LIB_NAME)
)
SELECT * FROM BOOK

CREAGE TABLE DELE_INFO(
ORDER_NUMBER NUMBER(10),
ID VARCHAR2(100),
BOOK_NAME VARCHAR2(100),
NAME VARCHAR2(50),
ADDR VARCHAR2(100),
AGE NUMBER(30),
GENDER NUMBER(5),
CHARGE NUMBER(10),
NOW_LOCATION VARCHAR2(100)
CONSTRAINT DELEINFO_ORDER_PK PRIMARY KEY(ORDER_NUMBER),
CONSTRAIN DELINFO_ID_FK FOREIGN KEY(ID)
	REFERENCES MEMBER(ID)
)

select * from Reserved_book;

CREATE TABLE BOOKCART(
BOOK_NAME VARCHAR2(100),
CODE NUMBER(30),
WRITER VARCHAR2(50),
PUBLISHER VARCHAR2(50),
LIB_NAME VARCHAR2(30),
RENTAL_DAY NUMBER(30),
CONSTRAINT BOOKCART_nameCode_PK PRIMARY KEY(BOOK_NAME, CODE),
CONSTRAINT BOOKCART_NAME_FK FOREIGN KEY(BOOK_NAME,CODE)
	REFERENCES BOOK(BOOK_NAME,CODE),
CONSTRAINT BOOKCART_libName_FK FOREIGN KEY(LIB_NAME)
	REFERENCES LIB(LIB_NAME)
)

SELECT * FROM BOOKCART

CREATE TABLE LIB(
LIB_NAME VARCHAR2(50),
LOCATION VARCHAR2(100),
OPR_TIME VARCHAR2(300),
CLOSED VARCHAR2(100),
HOMEPAGE VARCHAR2(100),
BOOK_DATA NUMBER(7),
RENTAL_DAY NUMBER(5),
RENTAL_CNT NUMBER(5),
LIB_TEL VARCHAR2(30),
GRADE NUMBER(5),
CONSTRAINT LIB_LIBNAME_PK PRIMARY KEY(LIB_NAME)
)
select * from lib;

INSERT INTO LIB VALUES(
'상록도서관', '광주광역시 서구 상무대로 1171번길 11','자료실 매일 9:00~22:00, 어린이열람실 매일 9:00~18:00',
'매월 두번째, 네번째 월요일, 법정공휴일', 'http://www.seogu.gwangju.kr/library', 43478, 15, 5,'062-350-4589',NULL
)

INSERT INTO LIB VALUES(
'서구어린이생태도서관', '광주광역시 서구 풍암공원로 8','월~금 09:00 ~ 18:00 토,일 09:00 ~ 17:00',
'매월 두번째, 네번째 월요일, 법정공휴일', 'http://www.seogu.gwangju.kr/library', 43907, 15, 5,'062-350-4584',NULL
)

INSERT INTO LIB VALUES(
'서구공공도서관', '광주광역시 서구 마재로 3','종합자료실 평일 9:00~18:00 / 주말 9:00~17:00, 어린이자료실 평일 9:00~18:00 / 주말 9:00~17:00',
'매월 첫번째, 세번째 월요일 및 법정공휴일', 'http://www.seogu.gwangju.kr/library', 57544, 15, 5,'062-654-4306',NULL
)
select * from lib;
