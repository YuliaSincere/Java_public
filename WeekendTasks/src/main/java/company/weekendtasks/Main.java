package company.weekendtasks;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andrey
 */
import company.weekendtasks.*;
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        Scanner sc = new Scanner(System.in);

        ArrayList<Gamer> gamers = new ArrayList<Gamer>();
        String[] names = {"Vladimir", "Andrey", "Sergey", "Pavel"};
        for (String name: names){
            gamers.add(new Gamer(name));
        }
        FatherlandDefendersDay.russianRoulette(gamers);
    }
    
    
}
