-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 02, 2021 at 06:13 PM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.4.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `projectadmsiswa`
--

-- --------------------------------------------------------

--
-- Table structure for table `account`
--

CREATE TABLE `account` (
  `username` varchar(100) NOT NULL,
  `nama` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `telp` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `account`
--

INSERT INTO `account` (`username`, `nama`, `email`, `telp`, `password`) VALUES
('0052', 'Fajar Hidayatullah', 'fajarh@mail.com', '12345', 'admin'),
('0057', 'Salza Silviastanti', 'salzas@mail.com', '12345', 'admin'),
('0080', 'Dwiki Charisma Indiviery', 'dwikic@mail.com', '12345', 'admin'),
('0090', 'Andri Pratama', 'ap@mail.com', '12345', 'admin'),
('0104', 'Zen Fanny Parulian Pardosi', 'zenfanny@mail.com', '12345', 'admin'),
('0168', 'Waskito Adhy Pangestu', 'waskitoa@mail.com', '12345', 'admin'),
('0706', 'Sifa Maskury', 'sifam@mail.com', '12345', 'admin'),
('0964', 'Sonia Agustina Debiyanti Marpaung', 'soniaa@mail.com', '12345', 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `admintu`
--

CREATE TABLE `admintu` (
  `id_admin` int(11) NOT NULL,
  `nama` varchar(30) NOT NULL,
  `tempat` varchar(30) NOT NULL,
  `tgl_lahir` date NOT NULL,
  `jenis_kelamin` enum('Laki-laki','Perempuan') NOT NULL,
  `no_telpon` varchar(12) NOT NULL,
  `email` varchar(30) NOT NULL,
  `alamat` text NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `databuku`
--

CREATE TABLE `databuku` (
  `kode_buku` varchar(100) NOT NULL,
  `judul_buku` varchar(100) NOT NULL,
  `mata_pelajaran` varchar(100) NOT NULL,
  `tipe_buku` enum('Paket','LKS') NOT NULL,
  `semester` enum('1','2') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `dataguru`
--

CREATE TABLE `dataguru` (
  `id_guru` int(11) NOT NULL,
  `nama_guru` varchar(100) NOT NULL,
  `mapel` varchar(100) NOT NULL,
  `no_telp` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `jk` enum('Laki-laki','Perempuan') NOT NULL,
  `tempat_lahir` varchar(100) NOT NULL,
  `tgl_lahir` date NOT NULL,
  `alamat` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `datasiswa`
--

CREATE TABLE `datasiswa` (
  `nis` int(100) NOT NULL,
  `nama` varchar(100) NOT NULL,
  `notelp` varchar(15) NOT NULL,
  `tempatlahir` varchar(100) NOT NULL,
  `tgllahir` date NOT NULL,
  `jk` enum('Laki - laki','Perempuan') NOT NULL,
  `agama` varchar(100) NOT NULL,
  `jurusan` varchar(100) NOT NULL,
  `alamat` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `gedung`
--

CREATE TABLE `gedung` (
  `kode_pembayaran_gedung` varchar(15) NOT NULL,
  `nis` int(15) NOT NULL,
  `nama` varchar(30) NOT NULL,
  `tgl_pembayaran` varchar(15) NOT NULL,
  `biaya` varchar(30) NOT NULL,
  `nama_admin` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `pembayaranbuku`
--

CREATE TABLE `pembayaranbuku` (
  `kd_pembayaranbuku` varchar(100) NOT NULL,
  `kode_buku` varchar(100) NOT NULL,
  `nis` int(11) NOT NULL,
  `id_guru` int(11) NOT NULL,
  `nama_guru` varchar(100) NOT NULL,
  `judul_buku` varchar(100) NOT NULL,
  `mata_pelajaran` varchar(100) NOT NULL,
  `harga_buku` int(11) NOT NULL,
  `admin` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `pembayaranspp`
--

CREATE TABLE `pembayaranspp` (
  `kode_pembayaran` varchar(20) NOT NULL,
  `nis` int(11) NOT NULL,
  `nama_siswa` varchar(100) NOT NULL,
  `jurusan` varchar(100) NOT NULL,
  `tanggal_pembayaran` date NOT NULL,
  `bulan` varchar(100) NOT NULL,
  `jumlah_biaya` int(11) NOT NULL,
  `admin` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `seragam`
--

CREATE TABLE `seragam` (
  `kodepembayaran` varchar(100) NOT NULL,
  `nis` int(30) NOT NULL,
  `tglpembayaran` date NOT NULL,
  `jenisseragam` varchar(100) NOT NULL,
  `harga` int(11) NOT NULL,
  `namaadmin` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `account`
--
ALTER TABLE `account`
  ADD PRIMARY KEY (`username`);

--
-- Indexes for table `admintu`
--
ALTER TABLE `admintu`
  ADD PRIMARY KEY (`id_admin`);

--
-- Indexes for table `dataguru`
--
ALTER TABLE `dataguru`
  ADD PRIMARY KEY (`id_guru`);

--
-- Indexes for table `datasiswa`
--
ALTER TABLE `datasiswa`
  ADD PRIMARY KEY (`nis`);

--
-- Indexes for table `gedung`
--
ALTER TABLE `gedung`
  ADD PRIMARY KEY (`nis`);

--
-- Indexes for table `pembayaranbuku`
--
ALTER TABLE `pembayaranbuku`
  ADD PRIMARY KEY (`kd_pembayaranbuku`);

--
-- Indexes for table `pembayaranspp`
--
ALTER TABLE `pembayaranspp`
  ADD PRIMARY KEY (`kode_pembayaran`);

--
-- Indexes for table `seragam`
--
ALTER TABLE `seragam`
  ADD PRIMARY KEY (`kodepembayaran`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
