public class Task {
    public static void main(String[] args) {
       int[][] matrix = {{3, 5, 2}, {4, 1, 7}, {6, 9, 8}};
        System.out.println(sum(matrix));
    }

    public static int sum(int[][] mtrx) {
        int x = 0;
        for(int i=0; i< mtrx.length; i++){
            for(int j=0; j<mtrx[0].length; j++){
                if(i==j){
                    x+=mtrx[i][j];
                }
            }
        }
        return x;
    }
}