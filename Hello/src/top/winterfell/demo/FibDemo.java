package top.winterfell.demo;
import java.math.BigInteger;

public class FibDemo {

    //该斐波那契数列的复杂度为指数复杂度
    private static long fib (int n) throws RuntimeException {
        if(n < 1) throw new RuntimeException("Invalid number n");
        if(n == 1) return 0;
        if(n == 2) return 1;
        return fib (n - 1) + fib(n - 2);
    }

    //该斐波那契数列的复杂度为n
    private static BigInteger fib2 (int n) throws RuntimeException {
        if(n < 1) throw new RuntimeException("invalid number n");
        BigInteger a = new BigInteger("0");
        BigInteger b = new BigInteger("1");
        for(int index = 1; index < (n + 1) / 2; index++) {
            a = a.add(b);
            b = b.add(a);
        }
        if(n % 2 != 0) return a;
        return b;
    }

    private static BigInteger fib3 (int n) throws RuntimeException {
        if(n < 1) throw new RuntimeException("Invalid number n");
        BigInteger a = new BigInteger("0");
        BigInteger b = new BigInteger("1");
        if(n == 1) return a;
        if(n == 2) return b;
        BigInteger c = new BigInteger("1");
        for (int index = 2; index < n; index++) {
            c = a.add(b);
            a = b;
            b = c;
        }
        return c;
    }

    public static void main(String[] args) {
        int n;
        n = 40;
        long startTime = System.currentTimeMillis();
        for(int index = 1; index < n+1; index++) {
            System.out.println("Number " + index + " is " + fib2(index));
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime + " millis was cost.");
    }
}
