package Tasks;

public class task10{

        public static void main(String[] args) {

            int n = 4;
            System.out.println("Длина массива = " + n);

            int[][] arr = fillMatrix(n);
            outputArr(arr);

        }


        public static void outputArr(int[][] arr) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }


        public static int[][] fillMatrix(int n) {
            int[][] arr = new int[n][n];
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    if (i % 2 == 0) {
                        arr[i][j] = j + 1;
                    } else {
                        arr[i][j] = n - j;
                    }
                }
            }
            return arr;
        }
    }