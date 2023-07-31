insert into zajavka_user(user_id, user_name, email, password, name, active)
values (1, 'admin', 'admin@gmail.com', '$2a$12$aasRhylvwn4c6nXmT10UaOyONKJgmdrt8vwj13h5Z5f.vr4Zo.foa', 'Admin', true);
insert into zajavka_user(user_id, user_name, email, password, name, active)
values (2, 'user1', 'user1@gmail.com', '$2a$12$aasRhylvwn4c6nXmT10UaOyONKJgmdrt8vwj13h5Z5f.vr4Zo.foa', 'User1', true);


insert into zajavka_role (role_id, role)
values (1, 'ADMIN'),
       (2, 'USER');

insert into zajavka_user_role (user_id, role_id)
values (1, 1),
       (1, 2);

insert into zajavka_user_role (user_id, role_id)
values (2, 2);

