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

    public static void main(String[] args) throws IOException {
        String line;
        ArrayList<ArrayList<String>> keeping = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("/home/yulia/Documents/GitHub/Java_public/PracticeDummy/head.txt"))) {

            ArrayList<String> picture = new ArrayList<>();
            boolean prevLineIsEmpty = true;
            while ((line = br.readLine()) != null) {
                picture.add(line);
            }
        }

        for(int i = 0; i < a.size(); i++){
            System.out.println(a.get(i));
        }
    }
}