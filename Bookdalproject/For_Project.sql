create table  Member_Library(
	id varchar2(100),
	pw varchar2(100),
 	name varchar2(100),
 	age NUMBER (20),
 	phone varchar2(100),
 	sex varchar2(100)
)
Select * from Member_Library;
update Member_Library set phone = '010-7176-0953' where name = '�����';
update Member_Library set sex = 'M' where name = '�����';
update MEMBER_LIBRARY set phone = '010-1111-2222' where name = '�����';
update MEMBER_LIBRARY set sex = 'F' where name = '�ڼ���';
update MEMBER_LIBRARY set sex = 'F' where name = '������';
update MEMBER_LIBRARY set phone = '010-2222-3333' where name = '�ڼ���';
update MEMBER_LIBRARY set phone = '010-3333-4444' where name = '������';
Create table Reserved_book(
   User_name varchar2(100),
   book_name varchar2(100),
   book_id varchar2(100),
   author_Publisher varchar2(100),
   Day_to_Expire number(24),
   Library_name varchar2(100)
);
select * from Reserved_book;
create table LIB(
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
CONSTRAINT MEMBER_ID_PK PRIMARY KEY(LIB_NAME)
)
select * from lib;
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
