-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Gép: 127.0.0.1
-- Létrehozás ideje: 2023. Feb 03. 03:34
-- Kiszolgáló verziója: 10.4.25-MariaDB
-- PHP verzió: 8.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Adatbázis: `jjb-vizsga`
--

-- --------------------------------------------------------

--
-- Tábla szerkezet ehhez a táblához `books`
--

CREATE TABLE `books` (
  `id` int(11) NOT NULL,
  `author` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `title` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `price` int(11) NOT NULL,
  `onSale` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- A tábla adatainak kiíratása `books`
--

INSERT INTO `books` (`id`, `author`, `title`, `price`, `onSale`) VALUES
(1, 'Jaida Nitzsche', 'Quo Animi Quia Eveniet Aut', 13434, 0),
(2, 'Ardella Bauch', 'Eum Magni Fugit', 13213, 1),
(3, 'Kyla Kertzmann III', 'Id Voluptas Omnis', 3401, 1),
(4, 'Briana Kihn', 'Saepe Totam Magnam Sit', 10398, 1),
(5, 'Ardella Bauch', 'Voluptatum Sit Quia', 13099, 1),
(6, 'Dr. Judah Armstrong IV', 'Ratione Quo', 5618, 0),
(7, 'Sabina O\'Connell', 'Voluptates Accusamus Est Vitae', 6427, 1),
(8, 'Asha Kreiger', 'Nesciunt Sed Est Enim', 9965, 1),
(9, 'Mrs. Mozelle Nader', 'Aut Ad Aut', 5690, 0),
(10, 'Sabina O\'Connell', 'Repellendus Ut Mollitia Quo', 5235, 0),
(11, 'Briana Kihn', 'Veritatis Consectetur', 12675, 1),
(12, 'Sabina O\'Connell', 'Libero Quia', 3296, 0),
(13, 'Asha Kreiger', 'Quia Nulla Eum Quo', 12424, 1),
(14, 'Kyla Kertzmann III', 'Non Consectetur Ut', 6715, 1),
(15, 'Briana Kihn', 'Velit Modi', 2483, 0),
(16, 'Asha Kreiger', 'Quibusdam Cumque Perspiciatis Sed Nihil', 9713, 0),
(17, 'Kyla Kertzmann III', 'Cupiditate Libero', 3271, 0),
(18, 'Briana Kihn', 'Vel Amet Eum Suscipit Earum', 8813, 0),
(19, 'Prof. Jon Armstrong I', 'Veniam Placeat Omnis Voluptas Deleniti', 6628, 1),
(20, 'Asha Kreiger', 'Sed Ipsa', 7765, 1);

--
-- Indexek a kiírt táblákhoz
--

--
-- A tábla indexei `books`
--
ALTER TABLE `books`
  ADD PRIMARY KEY (`id`);

--
-- A kiírt táblák AUTO_INCREMENT értéke
--

--
-- AUTO_INCREMENT a táblához `books`
--
ALTER TABLE `books`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
