package top.winterfell.demo;
import java.math.BigInteger;

public class FibDemo {
    //该斐波那契数列的复杂度为指数复杂度
    private static long fib (int n) throws RuntimeException{
        if(n < 1) throw new RuntimeException("Invalid number");
        if(n == 1) return 0;
        if(n == 2) return 1;
        return fib (n - 1) + fib(n - 2);
    }
    //该斐波那契数列的复杂度为n
    private static BigInteger fib2 (int n) {
        BigInteger a = new BigInteger("0");
        BigInteger b = new BigInteger("1");
        for(int index = 1; index < (n + 1) / 2; index++) {
            a = a.add(b);
            b = b.add(a);
        }
        if(n % 2 != 0) return a;
        return b;
    }
    public static void main(String[] args) {
        int n;
        n = 30;
        for(int index = 1; index < n+1; index++) {
            System.out.println("Number " + index + " is " + fib(index));
        }
    }
}
