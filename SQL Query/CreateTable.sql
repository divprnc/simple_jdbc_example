USE [FinSoft]
GO

/****** Object:  Table [dbo].[InvoiceGen]    Script Date: 25/07/2019 16:40:39 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

SET ANSI_PADDING ON
GO

CREATE TABLE [dbo].[InvoiceGen](
	[CompanyCode] [int] NULL,
	[BranchCode] [varchar](2) NULL,
	[InvoiceDate] [date] NULL,
	[InvoiceNo] [varchar](6) NULL,
	[CustName] [varchar](50) NULL,
	[CustAddress] [varchar](100) NULL,
	[State] [int] NULL,
	[Pin] [int] NULL,
	[MobileNo] [int] NULL,
	[CurrencyType] [int] NULL,
	[Remarks] [varchar](200) NULL,
	[CreatedBy] [varchar](5) NULL,
	[CreationDate] [date] NULL,
	[ModifiedBy] [varchar](5) NULL,
	[ModificationDate] [date] NULL
) ON [PRIMARY]

GO

SET ANSI_PADDING OFF
GO


