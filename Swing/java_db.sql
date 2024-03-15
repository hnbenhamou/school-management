-- MySQL dump 10.13  Distrib 8.0.32, for Win64 (x86_64)
--
-- Host: localhost    Database: ecole_db
-- ------------------------------------------------------
-- Server version	8.0.32

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `absence`
--

DROP TABLE IF EXISTS `absence`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `absence` (
  `id_etud` int NOT NULL,
  `nbrHr` int DEFAULT NULL,
  `id_mod` int NOT NULL,
  PRIMARY KEY (`id_etud`,`id_mod`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `absence`
--

LOCK TABLES `absence` WRITE;
/*!40000 ALTER TABLE `absence` DISABLE KEYS */;
INSERT INTO `absence` VALUES (1,7,1),(1,3,2),(1,4,3),(2,3,1),(2,5,2);
/*!40000 ALTER TABLE `absence` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `admin`
--

DROP TABLE IF EXISTS `admin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `admin` (
  `id_adm` int NOT NULL,
  `nom` varchar(30) DEFAULT NULL,
  `prenom` varchar(30) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `poste` varchar(10) DEFAULT NULL,
  `tel` varchar(20) DEFAULT NULL,
  `adresse` varchar(30) DEFAULT NULL,
  `ville` varchar(20) DEFAULT NULL,
  `pays` varchar(20) DEFAULT NULL,
  `id_login` int DEFAULT NULL,
  PRIMARY KEY (`id_adm`),
  KEY `id_login` (`id_login`),
  CONSTRAINT `admin_ibfk_1` FOREIGN KEY (`id_login`) REFERENCES `login` (`id_login`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admin`
--

LOCK TABLES `admin` WRITE;
/*!40000 ALTER TABLE `admin` DISABLE KEYS */;
INSERT INTO `admin` VALUES (2,'SALAH','DE NAZ','lm@fcbarcelona.com','directeur','0711111111','RUE 2','ALM','MAROC',5);
/*!40000 ALTER TABLE `admin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dossier`
--

DROP TABLE IF EXISTS `dossier`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `dossier` (
  `id_doss` int NOT NULL AUTO_INCREMENT,
  `nom` varchar(30) DEFAULT NULL,
  `prenom` varchar(30) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `tel` varchar(20) DEFAULT NULL,
  `adresse` varchar(30) DEFAULT NULL,
  `ville` varchar(20) DEFAULT NULL,
  `pays` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id_doss`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dossier`
--

LOCK TABLES `dossier` WRITE;
/*!40000 ALTER TABLE `dossier` DISABLE KEYS */;
INSERT INTO `dossier` VALUES (1,'BENHAMOU','HASSAN','hassanbenhamou2002@gmail.com','0711191884','RUE 3 HAYTAKKADOUM ','EL GARA','maroc'),(2,'SATOUT','ABDELHAKIM','hakim.satout@gmail.com','0711111884','New hassan R','OZ','maroc'),(3,'BARKA','YASSINE','yassinebarka@gmail.com','067777777','RUE M','CASABLANCA','MAROC'),(5,'Evans','Ca','ca@gmail.com','0677777777','NEw york','new ','USA'),(6,'Inkonnu','YASS','inkonnu@email.com','099999999','rue casa','casablanca','maroc'),(7,'Dargal','Mariem','mariem.dargal@gmail.com','0711111884','XXXXX','Beni mellal','Maroc');
/*!40000 ALTER TABLE `dossier` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `etudiant`
--

DROP TABLE IF EXISTS `etudiant`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `etudiant` (
  `id_etud` int NOT NULL AUTO_INCREMENT,
  `id_doss` int DEFAULT NULL,
  `id_login` int DEFAULT NULL,
  PRIMARY KEY (`id_etud`),
  KEY `id_doss` (`id_doss`),
  KEY `id_login` (`id_login`),
  CONSTRAINT `etudiant_ibfk_1` FOREIGN KEY (`id_doss`) REFERENCES `dossier` (`id_doss`),
  CONSTRAINT `etudiant_ibfk_2` FOREIGN KEY (`id_login`) REFERENCES `login` (`id_login`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `etudiant`
--

LOCK TABLES `etudiant` WRITE;
/*!40000 ALTER TABLE `etudiant` DISABLE KEYS */;
INSERT INTO `etudiant` VALUES (1,1,1),(2,2,2),(4,5,13),(5,6,14),(6,7,16);
/*!40000 ALTER TABLE `etudiant` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `login`
--

DROP TABLE IF EXISTS `login`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `login` (
  `id_login` int NOT NULL,
  `username` varchar(30) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  `typee` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id_login`),
  UNIQUE KEY `username` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `login`
--

LOCK TABLES `login` WRITE;
/*!40000 ALTER TABLE `login` DISABLE KEYS */;
INSERT INTO `login` VALUES (1,'b.hassan','e10adc3949ba59abbe56e057f20f883e','etudiant'),(2,'satout.2','1552c03e78d38d5005d4ce7b8018addf','etudiant'),(3,'gherabi.1','202cb962ac59075b964b07152d234b70','professeur'),(4,'MESSI','e10adc3949ba59abbe56e057f20f883e','professeur'),(5,'directeur','202cb962ac59075b964b07152d234b70','administrateur'),(6,'test','e10adc3949ba59abbe56e057f20f883e','etudiant'),(7,'yyyyy.5','e10adc3949ba59abbe56e057f20f883e','professeur'),(8,'bro.5','e10adc3949ba59abbe56e057f20f883e','etudiant'),(9,'Zeref.6','e10adc3949ba59abbe56e057f20f883e','etudiant'),(10,'YASSINE.4','e10adc3949ba59abbe56e057f20f883e','etudiant'),(11,'yass.4','e10adc3949ba59abbe56e057f20f883e','etudiant'),(12,'kaljfsdkj.4','e10adc3949ba59abbe56e057f20f883e','etudiant'),(13,'Evans.5','e10adc3949ba59abbe56e057f20f883e','etudiant'),(14,'Inkonnu.6','b77127842f9176f75f27ee68444b666d','etudiant'),(15,'AAA.7','117b4ada6eeeac9d9049ec90b8178b16','etudiant'),(16,'Dargal.7','a384a91eaa094c9c2a882b21ca634ad4','etudiant');
/*!40000 ALTER TABLE `login` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `login1`
--

DROP TABLE IF EXISTS `login1`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `login1` (
  `user` varchar(20) DEFAULT NULL,
  `password` varchar(60) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `login1`
--

LOCK TABLES `login1` WRITE;
/*!40000 ALTER TABLE `login1` DISABLE KEYS */;
INSERT INTO `login1` VALUES ('hassan','20861f452350c73d149b0de8ddbf8c3e');
/*!40000 ALTER TABLE `login1` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `module`
--

DROP TABLE IF EXISTS `module`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `module` (
  `id_mod` int NOT NULL,
  `nom` varchar(30) DEFAULT NULL,
  `id_prof` int DEFAULT NULL,
  PRIMARY KEY (`id_mod`),
  KEY `id_prof` (`id_prof`),
  CONSTRAINT `module_ibfk_1` FOREIGN KEY (`id_prof`) REFERENCES `prof` (`id_prof`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `module`
--

LOCK TABLES `module` WRITE;
/*!40000 ALTER TABLE `module` DISABLE KEYS */;
INSERT INTO `module` VALUES (1,'JAVA',1),(2,'MATH APP',2),(3,'WEB DEV',1),(4,'Analyse',4),(5,'Theorie D\'information',3);
/*!40000 ALTER TABLE `module` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `prof`
--

DROP TABLE IF EXISTS `prof`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `prof` (
  `id_prof` int NOT NULL,
  `nom` varchar(30) DEFAULT NULL,
  `prenom` varchar(30) DEFAULT NULL,
  `statut` varchar(10) DEFAULT NULL,
  `specialite` varchar(15) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `tel` varchar(20) DEFAULT NULL,
  `adresse` varchar(30) DEFAULT NULL,
  `ville` varchar(20) DEFAULT NULL,
  `pays` varchar(20) DEFAULT NULL,
  `id_login` int DEFAULT NULL,
  PRIMARY KEY (`id_prof`),
  KEY `id_login` (`id_login`),
  CONSTRAINT `prof_ibfk_1` FOREIGN KEY (`id_login`) REFERENCES `login` (`id_login`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `prof`
--

LOCK TABLES `prof` WRITE;
/*!40000 ALTER TABLE `prof` DISABLE KEYS */;
INSERT INTO `prof` VALUES (1,'Gherabi','Noreddine','Marie','JAVA/JEE','n.gherabi@usms.ma','0711111111','RUE 2','CASABLANCA','MAROC',3),(2,'Saidi','Ahmed','Marie','MATH','lm@fcbarcelona.com','0711111111','RUE 2','Casa','Morocco',4),(3,'El ouakyl','Mehdi','Celi','Reseau','mehdi.elouakyl@gmail.com','0711111222','WARTZ M2','EL GARA','Maroc',NULL),(4,'Mostafa','Karam','Marie','Analyse','karam.mostafa@gmail.com','0711111111','RUE 22','Rabat','Morocco',NULL);
/*!40000 ALTER TABLE `prof` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `result`
--

DROP TABLE IF EXISTS `result`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `result` (
  `id_etud` int NOT NULL,
  `id_mod` int NOT NULL,
  `note` int DEFAULT NULL,
  PRIMARY KEY (`id_etud`,`id_mod`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `result`
--

LOCK TABLES `result` WRITE;
/*!40000 ALTER TABLE `result` DISABLE KEYS */;
INSERT INTO `result` VALUES (1,1,6),(1,2,20),(2,1,17),(2,2,15);
/*!40000 ALTER TABLE `result` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-05-23 12:35:16
