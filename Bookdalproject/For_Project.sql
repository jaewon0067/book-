CREATE TABLE MEMBER_library(
	ID VARCHAR2(30) NOT NULL,
	PW VARCHAR2(25) NOT NULL,
	NAME VARCHAR2(10) NOT NULL,
	AGE VARCHAR2(5) NOT NULL,
	PHONE VARCHAR2(30) NOT NULL,
	GENDER varchar2(10) NOT NULL,
	ADDR VARCHAR2(300) NOT NULL,
	CONSTRAINT MEMBER_ID_PK PRIMARY KEY(ID),
	CONSTRAINT MEMBER_GENDER_CK CHECK(GENDER IN('F', 'M'))
)

Select * from Member_Library;
<<<<<<< HEAD


update Member_Library set phone = '010-7176-0953' where name = '김명주';
update Member_Library set sex = 'M' where name = '김명주';
update MEMBER_LIBRARY set phone = '010-1111-2222' where name = '정재원';
update MEMBER_LIBRARY set sex = 'F' where name = '박수진';
update MEMBER_LIBRARY set sex = 'F' where name = '이은지';
update MEMBER_LIBRARY set phone = '010-2222-3333' where name = '박수진';
update MEMBER_LIBRARY set phone = '010-3333-4444' where name = '이은지';
=======


ALTER TABLE MEMBER_library MODIFY GENDER VARCHAR2(20);

ALTER TABLE MEMBER_library


drop table MEMBER_library cascade constraints;
DROP TABLE MEMBER_library
>>>>>>> branch 'master' of https://github.com/jaewon0067/book-.git

Select * from MEMBER_library; 

INSERT INTO MEMBER_LIBRARY VALUES('sj1004','1234','박수진',25,'010-1111-3333','F','광주광역시 풍암동')
INSERT INTO MEMBER_LIBRARY VALUES('ej1004','1234','이은지',25,'010-1234-5678','F','광주광역시 광산구')
INSERT INTO MEMBER_LIBRARY VALUES('mj1004','1234','김명주',26,'010-1111-2222','M','광주광역시 광산구 월계동')
INSERT INTO MEMBER_LIBRARY VALUES('jw1004','1234','정재원',25,'010-2222-3333','F','광주광역시 송하동 CGI센터')





CREATE TABLE BOOK( -- 어레이리스트에 담겨있음
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
);
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


CREATE TABLE DELE_INFO(
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
BOOK_NAME VARCHAR2(100) NOT NULL,
CODE NUMBER(30) NOT NULL,
WRITER VARCHAR2(50),
PUBLISHER VARCHAR2(50),
LIB_NAME VARCHAR2(30) NOT NULL,
RENTAL_DAY NUMBER(30) NOT NULL,
CONSTRAINT BOOKCART_idCode_PK PRIMARY KEY(ID, CODE),
CONSTRAINT BOOKCART_ID_FK FOREIGN KEY(ID)
        REFERENCES MEMBER_LIBRARY(ID),
CONSTRAINT BOOKCART_ID_FK FOREIGN KEY(BOOK_NAME, CODE)
        REFERENCES BOOK(BOOK_NAME, CODE),
CONSTRAINT BOOKCART_libName_FK FOREIGN KEY(LIB_NAME)
        REFERENCES LIB(LIB_NAME),
CONSTRAINT BOOKCART 
)

SELECT * FROM BOOKCART

CREATE TABLE LIB(
	LIB_NAME VARCHAR2(50) NOT NULL,
	LOCATION VARCHAR2(100) NOT NULL,
	OPR_TIME VARCHAR2(300) NOT NULL,
	CLOSED VARCHAR2(100) NOT NULL,
	HOMEPAGE VARCHAR2(100) NOT NULL,
	BOOK_DATA NUMBER(7) NOT NULL,
	RENTAL_DAY NUMBER(5) NOT NULL,
	RENTAL_CNT NUMBER(5) NOT NULL,
	LIB_TEL VARCHAR2(30) NOT NULL,
	GRADE NUMBER(5),
	CONSTRAINT LIB_LIBNAME_PK PRIMARY KEY(LIB_NAME)

)

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

CREATE TABLE DELI_INFO(
	ORDER_NUMBER NUMBER(10) NOT NULL,
	ID VARCHAR2(100) NOT NULL,
	BOOK_NAME VARCHAR2(100) NOT NULL,
	NAME VARCHAR2(50) NOT NULL,
	ADDR VARCHAR2(100) NOT NULL,
	AGE NUMBER(30) NOT NULL,
	GENDER NUMBER(5) NOT NULL,
	CHARGE NUMBER(10)  NOT NULL,
	LIB_NAME varchar2(100) NOT NULL,
	D_DAY 
	NOW_LOCATION VARCHAR2(100)
	CONSTRAINT DELIINFO_ORDER_PK PRIMARY KEY(ORDER_NUMBER),
	CONSTRAINT DELIINFO_ID_FK FOREIGN KEY(ID)
	        REFERENCES MEMBER(ID),
	CONSTRAINT DELIINFO_BOOKNAME_FK FOREIGN KEY(BOOK_NAME)
	        REFERENCES BOOK(BOOK_NAME),
	CONSTRAINT DELI_INFO_GENDER_CK CHECK(GENDER IN('F', 'M')),
	CONSTRAINT DELI_INFO_DELISTATE_CK CHECK(DELI_STATE IN('배송중','대출중','반납완료'))
)
Select * from DELI_INFO;
