1. 회원가입한 정보를 저장할 수 있는 'web_member'테이블을 만드시오.
   컬럼명 : m_email / m_pw / m_tel / m_adress
	
   DROP table web_member cascade constraint
   DROP table web_message cascade constraint
   DROP sequence num_seq
   
   CREATE table web_member(
   m_email varchar(50),
   m_pw varchar(20) not null,
   m_tel varchar(20) not null,
   m_adress varchar(100) not null,
   constraint web_member_pk primary key(m_email)
   );
	
   CREATE table web_message(
	m_num NUMBER,
	m_sendName varchar(50) not null,
	m_receiveEmail varchar(50) not null,
	m_content varchar(200),
	m_sendDate date not null,
	constraint web_message_pk primary key(m_num)
   );
   
   CREATE sequence num_seq increment by 1 start with 1;
   
   insert into web_message values(num_seq.nextval,'test','1','test 내용',sysdate)
   
	select * from web_member;
	select * from web_message;






