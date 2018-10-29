
create table if not exists flyway_schema_history
(
	installed_rank integer not null,
	version varchar(50),
	description varchar(200) not null,
	type varchar(20) not null,
	script varchar(1000) not null,
	checksum integer,
	installed_by varchar(100) not null,
	installed_on timestamp default now() not null,
	execution_time integer not null,
	success boolean not null,
	constraint flyway_schema_history_pk
		primary key (installed_rank)
)
;

create index if not exists flyway_schema_history_s_idx
	on flyway_schema_history (success)
;

create table if not exists teacher
(
	teacher_id serial not null,
	first_name varchar(50) not null,
	last_name varchar(50) not null,
	middle_name varchar(50),
	age integer not null,
	address varchar(254) not null,
	phone_number varchar(20) not null,
	email varchar(254) not null,
	base_salary real not null,
	working_hours real not null,
	bonus real default 0.0 not null,
	hired_date date not null,
	level varchar(50) not null,
	constraint teacher_pkey
		primary key (teacher_id)
)
;

create table if not exists section
(
	section_id serial not null,
	name varchar(50) not null,
	class_number integer not null,
	constraint section_pkey
		primary key (section_id)
)
;

create table if not exists class_room
(
	class_room_id serial not null,
	section_id integer not null,
	name varchar(50) not null,
	capacity integer not null,
	constraint "classRoom_pkey"
		primary key (class_room_id)
)
;

alter table class_room
	add constraint "classRoom_section_id_fkey"
		foreign key (section_id) references section
;

create table if not exists course
(
	course_id serial not null,
	class_room_id integer not null,
	name varchar(50) not null,
	hours_number real not null,
	price real not null,
	start_date date not null,
	finish_date date not null,
	constraint course_pkey
		primary key (course_id)
)
;

alter table course
	add constraint course_class_room_id_fkey
		foreign key (class_room_id) references class_room
;

create table if not exists "testPaper"
(
	test_paper_id serial not null,
	name varchar(50) not null,
	duration real not null,
	teacher_id integer not null,
	course_id integer not null,
	constraint "testPaper_pkey"
		primary key (test_paper_id)
)
;

alter table "testPaper"
	add constraint "testPaper_teacher_id_fkey"
		foreign key (teacher_id) references teacher
;

alter table "testPaper"
	add constraint "testPaper_course_id_fkey"
		foreign key (course_id) references course
;

create table if not exists student
(
	student_id serial not null,
	course_id integer not null,
	teacher_id integer not null,
	first_name varchar(50) not null,
	last_name varchar(50) not null,
	middle_name varchar(50),
	age integer not null,
	address varchar(200) not null,
	phone_number varchar(20) not null,
	email varchar(254) not null,
	level varchar(50) not null,
	register_date date not null,
	finish_date date not null,
	constraint student_pkey
		primary key (student_id)
)
;

alter table student
	add constraint student_teacher_id_fkey
		foreign key (teacher_id) references teacher
;

alter table student
	add constraint student_course_id_fkey
		foreign key (course_course_id) references course
;

create table if not exists "testWritebyStudent"
(
	test_paper_id integer not null,
	student_id integer not null,
	test_score real not null,
	test_date date not null,
	constraint "testWritebyStudent_pkey"
		primary key (test_paper_id, student_id)
)
;

create table if not exists employee
(
	employee_id serial not null,
	department varchar(50) not null,
	first_name varchar(50) not null,
	last_name varchar(50) not null,
	middle_name varchar(50),
	age integer not null,
	address varchar(200) not null,
	phone_number varchar(20) not null,
	email varchar(254) not null,
	base_salary real not null,
	working_hours real not null,
	bonus real default 0.0 not null,
	hired_date date not null,
	constraint employee_pkey
		primary key (employee_id)
)
;

create table admin
(
	admin_id varchar(50) not null,
	name varchar(50) not null,
  username     varchar(50) not null,
  password varchar(50) not null,
  created date not null ,
	constraint admin_pkey
		primary key (admin_id)
)
;

