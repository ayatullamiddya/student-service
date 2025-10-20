CREATE TABLE student (
    email VARCHAR(100) PRIMARY KEY,
    firstname VARCHAR(50) NOT NULL,
    lastname VARCHAR(50) NOT NULL,
    department VARCHAR(100),
    gender ENUM('Male', 'Female', 'Other'),
    coursename VARCHAR(100)
);