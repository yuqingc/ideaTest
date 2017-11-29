package top.winterfell.demo;

public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
        } catch (ArithmeticException | NullPointerException e) {
            System.out.println(e.toString());
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public static void hello () throws Exception {
        throw new Exception();
    }
}
