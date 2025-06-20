CREATE DATABASE library_project;
USE library_project;

CREATE TABLE library(
	isbn VARCHAR(100),
    type VARCHAR(100),
    price INTEGER,
    PRIMARY KEY(isbn)
);