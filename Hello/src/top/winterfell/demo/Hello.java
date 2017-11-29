package top.winterfell.demo;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        String i = s.next();
//        System.out.println(i);
        String a = "hello";
        String b = "hell";
        String c = b + "o";
        System.out.println("a equals b");
        System.out.println(a == c);//比较字符串不能用等于号
        System.out.println(a.equals(c));
    }
}
