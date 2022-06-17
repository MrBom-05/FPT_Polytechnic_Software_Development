package BAI1;

public class XPoly {
	public static double sum(double... nums) {
        double tong = 0;
        for (double item : nums) {
            tong += item;
        }
        return tong;
    }
	
    public static void main(String[] args) {
        double sum = sum(5, 6, 3, 6.7);
        System.out.println("Ket qua: " + sum);
    }
}
