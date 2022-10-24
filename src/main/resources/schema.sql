CREATE TABLE IF NOT EXISTS Employee ( 
user_id SERIAL PRIMARY KEY, 
name VARCHAR(50), 
name_kana VARCHAR(50),
password VARCHAR(250),
mail_address VARCHAR(50)
);

/*出勤*/
CREATE TABLE IF NOT EXISTS Attendance ( 
attendance_id SERIAL PRIMARY KEY,
user_id INTEGER,
start_date DATE,
end_date DATE,
status VARCHAR(3),
start_time TIME(6),
end_time TIME(6),
break_time TIME(6),
note VARCHAR(200),
reason_for_revision VARCHAR(100),
   CONSTRAINT fk_employee
      FOREIGN KEY(user_id) 
	  REFERENCES Employee(user_id)
);
