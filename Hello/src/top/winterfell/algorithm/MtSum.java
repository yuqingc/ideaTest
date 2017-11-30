package top.winterfell.algorithm;

/**
 * 三种求和算法
 *
 *  */
public class MtSum {

    private static int sum (int[] arr) {
        int sum = 0;
        for(int ele : arr) {
            sum += ele;
        }
        return sum;
    }

    //减小规模递归策略
    private static int jianSum (int[] arr, int n) {
        return n > 1 ? jianSum(arr, n - 1) + arr[n-1] : arr[0];//定义递归基
    }

    //分治策略
    private static int fenSum (int[] arr, int lo, int hi) {
        if (lo == hi) return arr[lo];//定义递归基
        int mi = (lo + hi) >> 1;
        return fenSum(arr, lo, mi) + fenSum(arr, mi + 1, hi);
    }

    public static void main(String[] args) {
        int[] arr = new int[100];
        for (int i = 0; i < 100; i++) {
            arr[i] = i + 1;
        }
        System.out.println(sum(arr));
        System.out.println(jianSum(arr, arr.length));
        System.out.println(fenSum(arr, 0, arr.length - 1));
    }
}
