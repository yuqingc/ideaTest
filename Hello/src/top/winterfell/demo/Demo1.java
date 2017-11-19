package top.winterfell.demo;

import java.util.Arrays;

public class Demo1 {
    protected void finalize () throws Throwable {
        super.finalize();
        System.out.println("laji huishou");
    }
    public static void main(String[] args) {
        //显示当前毫秒时间戳
        long time = System.currentTimeMillis();
        System.out.println(time);
        int[] arr1 = {1 ,2, 3, 4, 5, 6};
        int[] arr2 = new int[10];
        //复制数组
        System.arraycopy(arr1, 2, arr2, 1, 3);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        //退出程序 0 代表正常退出
        //System.exit(0);
        new Demo1();
        new Demo1();
        //强制垃圾回收 会调用 finalize 方法
        System.gc();
        System.exit(0);
    }
}
