-- begin CEUM_MESSAGE
alter table CEUM_MESSAGE add constraint FK_CEUM_MESSAGE_SENDER_ID foreign key (SENDER_ID) references SEC_USER(ID)^
alter table CEUM_MESSAGE add constraint FK_CEUM_MESSAGE_RECEIVER_ID foreign key (RECEIVER_ID) references SEC_USER(ID)^
alter table CEUM_MESSAGE add constraint FK_CEUM_MESSAGE_MESSAGE_TEXT_ID foreign key (MESSAGE_TEXT_ID) references CEUM_MESSAGE_TEXT(ID)^
create index IDX_CEUM_MESSAGE_MESSAGE_TEXT on CEUM_MESSAGE (MESSAGE_TEXT_ID)^
create index IDX_CEUM_MESSAGE_SENDER on CEUM_MESSAGE (SENDER_ID)^
create index IDX_CEUM_MESSAGE_RECEIVER on CEUM_MESSAGE (RECEIVER_ID)^
-- end CEUM_MESSAGE
