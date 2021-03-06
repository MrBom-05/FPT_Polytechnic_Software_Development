CREATE DATABASE THI_MASV
GO
USE THI_MASV
GO

CREATE TABLE SANPHAM(
    MASP VARCHAR(20) PRIMARY KEY,
    TENSP NVARCHAR(30),
    GIABAN DECIMAL(20,0),
    SOLUONG INT,
)

CREATE TABLE PHIEUNHAP(
    SOPN INT PRIMARY KEY,
    NGAYNHAP DATE,
    TRANGTHAI INT
)

CREATE TABLE CTPNHAP(
    SOPN INT,
    MASP VARCHAR(20),
    SLNHAP INT,
    GIANHAP DECIMAL(20,0)
)

ALTER TABLE CTPNHAP ADD FOREIGN KEY (SOPN) REFERENCES PHIEUNHAP(SOPN)
ALTER TABLE CTPNHAP ADD FOREIGN KEY (MASP) REFERENCES SANPHAM(MASP)
--2
GO
CREATE PROC SP_SANPHAM(
    @MASP VARCHAR(20),
    @TENSP NVARCHAR(30),
    @GIABAN DECIMAL(20,0),
    @SOLUONG INT
)
AS
IF @MASP IS NULL OR @TENSP IS NULL OR @GIABAN IS NULL OR @SOLUONG IS NULL
PRINT 'KHONG DUOC DE TRONG'
ELSE
INSERT INTO SANPHAM VALUES(@MASP, @TENSP, @GIABAN, @SOLUONG)

EXEC SP_SANPHAM @MASP = 'H1', @TENSP = 'PC', @GIABAN = 3000, @SOLUONG = 2
EXEC SP_SANPHAM @MASP = 'H2', @TENSP = 'PHONE', @GIABAN = 4000, @SOLUONG = 3
EXEC SP_SANPHAM @MASP = 'H3', @TENSP = 'BIKE', @GIABAN = 5000, @SOLUONG = 4
SELECT * FROM SANPHAM

GO
CREATE PROC SP_PHIEUNHAP(
    @SOPN INT,
    @NGAYNHAP DATE,
    @TRANGTHAI INT
)
AS
IF @SOPN IS NULL OR @NGAYNHAP IS NULL OR @TRANGTHAI IS NULL
PRINT 'KHONG DUOC DE TRONG'
ELSE
INSERT INTO PHIEUNHAP VALUES(@SOPN, @NGAYNHAP, @TRANGTHAI)

EXEC SP_PHIEUNHAP @SOPN = 3, @NGAYNHAP = '2022/01/01', @TRANGTHAI = 1
EXEC SP_PHIEUNHAP @SOPN = 4, @NGAYNHAP = '2022/02/01', @TRANGTHAI = 0
EXEC SP_PHIEUNHAP @SOPN = 5, @NGAYNHAP = '2022/03/04', @TRANGTHAI = 1
SELECT * FROM PHIEUNHAP

GO
CREATE PROC SP_CTPNHAP(
    @SOPN INT,
    @MASP VARCHAR(20),
    @SLNHAP INT,
    @GIANHAP DECIMAL(20,0)
)
AS
IF @SOPN IS NULL OR @MASP IS NULL OR @SLNHAP IS NULL OR @GIANHAP IS NULL
PRINT 'KHONG DUOC DE TRONG'
ELSE
INSERT INTO CTPNHAP VALUES(@SOPN, @MASP, @SLNHAP, @GIANHAP)

EXEC SP_CTPNHAP @SOPN = 3, @MASP = 'H1', @SLNHAP = 5, @GIANHAP = 5000
EXEC SP_CTPNHAP @SOPN = 4, @MASP = 'H3', @SLNHAP = 9, @GIANHAP = 9000
EXEC SP_CTPNHAP @SOPN = 5, @MASP = 'H2', @SLNHAP = 10, @GIANHAP = 8000
SELECT * FROM CTPNHAP
--3
GO
CREATE FUNCTION SOLUONG(
    @SOLUONG INT
)
RETURNS TABLE AS RETURN SELECT * FROM SANPHAM WHERE SOLUONG = @SOLUONG
GO

SELECT * FROM dbo.SOLUONG(4)
