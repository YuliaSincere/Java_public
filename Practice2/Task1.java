//вариант2
import java.util.Scanner;
class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a count of elements ");
        int a = sc.nextInt();
        int [] elem = new int[a];

        System.out.println("Enter elements ");
        for (int i = 0; i < a; i++) {
            elem[i] = sc.nextInt();
        }
        double result = 0;
        for (int i = 0; i < a; i++) {
            result = result + elem[i];
        }
        System.out.println("Average = " + result/a);
    }
}
