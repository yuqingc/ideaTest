package top.winterfell.algorithm;


public class MatrixVal {
    /**
     * 计算复杂度
     */
    private static int count;
     /**
      * 计算余子式
      */
    private static int[][] subMatrix(int[][] originMatrix, int x, int y) {
        System.out.println("Calculating subMatrix...");
        count++;
        int len = originMatrix.length;
        int res[][] = new int[len-1][len-1];
        for(int i = 0, iForRes = 0; i < len; i++) {
            if(i != x){
                for(int j = 0, jForRes = 0; j < len; j++) {
                    if(j != y) {
                        res[iForRes][jForRes++] = originMatrix[i][j];
                    }
                }
                iForRes++;
            }

        }
        return res;
    }

    private static int calcMatrix(int[][] matrix){
        if (matrix.length == 1) {
            return matrix[0][0];
        }
        int sum = 0;
        for(int i = 0; i < matrix.length; i++) {
            int subM[][] = subMatrix(matrix, 0, i);
            sum += Math.pow(-1, i) * matrix[0][i] * calcMatrix(subM);
        }
        return sum;
    }

    public static void main(String[] args) {
        count = 0;
        int[][] test = {
                {2,1,4,1,5,9,7},
                {3,7,2,1,8,2,-5},
                {1,2,6,2,0,-8,0},
                {0,9,6,2,4,-1,3},
                {1,2,6,-11,0,-8,0},
                {-1,7,6,2,0,-8,0},
                {6,2,1,2,0,-8,0}
        };
        int[][] test2 = {{-5}};
        System.out.println(calcMatrix(test));
        System.out.println(count);
    }
}
