

/*******************************************************************************
   Drop database if it exists
********************************************************************************/
DROP USER project2 CASCADE;

/*******************************************************************************
   Create database
********************************************************************************/
CREATE USER project2
IDENTIFIED BY p4ssw0rd
DEFAULT TABLESPACE users
TEMPORARY TABLESPACE temp
QUOTA 10M ON users;

GRANT connect to project2;
GRANT resource to project2;
GRANT create session TO project2;
GRANT create table TO project2;
GRANT create view TO project2;



conn project2/p4ssw0rd


/*******************************************************************************
  User Data Tables
********************************************************************************/

CREATE TABLE users
(
    user_id number,
    username varchar2(50) unique,
    user_password varchar2(50) not null,
    first_name varchar2(50) not null,
    last_name varchar2(50) not null,
    address_id number,
    bio varchar2(250),
    email varchar2(50) unique not null,
    phone_number varchar2(50),
    role_id number,
    constraint user_pk primary key (user_id)
);


/*******************************************************************************
   Address Table
********************************************************************************/
create table address (
address_id number primary key,
address_street varchar2(50) not null,
address_city varchar2(50) not null,
address_state varchar2(50) not null,
address_zipcode varchar2(50) not null
);

/*******************************************************************************
   Address Foreign Keys
********************************************************************************/

alter table users add constraint address_fk
foreign key (address_id) REFERENCES address (address_id); 

/*******************************************************************************
   User Role Table
********************************************************************************/


create table user_role 
(
    user_role_id number primary key not null,
    user_role varchar2(15)
);

/*******************************************************************************
   Users Foreign Keys
********************************************************************************/

alter table users add constraint user_role_fk
foreign key (role_id) REFERENCES user_role (user_role_id); 

/*******************************************************************************
  Event Table
********************************************************************************/
create table event(
event_id number primary key not null,
host_id number not null,
event_name varchar2(200)  not null,
description varchar2(200) not null, 
event_location varchar2(200) not null,
date_and_time varchar2(50) unique not null,
capacity number,
phone_number number not null, 
attachment blob,
type_id number,
status_id number,
genre_id number
);

/*******************************************************************************
  Event Table
********************************************************************************/
alter table event add constraint host_id_fk
foreign key (host_id) REFERENCES users (user_id);

/*******************************************************************************
  Status Table
********************************************************************************/
create table status (
status_id number primary key not null,
status varchar2(50)

);

/*******************************************************************************
   Status Foreign Key
********************************************************************************/
alter table event add constraint event_status_fk
foreign key (status_id) REFERENCES status (status_id);



/*******************************************************************************
  Event Type Table
********************************************************************************/
create table event_type (
event_type_id number primary key not null,
event_type varchar2(50)

);

/*******************************************************************************
   Event Type Foreign Key
********************************************************************************/
alter table event add constraint event_type_fk
foreign key (type_id) REFERENCES event_type (event_type_id);


/*******************************************************************************
  Genre Table
********************************************************************************/
create table genre (
genre_id number primary key not null,
genre_type varchar2(30)
);

/*******************************************************************************
   Genre Foreign Key
********************************************************************************/
alter table event add constraint genre_fk
foreign key (genre_id) REFERENCES genre (genre_id);




/*******************************************************************************
   Sequences
********************************************************************************/
create sequence user_id_seq start with 1;

CREATE SEQUENCE event_id_seq START WITH 1;

CREATE SEQUENCE address_id_seq START WITH 1;

/*******************************************************************************
   Triggers
********************************************************************************/

--CREATE OR REPLACE TRIGGER user_id_trigger
--BEFORE INSERT OR UPDATE on users
--FOR EACH ROW
--BEGIN
--    IF INSERTING THEN
--        SELECT user_id_seq.nextVal INTO :new.user_id FROM dual;
--    ELSIF UPDATING THEN
--        SELECT :old.user_id INTO :new.user_id FROM dual;
--    END IF;
--END;
--/
--
--CREATE OR REPLACE TRIGGER address_id_trigger
--BEFORE INSERT OR UPDATE on address
--FOR EACH ROW
--BEGIN
--    IF INSERTING THEN
--        SELECT address_id_seq.nextVal INTO :new.address_id FROM dual;
--    ELSIF UPDATING THEN
--        SELECT :old.address_id INTO :new.address_id FROM dual;
--    END IF;
--END;
--/
--
--
--
--CREATE OR REPLACE TRIGGER event_id_trigger
--BEFORE INSERT OR UPDATE on event
--FOR EACH ROW
--BEGIN
--    IF INSERTING THEN
--        SELECT event_id_seq.nextVal INTO :new.event_id FROM dual;
--    ELSIF UPDATING THEN
--        SELECT :old.event_id INTO :new.event_id FROM dual;
--    END IF;
--END;
--/

commit;
exit;