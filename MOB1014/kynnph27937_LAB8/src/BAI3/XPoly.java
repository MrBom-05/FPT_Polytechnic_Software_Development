package BAI3;

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
	
	public static String toUpperFirstChar(String name) {
        String[] ars = name.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ars.length; i++) {
            String item = ars[i];
            if (!item.equals("")) {
                String ch = item.substring(0, 1).toUpperCase();
                item = ch + item.substring(1).toLowerCase();
                sb.append(item).append(" ");
            }
        }

        return sb.toString().trim();
    }
	
    public static void main(String[] args) {
        String ten = toUpperFirstChar("nguyen ngoc ky");
        System.out.println(ten);
    }
}
