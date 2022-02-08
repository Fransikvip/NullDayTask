package Tasks;

public class Task4 {
    public static void main(String[] args) {
        double x = -4;
        double y = -3;

        boolean set1 = (x >= -2 && x <= 2) && (y >= 0 && x <= 4);
        boolean set2 = (x >= -4 && x <= 4) && (y >= -3 && y <= 0);

        System.out.println(set1 || set2);
    }
}