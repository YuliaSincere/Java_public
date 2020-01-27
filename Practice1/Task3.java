import java.util.Scanner;
class Task3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number ");
        int a = sc.nextInt();
        System.out.print("Enter second number ");
        int b = sc.nextInt();
        int n=0;
        //searching for greatest common divisor
         if (a > b){
                    if (a % b == 0){
                        n = a;
                    }
                    else {
                        n = a * b;
                    }
                }
                else {
                    if (b % a == 0){
                        n = b;
                    }
                    else {
                        n = a * b;
                    }
                }
        //searching for lowest common multiply
        int k = (a * b) / n;
        System.out.println("nod = "+n);
       System.out.print("nok= "+k);
    }
}