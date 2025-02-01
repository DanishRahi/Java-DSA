public class Questinn {

    public static void findLargest(int mat[][]) {
        if (mat.length == 0 || mat[0].length == 0) {
            System.out.print("row 0 " + Integer.MIN_VALUE);
        } else {
            int rowidx = -1, colidx = -1, rowsum = Integer.MIN_VALUE, colsum = Integer.MIN_VALUE;
            
            for (int i = 0; i < mat.length; i++) {
                int rsum = 0;
                
                for (int j = 0; j < mat[0].length; j++) {
                    rsum = rsum + mat[i][j];
                }

                if (rowsum < rsum) {
                    rowsum = rsum;
                    rowidx = i;
                }
            }

            for (int i = 0; i < mat[0].length; i++) {
                int csum = 0;

                for (int j = 0; j < mat.length; j++) {
                    csum = csum + mat[j][i];
                }

                if (colsum < csum) {
                    colsum = csum;
                    colidx = i;
                }
            }

            if (rowsum >= colsum) {
                System.out.print("row " + rowidx + " " + rowsum);
            } else {
                System.out.print("column " + colidx + " " + colsum);
            }
        }
    }

    public static void print(int mat[][]) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        
    	int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
    	print(matrix);
        findLargest(matrix);
    }
}

