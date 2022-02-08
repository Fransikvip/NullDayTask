package Tasks;

import java.util.Scanner;

public class Task1 {
    private static Scanner sc = new Scanner(System.in);
    private static int n = 0;

    public static void main(String[] args) {


    }
    public static void zero(int chislo){

        if(chislo == 0){
            System.out.println("Введите целое число");
        }else{
            System.out.println("Введите " + chislo + " значное целое число:");
        }

    }

        public static void one(){
            System.out.println("Введите целое четырехзначное число:");
            int n = 0;
            if (sc.hasNextInt()) {
                n = sc.nextInt();
            }
            int a, b, c, d;
            a = n / 1000;
            b = n / 100 % 10;
            c = n % 100 / 10;
            d = n % 1000 % 10;
            if ((a + b) == (c + d)) {
                System.out.println("true");
            } else
                System.out.println("false");
        }
    }

