import java.util.Scanner;
class Task2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a ");
        int a = sc.nextInt();
        System.out.print("Enter b ");
        int b = sc.nextInt();
        System.out.print("Enter c ");
        int c = sc.nextInt();
        int d = (b*b)-(4*a*c);
        int count = (d<0)?0 : ((d==0)?1 : 2);
        System.out.print("There are "+count+" roots");
    }
}