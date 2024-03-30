import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> mapWord = new HashMap<>();
        String content = Controller.workWithFile();
        String[] words = Controller.splitString(content);
        Controller.maxLength(words);
        Controller.mapFruit(words, mapWord);
    }
}

