package top.winterfell.demo;

public class MutableStringDemo {
    public static void main(String[] args) {
        String s1 = new String();
        //默认容量为16 并且可以自动扩容
        StringBuilder s2 = new StringBuilder("hello");
        s2.append(new StringBuilder("world"));
        System.out.println(s1.length());
        System.out.println(s2);

    }
}
