//2вариант
import java.util.Scanner;
class Taskmini {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a count of elements ");
        int a = sc.nextInt();
        int[] elem = new int[a];
        System.out.println("Enter elements ");
        for (int i = 0; i < a; i++) {
            elem[i] = sc.nextInt();
        }

            for (int i = 1 ; i < elem.length ; i++) {
                int puk = elem[i];
                int j = i - 1;
                while ((j >= 0) && (elem[j] > puk)) {
                    elem[j + 1]= elem[j];
                    j = j - 1;
                }
                elem[j + 1]= puk;
            }




                //output
                for (int i = 0; i < a; i++) {
                    System.out.print(elem[i]);
                }
            }
        }


