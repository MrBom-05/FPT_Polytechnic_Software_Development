package kynnph27937_Java1_ThiThu;

public class MayTinh {
	private String title;
	private String hang;
	private double canNang;
	
	
	public MayTinh() {
		
	}
	
	
	
	public MayTinh(String title, String hang, double canNang) {
		this.title = title;
		this.hang = hang;
		this.canNang = canNang;
	}


	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getHang() {
		return hang;
	}
	public void setHang(String hang) {
		this.hang = hang;
	}
	public double getCanNang() {
		return canNang;
	}
	public void setCanNang(double canNang) {
		this.canNang = canNang;
	}
	
	public void inThongTin() {
		System.out.println("Title:    "+getTitle());
		System.out.println("Hang:     "+getHang());
		System.out.println("Can nang: "+getCanNang());
	}
	
}
