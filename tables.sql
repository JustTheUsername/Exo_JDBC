CREATE DATABASE school;

CREATE USER 'school'@'localhost' IDENTIFIED BY 'azerty';

GRANT ALL PRIVILEGES ON school.* TO 'school'@'localhost';

USE school;


CREATE TABLE Classes(id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
                     nom VARCHAR(12));

CREATE TABLE Matieres(id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
                      nom VARCHAR(16));

CREATE TABLE Eleves (id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
                     nom VARCHAR(32),
                     prenom VARCHAR(32),
                     classe INT,
                     FOREIGN KEY (classe) REFERENCES Classes(id));

CREATE TABLE MatieresEleves(idEleves INT,
                            idMatiere INT,
                            FOREIGN KEY(idEleves)REFERENCES Eleves(id),
                            FOREIGN KEY (idMatiere) REFERENCES Matieres(id));