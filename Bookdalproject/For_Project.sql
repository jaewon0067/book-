CREATE TABLE MEMBER(
	ID VARCHAR2(30) NOT NULL,
	PW VARCHAR2(25) NOT NULL,
	NAME VARCHAR2(10) NOT NULL,
	AGE NUMBER(5) NOT NULL,
	PHONE VARCHAR2(30) NOT NULL,
	GENDER NUMBER(2) NOT NULL,
	CONSTRAINT MEMBER_ID_PK PRIMARY KEY(ID)
	CONSTRAINT MEMBER_GENDER_CK CHECK(GENDER IN('F', 'M'))
)
Select*from MEMBER;
Select * from Member_Library;
update Member_Library set phone = '010-7176-0953' where name = '�����';
update Member_Library set sex = 'M' where name = '�����';
update MEMBER_LIBRARY set phone = '010-1111-2222' where name = '�����';
update MEMBER_LIBRARY set sex = 'F' where name = '�ڼ���';
update MEMBER_LIBRARY set sex = 'F' where name = '������';
update MEMBER_LIBRARY set phone = '010-2222-3333' where name = '�ڼ���';
update MEMBER_LIBRARY set phone = '010-3333-4444' where name = '������';

--Create table Reserved_book(
--   User_name varchar2(100),
--   book_name varchar2(100),
--   book_id varchar2(100),
--   author_Publisher varchar2(100),
--   Day_to_Expire number(24),
--   LIB_NAME VARCHAR2(30)
--);

CREATE TABLE BOOK( -- ��̸���Ʈ�� �������
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

select * from Reserved_book;

CREATE TABLE BOOKCART(
	BOOK_NAME VARCHAR2(100) NOT NULL,
	CODE NUMBER(30) NOT NULL,
	WRITER VARCHAR2(50),
	PUBLISHER VARCHAR2(50),
	LIB_NAME VARCHAR2(30) NOT NULL,
	RENTAL_DAY NUMBER(30) NOT NULL,
	CONSTRAINT BOOKCART_nameCode_PK PRIMARY KEY(BOOK_NAME, CODE),
	CONSTRAINT BOOKCART_nameCode_FK FOREIGN KEY(BOOK_NAME,CODE),
	        REFERENCES BOOK(BOOK_NAME,CODE),
	CONSTRAINT BOOKCART_libName_FK FOREIGN KEY(LIB_NAME)
	        REFERENCES LIB(LIB_NAME)
)


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
'��ϵ�����', '���ֱ����� ���� �󹫴�� 1171���� 11','�ڷ�� ���� 9:00~22:00, ��̿����� ���� 9:00~18:00',
'�ſ� �ι�°, �׹�° ������, ����������', 'http://www.seogu.gwangju.kr/library', 43478, 15, 5,'062-350-4589',NULL
)

INSERT INTO LIB VALUES(
'������̻��µ�����', '���ֱ����� ���� ǳ�ϰ����� 8','��~�� 09:00 ~ 18:00 ��,�� 09:00 ~ 17:00',
'�ſ� �ι�°, �׹�° ������, ����������', 'http://www.seogu.gwangju.kr/library', 43907, 15, 5,'062-350-4584',NULL
)

INSERT INTO LIB VALUES(
'��������������', '���ֱ����� ���� ����� 3','�����ڷ�� ���� 9:00~18:00 / �ָ� 9:00~17:00, ����ڷ�� ���� 9:00~18:00 / �ָ� 9:00~17:00',
'�ſ� ù��°, ����° ������ �� ����������', 'http://www.seogu.gwangju.kr/library', 57544, 15, 5,'062-654-4306',NULL
)
select * from lib;

CREATE TABLE DELE_INFO(
	ORDER_NUMBER NUMBER(10) NOT NULL,
	ID VARCHAR2(100) NOT NULL,
	BOOK_NAME VARCHAR2(100) NOT NULL,
	NAME VARCHAR2(50) NOT NULL,
	ADDR VARCHAR2(100) NOT NULL,
	AGE NUMBER(30) NOT NULL,
	GENDER NUMBER(5) NOT NULL,
	CHARGE NUMBER(10)  NOT NULL,
	NOW_LOCATION VARCHAR2(100),
	CONSTRAINT DELIINFO_ORDER_PK PRIMARY KEY(ORDER_NUMBER),
	CONSTRAINT DELIINFO_ID_FK FOREIGN KEY(ID)
	        REFERENCES MEMBER(ID),
	CONSTRAINT DELIINFO_BOOKNAME_FK FOREIGN KEY(BOOK_NAME)
	        REFERENCES BOOK(BOOK_NAME),
	CONSTRAINT MEMBER_GENDER_CK CHECK(GENDER IN('F', 'M'))
)
