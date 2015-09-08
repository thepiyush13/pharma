CREATE DATABASE  IF NOT EXISTS `mercy_pharm` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `mercy_pharm`;
-- MySQL dump 10.13  Distrib 5.6.17, for Win32 (x86)
--
-- Host: localhost    Database: mercy_pharm
-- ------------------------------------------------------
-- Server version	5.6.20

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
-- Table structure for table `doctor`
--

DROP TABLE IF EXISTS `doctor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `doctor` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `dea_number` varchar(16) NOT NULL,
  `firstname` varchar(64) NOT NULL,
  `lastname` varchar(64) NOT NULL,
  `degree` varchar(16) NOT NULL,
  `phone_number` varchar(10) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `doctor`
--

LOCK TABLES `doctor` WRITE;
/*!40000 ALTER TABLE `doctor` DISABLE KEYS */;
INSERT INTO `doctor` VALUES (1,'12904587J2','Mark','Jones','MD','8015551231'),(2,'98H23T4591','Susan','Smith','MD.PhD','4357996555'),(3,'56T432T000','Ralph','Ferris','MD','4356789988'),(4,'98743765Q0','John','Sharpe','MD','8012223454');
/*!40000 ALTER TABLE `doctor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `medication`
--

DROP TABLE IF EXISTS `medication`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `medication` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(64) NOT NULL,
  `common_name` varchar(64) NOT NULL,
  `description` varchar(512) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `medication`
--

LOCK TABLES `medication` WRITE;
/*!40000 ALTER TABLE `medication` DISABLE KEYS */;
INSERT INTO `medication` VALUES (1,'abacavir sulfate','Ziagen','a synthetic carbocyclic nucleoside analogue with inhibitory activity against HIV-1'),(2,'nadolol','Corogard','a synthetic nonselective beta-adrenergic receptor blocking agent designated chemically as 1-(tert-butylamino)-3-[(5,6,7,8-tetrahydro-cis-6,7-dihydroxy-1-naphthyl)oxy]-2-propanol.'),(3,'ruxolitinib phosphate','Jakafi','a kinase inhibitor with the chemical name (R)-3-(4-(7H-pyrrolo[2,3­d]pyrimidin-4-yl)-1H-pyrazol-1-yl)-3-cyclopentylpropanenitrile phosphate and a molecular weight of 404.36'),(4,'eribulin mesylate','Halaven','a non-taxane microtubule dynamics inhibitor. Eribulin mesylate is a synthetic analogue of halichondrin B, a product isolated from the marine sponge.'),(5,'triazolom','Halcion','a benzodiazepine (ben-zoe-dye-AZE-eh-peen) similar to Valium. Triazolam affects chemicals in the brain that may become unbalanced and cause sleep problems (insomnia).'),(6,'valrubicin','Valstar','a cancer (antineoplastic) medication. Valrubicin interferes with the growth of cancer cells and slows their growth and spread in the body.');
/*!40000 ALTER TABLE `medication` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `patient`
--

DROP TABLE IF EXISTS `patient`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `patient` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `mercy_id` varchar(10) NOT NULL,
  `mercy_clinic` varchar(16) NOT NULL,
  `firstname` varchar(64) NOT NULL,
  `lastname` varchar(64) NOT NULL,
  `phone_number` varchar(10) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `mercy_id_UNIQUE` (`mercy_id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `patient`
--

LOCK TABLES `patient` WRITE;
/*!40000 ALTER TABLE `patient` DISABLE KEYS */;
INSERT INTO `patient` VALUES (1,'W000000001','West','Matt','Manley','8018881212'),(2,'W000000002','West','Joe','Jonas','8018884564'),(3,'W000000003','West','Bill','Bixby','8015559023'),(4,'W000000004','West','Raif','Richards','8019993451'),(5,'E000000115','East','Julie','Jenkins','8019897875'),(6,'W000000006','West','Suzy','Smith','8019893100'),(7,'W000000007','West','Kary','Kitchens','8019834122'),(8,'W000000008','West','Lucy','Lemmons','8014449009');
/*!40000 ALTER TABLE `patient` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pharmacist`
--

DROP TABLE IF EXISTS `pharmacist`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pharmacist` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `dea_number` varchar(16) DEFAULT NULL,
  `firstname` varchar(64) DEFAULT NULL,
  `lastname` varchar(64) DEFAULT NULL,
  `phone_number` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pharmacist`
--

LOCK TABLES `pharmacist` WRITE;
/*!40000 ALTER TABLE `pharmacist` DISABLE KEYS */;
INSERT INTO `pharmacist` VALUES (1,'098098B321','Robert','Frank','4350988900'),(2,'FSE45698J1','Daren','Davis','4357774581'),(3,'J098R45629','Veronica','Williams','4359991212'),(4,'9823B98234','Jennifer','Jones','4356678904');
/*!40000 ALTER TABLE `pharmacist` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `prescription`
--

DROP TABLE IF EXISTS `prescription`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `prescription` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `patient_id` int(11) DEFAULT NULL,
  `doctor_id` int(11) NOT NULL,
  `pharmacist_id` int(11) NOT NULL,
  `medication_id` int(11) NOT NULL,
  `status_id` int(11) NOT NULL,
  `dose_mg` int(11) NOT NULL,
  `created_date` date NOT NULL,
  `modified_date` date NOT NULL,
  `notes` varchar(512) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `pres_patient_fk_idx` (`patient_id`),
  KEY `pres_doctor_fk_idx` (`doctor_id`),
  KEY `pres_pharmacist_fk_idx` (`pharmacist_id`),
  KEY `pres_medication_fk_idx` (`medication_id`),
  KEY `pres_status_fk_idx` (`status_id`),
  CONSTRAINT `pres_doctor_fk` FOREIGN KEY (`doctor_id`) REFERENCES `doctor` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `pres_medication_fk` FOREIGN KEY (`medication_id`) REFERENCES `medication` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `pres_patient_fk` FOREIGN KEY (`patient_id`) REFERENCES `patient` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `pres_pharmacist_fk` FOREIGN KEY (`pharmacist_id`) REFERENCES `pharmacist` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `pres_status_fk` FOREIGN KEY (`status_id`) REFERENCES `prescription_status` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `prescription`
--

LOCK TABLES `prescription` WRITE;
/*!40000 ALTER TABLE `prescription` DISABLE KEYS */;
INSERT INTO `prescription` VALUES (1,1,2,2,1,1,115,'2013-12-29','2014-01-30',NULL),(2,3,3,1,2,3,20,'2014-01-27','2014-03-13',NULL),(3,2,4,3,6,2,220,'2014-05-21','2014-03-18',NULL),(4,3,1,2,5,1,319,'2014-07-05','2014-08-06',NULL),(5,3,4,3,6,1,395,'2014-02-27','2014-08-18','Phasellus sit amet erat. Nulla tempus.'),(6,5,1,4,3,3,406,'2014-04-03','2013-12-15',NULL),(7,2,2,1,6,2,295,'2014-05-21','2013-10-19',NULL),(8,1,2,2,4,2,470,'2014-07-21','2013-10-24','Vestibulum sed magna at nunc commodo placerat.'),(9,2,2,2,4,1,402,'2013-11-05','2014-09-15',NULL),(10,4,1,1,3,2,207,'2013-11-29','2014-06-29','Morbi non quam nec dui luctus rutrum. Nulla tellus.'),(11,3,4,1,4,3,299,'2014-01-28','2013-10-07',NULL),(12,1,2,3,2,3,201,'2013-12-15','2014-01-08',NULL),(13,4,3,1,2,3,104,'2013-11-10','2013-10-29',NULL),(14,5,2,4,5,2,68,'2014-05-17','2014-07-13',NULL),(15,5,4,4,1,3,327,'2014-04-20','2014-02-04',NULL),(16,3,2,4,5,1,251,'2013-10-28','2014-03-19',NULL),(17,6,1,3,6,3,90,'2013-11-17','2013-11-07','Aenean auctor gravida sem. Praesent id massa id nisl venenatis lacinia.'),(18,4,4,3,2,1,462,'2014-03-05','2013-10-20',NULL),(19,5,4,1,6,2,167,'2014-10-02','2013-11-10','Proin interdum mauris non ligula pellentesque ultrices.'),(20,3,2,3,3,1,212,'2014-02-14','2014-06-12',NULL);
/*!40000 ALTER TABLE `prescription` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `prescription_status`
--

DROP TABLE IF EXISTS `prescription_status`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `prescription_status` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `description` varchar(16) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `prescription_status`
--

LOCK TABLES `prescription_status` WRITE;
/*!40000 ALTER TABLE `prescription_status` DISABLE KEYS */;
INSERT INTO `prescription_status` VALUES (1,'filled'),(2,'denied'),(3,'overruled');
/*!40000 ALTER TABLE `prescription_status` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'mercy'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2014-10-07 12:17:31
