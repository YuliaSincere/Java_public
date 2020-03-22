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
        /* ValentinsDay.loadFile("C:\\Users\\Andrey\\Documents\\NetBeansProjects\\WeekendTasks\\src\\main\\java\\company\\weekendtasks\\ascii_arts.txt");
        System.out.println("Enter name of your bf/gf");
        String name = sc.nextLine();
        String congratulation = "Happy Valentine's Day";
        String filename = "C:\\Users\\Andrey\\Desktop\\" + "To" + name + ".txt";
        ValentinsDay.toSaveCongratulation(filename, name, congratulation); */
        ArrayList<Gamer> gamers = new ArrayList<Gamer>();
        String[] names = {"Vladimir", "Andrey", "Sergey", "Pavel"};
        for (String name: names){
            gamers.add(new Gamer(name));
        }
        FatherlandDefendersDay.russianRoulette(gamers);
    }
    
    
}
