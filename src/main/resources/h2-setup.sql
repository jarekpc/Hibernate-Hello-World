--h2
CREATE TABLE Person (
person_id BIGINT primary key auto_increment,
name varchar(10) 
);

CREATE TABLE Phone(
phone_id BIGINT primary key auto_increment,
number varchar(255),
person_id bigint
);
ALTER TABLE Phone 
ADD CONSTRAINT PERSON_ID_FK 
FOREIGN KEY(PERSON_ID) REFERENCES PERSON(PERSON_ID)
--