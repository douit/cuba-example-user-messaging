-- begin CEUM_MESSAGE
create table CEUM_MESSAGE (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    SENDER_ID varchar(36) not null,
    RECEIVER_ID varchar(36),
    SUBJECT varchar(255),
    ENTITY_REFERENCE varchar(255),
    MESSAGE_BOX integer not null,
    MESSAGE_TEXT_ID varchar(36) not null,
    --
    primary key (ID)
)^^-- end CEUM_MESSAGE
-- begin CEUM_MESSAGE_TEXT
create table CEUM_MESSAGE_TEXT (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    TEXT longvarchar not null,
    --
    primary key (ID)
)^
-- end CEUM_MESSAGE_TEXT
