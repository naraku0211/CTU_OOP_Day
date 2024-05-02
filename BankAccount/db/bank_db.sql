-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               8.0.30 - MySQL Community Server - GPL
-- Server OS:                    Win64
-- HeidiSQL Version:             12.1.0.6537
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

-- Dumping data for table bank_db.accounts: ~2 rows (approximately)
INSERT INTO `accounts` (`id`, `account_number`, `lname`, `fname`, `mi`, `pin_number`, `balance`, `lasttimelogin`) VALUES
	(2, '13816210537', 'user', 'user', 'I', '123456', 5.00, NULL),
	(3, '7148205519', 'user', 'user', 'I', '123456', 3900.00, NULL);

-- Dumping data for table bank_db.transactions: ~0 rows (approximately)

-- Dumping data for table bank_db.users: ~0 rows (approximately)
INSERT INTO `users` (`id`, `account_lname`, `account_fname`, `username`, `password`, `account_type`, `lasttimelogin`) VALUES
	(1, 'Admin', 'Super', 'admin', 'admin', 1, '2023-05-02 17:12:01');

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
