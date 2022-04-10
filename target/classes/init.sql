insert into roles(role_id,name) values (default,'ADMIN');
insert into roles(role_id,name) values (default,'USER');

insert into users(user_id,username,password) values(default,'$2a$12$AQUByh7Rlp/.cyerPM72v.Fk1JG2A2a3yfM8EBdZgEo4AefztfVIe','ADMIN');
insert into users(user_id,username,password) values(default,'$2a$12$DmSIhO4JB6neQkoo9by9..bA6U93SPLbnHE7ssNe6YvgvHUvlUAyi','USER');

insert into user_roles(role_id,user_id) values (1,1);
insert into user_roles(role_id,user_id) values (2,2);