use adlister_db;

create table if NOT EXISTS users (
  id INT PRIMARY KEY AUTO_INCREMENT,
  username VARCHAR(50),
  email VARCHAR(50),
  password VARCHAR(20)
);

create table IF NOT EXISTS ads (
  id int KEY AUTO_INCREMENT,
  user_id int,
  title VARCHAR(60),
  description VARCHAR(80)
);

