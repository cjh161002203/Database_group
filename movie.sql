--��Ӱ
create table Movie(
	mID int primary key,
	mname nvarchar(20),
	movieLanguage nvarchar(10),
	duration nvarchar(20),		--ʱ��
	area nvarchar(20),
	releaseTime date,
	othername nvarchar(100),
	content text,
	price float
)

--ְԱ
create table Worker(
	wid int primary key,
	wcountry nvarchar(20),
	wname nvarchar(30),
)

--���ݹ�ϵ
create table direct(
	wid int,
	mID int,
	constraint d_prim primary key(wid, mID)
)

--���ݹ�ϵ
create table act(
	wid int,
	mID int,
	constraint a_prim primary key(wid, mID)
)

--����ϵ
create table author(
	wid int,
	mID int,
	constraint at_prim primary key(wid, mID)
)

--���� type�ǹؼ��֣��ʸ�Ϊtyp
create table Typ(
	typename nvarchar(30) primary key
)

--��Ӱ���͹�ϵ
create table mtype(
	mID int,
	typename nvarchar(30),
	constraint mt_prim primary key(mID, typename)
)

--��ǩ
create table tag(
	tag nvarchar(30) primary key
)

--��Ӱ��ǩ��ϵ
create table mtag(
	mID int,
	tag nvarchar(30),
	constraint mtg_prim primary key(mID, tag)
)

drop table act
drop table author
drop table direct
drop table Movie
drop table mtag
drop table mtype
drop table tag
drop table Typ
drop table Worker