package top.winterfell.demo;

import java.util.Vector;

public class ColDemo {
    public static void main(String[] args) {
        Vector v = new Vector();
        v.add(1);
        v.add(Integer.valueOf(3));
        System.out.println(v.elementAt(0));
        System.out.println(v.elementAt(1));
    }
}
