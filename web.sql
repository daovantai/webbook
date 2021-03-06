USE [qltv]
GO
/****** Object:  Table [dbo].[Khosach]    Script Date: 6/10/2022 10:21:48 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Khosach](
	[masach] [nvarchar](50) NOT NULL,
	[tensach] [nvarchar](50) NULL,
	[tacgia] [nvarchar](50) NULL,
	[nxb] [nvarchar](50) NULL,
	[theloai] [nvarchar](50) NULL,
	[tinhtrang] [nvarchar](50) NULL,
 CONSTRAINT [PK_Khosach] PRIMARY KEY CLUSTERED 
(
	[masach] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[phieumuon]    Script Date: 6/10/2022 10:21:48 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[phieumuon](
	[id] [nvarchar](50) NULL,
	[tendn] [nvarchar](50) NULL,
	[masach] [nvarchar](50) NULL,
	[tensach] [nvarchar](50) NULL
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Taikhoan]    Script Date: 6/10/2022 10:21:48 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Taikhoan](
	[Hovaten] [nvarchar](50) NULL,
	[Tendn] [nvarchar](50) NULL,
	[Email] [nvarchar](50) NULL,
	[sdt] [nvarchar](50) NULL,
	[Matkhau] [nvarchar](50) NULL,
	[Nlmk] [nvarchar](50) NULL
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[TKthuthu]    Script Date: 6/10/2022 10:21:48 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[TKthuthu](
	[Tendn] [nvarchar](50) NULL,
	[Matkhau] [nvarchar](50) NULL,
	[khokk] [nvarchar](50) NULL
) ON [PRIMARY]
GO
INSERT [dbo].[Khosach] ([masach], [tensach], [tacgia], [nxb], [theloai], [tinhtrang]) VALUES (N'MS0001', N'Tieng Anh', N'Pham Linh', N'Kim dong', N'Van hoc', N'đã mượn')
INSERT [dbo].[Khosach] ([masach], [tensach], [tacgia], [nxb], [theloai], [tinhtrang]) VALUES (N'MS0002', N'Cà phê cùng Tony', N'Nhật Ánh', N'Dân trí', N'Giải trí', N'chưa mượn')
INSERT [dbo].[Khosach] ([masach], [tensach], [tacgia], [nxb], [theloai], [tinhtrang]) VALUES (N'MS0004', N'Đừng bao giờ bỏ cuộc', N'Trump', N'Dân trí', N'Tự truyện', N'đã mượn')
INSERT [dbo].[Khosach] ([masach], [tensach], [tacgia], [nxb], [theloai], [tinhtrang]) VALUES (N'MS0005', N'Ông già và biển cả', N'Hemingway', N'Quốc Gia', N'Tiểu thuyết', N'chưa mượn')
INSERT [dbo].[Khosach] ([masach], [tensach], [tacgia], [nxb], [theloai], [tinhtrang]) VALUES (N'MS0006', N'Tỷ phú bán giày', N'Tony Hsieh', N'Lao Động', N'Tiểu thuyết', N'đã mượn')
INSERT [dbo].[Khosach] ([masach], [tensach], [tacgia], [nxb], [theloai], [tinhtrang]) VALUES (N'MS0007', N'Đọc vị bất kỳ ai', N'David', N'Hà Nội', N'Truyện ngắn', N'đã mượn')
INSERT [dbo].[Khosach] ([masach], [tensach], [tacgia], [nxb], [theloai], [tinhtrang]) VALUES (N'MS0008', N'Bố già', N'Mario Puzo', N'Lao Động', N'Tiểu thuyết', N'chưa mượn')
INSERT [dbo].[Khosach] ([masach], [tensach], [tacgia], [nxb], [theloai], [tinhtrang]) VALUES (N'MS0010', N'Mặc kệ thiên hạ', N'Mari Tamaga', N'Kim đồng', N'Tiểu thuyết', N'đã mượn')
INSERT [dbo].[Khosach] ([masach], [tensach], [tacgia], [nxb], [theloai], [tinhtrang]) VALUES (N'MS0011', N'Bắt trẻ đồng xanh', N'J.D.Salinger', N'New York', N'Truyện dài', N'chưa mượn')
INSERT [dbo].[Khosach] ([masach], [tensach], [tacgia], [nxb], [theloai], [tinhtrang]) VALUES (N'MS0012', N'Cuốn theo chiều gió', N'Gone With The Wind', N'Quốc gia', N'Truyện ngắn', N'đã mượn')
INSERT [dbo].[Khosach] ([masach], [tensach], [tacgia], [nxb], [theloai], [tinhtrang]) VALUES (N'MS0024', N'No Love', N'Quỳnh Như', N'Tibi', N'Tình yêu', N'đã mượn')
INSERT [dbo].[Khosach] ([masach], [tensach], [tacgia], [nxb], [theloai], [tinhtrang]) VALUES (N'MS0093', N'Toeic', N'ok', N'english', N'Van hoc', N'chưa mượn')
INSERT [dbo].[Khosach] ([masach], [tensach], [tacgia], [nxb], [theloai], [tinhtrang]) VALUES (N'MS0102', N'Nhà Giả Kim', N'Paulo Comic', N'Văn Học', N'Tiểu thuyết', N'chưa mượn')
INSERT [dbo].[Khosach] ([masach], [tensach], [tacgia], [nxb], [theloai], [tinhtrang]) VALUES (N'MS0125', N'Đắc Nhân Tâm', N'Dale Car', N'New York', N'Văn học', N'đã mượn')
INSERT [dbo].[Khosach] ([masach], [tensach], [tacgia], [nxb], [theloai], [tinhtrang]) VALUES (N'MS0129', N'CNPM', N'CoTuAnh', N'ptit', N'hoc', N'chưa mượn')
INSERT [dbo].[Khosach] ([masach], [tensach], [tacgia], [nxb], [theloai], [tinhtrang]) VALUES (N'MS0198', N'Camp Bomb', N'Zeblish', N'ThaoHip', N'Tiếng anh', N'đã mượn')
INSERT [dbo].[Khosach] ([masach], [tensach], [tacgia], [nxb], [theloai], [tinhtrang]) VALUES (N'MS1024', N'MU C1', N'Harry Maxhai', N'Man', N'Truyện hài', N'chưa mượn')
INSERT [dbo].[Khosach] ([masach], [tensach], [tacgia], [nxb], [theloai], [tinhtrang]) VALUES (N'MS1098', N'Dạy con làm giàu', N'Robert Kiyosaki', N'Hà Nội', N'Văn Học', N'chua muon')
INSERT [dbo].[Khosach] ([masach], [tensach], [tacgia], [nxb], [theloai], [tinhtrang]) VALUES (N'MS2054', N'Những tấm lòng cao cả', N'Edmondo', N'HCM', N'Tiểu thuyết', N'đã mượn')
INSERT [dbo].[Khosach] ([masach], [tensach], [tacgia], [nxb], [theloai], [tinhtrang]) VALUES (N'MS2304', N'Nhà lãnh đạo', N'Robin Sharma', N'Kim đồng', N'Tiểu thuyết', N'đã mượn')
INSERT [dbo].[Khosach] ([masach], [tensach], [tacgia], [nxb], [theloai], [tinhtrang]) VALUES (N'MS6788', N'java', N'MinhHoang', N'bachay', N'LyTrum', N'chua muon')
INSERT [dbo].[Khosach] ([masach], [tensach], [tacgia], [nxb], [theloai], [tinhtrang]) VALUES (N'MS8932', N'Harry Potter', N'J.K.Rowling', N'Dân trí', N'Truyện tranh', N'chưa mượn')
GO
INSERT [dbo].[phieumuon] ([id], [tendn], [masach], [tensach]) VALUES (N'Toeic', N'ok', N'english', N'MS0093')
INSERT [dbo].[phieumuon] ([id], [tendn], [masach], [tensach]) VALUES (N'Bố già', N'Mario Puzo', N'Lao Động', N'MS0008')
INSERT [dbo].[phieumuon] ([id], [tendn], [masach], [tensach]) VALUES (N'Mặc kệ thiên hạ', N'Mari Tamaga', N'Kim đồng', N'MS0010')
GO
INSERT [dbo].[Taikhoan] ([Hovaten], [Tendn], [Email], [sdt], [Matkhau], [Nlmk]) VALUES (N'kimanh', N'kimanh', N'anh1@gmail.com', N'0108202', N'321', N'321')
INSERT [dbo].[Taikhoan] ([Hovaten], [Tendn], [Email], [sdt], [Matkhau], [Nlmk]) VALUES (N'daovantai', N'daotai', N'daotai2309@gmail.com', N'0347268', N'123', N'123')
INSERT [dbo].[Taikhoan] ([Hovaten], [Tendn], [Email], [sdt], [Matkhau], [Nlmk]) VALUES (N'nguyenminhoang', N'ahoang', N'hoang@gmail.com', N'09289323', N'123456', N'123456')
INSERT [dbo].[Taikhoan] ([Hovaten], [Tendn], [Email], [sdt], [Matkhau], [Nlmk]) VALUES (N'kimdao', N'kim', N'daotai2309@gmail.com', N'123141', N'123', N'123')
INSERT [dbo].[Taikhoan] ([Hovaten], [Tendn], [Email], [sdt], [Matkhau], [Nlmk]) VALUES (N'phamthuy', N'thuypham', N'thuy@gmail.com', N'0987622', N'thuythuy', N'thuythuy')
INSERT [dbo].[Taikhoan] ([Hovaten], [Tendn], [Email], [sdt], [Matkhau], [Nlmk]) VALUES (N'phamquynhnhu', N'nhupham', N'nhu@gmai.com', N'09829893', N'123456', N'123456')
INSERT [dbo].[Taikhoan] ([Hovaten], [Tendn], [Email], [sdt], [Matkhau], [Nlmk]) VALUES (N'ngocanh', N'anhtun', N'anh@gmail.com', N'09290829', N'444', N'444')
INSERT [dbo].[Taikhoan] ([Hovaten], [Tendn], [Email], [sdt], [Matkhau], [Nlmk]) VALUES (N'thantrieu', N'trieutrieu', N'trieu@gmail.com', N'0388131', N'123', N'123')
INSERT [dbo].[Taikhoan] ([Hovaten], [Tendn], [Email], [sdt], [Matkhau], [Nlmk]) VALUES (N'cnpm', N'cnpm', N'cnpm@gmail.com', N'012345', N'123', N'123')
INSERT [dbo].[Taikhoan] ([Hovaten], [Tendn], [Email], [sdt], [Matkhau], [Nlmk]) VALUES (N'linhlinh', N'linhlinh22', N'linh@gmail.com', N'0197393', N'1234', N'1234')
GO
INSERT [dbo].[TKthuthu] ([Tendn], [Matkhau], [khokk]) VALUES (N'admin', N'123', N'123')
INSERT [dbo].[TKthuthu] ([Tendn], [Matkhau], [khokk]) VALUES (N'thuthu', N'1234', N'1234')
GO
