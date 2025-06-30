package Day7;

public class Task1 {
	
	CREATE TABLE Student (
	    student_id INT PRIMARY KEY AUTO_INCREMENT,
	    first_name VARCHAR(100) NOT NULL,
	    last_name VARCHAR(100) NOT NULL,
	    email VARCHAR(100) UNIQUE NOT NULL,
	    enrollment_year YEAR NOT NULL
	);


	CREATE TABLE Course (
	    course_id INT PRIMARY KEY AUTO_INCREMENT,
	    course_name VARCHAR(100) NOT NULL,
	    course_code VARCHAR(20) UNIQUE NOT NULL,
	    fee DECIMAL(10, 2) NOT NULL,
	    credits INT NOT NULL
	);

	
	
	INSERT INTO Student (first_name, last_name, email, enrollment_year) VALUES
	('Alice', 'Johnson', 'alice.johnson@email.com', 2023),
	('Bob', 'Smith', 'bob.smith@email.com', 2022),
	('Charlie', 'Brown', 'charlie.brown@email.com', 2024),
	('Diana', 'Evans', 'diana.evans@email.com', 2021),
	('Ethan', 'Wright', 'ethan.wright@email.com', 2023);


	INSERT INTO Course (course_name, course_code, fee, credits) VALUES
	('Introduction to Programming', 'CS101', 500.00, 3),
	('Database Systems', 'CS102', 600.00, 4),
	('Web Development', 'CS103', 550.00, 3),
	('Computer Networks', 'CS104', 650.00, 4),
	('Operating Systems', 'CS105', 700.00, 4);
	
	
	UPDATE Course
	SET fee = 650.00
	WHERE course_code = 'CS102';

	
