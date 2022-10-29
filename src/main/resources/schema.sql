CREATE TABLE IF NOT EXISTS Employee ( 
<<<<<<< Updated upstream
user_id SERIAL PRIMARY KEY, 
name VARCHAR(50), 
name_kana VARCHAR(50),
password VARCHAR(250),
mail_address VARCHAR(50)
);

/*出勤*/
CREATE TABLE IF NOT EXISTS attendance ( 
user_id integer PRIMARY KEY ,
start_date DATE PRIMARY KEY, 
end_date DATE,
status VARCHAR(2),
start_time TIME(6),
end_time TIME(6),
break_time TIME(6),
note VARCHAR(200),
ADD PRIMARY KEY(user_id,start_date);
=======
id SERIAL(8) PRIMARY KEY, 
name VARCHAR(50), 
name_kana VARCHAR(50),
password VARCHAR(250),
mail_address VARCHAR(50),
);

/*出勤*/
CREATE TABLE IF NOT EXISTS Attendance ( 
user_id VARCHAR(8) PRIMARY KEY FOREIGN KEY,
start_date DATE(8), 
end_date DATE(8),
status VARCHAR(2) FOREIGN KEY,
start_time TIME(8),
end_time TIME(8),
break_time TIME(8),
note VARCHAR(200)
);
>>>>>>> Stashed changes


