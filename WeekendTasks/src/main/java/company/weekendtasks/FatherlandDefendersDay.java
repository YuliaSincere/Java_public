package company.weekendtasks;
import java.io.*;
import java.util.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Andrey
 */


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
class Gamer {
    private final String name;
    private boolean alive;
    public Gamer(String gamerName){
        name = gamerName;
        alive = true;
    }
    public String getName(){
        return name;
    }
    public void toDie(){
        alive = false;
    }
    public boolean isAlive(){
        return alive;
    }
}
public class FatherlandDefendersDay {
    public static void russianRoulette(ArrayList<Gamer> gamers) throws IOException {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int bullet = r.nextInt(6);
        int push = r.nextInt(6);
        int n = gamers.size();
        ValentinsDay.loadFile("/home/yulia/Desktop/WeekendTasks/pukyou.txt");
        while (n > 1) {
            for (Gamer g : gamers) {
                if (n == 1) {
                    break;
                } else {
                    if (g.isAlive()) {
                        System.out.println("Hey, " + g.getName() + "! Roll and push(1) or just push(any number, except 1)?");
                        if (sc.nextInt() == 1) push = r.nextInt();
                        else push = (push + 1) % 6;
                        if (push == bullet) {
                            g.toDie();
                                String message = g.getName() + ", you,re dead! Good night";
                                System.out.println(message);

                                ValentinsDay.toSaveCongratulation("/home/yulia/Desktop/WeekendTasks/" + "To" + g.getName() +  ".txt", g.getName(),message);

                                n -= 1;
                                bullet = r.nextInt(6);
                            }
                        }
                    }
                }
            }
            for (Gamer g : gamers) if (g.isAlive()) System.out.println(g.getName() + " - WINNER!!!");
        }
}
