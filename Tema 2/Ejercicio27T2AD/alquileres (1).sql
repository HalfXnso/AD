-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 02-10-2024 a las 12:24:33
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `inmobiliaria`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `alquileres`
--

CREATE TABLE `alquileres` (
  `idAlquiler` int(11) NOT NULL,
  `direccion` varchar(40) NOT NULL,
  `poblacion` varchar(30) NOT NULL,
  `codPostal` varchar(10) NOT NULL,
  `precioAlquiler` decimal(6,2) NOT NULL,
  `idContacto` varchar(30) NOT NULL,
  `telefono` varchar(12) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Volcado de datos para la tabla `alquileres`
--

INSERT INTO `alquileres` (`idAlquiler`, `direccion`, `poblacion`, `codPostal`, `precioAlquiler`, `idContacto`, `telefono`) VALUES
(1, 'Calle Falsa 123', 'Madrid', '28001', 3652.21, 'A123', '654789123'),
(3, 'Calle Mayor 45', 'Sevilla', '41003', 700.00, 'C789', '623456789'),
(4, 'Plaza del Sol 12', 'Valencia', '46001', 900.00, 'D012', '634567890'),
(5, 'Calle Luna 8', 'Granada', '18002', 600.00, 'E345', '645678901'),
(6, 'Avenida Libertad 10', 'Bilbao', '48001', 1100.25, 'F678', '656789012'),
(7, 'Calle del Rio 22', 'Zaragoza', '50001', 750.50, 'G901', '667890123'),
(8, 'Calle Real 33', 'Salamanca', '37001', 800.00, 'H234', '678901234'),
(9, 'Avenida Norte 15', 'Malaga', '29001', 950.80, 'I567', '689012345'),
(10, 'Plaza Mayor 5', 'Alicante', '03001', 650.50, 'J890', '690123456');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `alquileres`
--
ALTER TABLE `alquileres`
  ADD PRIMARY KEY (`idAlquiler`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
