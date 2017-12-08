package top.winterfell.algorithm;

import java.util.Arrays;

public class MtMergeSort {

    private static int[] merge ( int[] arr, int lo, int hi, int mi) {
        if(arr.length < 2) return arr;
        int ll = mi - lo;
        int lr = hi - mi;
        int[] leftarr = new int[ll];
        for(int ci = lo; ci < mi; leftarr[ci - lo] = arr[ci++]);
        for(int i = lo, li = 0, ri = 0; (li < ll) || (ri < lr);) {
            if( (li < ll) && ( lr <= ri || leftarr[li] <= arr[ri + mi])) arr[i++] = leftarr[li++];
            if( (ri < lr) && ( ll <= li || arr[ri + mi] < leftarr[li])) arr[i++] = arr[ri++ + mi];
        }
        return arr;
    }

    private static int[] sort (int[] arr, int lo, int hi) {
        if(hi - lo < 2) return arr;
        int mi = (lo + hi) >> 1;
        sort(arr, lo, mi);
        sort(arr, mi, hi);
        merge(arr, lo, hi, mi);
        return arr;
    }

    public static void main(String[] args) {
       //重写！！！！！！！！！！
        int[] a = {6,2,7,9,5,8,21,16,0,4,3,8,4,2,15,3,4,0,41,32,10,26,0,11,8};
        int len = a.length;
        System.out.println(Arrays.toString(sort(a,0, len)));
    }
}
