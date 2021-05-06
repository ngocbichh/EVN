-- MySQL dump 10.13  Distrib 8.0.21, for Win64 (x86_64)
--
-- Host: localhost    Database: evn
-- ------------------------------------------------------
-- Server version	8.0.21

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
-- Table structure for table `invoice`
--

DROP TABLE IF EXISTS `invoice`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `invoice` (
  `id_invice` varchar(255) NOT NULL,
  `vat` float NOT NULL,
  `money` float NOT NULL,
  `month` int NOT NULL,
  `new_index` int NOT NULL,
  `old_index` int NOT NULL,
  `quarter` int NOT NULL,
  `status` varchar(255) DEFAULT NULL,
  `total` float NOT NULL,
  `year` int NOT NULL,
  `id_customer` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id_invice`),
  KEY `FKlyajla9dkjg11gtikvka08ls0` (`id_customer`),
  CONSTRAINT `FKlyajla9dkjg11gtikvka08ls0` FOREIGN KEY (`id_customer`) REFERENCES `customer` (`id_customer`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `invoice`
--

LOCK TABLES `invoice` WRITE;
/*!40000 ALTER TABLE `invoice` DISABLE KEYS */;
INSERT INTO `invoice` VALUES ('1',10,1000000,1,1000,10,1,'Đã hoàn thành',5000000,2020,'1'),('10',10,1000000,10,1000,10,4,'Đã hoàn thành',5000000,2020,'1'),('11',10,1000000,11,1000,10,4,'Đã hoàn thành',5000000,2020,'1'),('12',10,1000000,12,1000,10,4,'Chưa hoàn thành',5000000,2020,'1'),('13',10,1000000,1,1000,10,1,'Đã hoàn thành',5000000,2021,'4'),('14',10,1000000,1,1000,10,1,'Chưa hoàn thành',5000000,2019,'2'),('15',10,1000000,2,1000,10,1,'Đã hoàn thành',5000000,2019,'5'),('16',10,1000000,2,1000,10,1,'Chưa hoàn thành',5000000,2019,'1'),('17',10,1000000,3,1000,10,1,'Đã hoàn thành',5000000,2021,'9'),('18',10,1000000,3,1000,10,1,'Chưa hoàn thành',5000000,2021,'11'),('19',10,1000000,4,1000,10,2,'Chưa hoàn thành',5000000,2019,'1'),('2',10,1000000,2,1000,10,1,'Chưa hoàn thành',5000000,2020,'1'),('20',10,1000000,4,1000,10,2,'Chưa hoàn thành',5000000,2019,'4'),('21',10,1000000,4,1000,10,2,'Chưa hoàn thành',5000000,2019,'4'),('22',10,1000000,4,1000,10,2,'Chưa hoàn thành',5000000,2019,'5'),('23',10,1000000,5,1000,10,2,'Chưa hoàn thành',5000000,2019,'6'),('24',10,1000000,4,1000,10,2,'Chưa hoàn thành',5000000,2019,'3'),('25',10,1000000,5,1000,10,2,'Đã hoàn thành',5000000,2020,'2'),('3',10,1000000,3,1000,10,1,'Đã hoàn thành',5000000,2020,'1'),('4',10,1000000,4,1000,10,2,'Đã hoàn thành',5000000,2020,'1'),('5',10,1000000,5,1000,10,2,'Đã hoàn thành',5000000,2020,'1'),('6',10,1000000,6,1000,10,2,'Đã hoàn thành',5000000,2020,'1'),('7',10,1000000,7,1000,10,3,'Đã hoàn thành',5000000,2020,'1'),('8',10,1000000,8,1000,10,3,'Đã hoàn thành',5000000,2020,'1'),('9',10,1000000,9,1000,10,3,'Chưa hoàn thành',5000000,2020,'1');
/*!40000 ALTER TABLE `invoice` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-05-03 23:51:02
