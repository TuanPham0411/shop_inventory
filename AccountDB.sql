CREATE DATABASE AccountDB;
GO

USE AccountDB;
GO

CREATE TABLE Accounts (
    MSNV CHAR(5) PRIMARY KEY,
    FullName NVARCHAR(255) NOT NULL,
    BirthDate DATE,
    PhoneNumber NVARCHAR(20),
    Address NVARCHAR(255),
    Gender NVARCHAR(10),
    Role NVARCHAR(20) NOT NULL,
    username NCHAR(10) NOT NULL,
    password NCHAR(10) NOT NULL,
);

CREATE TABLE Recovery (
    MSNV CHAR(5) PRIMARY KEY,
    Question NVARCHAR(255),
    Answer NVARCHAR(255)
);
