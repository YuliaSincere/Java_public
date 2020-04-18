
import java.util.Scanner;


public class Main {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine(); 
    String[] words = str.split("\\s"); //ограничитель - пробел
           for(String subStr:words) {
              System.out.println(subStr);  
           }  
        }
     }

