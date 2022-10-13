CREATE TABLE IF NOT EXISTS Employee ( 
id SERIAL(8) PRIMARY KEY, 
name VARCHAR(50), 
name_kana VARCHAR(50),
password VARCHAR(250),
mail_address VARCHAR(50),
);

/*出勤*/
CREATE TABLE IF NOT EXISTS Attendance ( 
user_id VARCHAR(8) PRIMARY KEY FOREIGN KEY,
date DATE(8), 
status VARCHAR(2) FOREIGN KEY,
start_time TIME(8),
end_time TIME(8),
break_time TIME(8),
note VARCHAR(200),
);


