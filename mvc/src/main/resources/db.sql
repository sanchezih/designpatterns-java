# Dumping database structure for userdb
DROP DATABASE IF EXISTS `codejavu`;
CREATE DATABASE IF NOT EXISTS `codejavu` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `codejavu`;

# Dumping structure for table userdb.users
DROP TABLE IF EXISTS `persona`;

CREATE TABLE `persona` (
    `id` INT(10) NOT NULL,
    `nombre` VARCHAR(30) DEFAULT NULL,
    `edad` INT(3) DEFAULT NULL,
    `profesion` VARCHAR(30) DEFAULT NULL,
    `telefono` DECIMAL(10 , 0 ) DEFAULT NULL,
    PRIMARY KEY (`id`)
)  ENGINE=INNODB DEFAULT CHARSET=LATIN1;
 
/*Data for the table `persona` */
INSERT INTO `persona` (`id`, `nombre`, `edad`, `profesion`, `telefono`) VALUES
	(315, 'Roque Perez', 31, 'Medico', 45420350),
	(316, 'Leopoldo Lugones', 27, 'Arquitecto', 45435830);