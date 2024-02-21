DROP DATABASE IF EXISTS Human_Friends;
CREATE DATABASE Human_Friends;
USE Human_Friends;

DROP TABLE IF EXISTS `pack_animal`;
CREATE TABLE `pack_animal` (
  `Type` varchar(100) DEFAULT NULL,
  `DoB` timestamp NULL DEFAULT NULL,
  `Commands` varchar(100) DEFAULT NULL,
  `id` bigint unsigned NOT NULL AUTO_INCREMENT,
  `Name` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


INSERT INTO pack_animal
(`Type`, DoB, Commands, id, Name)
VALUES('Camel', '2011-07-21', 'Walk, Carry Load', 1, 'Hind');

INSERT INTO pack_animal
(`Type`, DoB, Commands, id, Name)
VALUES('Donkey', '2005-07-21', 'Walk, Bray, Kick', 2, 'Burro');

INSERT INTO pack_animal
(`Type`, DoB, Commands, id, Name)
VALUES('Horse', '2020-05-21', 'Trot, Canter, Gallop', 3, 'Dune');

INSERT INTO pack_animal
(`Type`, DoB, Commands, id, Name)
VALUES('Camel', '2019-07-21', 'Walk, Carry Load', 4, 'Blaze');

INSERT INTO pack_animal
(`Type`, DoB, Commands, id, Name)
VALUES('Horse', '2022-07-20', 'Trot, Canter, Gallop', 5, 'Sahara');

INSERT INTO pack_animal
(`Type`, DoB, Commands, id, Name)
VALUES('Donkey', '2024-02-11', 'Walk, Bray, Kick', 6, 'Don');

INSERT INTO pack_animal
(`Type`, DoB, Commands, id, Name)
VALUES('Donkey', '2023-02-11', 'Walk, Bray, Kick', 7, 'Grey');

DROP TABLE IF EXISTS `pets`;
CREATE TABLE `pets` (
  `Type` varchar(100) DEFAULT NULL,
  `DoB` timestamp NULL DEFAULT NULL,
  `Commands` varchar(100) DEFAULT NULL,
  `id` bigint unsigned NOT NULL AUTO_INCREMENT,
  `Name` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

INSERT INTO pets
(`Type`, DoB, Commands, id, Name)
VALUES('Cat', '2021-07-21', 'Sit, Pounce, Scratch', 1, 'Whiskers');

INSERT INTO pets
(`Type`, DoB, Commands, id, Name)
VALUES('Hamster', '2015-07-21', 'Roll, Hide', 2, 'Burro');

INSERT INTO pets
(`Type`, DoB, Commands, id, Name)
VALUES('Cat', '2019-05-21', 'Sit, Pounce, Scratch', 3, 'Dune');

INSERT INTO pets
(`Type`, DoB, Commands, id, Name)
VALUES('Dog', '2018-07-21', 'Sit, Stay, Roll', 4, 'Buddy');

INSERT INTO pets
(`Type`, DoB, Commands, id, Name)
VALUES('Cat', '2021-07-20', 'Sit, Pounce, Scratch', 5, 'Oliver');

DELETE FROM pack_animal  WHERE Type = 'Camel';

SELECT name, DoB, type, commands,  (year(CURDATE()) - year(DoB)) as Age
FROM pack_animal
WHERE
YEAR(`DoB`) >= YEAR(DATE_SUB(CURDATE(), INTERVAL 3 YEAR)) and ((year(CURDATE()) - year(DoB)) >= 1)
union

SELECT name, DoB, type, commands, (year(CURDATE()) - year(DoB)) as Age
FROM pets
WHERE
YEAR(`DoB`) >= YEAR(DATE_SUB(CURDATE(), INTERVAL 3 YEAR)) and ((year(CURDATE()) - year(DoB)) >= 1)
order by name
;