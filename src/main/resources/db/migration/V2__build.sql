
create table admin
(
	admin_id serial not null,
	name varchar(50) not null,
  username     varchar(50) not null,
  password varchar(254) not null,
  created date not null ,
	constraint admin_pkey
		primary key (admin_id)
)
;

