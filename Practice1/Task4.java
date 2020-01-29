import java.util.Scanner;
class Task4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number ");
        int a = sc.nextInt();
        System.out.print("Enter second number ");
        int b = sc.nextInt();
        System.out.print("Enter third number ");
        int c = sc.nextInt();
        int n=0;
        int h1 = a * b;
        int h2 = a * c;
        int h3 = c * b;
        int h4 = a * b * c;
        int aa = a;
        int bb = b;
        int cc = c;
        //searching for greatest common divisor   part 1
        while ((a != 0) && (b != 0)){
            if (a > b) {
                a = a % b;
            }
            else {
                b = b % a;
            }
        }
        n = a + b;
        //searching for greatest common divisor  part 2
        while ((n != 0) && (c != 0)){
            if (n > c) {
                n = n % c;
            }
            else {
                c = c % n;
            }
        }
        int t = n + c;
        int k = 0;
        //searching for lowest common multiply
        if ((h1 % t) % cc == 0) {
            k = h1 / t;
        }
        else if ((h2 % t) % bb == 0) {
            k = h2 / t;
        }
        else if ((h3 % t) % aa == 0) {
            k = h3 / t;
        }
        else {
            k = h4 / t;
        }
        System.out.println("nod = "+t);
       System.out.print("nok= "+k);
    }
}