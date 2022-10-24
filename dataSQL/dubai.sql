USE [master]
GO
CREATE DATABASE [KaraokeDubai]
GO

use [KaraokeDuBai]
go

CREATE TABLE [dbo].[Phong](
	[maPhong] [nvarchar](50) NOT NULL,
	[maLoaiPhong] [nvarchar](50) NOT NULL,
	[tinhTrangPhong] [nvarchar](255) NULL,
	[giaPhong] [float] NULL,
	sucChua int ,
	moTa  [nvarchar](255),
 CONSTRAINT [PK_Phong] PRIMARY KEY CLUSTERED 
(
	[maPhong] ASC
)
)
go

CREATE TABLE [dbo].[ChiTietDonDatPhong](
	[maDonDatPhong] [nvarchar](50) NOT NULL,
	[soLuong] [int] NULL,
	ngayDen date ,
	gioDen time,
	[maPhong] [nvarchar](50) NOT NULL,
	trangThaiDDP [nvarchar](50) NOT NULL
 CONSTRAINT [PK_ChiTietDonDatPhong] PRIMARY KEY CLUSTERED 
(
	[maDonDatPhong] ASC,
	[maPhong] ASC
)
) 
GO


GO
CREATE TABLE [dbo].[ChiTietHD](
	[maHD] [nvarchar](50) NOT NULL,
	[maMH] [nvarchar](50) NOT NULL,
	[maPhong]  [nvarchar](50) NOT NULL,
	[soLuong] [int] NULL,
	gioVao time,
	gioRa time,
	trangThaiCTHD [nvarchar](50) NOT NULL

 CONSTRAINT [PK_ChiTietHD] PRIMARY KEY CLUSTERED 
(
	[maHD] ASC,
	[maMH] ASC,
	[maPhong] ASC
)
)
GO




GO
CREATE TABLE [dbo].[DonDatPhong](
	[maDonDatPhong] [nvarchar](50) NOT NULL,
	[maNV] [nvarchar](50) NOT NULL,
	[maKH] [nvarchar](50) NOT NULL,
	[ngayLap] [date] NULL,
 CONSTRAINT [PK_DonDatPhong] PRIMARY KEY CLUSTERED 
(
	[maDonDatPhong] ASC
)
)
GO



GO
CREATE TABLE [dbo].[HoaDon](
	[maHD] [nvarchar](50) NOT NULL,
	[maKH] [nvarchar](50) NOT NULL,
	[tenKH] [nvarchar](50) ,
	[maNV] [nvarchar](50) NOT NULL,
	[tenNV] [nvarchar](50) ,
	[ngayLap] [date] NULL,
	[phuThu] [nvarchar](255) NULL,
	
 CONSTRAINT [PK_HoaDon] PRIMARY KEY CLUSTERED 
(
	[maHD] ASC
)
)
GO


GO
CREATE TABLE [dbo].[KhachHang](
	[maKH] [nvarchar](50) NOT NULL,
	[maLoaiKH] [nvarchar](50) NOT NULL,
	[tenKH] [nvarchar](255) NULL,
	[sdt] [nvarchar](255) NULL,
	[cccd] [nvarchar](255) NULL,
	[diaChi] [nvarchar](255) NULL,
	[ngaySinh] [date] NULL,
	[gioiTinh] [nvarchar](255) NULL,
	[diemTichLuy] [int] NULL,
	[ngayDK] [date] NULL,
 CONSTRAINT [PK_KhachHang] PRIMARY KEY CLUSTERED 
(
	[maKH] ASC
)
)
GO



CREATE TABLE [dbo].[LoaiKH](
	[maLoai] [nvarchar](50) NOT NULL,
	[tenLoaiKH] [nvarchar](255) NULL,
 CONSTRAINT [PK_LoaiKH] PRIMARY KEY CLUSTERED 
(
	[maLoai] ASC
)
)
GO


CREATE TABLE [dbo].[LoaiMH](
	[maLoai] [nvarchar](50) NOT NULL,
	[tenLoaiMH] [nvarchar](255) NULL,
 CONSTRAINT [PK_LoaiMatHang] PRIMARY KEY CLUSTERED 
(
	[maLoai] ASC
)
)
GO


CREATE TABLE [dbo].[LoaiPhong](
	[maLoai] [nvarchar](50) NOT NULL,
	[tenLoaiPhong] [nvarchar](255) NULL,
 CONSTRAINT [PK_LoaiPhong] PRIMARY KEY CLUSTERED 
(
	[maLoai] ASC
)
)

CREATE TABLE [dbo].[MatHang](
	[maMH] [nvarchar](50) NOT NULL,
	[maLoaiMH] [nvarchar](50) NOT NULL,
	[tenMH] [nvarchar](255) NULL,
	[soLuong] [int] NULL,
	[giaMH] [float] NULL,
 CONSTRAINT [PK_MatHang] PRIMARY KEY CLUSTERED 
(
	[maMH] ASC
)
)
GO


CREATE TABLE [dbo].[NhanVien](
	[maNV] [nvarchar](50) NOT NULL,
	[maTK] [nvarchar](50) NOT NULL,
	[tenNV] [nvarchar](255) NULL,
	[chucVu] [nvarchar](255) NULL,
	[gioiTinh] [nvarchar](255) NULL,
	[ngaySinh] [date] NULL,
	[diaChi] [nvarchar](255) NULL,
	[sdt] [nvarchar](255) NULL,
	[cccd] [nvarchar](255) NULL,
	[luong] [float] NULL,
	[caLamViec] [nvarchar](255) NULL,
	[trangThai] [nvarchar](50) NULL,
 CONSTRAINT [PK_NhanVien] PRIMARY KEY CLUSTERED 
(
	[maNV] ASC
)
)



CREATE TABLE [dbo].[TaiKhoan](
	[maTK] [nvarchar](50) NOT NULL,
	[matKhau] [nvarchar](255) NOT NULL,
 CONSTRAINT [PK_TaiKhoan] PRIMARY KEY CLUSTERED 
(
	[maTK] ASC
))
GO
ALTER TABLE [dbo].[ChiTietDonDatPhong]  WITH CHECK ADD  CONSTRAINT [FK_CTDDP_DonDatPhong] FOREIGN KEY([maDonDatPhong])
REFERENCES [dbo].[DonDatPhong] ([maDonDatPhong])
GO
ALTER TABLE [dbo].[ChiTietDonDatPhong] CHECK CONSTRAINT [FK_CTDDP_DonDatPhong]
GO
ALTER TABLE [dbo].[ChiTietDonDatPhong]  WITH CHECK ADD  CONSTRAINT [FK_CTDDP_Phong] FOREIGN KEY([maPhong]) -- loi
REFERENCES [dbo].[Phong] ([maPhong])
GO
ALTER TABLE [dbo].[ChiTietDonDatPhong] CHECK CONSTRAINT [FK_CTDDP_Phong]
GO
ALTER TABLE [dbo].[ChiTietHD]  WITH CHECK ADD  CONSTRAINT [FK_CTHD_HoaDon] FOREIGN KEY([maHD])
REFERENCES [dbo].[HoaDon] ([maHD])
GO
ALTER TABLE [dbo].[ChiTietHD] CHECK CONSTRAINT [FK_CTHD_HoaDon]
GO
ALTER TABLE [dbo].[ChiTietHD]  WITH CHECK ADD  CONSTRAINT [FK_CTHD_MatHang] FOREIGN KEY([maMH])
REFERENCES [dbo].[MatHang] ([maMH])
GO
ALTER TABLE [dbo].[ChiTietHD] CHECK CONSTRAINT [FK_CTHD_MatHang]
GO
ALTER TABLE [dbo].[ChiTietHD]  WITH CHECK ADD  CONSTRAINT [FK_CTHD_Phong] FOREIGN KEY([maPhong])
REFERENCES [dbo].[Phong] ([maPhong])
GO
ALTER TABLE [dbo].[ChiTietHD] CHECK CONSTRAINT [FK_CTHD_Phong]
GO

ALTER TABLE [dbo].[DonDatPhong]  WITH CHECK ADD  CONSTRAINT [FK_DonDatPhong_KhachHang] FOREIGN KEY([maKH])
REFERENCES [dbo].[KhachHang] ([maKH])
ON UPDATE CASCADE
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[DonDatPhong] CHECK CONSTRAINT [FK_DonDatPhong_KhachHang]
GO
ALTER TABLE [dbo].[DonDatPhong]  WITH CHECK ADD  CONSTRAINT [FK_DonDatPhong_NhanVien] FOREIGN KEY([maNV])
REFERENCES [dbo].[NhanVien] ([maNV])
ON UPDATE CASCADE
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[DonDatPhong] CHECK CONSTRAINT [FK_DonDatPhong_NhanVien]
GO

ALTER TABLE [dbo].[HoaDon]  WITH CHECK ADD  CONSTRAINT [FK_HoaDon_KhachHang] FOREIGN KEY([maKH])
REFERENCES [dbo].[KhachHang] ([maKH])
ON UPDATE CASCADE
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[HoaDon] CHECK CONSTRAINT [FK_HoaDon_KhachHang]
GO
ALTER TABLE [dbo].[HoaDon]  WITH CHECK ADD  CONSTRAINT [FK_HoaDon_NhanVien] FOREIGN KEY([maNV])
REFERENCES [dbo].[NhanVien] ([maNV])
ON UPDATE CASCADE
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[HoaDon] CHECK CONSTRAINT [FK_HoaDon_NhanVien]
GO
ALTER TABLE [dbo].[KhachHang]  WITH CHECK ADD  CONSTRAINT [FK_KhachHang_LoaiKH] FOREIGN KEY([maLoaiKH])
REFERENCES [dbo].[LoaiKH] ([maLoai])
ON UPDATE CASCADE
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[KhachHang] CHECK CONSTRAINT [FK_KhachHang_LoaiKH]
GO
ALTER TABLE [dbo].[MatHang]  WITH CHECK ADD  CONSTRAINT [FK_MatHang_LoaiMatHang] FOREIGN KEY([maLoaiMH])
REFERENCES [dbo].[LoaiMH] ([maLoai])
ON UPDATE CASCADE
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[MatHang] CHECK CONSTRAINT [FK_MatHang_LoaiMatHang]
GO
ALTER TABLE [dbo].[NhanVien]  WITH CHECK ADD  CONSTRAINT [FK_NhanVien_TaiKhoan1] FOREIGN KEY([maTK])
REFERENCES [dbo].[TaiKhoan] ([maTK])
GO
ALTER TABLE [dbo].[NhanVien] CHECK CONSTRAINT [FK_NhanVien_TaiKhoan1]
GO
ALTER TABLE [dbo].[Phong]  WITH CHECK ADD  CONSTRAINT [FK_Phong_LoaiPhong] FOREIGN KEY([maLoaiPhong])
REFERENCES [dbo].[LoaiPhong] ([maLoai])
ON UPDATE CASCADE
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[Phong] CHECK CONSTRAINT [FK_Phong_LoaiPhong]
GO

use KaraokeDubai

/*1.Thêm loại khách hàng*/
insert into [dbo].[LoaiKH] values ('LKH001',N'Khách hàng thường')

select * from LoaiKH

/*2.Thêm loại mặt hàng*/
insert into [dbo].[LoaiMH] values ('LMH001',N'Đồ uống')

select * from LoaiMH

/*3.Thêm loại phòng*/
insert into [dbo].[LoaiPhong] values ('LP001',N'Phòng VIP')

select * from [LoaiPhong]

/*4.Thêm mặt hàng*/
insert into [dbo].[MatHang] values ('MH001','LMH001','Coca Cola',100,10000 )

select * from [dbo].[MatHang]

/*5.Thêm tài khoản*/
insert into [dbo].[TaiKhoan] values ('TK001','20009931')

select * from [dbo].[TaiKhoan]

/*6.Thêm nhân viên*/
insert into [dbo].[NhanVien] values ('NV001','TK001',N'Nguyễn Hoàng Thái',N'Quản lí',N'Nam','2002-04-02',N'Đồng Phú - Long Hồ - Vĩnh Long','0703328743','312312312',20000000,'Full ca',N'Đang làm việc')

select * from [dbo].[NhanVien]

/*7.Thêm khách hàng*/
insert into [dbo].[KhachHang] values ('KH001','LKH001',N'Nguyễn Thái Hoàng','0703328743','312312312',N'Đồng Phú - Long Hồ - Vĩnh Long','2002-04-02',N'Nam',5,'2021-01-02')

select * from [dbo].[KhachHang]

/*8.Thêm hoá đơn*/
insert into [dbo].[HoaDon] values ('HD001','KH001',N'Nguyễn Thái Hoàng','NV001',N'Nguyễn Hoàng Thái','2022-04-02',N'Ngày thường')

select * from [dbo].[HoaDon]

/*9.Thêm phòng*/
insert into [dbo].[Phong] values ('P001','LP001',N'Trống',600000,10,N'Đầy đủ tiện nghi')

select * from [dbo].[Phong]

/*10.Thêm chi tiết hoá đơn*/
insert into [dbo].[ChiTietHD] values ('HD001','MH001','P001',2,N'10:30:00',N'12:30:00',N'Đã thanh toán')

select * from [dbo].[ChiTietHD]

/*11.Thêm đơn đặt phòng*/
insert into [dbo].[DonDatPhong] values ('DDP001','NV001','KH001','2002-04-02')

select * from [dbo].[DonDatPhong]

/*12.Thêm chi tiết đơn đặt phòng*/
insert into [dbo].[ChiTietDonDatPhong] values ('DDP001',12,'2002-04-02',N'10:30:00','P001',N'Đã trả phòng')

select * from [dbo].[ChiTietDonDatPhong]