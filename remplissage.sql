INSERT INTO classes (id,nom) VALUES (1,"6eme"),(2,"5eme"),(3,"4eme"),(4,'3eme'),(5,"2nd"),(6,"1ere"),(7,"terminale");

INSERT INTO `Eleves` (`nom`,`prenom`,`classe`) VALUES ("Sandoval","Fritz",5),("Trujillo","Phelan",4),("Howard","Sawyer",4),("Carrillo","Abigail",7),("Holt","Anika",4),("Dunn","Jane",3),("Hull","Kaden",6),("Grimes","Alan",3),("Bruce","Thomas",1),("Mclean","Sybill",3);
INSERT INTO `Eleves` (`nom`,`prenom`,`classe`) VALUES ("Farrell","Signe",5),("Elliott","McKenzie",3),("Pruitt","Rhoda",7),("Sweet","Xandra",4),("Phelps","Alvin",1),("Sharpe","Abigail",6),("Fuentes","Tatyana",7),("Howard","Craig",7),("Mcfadden","Helen",6),("Walton","Zenia",3);
INSERT INTO `Eleves` (`nom`,`prenom`,`classe`) VALUES ("Ochoa","Orlando",5),("Bailey","Aiko",2),("King","Dominique",4),("Ball","Helen",2),("Olson","Phyllis",6),("Tillman","Eric",4),("Melendez","Keiko",4),("Ochoa","Jena",2),("Richard","Hayfa",2),("Bender","Karly",3);
INSERT INTO `Eleves` (`nom`,`prenom`,`classe`) VALUES ("Benjamin","Micah",1),("Wise","Victoria",5),("Barron","Bree",2),("Cunningham","Sydney",3),("Vang","Aimee",2),("Ingram","Hiram",6),("Benson","Stewart",7),("Shields","Zeus",7),("Chan","Alfreda",4),("Battle","Ferdinand",5);
INSERT INTO `Eleves` (`nom`,`prenom`,`classe`) VALUES ("Sutton","Barrett",7),("Levy","Wing",3),("Sanders","Benedict",3),("Pratt","Patrick",4),("Hawkins","Lysandra",2),("Rice","Amy",2),("Stanton","Bianca",3),("Odonnell","Leonard",5),("Manning","Jameson",2),("Burgess","Uriah",3);
INSERT INTO `Eleves` (`nom`,`prenom`,`classe`) VALUES ("Burton","Geoffrey",1),("Maldonado","Melissa",2),("Duke","Jack",3),("Howe","Debra",4),("Cruz","Taylor",1),("Kramer","Echo",6),("Conner","Hunter",6),("Wells","Iliana",6),("Mcguire","Azalia",4),("Bradshaw","Yael",1);
INSERT INTO `Eleves` (`nom`,`prenom`,`classe`) VALUES ("Mercer","Jacob",3),("Schultz","Melvin",4),("Brown","Lee",3),("Blair","Asher",5),("Jensen","Hu",3),("Mcgowan","Dominique",2),("Kelly","Wynter",5),("Goodwin","Edward",5),("Pennington","May",7),("Finch","Randall",7);
INSERT INTO `Eleves` (`nom`,`prenom`,`classe`) VALUES ("Miller","Ciara",5),("Huff","Sage",1),("Albert","Abel",4),("Shaw","Madison",5),("Hale","Clayton",3),("Clemons","Brynn",6),("Poole","Colt",2),("Garner","Valentine",1),("Owen","Griffith",2),("Huber","Josiah",6);
INSERT INTO `Eleves` (`nom`,`prenom`,`classe`) VALUES ("Hartman","Derek",5),("Morris","Zoe",3),("Delacruz","Adrian",7),("Salinas","Genevieve",1),("Brewer","Jacqueline",2),("Anderson","Kaitlin",5),("Alford","Barrett",6),("Parsons","Flavia",4),("Talley","Indigo",3),("Riley","Mara",5);
INSERT INTO `Eleves` (`nom`,`prenom`,`classe`) VALUES ("Hood","Glenna",7),("Robbins","Gil",7),("Goodman","Jessica",7),("Flowers","Madaline",1),("Tanner","Rose",2),("Mcclain","Maggie",6),("Hays","Dana",3),("Jordan","Macon",4),("Cruz","Savannah",7),("Alston","Haviva",1);


INSERT INTO matieres (id,nom) VALUES (1,"Maths"),(2,"Français"),(3,"Latin"),(4,"Histoire-Geo"),(5,"Technologie"),(6,"Sport"),(7,"Anglais"),(8,"Economie"),(9,"Physique-Chimie");

INSERT INTO `MatieresEleves` (`idEleves`,`idMatiere`) VALUES (191,3),(164,7),(100,2),(161,9),(192,2),(134,4),(115,6),(130,7),(140,7),(104,1);
INSERT INTO `MatieresEleves` (`idEleves`,`idMatiere`) VALUES (148,1),(152,8),(109,1),(194,1),(159,9),(194,5),(190,7),(181,6),(196,5),(149,9);
INSERT INTO `MatieresEleves` (`idEleves`,`idMatiere`) VALUES (200,6),(108,3),(119,9),(126,7),(115,6),(166,2),(151,3),(167,6),(150,8),(119,9);
INSERT INTO `MatieresEleves` (`idEleves`,`idMatiere`) VALUES (153,9),(186,2),(167,6),(192,2),(174,6),(130,5),(168,5),(187,9),(179,2),(116,9);
INSERT INTO `MatieresEleves` (`idEleves`,`idMatiere`) VALUES (182,9),(194,3),(118,6),(157,2),(192,7),(101,4),(132,4),(189,5),(102,5),(172,8);
INSERT INTO `MatieresEleves` (`idEleves`,`idMatiere`) VALUES (105,9),(190,2),(163,5),(194,1),(196,9),(175,6),(126,1),(191,5),(196,4),(151,5);
INSERT INTO `MatieresEleves` (`idEleves`,`idMatiere`) VALUES (114,3),(108,9),(173,5),(122,8),(157,9),(198,7),(154,1),(118,3),(137,7),(104,7);
INSERT INTO `MatieresEleves` (`idEleves`,`idMatiere`) VALUES (153,2),(124,4),(129,8),(165,5),(199,4),(180,4),(183,9),(113,2),(137,6),(129,3);
INSERT INTO `MatieresEleves` (`idEleves`,`idMatiere`) VALUES (130,5),(168,2),(197,9),(133,8),(156,1),(157,6),(177,9),(184,4),(106,8),(195,7);
INSERT INTO `MatieresEleves` (`idEleves`,`idMatiere`) VALUES (140,2),(148,9),(130,2),(184,8),(188,1),(106,2),(166,7),(180,9),(117,3),(119,4);
