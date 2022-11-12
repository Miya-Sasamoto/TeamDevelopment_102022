CREATE TABLE IF NOT EXISTS employee ( 
user_id SERIAL PRIMARY KEY, 
name VARCHAR(50), 
nameKana VARCHAR(50),
mailAddress VARCHAR(50),
passWord VARCHAR(250)
);

/*出勤*/
CREATE TABLE IF NOT EXISTS Attendance ( 
user_id INTEGER PRIMARY KEY,
start_date DATE,
	end_date DATE,
status VARCHAR(2),
start_time TIME(8),
end_time TIME(8),
break_time TIME(8),
note VARCHAR(200),
	FOREIGN KEY (user_id)
	REFERENCES Employee (user_id)
);
