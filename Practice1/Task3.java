import java.util.Scanner;
class Task3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number ");
        int a = sc.nextInt();
        System.out.print("Enter second number ");
        int b = sc.nextInt();
        int n=0;
        int h = a * b;
        //searching for greatest common divisor
        while ((a != 0) && (b != 0)){
            if (a > b) {
                a = a % b;
            }
            else {
                b = b % a;
            }
        }
        n = a + b;
        //searching for lowest common multiply
        int k  = h/n;
        System.out.println("nod = "+n);
        System.out.print("nok = "+k);
    }
}