package main.java.com.superpuper;

import java.io.*;
import java.util.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String args[]) throws IOException
    {
        ArrayList<What> trash = new ArrayList<What>();
        String whoName;
        int cash;

        Scanner sc = new Scanner(System.in);
        System.out.println("Who are you?");
        whoName = sc.nextLine();
        System.out.println("What about your cash?");
        cash = sc.nextInt();
        Who whoIsHe = new Who(whoName, cash);
        System.out.println("Will we give it normally or not? If will enter 1, if not enter smth else");
        reply = sc.nextInt();

        int puk = whoIsHe.getWhoCash();
        int urovenLoha = 0;

        if (reply == 1) {
            trash.add(new What("Super Cat",100) );
            trash.add(new What("Pretty Cat",200) );
            trash.add(new What("Clever Cat",300) );
            trash.add(new What("Playful Cat",400) );
            trash.add(new What("Decent Cat",500) );

            for(int i = 0 ; i < trash.size() ; i++) {
                while (urovenLoha <= puk) {
                    urovenLoha = urovenLoha + What[i].getPrice();
                    System.out.println(urovenLoha);
                }
            }
        }
        else {
            trash.add(new What("Haughty Cat",10) );
            trash.add(new What("Agressive Cat",20) );
            trash.add(new What("Dangerous Cat",30) );
            trash.add(new What("Ferocious Cat",40) );
            trash.add(new What("Impudent Cat",50) );

            for(int i = 0 ; i < trash.size() ; i++) {
                while (urovenLoha <= puk) {
                    urovenLoha = urovenLoha + What[i].getPrice();
                    System.out.println(urovenLoha);
                }
            }
        }
    }
}

