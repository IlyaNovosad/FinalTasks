import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;


public class Controller {
    public static void mapFruit(String[] words, Map<String, Integer> mapWord) {
        for (String word : words) {
            if (!mapWord.containsKey(word)) {
                mapWord.put(word, 1);
            } else {
                mapWord.put(word, mapWord.get(word) + 1);
            }
        }
        for (Map.Entry<String, Integer> elem : mapWord.entrySet()) {
            System.out.println("значение " + elem.getKey() + " встретился " + elem.getValue() + " раз");
        }
    }

    public static void maxLength(String[] words) {
        String counter = "";
        for (String word : words) {
            if (word.length() > counter.length()) {
                counter = word;
            }
        }
        System.out.println("Наибольшее количество символов в слове " + counter + " и оно равно " + counter.length());
    }

    public static String[] splitString(String str) {
        return str.replaceAll("\\s{2,}", " ").split(" ", 0);
    }

    public static String workWithFile() {
        String fileName = "input.txt";
        try (BufferedReader reader = Files.newBufferedReader(Paths.get(fileName))) {
            return reader.readLine();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Не удалось считать файл");
        }
        return String.valueOf(false);
    }
    public static void fruitCounter(String[] words) {
        int count = 0;
        for (String ignored : words) {
            count++;
        }
        System.out.println("Количество слов в файле равно: " + count);
    }
}
