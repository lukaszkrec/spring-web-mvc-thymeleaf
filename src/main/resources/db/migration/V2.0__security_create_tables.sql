CREATE TABLE zajavka_user
(
    user_id   SERIAL       NOT NULL,
    user_name VARCHAR(20)  NOT NULL,
    email     VARCHAR(32)  not null,
    password  varchar(256) not null,
    name      varchar(32)  not null,
    active    boolean      not null,
    PRIMARY KEY (user_id),
    unique (user_name),
    unique (email)
);

CREATE table zajavka_role
(
    role_id SERIAL      not null,
    role    VARCHAR(20) not null,
    PRIMARY KEY (role_id)

);


CREATE table zajavka_user_role
(
    user_id INT not null,
    role_id INT not null,
    primary key (user_id, role_id),
    constraint fk_zajavka_user_role_user
        FOREIGN KEY (user_id)
            references zajavka_user (user_id),
    constraint fk_zajavka_user_role_role
        foreign key (role_id)
            references zajavka_role (role_id)
);


