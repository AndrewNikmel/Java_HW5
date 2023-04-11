import java.util.HashMap;
import java.util.Map;
public class task1 {
    public static void phoneBook() {
        Map<Integer,String> book = new HashMap<>();
        book.put(789, "Иван Иванов");
        book.put(654, "Светлана Петрова");
        book.put(321, "Кристина Белова");
        book.put(741, "Анна Мусина");
        book.put(852, "Кристина Белова");
        book.put(963, "Анна Мусина");
        book.put(369, "Анна Крутова");
        book.put(258, "Иван Юрин");
        book.put(147, "Петр Лыков");
        book.put(987, "Павел Чернов");
        book.put(123, "Петр Чернышов");
        book.put(456, "Иван Юрин");
        book.put(159, "Петр Лыков");
        book.put(951, "Мария Федорова");
        book.put(183, "Марина Светлова");
        book.put(381, "Мария Савина");
        book.put(729, "Мария Рыкова");
        book.put(927, "Марина Лугова");
        book.put(684, "Мария Савина");
        book.put(486, "Мария Рыкова");
        book.put(426, "Марина Лугова");
        book.put(624, "Анна Владимирова");
        book.put(953, "Иван Мечников");
        book.put(359, "Петр Петин");
        book.put(751, "Иван Ежов");
        System.out.println(book);
    }
}


// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.