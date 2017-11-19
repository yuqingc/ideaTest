package top.winterfell.demo;

import java.math.BigDecimal;

public class DemoMath {
    public static void main(String[] args) {
        System.out.println(Math.max(5, 8));
        //传入字符串 这样更加精确 传入double就不准确
        BigDecimal mum1 = new BigDecimal("0.1");
        BigDecimal mum2 = new BigDecimal("0.9");
        System.out.println(mum1.add(mum2));
        System.out.println(Long.MIN_VALUE);
    }
}
