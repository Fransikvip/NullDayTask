package Tasks;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        int sum=0;

        if (((a>b) && (b>c)) || ((c>b) &&(b>a)))
         sum=a+c;
    else
        if (((a>c) && (c>b)) || ((b>c) && (c>a)))
         sum =a+b;
    else
        if (((b>a) && (a>c)) || ((c>a) && (a>b)))
         sum=b+c;
        System.out.println(sum);
    }

}
