CREATE TABLE IF NOT EXISTS `person` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `first_name` varchar(25) NOT NULL,
  `last_name` varchar(60) NOT NULL,
  `gender` varchar(9) NOT NULL,
  PRIMARY KEY (`id`)
);

INSERT INTO `person` (`id`, `first_name`, `last_name`, `gender`) VALUES (1, 'Jonas', 'Garcia Rosa', 'Masculino');