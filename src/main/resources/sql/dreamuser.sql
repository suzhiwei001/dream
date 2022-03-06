create table user_base
(
    uid              int auto_increment
        primary key,
    user_role        int         null,
    register_source  int         null,
    user_name        varchar(10) null,
    nick_name        varchar(10) null,
    gender           varchar(10) null,
    birthday         varchar(10) null,
    signature        varchar(10) null,
    mobile           varchar(10) null,
    mobile_bind_time timestamp   null,
    email            varchar(10) null,
    email_bind_time  timestamp   null,
    face             varchar(10) null,
    create_time      timestamp   null,
    update_time      timestamp   null,
    push_token       varchar(10) null
);