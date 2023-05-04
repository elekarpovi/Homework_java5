import java.util.*;

public class task1 {
    public static void main(String[] args) {
        telNums();
    }

    public static void telNums() {
        /*Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько
        телефонов. Нужны методы добавления новой записи в книгу и метод поиска записей в телефонной книге*/

        Telephones telBook = new Telephones();
        telBook.add("Иванов", "1234567");
        telBook.add("Сидоров", "2345678");
        telBook.add("Петров", "3456789");
        telBook.add("Топоров", "4567891");
        telBook.add("Петрова", "5678912");
        telBook.add("Ильина", "6789123");
        telBook.add("Мостов", "7891234");
        telBook.print();
        telBook.findLastName("Петрова");
        telBook.findTelNumber("1234567");
        
    }
} 