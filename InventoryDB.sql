CREATE DATABASE InventoryDB;
GO
USE InventoryDB;

-- Bảng Items
CREATE TABLE Items (
    ItemID VARCHAR(10) PRIMARY KEY,
    Name NVARCHAR(255) NOT NULL,
    Style NVARCHAR(50),
    Gender NVARCHAR(20),
    Brand NVARCHAR(100),
    Material NVARCHAR(50),
    Origin NVARCHAR(50),
    Price DECIMAL(10, 2),
    Color NVARCHAR(50),
    CreateDate DATE
);

-- Bảng Locations
CREATE TABLE Locations (
    LocationID INT IDENTITY(1,1) PRIMARY KEY,
    LocationCode NVARCHAR(20) UNIQUE
);

-- Bảng Import
CREATE TABLE Import (
    ImportID INT IDENTITY(1,1) PRIMARY KEY,
    ItemID VARCHAR(10),
    Size NVARCHAR(10),
    Quantity INT,
    EmployeeID CHAR(5),
    Reason NVARCHAR(255),
    ImportDate DATE,
    FOREIGN KEY (ItemID) REFERENCES Items(ItemID)
);

-- Bảng Export
CREATE TABLE Export (
    ExportID INT IDENTITY(1,1) PRIMARY KEY,
    ItemID VARCHAR(10),
    Size NVARCHAR(10),
    Quantity INT,
    EmployeeID CHAR(5),
    Reason NVARCHAR(255),
    ExportDate DATE,
    FOREIGN KEY (ItemID) REFERENCES Items(ItemID)
);

-- Bảng Inventory
CREATE TABLE Inventory (
    InventoryID INT IDENTITY(1,1) PRIMARY KEY,
    ItemID VARCHAR(10),
    Size NVARCHAR(10),
    Quantity INT,
	LocationID INT,
    FOREIGN KEY (ItemID) REFERENCES Items(ItemID),
	FOREIGN KEY (LocationID) REFERENCES Locations(LocationID)
);