package top.winterfell.algorithm;

public class MtSort {
    private static boolean swap (int[] arr, int i, int j) {
        int temp;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return true;
    }

    private static void sortArr (int[] originArr) {
        int arrSize = originArr.length;
        for (int i = 0; i < arrSize; i++) {
            for(int j = 0; j < i; j++) {
                if (originArr[i] < originArr[j]) {
                    swap(originArr, i, j);
                }
            }
        }
    }

    private static void bubble(int[] originArr) {
        int arrSize = originArr.length;
        for (int i = 1; i < arrSize; i++) {
            for (int j = 0; j < arrSize - i; j++) {
                if (originArr[j] > originArr[j+1]){
                    swap(originArr, j, j+1);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] testArr;
        testArr = new int[]{6,2,8,5,1,6,7,5,1,2,3,4,7,8,2,4,5,2,3,7,8,4,1,2,5,9,3};
        for (int ele: testArr) {
            System.out.println(ele);
        }
        System.out.println("----------------");
        bubble(testArr);
        for (int ele: testArr) {
            System.out.println(ele);
        }
    }
}
