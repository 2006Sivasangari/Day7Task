package Day7;

public class Day7Main{
	CREATE DATABASE LibraryDB;
	USE LibraryDB;


	CREATE TABLE Books (
	    BookID INT PRIMARY KEY AUTO_INCREMENT,
	    Title VARCHAR(255),
	    Author VARCHAR(100),
	    Genre VARCHAR(50),
	    YearPublished INT
	);


	CREATE TABLE Members (
	    MemberID INT PRIMARY KEY AUTO_INCREMENT,
	    Name VARCHAR(100),
	    Email VARCHAR(100),
	    MembershipDate DATE
	);

	CREATE TABLE BorrowRecords (
	    RecordID INT PRIMARY KEY AUTO_INCREMENT,
	    BookID INT,
	    MemberID INT,
	    BorrowDate DATE,
	    ReturnDate DATE,
	    FOREIGN KEY (BookID) REFERENCES Books(BookID),
	    FOREIGN KEY (MemberID) REFERENCES Members(MemberID)
	);
	
	INSERT INTO Books (Title, Author, Genre, YearPublished) VALUES
	('1984', 'George Orwell', 'Dystopian', 1949),
	('To Kill a Mockingbird', 'Harper Lee', 'Fiction', 1960),
	('The Great Gatsby', 'F. Scott Fitzgerald', 'Classic', 1925);

	
	INSERT INTO Members (Name, Email, MembershipDate) VALUES
	('Alice Johnson', 'alice.j@example.com', '2023-01-15'),
	('Bob Smith', 'bob.s@example.com', '2022-11-03'),
	('Clara Davis', 'clara.d@example.com', '2024-05-20');
	
	INSERT INTO BorrowRecords (BookID, MemberID, BorrowDate, ReturnDate) VALUES
	(1, 2, '2025-06-01', '2025-06-15'),
	(2, 1, '2025-06-10', NULL),
	(3, 3, '2025-06-20', '2025-06-28');


	


