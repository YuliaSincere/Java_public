
import java.util.Scanner;
class Task1 {

        public static double pi() {
            double n = 1;
            double nn = 1;
            double pi = 0;
            double pi1 = 0;
            double pi2 = 0;
            for (int i = 1; i < 10000; i += 1) {
                if (i % 2 == 0) {
                    pi1 -= (1 / Math.pow(2,n) * (1/n));
                    pi2 -= (1 / Math.pow(3,nn) * (1/nn));
                } else {
                    pi1 += (1 / Math.pow(2,n) * (1/n));
                    pi2 += (1 / Math.pow(3,nn) * (1/nn));
                }
                n = n+2;
                nn += 2;
            }
            pi = (pi1 + pi2) * 4;
            System.out.println(pi1);
            System.out.println(pi2);
            return pi;
        }

        public static double e(int n) {
            double fac = 1;
            double esh = 1; //переменная для суммы - для возвращения
            for (int j = 1; j < n ; j++) {
                fac = fac * j;
                double eshka = 1 / fac; //слагаемое
                esh = esh + eshka; //сумма слагаемых
            }
            return esh;
        }

        public static double ln() {

           // double result = 0;
            double des = 0;

            for (double i = 1; i < 10000; i++) {
                if (i % 2 == 0) {
                    des -= 1 / i;
                }
                else{
                    des += 1 / i;
                }
               // result = result + des;
            }
            return des;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("\nPi: " + pi());
            System.out.print("\ne: " + e(1000));
            System.out.print("\nln: " + ln());
        }
}