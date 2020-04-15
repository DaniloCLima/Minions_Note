-- MySQL dump 10.13  Distrib 8.0.19, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: Minions_Note
-- ------------------------------------------------------
-- Server version	8.0.19

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
-- Table structure for table `Minion`
--

DROP TABLE IF EXISTS `Minion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Minion` (
  `nome` varchar(100) NOT NULL,
  `parentesco` varchar(45) NOT NULL,
  `contato` varchar(45) NOT NULL,
  `facebook` varchar(45) DEFAULT NULL,
  `valorPessoal` int NOT NULL,
  `minionRank` int NOT NULL,
  `idMinion` bigint unsigned NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`idMinion`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Minion`
--

LOCK TABLES `Minion` WRITE;
/*!40000 ALTER TABLE `Minion` DISABLE KEYS */;
INSERT INTO `Minion` VALUES ('Aila Farias Silva','Tia','(21) 946125087','https://www.facebook.com/aila.maria.39',5,1,1),('Bruno Fafa Silsil','Primo','(11) 982557320','https://www.facebook.com/brubu.silsil',1,5,2),('Escrotildo Tonto','Cunhado','(11) 912548541','https://www.facebook.com/escrotildo.tonto',3,4,3),('Feique Nilson','Tio','(21) 942014778','https://www.facebook.com/feique.nilson',4,3,4),('Maxis Tah','Irmã','(11) 995874125','https://www.facebook.com/maxis.tah.7',2,2,5);
/*!40000 ALTER TABLE `Minion` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-04-14 22:23:53
