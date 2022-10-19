import java.io.*;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PeaceAndWarSearcher {
    public static void main(String[] args) {

        File file = new File("WarAndPease.txt");
        Parser parse = new Parser();
        ArrayList<String> lines = Parser.parse(file);


        String string = lines.toString();//Перегонем массив в текстовый формат
        Pattern pattern = Pattern.compile("традани");//Создаём паттерн поиска
        Matcher matcher = pattern.matcher(string);//Указываем, что искать мы будем в переменной string
        int count = 0;//Просто счётчик
        while (matcher.find()) {
            count++;//Если  находится совпадение - счётчик увеличивается на 1
        }
        String times;
        if ((count == 2) || (count == 3) || (count == 4)) {
            times = " раза.";
        } else {
            times = " раз.";
        }//Конструкция, позволяющая грамотно выводить ответ
        System.out.println("В файле слово 'страдание' встречается " + count + times);//Вывод результата.
    }
}
