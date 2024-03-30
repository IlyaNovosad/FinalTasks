import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> mapWord = new HashMap<>();
        String content = Controller.workWithFile();
        String[] words = Controller.splitString(content);
        Controller.fruitCounter(words);
        System.out.println("------------------------------------------------------------------");
        Controller.maxLength(words);
        System.out.println("------------------------------------------------------------------");
        Controller.mapFruit(words, mapWord);
    }
}

