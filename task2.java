import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;
import java.util.LinkedHashMap;
import java.util.Comparator;

public class task2 {
    public static void main(String[] args) {
        
        ArrayList <String> list = new ArrayList<>();
        Map <String, Integer> map = new HashMap<>();
        list.add("Иван Иванов");
        list.add("Светлана Петрова");
        list.add("Кристина Белова");
        list.add("Анна Мусина");
        list.add("Анна Крутова");
        list.add("Иван Юрин");
        list.add("Петр Лыков");
        list.add("Павел Чернов");
        list.add("Петр Чернышов");
        list.add("Мария Федорова");
        list.add("Марина Светлова");
        list.add("Мария Савина");
        list.add("Мария Рыкова");
        list.add("Марина Лугова");
        list.add("Анна Владимирова");
        list.add("Иван Мечников");
        list.add("Петр Петин");
        list.add("Иван Ежов");

        for (String item:list) {
            String [] nameList = item.split(" ");
            var name = nameList[0].toString();
            if (map.containsKey(name)){
                map.put(name, map.get(name) + 1);
            }
            else {
                map.put(name, 1);
            }
        }

        Logger log = Logger.getAnonymousLogger();
        log.info("Unsorted : " + map.toString());

        Map<String, Integer> unSortedMap =map;
        LinkedHashMap<String, Integer> reverseSortedMap = new LinkedHashMap<>();
        unSortedMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEachOrdered(x -> reverseSortedMap.put(x.getKey(), x.getValue()));

        log.info("Sorted : " + reverseSortedMap.toString());

    }
}


// Пусть дан список сотрудников:

// Иван Иванов
// Светлана Петрова
// Кристина Белова
// Анна Мусина
// Анна Крутова
// Иван Юрин
// Петр Лыков
// Павел Чернов
// Петр Чернышов
// Мария Федорова
// Марина Светлова
// Мария Савина
// Мария Рыкова
// Марина Лугова
// Анна Владимирова
// Иван Мечников
// Петр Петин
// Иван Ежов
// Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности.