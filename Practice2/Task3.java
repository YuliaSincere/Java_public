import java.util.Scanner;
class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How much elements in massive will we have? ");
        int k = sc.nextInt();
        int res = 0;
        //mass creating
        int [] elem = new int[k];

        //enter to mass
        System.out.println("Enter elements ");
        for (int i = 0; i < elem.length; i++) {
            elem[i] = sc.nextInt();
        }

        //gcd finding

        for (int i = 0; i < k - 1; i++) {
                res = nod(elem[i], elem[i + 1]);
            }
        //result
        System.out.print("GCD = " + res);
    }

    //gcd function
    public static int nod(int a, int b) {
        while ((a != 0) && (b != 0)){
            if (a > b) {
                a = a % b;
            }
            else {
                b = b % a;
            }
        }
        return a + b;
    }


}