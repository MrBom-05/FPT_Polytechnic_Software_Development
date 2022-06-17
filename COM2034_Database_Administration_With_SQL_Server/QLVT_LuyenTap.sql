/*Câu 1 (1.5 điểm): Tạo cơ sở dữ liệu QLVT gồm 3 bảng.
VATTU (MaVT, TenVT, DVTinh,NgayTao,DonGia)
PHIEUXUAT (SoPX, NgayXuat)
CTPXUAT(SoPX, MaVT, SLXuat, DonGia,TrangThai)*/
CREATE DATABASE QLVT
GO
USE QLVT
GO

CREATE TABLE VATTU
(
    MaVT VARCHAR(20) PRIMARY KEY,
    TenVT NVARCHAR(30),
    DVTinh NVARCHAR(20),
    NgayTao DATE,
    DonGia DECIMAL(20,0)
)

CREATE TABLE PHIEUXUAT
(
    SoPX INT PRIMARY KEY,
    NgayXuat DATE
)

CREATE TABLE CTPXUAT
(
    SoPX INT,
    MaVT VARCHAR(20),
    SLXuat INT,
    DonGia DECIMAL(20,0),
    TrangThai INT
)

ALTER TABLE CTPXUAT ADD FOREIGN KEY (SoPX) REFERENCES PHIEUXUAT(SoPX)
ALTER TABLE CTPXUAT ADD FOREIGN KEY (MaVT) REFERENCES VATTU(MaVT)

/*Câu 2 (3 điểm): Chèn thông tin vào các bảng
Tạo Stored Procedure (SP) với các tham số đầu vào phù hợp.
SP thứ nhất thực hiện chèn dữ liệu vào bảng VATTU.
SP thứ hai thực hiện chèn dữ liệu vào bảng PHIEUXUAT.
SP thứ ba thực hiện chèn dữ liệu vào bảng CTPXUAT.
Yêu cầu mỗi SP phải kiểm tra tham số đầu vào. Với các cột không chấp nhận thuộc tính Null.
Với mỗi SP viết 3 lời gọi thành công.*/

GO
CREATE PROC SP_VATTU(
    @MaVT VARCHAR(20),
    @TenVT NVARCHAR(30),
    @DVTinh NVARCHAR(20),
    @NgayTao DATE,
    @DonGia DECIMAL(20,0)
)
AS
IF @MaVT IS NULL OR @TenVT IS NULL OR @DVTinh IS NULL OR @NgayTao IS NULL OR @DonGia IS NULL
PRINT N'KHÔNG ĐƯỢC ĐỂ TRỐNG'
ELSE
INSERT INTO VATTU VALUES(@MaVT, @TenVT, @DVTinh, @NgayTao, @DonGia)

EXEC SP_VATTU @MaVT = 'H8', @TenVT = 'XE', @DVTinh = 'VND', @NgayTao = '2022/01/02', @DonGia = 30000
EXEC SP_VATTU @MaVT = 'H10', @TenVT = 'XE', @DVTinh = 'VND', @NgayTao = '2022/03/02', @DonGia = 40000
EXEC SP_VATTU @MaVT = 'H15', @TenVT = 'XE', @DVTinh = 'VND', @NgayTao = '2022/01/02', @DonGia = 30000
SELECT * FROM VATTU

GO
CREATE PROC SP_PHIEUXUAT(
    @SoPX INT,
    @NgayXuat DATE
)
AS
IF @SoPX IS NULL OR @NgayXuat IS NULL
PRINT N'KHÔNG ĐƯỢC ĐỂ TRỐNG'
ELSE
INSERT INTO PHIEUXUAT VALUES (@SoPX, @NgayXuat)

EXEC SP_PHIEUXUAT @SoPX = 9, @NgayXuat = '2022/02/02'
EXEC SP_PHIEUXUAT @SoPX = 4, @NgayXuat = '2022/02/02'
EXEC SP_PHIEUXUAT @SoPX = 10, @NgayXuat = '2022/02/02'
SELECT * FROM PHIEUXUAT

GO
CREATE PROC SP_CTPXUAT(
    @SoPX INT,
    @MaVT VARCHAR(20),
    @SLXuat INT,
    @DonGia DECIMAL(20,0),
    @TrangThai INT
)
AS
IF @SoPX IS NULL OR @MaVT IS NULL OR @SLXuat IS NULL OR @DonGia IS NULL OR @TrangThai IS NULL
PRINT N'KHÔNG ĐƯỢC ĐỂ TRỐNG'
ELSE
INSERT INTO CTPXUAT VALUES (@SoPX, @MaVT, @SLXuat, @DonGia, @TrangThai)

EXEC SP_CTPXUAT @SoPX = 10, @MaVT = 'H8', @SLXuat = 5, @DonGia = 50000, @TrangThai = 1
EXEC SP_CTPXUAT @SoPX = 4, @MaVT = 'H10', @SLXuat = 4, @DonGia = 90000, @TrangThai = 0
EXEC SP_CTPXUAT @SoPX = 9, @MaVT = 'H15', @SLXuat = 8, @DonGia = 50000, @TrangThai = 1
SELECT * FROM CTPXUAT

/*Câu 3 (2 điểm): Viết Hàm
Viết hàm các tham số đầu vào tương ứng với các cột của bảng VATTU. Hàm này trả về MaVT thỏa mãn các giá trị được truyền tham số. */

GO
CREATE FUNCTION SEARCH(
    @MaVT VARCHAR(20),
    @TenVT NVARCHAR(30),
    @DVTinh NVARCHAR(20),
    @NgayTao DATE,
    @DonGia DECIMAL(20,0)
)
RETURNS NVARCHAR(30)
BEGIN
    RETURN (SELECT MaVT FROM VATTU WHERE MaVT = @MaVT AND TenVT = @TenVT AND DVTinh = @DVTinh AND NgayTao = @NgayTao AND DonGia = @DonGia)
END
GO
DECLARE @MaVT VARCHAR(20)
SET @MaVT = dbo.SEARCH('H8', 'XE', 'VND', '2022/01/02', 30000)
SELECT @MaVT AS N'MaVT'

/*Câu 4 (1.5 điểm): Tạo View 
Tạo View lưu thông tin của phiếu xuất có giá trị lớn nhất, gồm các thông tin sau: MaVT, TenVT, NgayXuat, TenKH, SLXuat, DonGia, “Gia Tri Max” và sắp xếp giảm dần.*/

GO
CREATE VIEW SP
AS
    SELECT TOP(3)
        VATTU.MaVT, VATTU.TenVT, PHIEUXUAT.NgayXuat, CTPXUAT.SLXuat, CTPXUAT.DonGia, SUM(CTPXUAT.DonGia * CTPXUAT.SLXuat) AS 'GIA TRI MAX'
    FROM VATTU JOIN CTPXUAT ON CTPXUAT.MaVT = VATTU.MaVT
    JOIN PHIEUXUAT ON CTPXUAT.SoPX = PHIEUXUAT.SoPX
    GROUP BY VATTU.MaVT, VATTU.TenVT, PHIEUXUAT.NgayXuat, CTPXUAT.SLXuat, CTPXUAT.DonGia
    ORDER BY SUM(CTPXUAT.DonGia * CTPXUAT.SLXuat) DESC
GO
SELECT *
FROM SP
/*Câu 5 (2 điểm): Viết thủ tục
Viết một SP nhận một tham số đầu vào là SLXuat. SP này thực hiện thao tác xóa thông tin vật tư và phiếu xuất tương ứng.
Yêu cầu: Sử dụng giao dịch trong thân SP, để đảm bảo tính toàn vẹn dữ liệu khi một thao tác xóa thực hiện không thành công.
Lưu ý! Tên CSDL: CSDL_Tên Sinh Viên_MSSV. Xóa hết các CSDL trên máy. Ngắt internet, không trao đổi. Giám thị nhắc lần 1 trừ 2 điểm, lần 2 trừ 5 điểm, lần 3 hủy bài thi.*/

GO
CREATE TRIGGER XOA_SL ON CTPXUAT AFTER DELETE
AS 
BEGIN
    DELETE VATTU WHERE MaVT IN (SELECT MaVT FROM DELETED)
    DELETE PHIEUXUAT WHERE SoPX IN (SELECT SoPX FROM DELETED)

END
GO
CREATE PROC XOA_SP(@SLXuat INT)
AS
BEGIN
    DELETE CTPXUAT WHERE MaVT IN (SELECT MaVT FROM CTPXUAT WHERE SLXuat = @SLXuat)
    DELETE CTPXUAT WHERE SoPX IN (SELECT SoPX FROM CTPXUAT WHERE SLXuat = @SLXuat)
END
SELECT * FROM VATTU
SELECT * FROM PHIEUXUAT
SELECT * FROM CTPXUAT
EXEC XOA_SP @SLXuat = 5


