package Tasks;

public class task10{
    public static void main(String[] args) {
        int n = 4;
        int[][] array = new int[n][n];
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                if (i % 2 == 0) {
                    array[i][j] = j + 1;
                } else {
                    array[i][j] = n - j;
                }
            }
        }
        System.out.println(array);
    }

}