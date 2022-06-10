package BAI2;

public class XPoly {
	public static double sum(double... nums) {
        double tong = 0;
        for (double item : nums) {
            tong += item;
        }
        return tong;
    }
	public static double min(double... mums) {
		double min = mums[0];
		for(double item : mums) {
			min = Math.min(min, item);
		}
		return min;
	}
	
	public static double max(double... mums) {
		double max = mums[0];
		for(double item : mums) {
			max = Math.max(max, item);
		}
		return max;
	}

    public static void main(String[] args) {
        double min; 
        double max;
        min = min(5, 6, 3, 6.7);
        max = max(5, 6, 3, 6.7);
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }
}
