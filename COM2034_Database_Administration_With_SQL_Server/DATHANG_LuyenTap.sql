/* Câu 1 (1.5 điểm): Tạo cơ sở dữ liệu DATHANG gồm 3 bảng. 
MATHANG (MaH, TenH, LoaiH, DVTinh )
DONHANG (SoDH, NgayDH, NgayGH)
CTDH (SoDH, MaH, SoLuong, DonGia) */
CREATE DATABASE DATHANG
GO
USE DATHANG
GO

CREATE TABLE MATHANG
(
    MaH VARCHAR(20) PRIMARY KEY,
    TenH NVARCHAR(30),
    LoaiH NVARCHAR(30),
    DVTinh VARCHAR(MAX)
)

CREATE TABLE DONHANG
(
    SoDH INT PRIMARY KEY,
    NgayDH DATE,
    NgayGH DATE
)

CREATE TABLE CTDH
(
    SoDH INT,
    MaH VARCHAR(20),
    SoLuong INT,
    DonGia DECIMAL(20,0)
)

ALTER TABLE CTDH ADD FOREIGN KEY (SoDH) REFERENCES DONHANG(SoDH)

ALTER TABLE CTDH ADD FOREIGN KEY (MaH) REFERENCES MATHANG(MaH)


/* Câu 2 (3 điểm): Chèn thông tin vào các bảng
●	Tạo Stored Procedure (SP) với các tham số đầu vào phù hợp.
SP thứ nhất thực hiện chèn dữ liệu vào bảng MATHANG.
SP thứ hai thực hiện chèn dữ liệu vào bảng DONHANG.
SP thứ ba thực hiện chèn dữ liệu vào bảng CTDH.
●	Yêu cầu mỗi SP phải kiểm tra tham số đầu vào. Với các cột không chấp nhận thuộc tính Null.
●	Với mỗi SP viết 3 lời gọi thành công. */

-- 1
GO
CREATE PROC SP_MATHANG
    @MaH VARCHAR(20),
    @TenH NVARCHAR(30),
    @LoaiH NVARCHAR(30),
    @DVTinh VARCHAR(MAX)
AS
IF @MaH IS NULL OR @TenH IS NULL OR @LoaiH IS NULL OR @DVTinh IS NULL
PRINT N'Không được để trống'
ELSE
INSERT INTO MATHANG VALUES(@MaH, @TenH, @LoaiH, @DVTinh)

EXEC SP_MATHANG @MaH = 'H1', @TenH = 'PC', @LoaiH = 'ASUS', @DVTinh = 'VND'
EXEC SP_MATHANG @MaH = 'H2', @TenH = 'IPHONE', @LoaiH = 'APPLE', @DVTinh = 'VND'
EXEC SP_MATHANG @MaH = 'H3', @TenH = 'WIFI', @LoaiH = 'TOTO', @DVTinh = 'VND'
SELECT * FROM MATHANG
-- 2

GO
CREATE PROC SP_DONHANG
    @SoDH INT,
    @NgayDH DATE,
    @NgayGH DATE
AS
IF @SoDH IS NULL OR @NgayDH IS NULL OR @NgayGH IS NULL
PRINT N'Không được để trống'
ELSE
INSERT INTO DONHANG VALUES(@SoDH, @NgayDH, @NgayGH)

EXEC SP_DONHANG @SoDH = 1, @NgayDH = '2022-01-12', @NgayGH = '2022-03-01'
EXEC SP_DONHANG @SoDH = 2, @NgayDH = '2022-01-12', @NgayGH = '2022-03-01'
EXEC SP_DONHANG @SoDH = 3, @NgayDH = '2022-02-12', @NgayGH = '2022-03-01'
SELECT * FROM DONHANG
-- 3

GO
CREATE PROC SP_CTDH
    @SoDH INT,
    @MaH VARCHAR(20),
    @SoLuong INT,
    @DonGia DECIMAL(20,0)
AS
IF @SoDH IS NULL OR @MaH IS NULL OR @SoLuong IS NULL OR @DonGia IS NULL
PRINT N'Không được để trống'
ELSE
INSERT INTO CTDH VALUES(@SoDH, @MaH, @SoLuong, @DonGia)

EXEC SP_CTDH @SoDH = 1, @MaH = 'H1', @SoLuong = 10, @DonGia = 40000
EXEC SP_CTDH @SoDH =  1, @MaH = 'H2', @SoLuong = 5, @DonGia = 50000
EXEC SP_CTDH @SoDH = 3, @MaH = 'H3', @SoLuong = 3, @DonGia = 40000
SELECT * FROM CTDH

/* Câu 3 (2 điểm): Viết Hàm
Viết hàm các tham số đầu vào tương ứng với các cột của bảng MATHANG. Hàm này trả về MaH thỏa mãn các giá trị được truyền tham số. */
GO
CREATE FUNCTION TIMKIEM(
    @MaH VARCHAR(20),
    @TenH NVARCHAR(30),
    @LoaiH NVARCHAR(30),
    @DVTinh VARCHAR(MAX)
)
RETURNS NVARCHAR(30)
BEGIN
    RETURN (SELECT MaH FROM MATHANG WHERE MaH = @MaH AND TenH = @TenH AND LoaiH = @LoaiH AND DVTinh = @DVTinh)
END
GO
DECLARE @MaH VARCHAR(20)
SET @MaH = dbo.TIMKIEM('H1', 'PC', 'ASUS', 'VND')
SELECT @MaH AS N'MaH'
/*Câu 4 (1.5 điểm): Tạo View 
Tạo View lưu thông tin của TOP 5 có giá trị đơn hàng lớn nhất, gồm các thông tin sau: MaH, TenH, LoaiH, NgayDH, NgayGH, SoLuong, DonGia, “Gia Tri Max”. */

GO
CREATE VIEW MAT_HANG
AS
    SELECT TOP 5
        MATHANG.MaH, MATHANG.TenH, MATHANG.LoaiH, DONHANG.NgayDH, DONHANG.NgayGH, CTDH.SoLuong, CTDH.DonGia, SUM(CTDH.SoLuong * CTDH.DonGia) [GIA TRI MAX]
    FROM MATHANG JOIN CTDH ON MATHANG.MaH = CTDH.MaH JOIN DONHANG ON CTDH.SoDH = DONHANG.SoDH
    GROUP BY MATHANG.MaH, MATHANG.TenH, MATHANG.LoaiH, DONHANG.NgayDH, DONHANG.NgayGH, CTDH.SoLuong, CTDH.DonGia
GO

SELECT *
FROM MAT_HANG
/* Câu 5 (2 điểm): Viết thủ tục
Viết một SP nhận một tham số đầu vào là SoLuong. SP này thực hiện thao tác xóa thông tin mặt hàng và đơn hàng tương ứng.
Yêu cầu: Sử dụng giao dịch trong thân SP, để đảm bảo tính toàn vẹn dữ liệu khi một thao tác xóa thực hiện không thành công. */

GO
CREATE TRIGGER XOA_DH ON CTDH AFTER DELETE
AS 
BEGIN
    DELETE MATHANG WHERE MaH IN (SELECT MaH FROM DELETED)
    DELETE DONHANG WHERE SoDH IN (SELECT SoDH FROM DELETED)

END
GO
CREATE PROC XOA_SP(@SoLuong INT)
AS
BEGIN
    DELETE CTDH WHERE MaH IN (SELECT MaH FROM CTDH WHERE SoLuong = @SoLuong)
    DELETE CTDH WHERE SoDH IN (SELECT SoDH FROM CTDH WHERE SoLuong = @SoLuong)
END
SELECT * FROM MATHANG
SELECT * FROM DONHANG
SELECT * FROM CTDH
EXEC XOA_SP @SoLuong = 5