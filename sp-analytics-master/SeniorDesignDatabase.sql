-- MySQL Script generated by MySQL Workbench
-- Thu May  7 09:30:58 2020
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema spanalytics
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema spanalytics
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `spanalytics` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `spanalytics` ;

-- -----------------------------------------------------
-- Table `spanalytics`.`team`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `spanalytics`.`team` (
  `teamID` INT NOT NULL,
  `teamName` VARCHAR(255) NULL DEFAULT NULL,
  `league` VARCHAR(255) NULL DEFAULT NULL,
  `Confence` VARCHAR(255) NULL DEFAULT NULL,
  PRIMARY KEY (`teamID`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `spanalytics`.`game`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `spanalytics`.`game` (
  `gameID` INT NOT NULL,
  `team1` INT NULL DEFAULT NULL,
  `team2` INT NULL DEFAULT NULL,
  `gameDate` DATE NULL DEFAULT NULL,
  PRIMARY KEY (`gameID`),
  INDEX `team1` (`team1` ASC) VISIBLE,
  INDEX `team2` (`team2` ASC) VISIBLE,
  CONSTRAINT `game_ibfk_1`
    FOREIGN KEY (`team1`)
    REFERENCES `spanalytics`.`team` (`teamID`),
  CONSTRAINT `game_ibfk_2`
    FOREIGN KEY (`team2`)
    REFERENCES `spanalytics`.`team` (`teamID`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `spanalytics`.`player`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `spanalytics`.`player` (
  `playerID` INT NOT NULL,
  `playerNameFirst` VARCHAR(255) NULL DEFAULT NULL,
  `playerNumber` INT NULL DEFAULT NULL,
  `playerNameLast` VARCHAR(255) NULL DEFAULT NULL,
  `hometown` VARCHAR(255) NULL DEFAULT NULL,
  `birthDate` DATE NULL DEFAULT NULL,
  `pweight` INT NULL DEFAULT NULL,
  `teamID` INT NULL DEFAULT NULL,
  `heightInches` INT NULL DEFAULT NULL,
  `goalie` BIT(1) NULL DEFAULT NULL,
  PRIMARY KEY (`playerID`),
  INDEX `teamID` (`teamID` ASC) VISIBLE,
  CONSTRAINT `player_ibfk_1`
    FOREIGN KEY (`teamID`)
    REFERENCES `spanalytics`.`team` (`teamID`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `spanalytics`.`gamestats`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `spanalytics`.`gamestats` (
  `gameStatsID` INT NULL DEFAULT NULL,
  `goals` INT NULL DEFAULT NULL,
  `assists` INT NULL DEFAULT NULL,
  `playerID` INT NULL DEFAULT NULL,
  `gameID` INT NOT NULL,
  `timePlayed` FLOAT NULL DEFAULT NULL,
  PRIMARY KEY (`gameID`),
  INDEX `playerID` (`playerID` ASC) VISIBLE,
  CONSTRAINT `gamestats_ibfk_1`
    FOREIGN KEY (`playerID`)
    REFERENCES `spanalytics`.`player` (`playerID`),
  CONSTRAINT `gamestats_ibfk_2`
    FOREIGN KEY (`gameID`)
    REFERENCES `spanalytics`.`game` (`gameID`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `spanalytics`.`hit`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `spanalytics`.`hit` (
  `hitID` INT NOT NULL AUTO_INCREMENT,
  `playerNumber` VARCHAR(255) NULL DEFAULT NULL,
  `passPeriod` VARCHAR(255) NULL DEFAULT NULL,
  `passTime` VARCHAR(255) NULL DEFAULT NULL,
  `playType` VARCHAR(255) NULL DEFAULT NULL,
  `status` VARCHAR(255) NULL DEFAULT NULL,
  `passTeam` VARCHAR(255) NULL DEFAULT NULL,
  `x` INT NULL DEFAULT NULL,
  `y` INT NULL DEFAULT NULL,
  PRIMARY KEY (`hitID`))
ENGINE = InnoDB
AUTO_INCREMENT = 3
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `spanalytics`.`pass`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `spanalytics`.`pass` (
  `passID` INT NOT NULL AUTO_INCREMENT,
  `playerNumber` VARCHAR(255) NULL DEFAULT NULL,
  `passPeriod` VARCHAR(255) NULL DEFAULT NULL,
  `passTime` VARCHAR(255) NULL DEFAULT NULL,
  `playType` VARCHAR(255) NULL DEFAULT NULL,
  `status` VARCHAR(255) NULL DEFAULT NULL,
  `passTeam` VARCHAR(255) NULL DEFAULT NULL,
  `x` INT NULL DEFAULT NULL,
  `y` INT NULL DEFAULT NULL,
  `x2` INT NULL DEFAULT NULL,
  `y2` INT NULL DEFAULT NULL,
  PRIMARY KEY (`passID`))
ENGINE = InnoDB
AUTO_INCREMENT = 2
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `spanalytics`.`possession`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `spanalytics`.`possession` (
  `possessionID` INT NOT NULL AUTO_INCREMENT,
  `game` VARCHAR(255) NULL DEFAULT NULL,
  `period` VARCHAR(255) NULL DEFAULT NULL,
  `gameTime` VARCHAR(255) NULL DEFAULT NULL,
  `team` VARCHAR(255) NULL DEFAULT NULL,
  `player` VARCHAR(255) NULL DEFAULT NULL,
  PRIMARY KEY (`possessionID`))
ENGINE = InnoDB
AUTO_INCREMENT = 4
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `spanalytics`.`shift`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `spanalytics`.`shift` (
  `shiftID` INT NOT NULL AUTO_INCREMENT,
  `playerNumber` VARCHAR(255) NULL DEFAULT NULL,
  `shiftPeriod` VARCHAR(255) NULL DEFAULT NULL,
  `shiftTime` VARCHAR(255) NULL DEFAULT NULL,
  `shiftTeam` VARCHAR(255) NULL DEFAULT NULL,
  PRIMARY KEY (`shiftID`))
ENGINE = InnoDB
AUTO_INCREMENT = 3
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `spanalytics`.`shot`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `spanalytics`.`shot` (
  `shotID` INT NOT NULL,
  `teamFor` VARCHAR(255) NULL DEFAULT NULL,
  `teamAgainst` VARCHAR(255) NULL DEFAULT NULL,
  `link` VARCHAR(255) NULL DEFAULT NULL,
  `player` VARCHAR(255) NULL DEFAULT NULL,
  `shotnumber` VARCHAR(255) NULL DEFAULT NULL,
  `shotType` VARCHAR(255) NULL DEFAULT NULL,
  `playtype` VARCHAR(255) NULL DEFAULT NULL,
  `playerStatus` VARCHAR(255) NULL DEFAULT NULL,
  `releaseType` VARCHAR(255) NULL DEFAULT NULL,
  `pChance` VARCHAR(255) NULL DEFAULT NULL,
  `sChance` VARCHAR(255) NULL DEFAULT NULL,
  `createdBy` VARCHAR(255) NULL DEFAULT NULL,
  `result` VARCHAR(255) NULL DEFAULT NULL,
  `scoringChance` VARCHAR(255) NULL DEFAULT NULL,
  `rb` VARCHAR(255) NULL DEFAULT NULL,
  `goalie` VARCHAR(255) NULL DEFAULT NULL,
  `extra` VARCHAR(255) NULL DEFAULT NULL,
  `statusCombo` VARCHAR(255) NULL DEFAULT NULL,
  PRIMARY KEY (`shotID`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;