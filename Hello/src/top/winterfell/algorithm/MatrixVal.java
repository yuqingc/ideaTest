package top.winterfell.algorithm;


public class MatrixVal {
    /**
     * @param count the count of the running time of the cofactor method.
     */
    private static int count;
     /**
      * @return the cofactor the origin matrix at a certain row and line.
      */
    private static int[][] cofactor(int[][] originMatrix, int row, int column) {
        System.out.println("Calculating cofactor...");
        count++;
        int len = originMatrix.length;
        int res[][] = new int[len-1][len-1];
        for(int i = 0, iForRes = 0; i < len; i++) {
            if(i != row){
                for(int j = 0, jForRes = 0; j < len; j++) {
                    if(j != column) {
                        res[iForRes][jForRes++] = originMatrix[i][j];
                    }
                }
                iForRes++;
            }

        }
        return res;
    }

    /**
     * @return the value of the matrix
     * */
    private static int calcMatrix(int[][] matrix){
        if (matrix.length == 1) {
            return matrix[0][0];
        }
        int sum = 0;
        for(int i = 0; i < matrix.length; i++) {
            int subM[][] = cofactor(matrix, 0, i);
            sum += Math.pow(-1, i) * matrix[0][i] * calcMatrix(subM);
        }
        return sum;
    }

    public static void main(String[] args) {
        count = 0;
        int[][] test = {
                {2,1,4,1,5,9},
                {3,7,2,1,8,2,},
                {1,2,6,2,0,-8},
                {0,9,6,2,4,-1},
                {1,2,6,-11,0,-8},
                {-1,7,6,2,0,-8}
        };
        int[][] test2 = {{-5}};
        System.out.println(calcMatrix(test));
        System.out.println(count);
    }
}
