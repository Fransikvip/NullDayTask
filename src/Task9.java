package Tasks;

import java.util.Arrays;

import java.util.Random;


public class Task9 {

    public static void main(String[] args) {

        int sizeFirst = 11;
        int[] arr = new int[sizeFirst];


        Random ran = new Random();
        for (int i = 0; i < sizeFirst; i++) {
            arr[i] = ran.nextInt(40);
        }
        System.out.println("Первый массив: " + Arrays.toString(arr));
        int sizeSecond = 14;
        int[] secondArr = new int[sizeSecond];



        for (int i = 0; i < sizeSecond; i++) {
            secondArr[i] = ran.nextInt(40);
        }
        System.out.println("Второй массив: " + Arrays.toString(secondArr));

        int k = 5;

        int[] sumArr;
        sumArr = new int[sizeFirst + sizeSecond];


        int counter = 0;
        for (int i = 0; i < sizeFirst; i++, counter++) {
            sumArr[counter] = arr[i];
            if (i == k) {
                counter++;
                for (int j = 0; j < sizeSecond; j++, counter++) {
                    sumArr[counter] = secondArr[j];
                }
                counter--;
            }
        }
        System.out.println("Результат объединения массивов: " + Arrays.toString(sumArr));

    }
}