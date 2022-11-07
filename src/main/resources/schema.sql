CREATE TABLE IF NOT EXISTS Employee ( 
user_id SERIAL PRIMARY KEY, 
name VARCHAR(50), 
name_kana VARCHAR(50),
password VARCHAR(250),
mail_address VARCHAR(50)

);

/*退勤*/
CREATE TABLE IF NOT EXISTS attendance ( 
user_id integer PRIMARY KEY ,
start_date DATE PRIMARY KEY, 
end_date DATE,
status VARCHAR(2),
start_time TIME(6),
end_time TIME(6),
break_time TIME(6),
note VARCHAR(200),
attendance_id serial,s
ADD PRIMARY KEY(user_id,start_date);

CREATE TABLE [ IF NOT EXISTS ] attendance (
  attendance_id serial UNIQUE
)

