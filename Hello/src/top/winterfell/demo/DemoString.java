package top.winterfell.demo;

public class DemoString {
    private static String getHe () {
        return "he";
    }
    public static void main(String[] args) {
        String s = "hello";
        String s1 = "hello";
        String s2 = "he" + "llo";
        String s3 = "h" + "e" + "l" + "l" + "o";
        String s4 = new String("hello");
        String temp = "he";
        String s5 = temp + "llo";
        String s6 = getHe() + "llo";
        System.out.println(s == s1);
        System.out.println(s == s2);
        System.out.println(s == s3);
        System.out.println(s == s4);
        System.out.println(s == s5);
        System.out.println(s == s6);
    }
}
