package GenralPracties;

public class DiagonalSum {

    public static int diagonalSum(int matrix[][]){
        int sum=0;

        for(int i=0;i<matrix.length;i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i == j) {
                    sum += matrix[i][j];
                } else if (i + j == matrix.length - 1) {
                    sum += matrix[i][j];
                }
            }
        }
        return  sum;
    }


    public static void main(String[] args) {

        int arr[][]={{1,2,3},
                     {23,3,3,},
                     {2,3,3}};
        System.out.println(diagonalSum(arr));
    }
}
