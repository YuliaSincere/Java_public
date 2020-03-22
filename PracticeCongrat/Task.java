import java.io.*;
import java.util.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task {

    public static void main(String[] args) throws IOException {
        String line;
        ArrayList<ArrayList<String>> keeping = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("/home/yulia/Documents/GitHub/Java_public/PracticeCongrat/puk.txt"))) {

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
       // Построчно выводим голую женщину
        for(int i = 0; i < a.size(); i++){
            System.out.println(a.get(i));
        }
        // Запрашиваем данные для завершения составления открытки
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите адресата");
        String addressee = sc.nextLine();
        System.out.println("Введите получателя");
        String recipient = sc.nextLine();

        // Осуществляем запись в файл
        File file = new File("note.txt");
        file.createNewFile();
        try (FileWriter writer = new FileWriter (file)) {
            for(int i = 0; i < a.size(); i++){
                writer.write( a.get(i));
                writer.write("\n");
            }
            writer.write(addressee);
            writer.write("\n");
            writer.write(recipient);
            writer.write("\n");
            writer.close();
        }
    }
}