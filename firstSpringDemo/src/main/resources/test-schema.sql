DROP TABLE demo IF EXISTS;

CREATE TABLE demo (
	id integer generated by default as identity,
	age integer not null check (age<=36 AND age>=0),
	colour varchar(255) not null,
	habitat varchar(255) not null,
	name varchar(255) not null,
	primary key (id)
);

ALTER TABLE demo 
ADD CONSTRAINT UK_8qrhl5wlohdjoko9nrorkdjkp UNIQUE (name);