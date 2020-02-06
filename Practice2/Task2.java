//вариант2
import java.util.Scanner;
class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int a = sc.nextInt();
        String s = new String();

        while (a != 0) {
            int b = a % 4;
            s = b + s;
            a /= 4;
        }
        System.out.println(s);
    }
}
