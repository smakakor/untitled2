import java.util.HashMap;
import java.util.Map;

public class Task3 {

    private final Map<String, Integer> map = new HashMap<>();


    public void addToMap(String key, int number) {
        if (!this.map.containsKey(key)) {
            this.map.put(key, number);
        } else {
            int numberMap = map.get(key);
            if (numberMap == number) {
                throw new IllegalArgumentException("Такое число уже существует");
            } else {
                map.put(key, number);
            }
        }

    }

    @Override
    public String toString() {
        return "Task3{" +
                "map=" + map +
                '}';
    }
}
