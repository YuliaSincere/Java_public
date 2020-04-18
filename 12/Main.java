
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("enter size");
        int k = sc.nextInt();
double[] f = new double[k];
try { 
for (int x = 0; x < k + 1; x++) {
    f[x] = (double) x/(x-7);
System.out.println("x="+x+", f[x]=" + f[x]);
}
}
catch (ArithmeticException ae) {
System.out.println("ДЕЛИШЬ НА 0");
}
catch (ArrayIndexOutOfBoundsException ai) {
System.out.println("АУТ АВ БАУНД");
}
}
}
