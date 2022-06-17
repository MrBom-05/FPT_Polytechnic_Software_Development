package BAI3;

public class Data {
	public Boolean isemail(String str) {
		String pattern = "\\w+@\\w+(\\.\\w+){1,2}";
		return str.matches(pattern);
	}
	
	public Boolean issdt(String str) {
		String pattern = "0\\d{9}";
		return str.matches(pattern);
	}
	public Boolean iscmnd(String str) {
		String pattern = "\\d{12}";
		return str.matches(pattern);
	}
}
