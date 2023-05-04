import java.util.*;

public class task2 {
    public static void main(String[] args) {
        listSort();
    }

    public static void listSort() {
        /*Пусть дан список сотрудников:
        Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина, Анна Крутова, Иван Юрин,
        Петр Лыков, Павел Чернов, Петр Чернышов, Мария Федорова, Марина Светлова, Мария Савина,
        Мария Рыкова, Марина Лугова, Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов.
        Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
        Отсортировать по убыванию популярности. Для сортировки использовать TreeMap.*/


        TreeMap<Integer, List<String>> treeMap = new TreeMap<>(Comparator.reverseOrder());
        String[] list = {"Иван Иванов", "Светлана Петрова", "Кристина Белова", "Анна Мусина",
                         "Анна Крутова", "Иван Юрин", "Петр Лыков", "Павел Чернов", "Петр Чернышов", 
                         "Мария Федорова", "Марина Светлова", "Мария Савина", "Мария Рыкова", 
                         "Марина Лугова", "Анна Владимирова", "Иван Мечников", "Петр Петин", "Иван Ежов"};
        ArrayList<String> lst = new ArrayList<>(Arrays.asList(list));
        while (!lst.isEmpty()) {
            int count = 0;
            String name = lst.get(0).substring(0, lst.get(0).indexOf(' '));
            Iterator<String> iterator = lst.iterator();
            while (iterator.hasNext()) {
                String str = iterator.next();
                if (name.equalsIgnoreCase(str.substring(0, str.indexOf(' ')))) {
                    count++;
                    iterator.remove();
                }
            }
            if (treeMap.containsKey(count)) {
                List<String> temp = treeMap.get(count);
                temp.add(name);
            } else {
                List<String> temp = new ArrayList<>();
                temp.add(name);
                treeMap.put(count, temp);
            }
        }
        System.out.println(treeMap);
    }


}
