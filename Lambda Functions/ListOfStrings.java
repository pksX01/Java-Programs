import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class ListOfStrings{
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>(5);
        list.add("Pavan");
        list.add("Piyush");
        list.add("Abhijeet");
        list.add("Shreshtha");
        list.add("Krishna");
        list.stream().filter(name -> name.startsWith("P"));
        list.forEach(System.out::println);
        System.out.print("\n");
        List<String> newList = list.stream().filter(name -> name.length()>5).collect(Collectors.toList());
        newList.forEach(System.out::println);
    }
}