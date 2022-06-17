package BaiThi;

public class DongVat {
	private int ID;
	private String maDV;
	private String chungLoai;
	
	
	public DongVat() {
		
	}


	public DongVat(int iD, String maDV, String chungLoai) {
		ID = iD;
		this.maDV = maDV;
		this.chungLoai = chungLoai;
	}


	public int getID() {
		return ID;
	}


	public void setID(int iD) {
		ID = iD;
	}


	public String getMaDV() {
		return maDV;
	}


	public void setMaDV(String maDV) {
		this.maDV = maDV;
	}


	public String getChungLoai() {
		return chungLoai;
	}


	public void setChungLoai(String chungLoai) {
		this.chungLoai = chungLoai;
	}
	
	public void inThongTin() {
		System.out.println("ID:          "+getID());
		System.out.println("Ma Dong Vat: "+getMaDV());
		System.out.println("Chung Loai:  "+getChungLoai());
	}
	
	
}
