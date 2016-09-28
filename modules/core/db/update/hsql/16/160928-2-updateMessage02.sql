alter table CEUM_MESSAGE add column MESSAGE_BOX integer default 1 not null ;
-- alter table CEUM_MESSAGE add column MESSAGE_TEXT_ID varchar(36) ^
-- update CEUM_MESSAGE set MESSAGE_TEXT_ID = <default_value> ;
-- alter table CEUM_MESSAGE alter column MESSAGE_TEXT_ID set not null ;
alter table CEUM_MESSAGE add column MESSAGE_TEXT_ID varchar(36) not null ;
alter table CEUM_MESSAGE drop column MESSAGE cascade ;
