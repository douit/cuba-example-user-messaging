alter table CEUM_MESSAGE add column READ_ boolean default false not null ;
alter table CEUM_MESSAGE drop column MESSAGE_BOX cascade ;
