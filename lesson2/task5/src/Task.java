public class Task {
    public static void main(String[] args) {
        int[][] matrix = new int[5][7];
        System.out.println(maxValue(matrix));


    }

    public static int maxValue(int[][] matrix) {
        int x = 0;
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                if (anInt > x) {
                    x = anInt;
                }
            }
        }
        return x;
    }
}