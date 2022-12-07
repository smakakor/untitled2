import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        taskListMap();
    }

    public static void task1() {
        HashMap<String, String> numberPhone = new HashMap<>();

        numberPhone.put("Шакиров А.И.", "+7 912 111 11 11");
        numberPhone.put("Байбеков А.Ш.", "+7 912 222 22 22");
        numberPhone.put("Неклюдова К.Л.", "+7 912 333 33 33");
        numberPhone.put("Емельянов К.И.", "+7 912 444 44 44");


        System.out.println(numberPhone.entrySet());
    }

    public static void task3() {

        Task3 map = new Task3();
        map.addToMap("str1", 5);
        map.addToMap("str2", 6);
        map.addToMap("str1", 7);

        System.out.println(map);

    }

    public static void taskListMap() {



        Map<Integer, String> map = new LinkedHashMap<>();
        map.put(6, "test6");
        map.put(4, "test4");
        map.put(5, "test5");
        map.put(7, "test7");
        map.put(2, "test2");

        for (Map.Entry<Integer, String> entry :
                map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }



}