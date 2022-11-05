CREATE TABLE IF NOT EXISTS Employee ( 
user_id SERIAL PRIMARY KEY, 
name VARCHAR(50), 
name_kana VARCHAR(50),
password VARCHAR(250),
mail_address VARCHAR(50)
);

/*出勤*/
CREATE TABLE IF NOT EXISTS Attendance ( 
attendance_id integer PRIMARY KEY ,
start_date DATE,
end_date DATE,
status VARCGAR(2),
start_time TIME(6),
end_time TIME(6),
note VARCHAR(200));
FOREIGN KEY (user_id)
REFERENCES employee (user_id)
);

