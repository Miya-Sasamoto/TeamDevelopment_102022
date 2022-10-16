INSERT INTO Employee (id, name, name_kana, password, mail_address) 
VALUES('00000001','ｔａｒｏｕ', 'タロウ'，'00000001','tarou@example.com');

INSERT INTO Attendance(
user_id,
start_date,
end_date,
status,
start_time,
end_time,
break_time,
note
)
VALUES('00000001','2022-01-01','2022-01-01','出勤','09:00','18:00','01:00','良好'）