package NhanVien;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class Date_Util {
     public static Date toDate(String s) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat();
        sdf.applyPattern("dd/mm/yyy");
        Date d = null;
        try {
            d = sdf.parse(s);
        } 
        catch (ParseException e) {
            e.printStackTrace();
            throw e;
        }
        
        return d;
    }

    public static String toString(Date d) {
        SimpleDateFormat sdf = new SimpleDateFormat();
        sdf.applyPattern("dd/mm/yyyy");
        return sdf.format(d);
    }
}
