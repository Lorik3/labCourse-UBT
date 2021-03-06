
USE [master]
GO
/****** Object:  Database [ELibrary]    Script Date: 01/07/2020 20:49:07 ******/
USE [ELibrary]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'ELibrary', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL14.SQLEXPRESS\MSSQL\DATA\ELibrary.mdf' , SIZE = 8192KB , MAXSIZE = UNLIMITED, FILEGROWTH = 65536KB )
 LOG ON 
( NAME = N'ELibrary_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL14.SQLEXPRESS\MSSQL\DATA\ELibrary_log.ldf' , SIZE = 8192KB , MAXSIZE = 2048GB , FILEGROWTH = 65536KB )
GO
ALTER DATABASE [ELibrary] SET COMPATIBILITY_LEVEL = 140
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [ELibrary].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [ELibrary] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [ELibrary] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [ELibrary] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [ELibrary] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [ELibrary] SET ARITHABORT OFF 
GO
ALTER DATABASE [ELibrary] SET AUTO_CLOSE ON 
GO
ALTER DATABASE [ELibrary] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [ELibrary] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [ELibrary] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [ELibrary] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [ELibrary] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [ELibrary] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [ELibrary] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [ELibrary] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [ELibrary] SET  ENABLE_BROKER 
GO
ALTER DATABASE [ELibrary] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [ELibrary] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [ELibrary] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [ELibrary] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [ELibrary] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [ELibrary] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [ELibrary] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [ELibrary] SET RECOVERY SIMPLE 
GO
ALTER DATABASE [ELibrary] SET  MULTI_USER 
GO
ALTER DATABASE [ELibrary] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [ELibrary] SET DB_CHAINING OFF 
GO
ALTER DATABASE [ELibrary] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [ELibrary] SET TARGET_RECOVERY_TIME = 60 SECONDS 
GO
ALTER DATABASE [ELibrary] SET DELAYED_DURABILITY = DISABLED 
GO
ALTER DATABASE [ELibrary] SET QUERY_STORE = OFF
GO
USE [ELibrary]
GO
/****** Object:  User [NT AUTHORITY\SYSTEM]    Script Date: 01/07/2020 20:49:07 ******/
CREATE USER [NT AUTHORITY\SYSTEM] FOR LOGIN [NT AUTHORITY\SYSTEM] WITH DEFAULT_SCHEMA=[dbo]
GO
/****** Object:  Table [dbo].[admins]    Script Date: 01/07/2020 20:49:07 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[admins](
	[Admin_id] [int] NOT NULL,
	[adminname] [varchar](20) NULL,
	[password] [varchar](30) NULL,
	[fk_student_id] [int] NULL,
	[fk_perdorusi_id] [int] NULL,
	[fk_id_autori] [int] NULL,
	[fk_libri_id] [int] NULL,
	[fk_lloji_id] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[Admin_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[autori]    Script Date: 01/07/2020 20:49:07 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[autori](
	[autori_id] [int] NOT NULL,
	[emri] [varchar](30) NULL,
	[mbiemri] [varchar](30) NULL,
	[gjinia] [varchar](1) NULL,
	[adressa] [varchar](20) NULL,
	[tel] [varchar](20) NULL,
	[email] [varchar](20) NULL,
PRIMARY KEY CLUSTERED 
(
	[autori_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[huazimi]    Script Date: 01/07/2020 20:49:07 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[huazimi](
	[huazimi_id] [int] NOT NULL,
	[data_e_huazimit] [date] NULL,
	[data_e_rikthimit] [date] NULL,
	[fk_libri_id] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[huazimi_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[libri]    Script Date: 01/07/2020 20:49:07 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[libri](
	[libri_id] [int] NOT NULL,
	[titulli] [varchar](30) NULL,
	[numri_i_faqeve] [int] NULL,
	[autori] [varchar](20) NULL,
	[Botusi] [varchar](15) NULL,
	[fk_id_autori] [int] NULL,
	[fk_lloji_id] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[libri_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[lloji]    Script Date: 01/07/2020 20:49:07 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[lloji](
	[lloji_id] [int] NOT NULL,
	[emri] [varchar](30) NULL,
PRIMARY KEY CLUSTERED 
(
	[lloji_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Perdorusi]    Script Date: 01/07/2020 20:49:07 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Perdorusi](
	[Users_id] [int] NOT NULL,
	[username] [varchar](20) NULL,
	[password] [varchar](30) NULL,
	[fk_roli_id] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[Users_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Rezervo]    Script Date: 01/07/2020 20:49:07 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Rezervo](
	[rezervo_id] [int] NOT NULL,
	[data_e_rezervimit] [date] NULL,
	[fk_libri_id] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[rezervo_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[roliL]    Script Date: 01/07/2020 20:49:07 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[roliL](
	[roli_id] [int] NOT NULL,
	[Emertimi] [varchar](50) NULL,
PRIMARY KEY CLUSTERED 
(
	[roli_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[studenti]    Script Date: 01/07/2020 20:49:07 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[studenti](
	[student_id] [int] NOT NULL,
	[emri] [varchar](30) NULL,
	[mbiemri] [varchar](30) NULL,
	[data_e_lindjes] [date] NULL,
	[gjinia] [varchar](1) NULL,
	[nr_telefonit] [int] NULL,
	[email] [varchar](20) NULL,
	[adressa] [varchar](20) NULL,
	[fk_user_id] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[student_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
ALTER TABLE [dbo].[admins]  WITH CHECK ADD FOREIGN KEY([fk_id_autori])
REFERENCES [dbo].[autori] ([autori_id])
GO
ALTER TABLE [dbo].[admins]  WITH CHECK ADD FOREIGN KEY([fk_libri_id])
REFERENCES [dbo].[libri] ([libri_id])
GO
ALTER TABLE [dbo].[admins]  WITH CHECK ADD FOREIGN KEY([fk_lloji_id])
REFERENCES [dbo].[lloji] ([lloji_id])
GO
ALTER TABLE [dbo].[admins]  WITH CHECK ADD FOREIGN KEY([fk_perdorusi_id])
REFERENCES [dbo].[Perdorusi] ([Users_id])
GO
ALTER TABLE [dbo].[admins]  WITH CHECK ADD FOREIGN KEY([fk_student_id])
REFERENCES [dbo].[studenti] ([student_id])
GO
ALTER TABLE [dbo].[huazimi]  WITH CHECK ADD FOREIGN KEY([fk_libri_id])
REFERENCES [dbo].[libri] ([libri_id])
GO
ALTER TABLE [dbo].[libri]  WITH CHECK ADD FOREIGN KEY([fk_id_autori])
REFERENCES [dbo].[autori] ([autori_id])
GO
ALTER TABLE [dbo].[libri]  WITH CHECK ADD FOREIGN KEY([fk_lloji_id])
REFERENCES [dbo].[lloji] ([lloji_id])
GO
ALTER TABLE [dbo].[Perdorusi]  WITH CHECK ADD FOREIGN KEY([fk_roli_id])
REFERENCES [dbo].[roliL] ([roli_id])
GO
ALTER TABLE [dbo].[Rezervo]  WITH CHECK ADD FOREIGN KEY([fk_libri_id])
REFERENCES [dbo].[libri] ([libri_id])
GO
ALTER TABLE [dbo].[studenti]  WITH CHECK ADD FOREIGN KEY([fk_user_id])
REFERENCES [dbo].[Perdorusi] ([Users_id])
GO
USE [master]
GO
ALTER DATABASE [ELibrary] SET  READ_WRITE 
GO
