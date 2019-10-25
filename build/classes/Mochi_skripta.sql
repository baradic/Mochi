-- MySQL dump 10.16  Distrib 10.1.37-MariaDB, for Win32 (AMD64)
--
-- Host: localhost    Database: mochi
-- ------------------------------------------------------
-- Server version	10.1.37-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `hibernate_sequence`
--

DROP TABLE IF EXISTS `hibernate_sequence`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hibernate_sequence`
--

LOCK TABLES `hibernate_sequence` WRITE;
/*!40000 ALTER TABLE `hibernate_sequence` DISABLE KEYS */;
INSERT INTO `hibernate_sequence` VALUES (60),(60),(60),(60),(60),(60);
/*!40000 ALTER TABLE `hibernate_sequence` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `izvodac`
--

DROP TABLE IF EXISTS `izvodac`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `izvodac` (
  `sifra` int(11) NOT NULL,
  `ime` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `info` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`sifra`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `izvodac`
--

LOCK TABLES `izvodac` WRITE;
/*!40000 ALTER TABLE `izvodac` DISABLE KEYS */;
INSERT INTO `izvodac` VALUES (12,'The Clash','Rock bend'),(13,'Prljavo kazalište ','Domaći rock band.'),(14,'Beyoncé','Američka pjevačica i glumica\nrođenda 1981. godine.'),(15,'Giboni','Zlatan Stipišić - Gibonni, \nhrvatski glazbenik, jedan od\n osnivača i prvi pjevač splitskog heavy meta\nl sastava \"Osmi putnik');
/*!40000 ALTER TABLE `izvodac` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `izvor`
--

DROP TABLE IF EXISTS `izvor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `izvor` (
  `sifra` int(11) NOT NULL,
  `naziv` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`sifra`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `izvor`
--

LOCK TABLES `izvor` WRITE;
/*!40000 ALTER TABLE `izvor` DISABLE KEYS */;
INSERT INTO `izvor` VALUES (2,'Youtube'),(8,'Deezer'),(9,'Tune in'),(10,'MusixHub'),(11,'Lokalna memorija');
/*!40000 ALTER TABLE `izvor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `korisnik`
--

DROP TABLE IF EXISTS `korisnik`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `korisnik` (
  `sifra` int(11) NOT NULL,
  `email` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `ime` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `lozinka` char(60) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `prezime` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`sifra`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `korisnik`
--

LOCK TABLES `korisnik` WRITE;
/*!40000 ALTER TABLE `korisnik` DISABLE KEYS */;
INSERT INTO `korisnik` VALUES (3,'barbararadic@gmail.com','Barbara','$2a$10$ea7QjWnmxsWcODsuPXbALu.zspTm.9J0FtL/RzX47t8QA.qeQF6NO','Radic'),(25,'m','m','$2a$10$XPEP41mPV9p3hA9mIWPjPu8oU6lkvgSQTPXpcvT3Ct0MG0ymZ5ep.','m'),(54,'mlesic@gmail.com','Marija','$2a$10$N.aFdwSgDqV6cGmDJvHe6uHJ63Uty4FmbkVQ4SxpAyTq0DVqOJUHO','Lešić');
/*!40000 ALTER TABLE `korisnik` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pjesma`
--

DROP TABLE IF EXISTS `pjesma`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pjesma` (
  `sifra` int(11) NOT NULL,
  `datumIzdanja` date DEFAULT NULL,
  `info` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `naziv` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `izvodac_sifra` int(11) DEFAULT NULL,
  `izvor_sifra` int(11) DEFAULT NULL,
  `zanr_sifra` int(11) DEFAULT NULL,
  PRIMARY KEY (`sifra`),
  KEY `FKsr7beh6n36n6qc5urx70f0g0v` (`izvodac_sifra`),
  KEY `FK5eod9n99dvrwi21p10g8nywg7` (`izvor_sifra`),
  KEY `FK12oecb7a9d3jajmwpr2judmhg` (`zanr_sifra`),
  CONSTRAINT `FK12oecb7a9d3jajmwpr2judmhg` FOREIGN KEY (`zanr_sifra`) REFERENCES `zanr` (`sifra`),
  CONSTRAINT `FK5eod9n99dvrwi21p10g8nywg7` FOREIGN KEY (`izvor_sifra`) REFERENCES `izvor` (`sifra`),
  CONSTRAINT `FKsr7beh6n36n6qc5urx70f0g0v` FOREIGN KEY (`izvodac_sifra`) REFERENCES `izvodac` (`sifra`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pjesma`
--

LOCK TABLES `pjesma` WRITE;
/*!40000 ALTER TABLE `pjesma` DISABLE KEYS */;
INSERT INTO `pjesma` VALUES (16,'1979-06-01','Pjesma iz istoimenog \nalbuma','London Calling',12,2,1),(18,'1993-06-10','','Tu noć kad si se udavala',13,11,4),(19,'1995-06-22','u Hrvatskoj poznata i kao\ndomoljubna pjesma','Ruža Hrvatska',13,8,7),(20,'1995-06-22','Nema komentara','Udica',15,10,4),(21,'2009-10-03','','Halo',14,10,4);
/*!40000 ALTER TABLE `pjesma` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `povijest`
--

DROP TABLE IF EXISTS `povijest`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `povijest` (
  `sifra` int(11) NOT NULL,
  `vrijemePreslusavanja` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `korisnik_sifra` int(11) DEFAULT NULL,
  `pjesma_sifra` int(11) DEFAULT NULL,
  PRIMARY KEY (`sifra`),
  KEY `FKjchdbp0s8pvsg9e8d9lykuq72` (`korisnik_sifra`),
  KEY `FKrdkm4lrakm17xogs07kqsb71x` (`pjesma_sifra`),
  CONSTRAINT `FKjchdbp0s8pvsg9e8d9lykuq72` FOREIGN KEY (`korisnik_sifra`) REFERENCES `korisnik` (`sifra`),
  CONSTRAINT `FKrdkm4lrakm17xogs07kqsb71x` FOREIGN KEY (`pjesma_sifra`) REFERENCES `pjesma` (`sifra`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `povijest`
--

LOCK TABLES `povijest` WRITE;
/*!40000 ALTER TABLE `povijest` DISABLE KEYS */;
INSERT INTO `povijest` VALUES (26,'05.06.2019._20:35',25,18),(27,'05.06.2019._20:35',25,20),(55,'05.06.2019._23:01',54,18),(56,'05.06.2019._23:01',54,19),(57,'05.06.2019._23:01',54,20),(58,'05.06.2019._23:02',3,16),(59,'05.06.2019._23:02',3,19);
/*!40000 ALTER TABLE `povijest` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `zanr`
--

DROP TABLE IF EXISTS `zanr`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `zanr` (
  `sifra` int(11) NOT NULL,
  `vrsta` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`sifra`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `zanr`
--

LOCK TABLES `zanr` WRITE;
/*!40000 ALTER TABLE `zanr` DISABLE KEYS */;
INSERT INTO `zanr` VALUES (1,'Rock'),(4,'Pop'),(5,'Folk'),(6,'Metal'),(7,'Nije navedeno');
/*!40000 ALTER TABLE `zanr` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-06-05 23:07:33
