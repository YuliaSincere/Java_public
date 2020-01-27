import java.util.Scanner;
class Task4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number ");
        int a = sc.nextInt();
        System.out.print("Enter second number ");
        int b = sc.nextInt();
       /* System.out.print("Enter third number ");
        int c = sc.nextInt();*/
        int n=0;
        //searching for lowest commmon denomiator
        if (a > b) {
            if ((a % b) == 0) {
                n = b;
            }
            else {
                a = a % b;
            }
        }
        else {
            if ((b % a) == 0) {
                n = a;
            }
            else {
                b = b % a;
            }
        }
        //part with third number (lcd)
        /*if ( (a+b) > c) {
            if (((a+b) % c) == 0) {
                n = c;
            }
            else {
                n = (a+b) % c;
            }
        }
        else {
            if ((c % (a+b)) == 0) {
                n = (a+b);
            }
            else {
                c = c % n;
            }
        }*/
        //searching for lowest common multiply
        n = a + b;
        /*int k = (a * b) / n;*/
        System.out.println("nod = "+n);
        /*System.out.print("nok= "+k);*/
    }
}