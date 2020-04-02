package main.java.com.supersuper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;

public class Main {
    public static void main(String args[]) throws IOException
    {
        ArrayList<What> trash = new ArrayList <What>();
        String whoName;
        int cash;
        double kolvo = 0;

        File file = new File("/home/yulia/Documents/GitHub/Java_public/Gifts8March/puk.txt");
        file.createNewFile();

        Scanner sc = new Scanner(System.in);
        System.out.println("Who are you?");
        whoName = sc.nextLine();
        System.out.println("What about your cash?");
        cash = sc.nextInt();
        try (FileWriter writer = new FileWriter (file)) {

        Who whoIsHe = new Who(whoName, cash);
        System.out.println("Will we give it normally or not? If will enter 1, if not enter smth else");
        int reply = sc.nextInt();

        int puk = whoIsHe.getWhoCash();
        int urovenLoha = 0;

            writer.write("hi. there are the items you can buy. we choose the quantity not the quality");
            writer.write("\n");
            writer.write("\n");
            writer.write("\n");

        if (reply == 1) {
            trash.add(new What("Super Cat",100) );
            writer.write("Super Cat,100");
            writer.write("\n");
            trash.add(new What("Pretty Cat",200) );
            writer.write("Pretty Cat,200");
            writer.write("\n");
            trash.add(new What("Clever Cat",300) );
            writer.write("Clever Cat,300");
            writer.write("\n");
            trash.add(new What("Playful Cat",400) );
            writer.write("Playful Cat,400");
            writer.write("\n");
            trash.add(new What("Decent Cat",500) );
            writer.write("Decent Cat,500");
            writer.write("\n");
            writer.write("\n");
            writer.write("\n");
            writer.write("and we will create groceryList for you");
            writer.write("\n");
            writer.write("\n");
            writer.write("\n");
            writer.write("\n");
            writer.write("Grocery list for " + whoName);
            writer.write("\n");

            for ( int i = 0 ; kolvo < puk ; i++) {
                System.out.println(trash.get(i).getPrice());
                String lol = trash.get(i).getDesignation();
                writer.write("\n");
                writer.write(lol);
                writer.write("\n");
                kolvo = kolvo + 100;
            }
        }
        else {
            trash.add(new What("Haughty Cat",10) );
            writer.write("Haughty Cat,10");
            writer.write("\n");
            trash.add(new What("Agressive Cat",20) );
            writer.write("Agressive Cat,20");
            writer.write("\n");
            trash.add(new What("Dangerous Cat",30) );
            writer.write("Dangerous Cat,30");
            writer.write("\n");
            trash.add(new What("Ferocious Cat",40) );
            writer.write("Ferocious Cat,40");
            writer.write("\n");
            trash.add(new What("Impudent Cat",50) );
            writer.write("Impudent Cat,50");
            writer.write("\n");
            writer.write("\n");
            writer.write("\n");
            writer.write("and we will create groceryList for you");
            writer.write("\n");
            writer.write("\n");
            writer.write("\n");
            writer.write("\n");
            writer.write("Grocery list for " + whoName);
            writer.write("\n");

            for ( int i = 0 ; kolvo < (puk - puk*0.7); i++) {
                System.out.println(trash.get(i).getPrice());
                String lol = trash.get(i).getDesignation();
                writer.write("\n");
                writer.write(lol);
                writer.write("\n");
                kolvo = kolvo + 30;
            }
        }
    }
}
}

