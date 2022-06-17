package BaiThi;

public class Nguoi {
	private int ID;
	private String ten;
	private String sDT;
	
	
	
	
	public Nguoi(int iD, String ten, String sDT) {
		ID = iD;
		this.ten = ten;
		this.sDT = sDT;
	}
	public Nguoi() {
		
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getsDT() {
		return sDT;
	}
	public void setsDT(String sDT) {
		this.sDT = sDT;
	}
	
	public void inThongTin() {
		System.out.println("ID:   "+getID());
		System.out.println("Ten:  "+getTen());
		System.out.println("SDT:  "+getsDT());
	}
	
}
