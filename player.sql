USE [player]
GO
/****** Object:  Table [dbo].[userTbl]    Script Date: 04/14/2016 17:20:14 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[userTbl](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[username] [nvarchar](50) NULL,
	[password] [nvarchar](50) NULL,
 CONSTRAINT [PK_userTbl] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[userTbl] ON
INSERT [dbo].[userTbl] ([id], [username], [password]) VALUES (1, N'zhangsan', N'123')
INSERT [dbo].[userTbl] ([id], [username], [password]) VALUES (2, N'lisi', N'444')
SET IDENTITY_INSERT [dbo].[userTbl] OFF
/****** Object:  Table [dbo].[userMusicTbl]    Script Date: 04/14/2016 17:20:14 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[userMusicTbl](
	[uid] [int] NULL,
	[mid] [int] NULL
) ON [PRIMARY]
GO
INSERT [dbo].[userMusicTbl] ([uid], [mid]) VALUES (1, 1)
INSERT [dbo].[userMusicTbl] ([uid], [mid]) VALUES (1, 2)
INSERT [dbo].[userMusicTbl] ([uid], [mid]) VALUES (2, 3)
INSERT [dbo].[userMusicTbl] ([uid], [mid]) VALUES (2, 2)
INSERT [dbo].[userMusicTbl] ([uid], [mid]) VALUES (2, 4)
/****** Object:  Table [dbo].[musicTbl]    Script Date: 04/14/2016 17:20:14 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[musicTbl](
	[mid] [int] IDENTITY(1,1) NOT NULL,
	[musicsinger] [nvarchar](50) NULL,
	[musicname] [nvarchar](50) NULL,
	[musicpath] [nvarchar](50) NULL,
 CONSTRAINT [PK_musicTbl] PRIMARY KEY CLUSTERED 
(
	[mid] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[musicTbl] ON
INSERT [dbo].[musicTbl] ([mid], [musicsinger], [musicname], [musicpath]) VALUES (1, N'顾海滨', N'别离开', N'顾海滨-别离开.mp3')
INSERT [dbo].[musicTbl] ([mid], [musicsinger], [musicname], [musicpath]) VALUES (2, N'顾海滨', N'对决', N'顾海滨-对决.mp3')
INSERT [dbo].[musicTbl] ([mid], [musicsinger], [musicname], [musicpath]) VALUES (3, N'顾海滨', N'跟着希望飞翔', N'顾海滨-跟着希望飞翔.mp3')
INSERT [dbo].[musicTbl] ([mid], [musicsinger], [musicname], [musicpath]) VALUES (4, N'顾海滨', N'黑桃皇后', N'顾海滨-黑桃皇后.mp3')
INSERT [dbo].[musicTbl] ([mid], [musicsinger], [musicname], [musicpath]) VALUES (5, N'顾海滨', N'你这样的女孩', N'顾海滨-你这样的女孩.mp3')
INSERT [dbo].[musicTbl] ([mid], [musicsinger], [musicname], [musicpath]) VALUES (6, N'顾海滨', N'配角', N'顾海滨-配角.mp3')
INSERT [dbo].[musicTbl] ([mid], [musicsinger], [musicname], [musicpath]) VALUES (7, N'顾海滨', N'蜻蜓', N'顾海滨-蜻蜓.mp3')
SET IDENTITY_INSERT [dbo].[musicTbl] OFF
