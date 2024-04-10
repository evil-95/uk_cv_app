-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le : sam. 10 fév. 2024 à 10:09
-- Version du serveur : 10.4.27-MariaDB
-- Version de PHP : 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `cv_builder`
--

-- --------------------------------------------------------

--
-- Structure de la table `administrateur`
--

CREATE TABLE `administrateur` (
  `Id` varchar(30) NOT NULL,
  `Mot_de_passe` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Déchargement des données de la table `administrateur`
--

INSERT INTO `administrateur` (`Id`, `Mot_de_passe`) VALUES
('cvbuilder@gmail.com', '123');

-- --------------------------------------------------------

--
-- Structure de la table `cvbuilderdatabase`
--

CREATE TABLE `cvbuilderdatabase` (
  `nom` varchar(255) NOT NULL,
  `tel` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `localisation` varchar(255) NOT NULL,
  `competences` varchar(255) NOT NULL,
  `langue` varchar(255) NOT NULL,
  `loisir` varchar(255) NOT NULL,
  `profil` varchar(255) NOT NULL,
  `formation` varchar(255) NOT NULL,
  `experience` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Déchargement des données de la table `cvbuilderdatabase`
--

INSERT INTO `cvbuilderdatabase` (`nom`, `tel`, `email`, `localisation`, `competences`, `langue`, `loisir`, `profil`, `formation`, `experience`) VALUES
('abdou', '5448', 'abdou@gmail.com', 'cameroun', 'programmeur', 'francais', 'programmer', 'amical', 'itt', 'stage'),
('fabilou dialo', '65218948', 'fbdialo@gmail.com', 'yaounde', 'programmeur', 'anglais', 'programmer', 'amical', 'inch tech', 'stage pro de 3 ans ');

-- --------------------------------------------------------

--
-- Structure de la table `cvbuilderphotodatabase`
--

CREATE TABLE `cvbuilderphotodatabase` (
  `nom` varchar(255) NOT NULL,
  `tel` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `localisation` varchar(255) NOT NULL,
  `competences` varchar(255) NOT NULL,
  `langue` varchar(255) NOT NULL,
  `loisir` varchar(255) NOT NULL,
  `profil` varchar(255) NOT NULL,
  `formation` varchar(255) NOT NULL,
  `experience` varchar(255) NOT NULL,
  `image` blob NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Déchargement des données de la table `cvbuilderphotodatabase`
--

INSERT INTO `cvbuilderphotodatabase` (`nom`, `tel`, `email`, `localisation`, `competences`, `langue`, `loisir`, `profil`, `formation`, `experience`, `image`) VALUES
('kemeni', '1516484', 'kemeniclex@gmail.com', 'Centre', 'heoijlzf', '', 'hzeuf', 'iuef', 'ihuezfj', 'hzeof', 0x6a617661782e7377696e672e496d61676549636f6e403162383436653063),
('haman', '558', 'ofgh', 'Est', 'uytvb', '', 'ouytgui', 'khj', 'lhuohiio', 'uhuoi', 0x443a5c6d6f646966322e6a7067),
('haman bouba', '558', 'onjon', 'Littoral', 'uytvb', '', 'ouytgui', 'khj', 'lhuohiio', 'uhuoi', 0x443a5c6d6f646966322e6a7067);

-- --------------------------------------------------------

--
-- Structure de la table `inscription`
--

CREATE TABLE `inscription` (
  `nom` varchar(25) NOT NULL,
  `prénom` varchar(25) NOT NULL,
  `Email` varchar(25) NOT NULL,
  `password` varchar(25) NOT NULL,
  `Confirm_Password` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Déchargement des données de la table `inscription`
--

INSERT INTO `inscription` (`nom`, `prénom`, `Email`, `password`, `Confirm_Password`) VALUES
('', '', '', '', ''),
('fabilou', 'fabilou', 'fbdialo@gmail.com', '111', '111'),
('haman', 'booba', 'haman@gmail.com', '222', '222'),
('kemeni', 'clex', 'kemeni@gmail.com', 'kemeni', 'kemeni');

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `administrateur`
--
ALTER TABLE `administrateur`
  ADD PRIMARY KEY (`Id`);

--
-- Index pour la table `cvbuilderdatabase`
--
ALTER TABLE `cvbuilderdatabase`
  ADD PRIMARY KEY (`email`);

--
-- Index pour la table `cvbuilderphotodatabase`
--
ALTER TABLE `cvbuilderphotodatabase`
  ADD PRIMARY KEY (`email`);

--
-- Index pour la table `inscription`
--
ALTER TABLE `inscription`
  ADD PRIMARY KEY (`Email`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
