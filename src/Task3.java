package Tasks;

import java.util.Scanner;
public class Task3
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        result(a,b);

    }
    public static void result(int a,int b){
        System.out.println("Square "+ (a+b)*2);
        System.out.println("Per "+(Math.sqrt(Math.pow(a,2)+Math.pow(b,2))+a+b));
    }
}