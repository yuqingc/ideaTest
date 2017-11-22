package top.winterfell.demo;

public class StringMethodDemo {
    public static void main(String[] args) {
        String str = " ";
        //判断字符串是否为空或者空格
        boolean isEmpty = str != null && "".equals(str.trim());
        System.out.println(isEmpty);
    }
}
