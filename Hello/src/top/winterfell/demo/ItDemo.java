package top.winterfell.demo;

import java.util.ArrayList;
import java.util.Iterator;

public class ItDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        for ( Object ele : list ) {
            System.out.println(ele);
        }
        System.out.println("--------------");
        for(Iterator it = list.iterator(); it.hasNext();) { //牛逼
            System.out.println(it.next());
        }
    }
}
