package Tasks;

public class Task8 {
    public static void main(String[] args) {
        int[] a = {1, 3, 25, 2222, 5};
        int k = 5;
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % k == 0) {
                sum += a[i];
            }
        }
        System.out.println("Сумма элементов массива, кратных " + k + ", равна " + sum);
    }
}