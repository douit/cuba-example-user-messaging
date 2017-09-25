alter table CEUM_MESSAGE add constraint FK_CEUM_MESSAGE_SENDER foreign key (SENDER_ID) references SEC_USER(ID);
alter table CEUM_MESSAGE add constraint FK_CEUM_MESSAGE_RECEIVER foreign key (RECEIVER_ID) references SEC_USER(ID);
alter table CEUM_MESSAGE add constraint FK_CEUM_MESSAGE_MESSAGE_TEXT foreign key (MESSAGE_TEXT_ID) references CEUM_MESSAGE_TEXT(ID);
create index IDX_CEUM_MESSAGE_SENDER on CEUM_MESSAGE (SENDER_ID);
create index IDX_CEUM_MESSAGE_RECEIVER on CEUM_MESSAGE (RECEIVER_ID);
create index IDX_CEUM_MESSAGE_MESSAGE_TEXT on CEUM_MESSAGE (MESSAGE_TEXT_ID);