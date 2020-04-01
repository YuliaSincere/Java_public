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

    public static void main(String[] args)throws IOException {
        String line;
        ArrayList<ArrayList<String>> keeping = new ArrayList<>();
        // кусок кода, чтобы считать голову из файла
        try (BufferedReader br = new BufferedReader(new FileReader("/home/yulia/Documents/GitHub/Java_public/PracticeDummy/head.txt"))) {

            ArrayList<String> picture = new ArrayList<>();
            boolean prevLineIsEmpty = true;
            while ((line = br.readLine()) != null) {

                if (line.trim().isEmpty()) {
                    // текущая строка пустая

                    if (prevLineIsEmpty) {
                        // предыдущая строка тоже пуста => идем дальше
                        continue;
                    }

                    // предыдущая строка не пустая => картинка кончилась => картинку сохраняем
                    prevLineIsEmpty = true;
                    keeping.add(picture);
                    picture = null;
                    continue;
                }

                // текущая строка не пустая, предыдущая пустая => началась новая картинка
                if (prevLineIsEmpty) {
                    picture = new ArrayList<>();
                    picture.add(line);
                    prevLineIsEmpty = false;
                    continue;
                }

                // продолжаем сохранять картинку
                picture.add(line);
            }

            // на всякий случай проверяем, есть ли у нас картинка, которую мы не сохранили,
            // потому что файл может кончаться не пустой строкой
            if ((picture != null) && (picture.size() > 0)) {
                keeping.add(picture);
            }
            System.out.printf("%s\n", keeping.size());
        }

        // генерируем рандомное число
        int min = 0;
        Random r = new Random();
        int max = keeping.size();
        System.out.print(r.nextInt(max));
        ArrayList<String> a = new ArrayList<>();
        a =  keeping.get(r.nextInt(max));
        // Построчно выводим голову
        for(int i = 0; i < a.size(); i++){
            System.out.println(a.get(i));
        }
        // генерируем тело с руками и ноги
        String[] beauty = {"#    #########    #", "%    $$$$$$$$$$   %" , "$   &&&&&&&&&&&   $" , "@    @@@@@@@@@    @" , "%   ***********   %"};
        for (int i = 0 ; i < 7 ; i++) {
            Random ran = new Random();
            int randomNumber = ran.nextInt(beauty.length);
            System.out.println(beauty[randomNumber]);
        }

        String[] nogi = {"      ##   ##     " , "      00   00     " , "      66   66     " , "      77   77     " , "      @@   @@     "};
        for (int j = 0 ; j < 5 ; j++) {
            Random ran2 = new Random();
            int randomNumber2 = ran2.nextInt(nogi.length);
            System.out.println(nogi[randomNumber2]);
        }
        
        // Осуществляем запись в файл
        File file = new File("/home/yulia/Documents/GitHub/Java_public/PracticeDummy/full.txt");
        file.createNewFile();
        try (FileWriter writer = new FileWriter (file)) {
            for(int i = 0; i < a.size(); i++){
                writer.write( a.get(i));
                writer.write("\n");
            }
            for (int i = 0 ; i < 7 ; i++) {
                Random ran = new Random();
                int randomNumber = ran.nextInt(beauty.length);
                writer.write(beauty[randomNumber]);
                writer.write("\n");
            }

            for (int j = 0 ; j < 5 ; j++) {
                Random ran2 = new Random();
                int randomNumber2 = ran2.nextInt(nogi.length);
                writer.write(nogi[randomNumber2]);
                writer.write("\n");
            }
        }
    }

}