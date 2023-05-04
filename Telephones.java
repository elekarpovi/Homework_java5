import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Telephones {
    /*Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
     Нужны методы добавления новой записи в книгу и метод поиска записей в телефонной книге*/
    private Map<String, List<String>> Book = new HashMap<>();

    public void add(String lastName, String telNumber){
        if (Book.containsKey(lastName.toUpperCase())){
            List <String> lst = Book.get(lastName.toUpperCase());
            lst.add(telNumber);
        }
        else {
            List<String> lst = new ArrayList<>();
            lst.add(telNumber);
            Book.put(lastName.toUpperCase(), lst);
        }
    }
    public void print(){
        for(Map.Entry<String,List<String>> entry: Book.entrySet()){
            System.out.println(entry);
        }
    }
    public void findLastName(String lastName){
        if (!Book.containsKey(lastName.toUpperCase())){
            System.out.println(lastName + "  не найден");
            return;
        }
        System.out.println(lastName + "\t" + Book.get(lastName.toUpperCase()).toString());
    }
    public void findTelNumber(String telNumber) {
        boolean flag= true;
        for (Map.Entry<String, List<String>> entry : Book.entrySet()) {
            List<String> lst = entry.getValue();
            for( String item : lst){
                if (item.equalsIgnoreCase(telNumber)) {
                    System.out.println(telNumber + "\t"+ entry.getKey());
                    flag = false;
                }
            }

        }
        if (flag) {System.out.println(telNumber + "  не найден");}
    }
}