
package Collection_Map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//<<Interface>> Collection
//Set <= HashSet Là collection :
//Mỗi giá trị chỉ xuất hiện 1 lần
//Không truy xuất theo chỉ số
//List <= ArrayList Là collection:
//Mỗi giá trị được xuất hiện nhiều lần
//Truy xuất các phần tử theo chỉ số


public class Demo_Collection {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        
        set.add(3);
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        
//        System.out.println("List: " + list);
//        System.out.println("Set: " + set);
//        System.out.println("--------------------------------");
//        
//        list.addAll(set);
//        System.out.println("List: " + list);
        
//        Collections.shuffle(list);
//        System.out.println("List: " + list);

        
        Comparator<Integer> c = new Comparator<Integer>() {
            @Override
            public int compare(Integer o, Integer o2) {
                return o.compareTo(o2);
            }
        };
        Collections.sort(list, c);
        System.out.println("List sortsed: " + list);
        Collections.reverse(list);
        System.out.println("List sortsed: " + list);
    }
}
