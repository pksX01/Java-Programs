import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListOfNumbers{
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>(5);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.forEach((Integer x) -> System.out.println(x));
        System.out.println("\nNew List after updating numbers");
        list.replaceAll(x -> x+10);
        list.forEach(x -> System.out.println(x));
        System.out.println("\nNew List after updating only even numbers");
        list.replaceAll(x -> x%2==0 ? x+10:x);
        list.forEach(System.out::println);
        System.out.println("Size: "+list.size());
        System.out.println("List contains 6?:"+list.contains(6));
        for(Integer value: list){
            System.out.println(value);
        }

        List<Integer> evenList = list.stream().filter(x -> x%2==0).collect(Collectors.toList());
        System.out.print("\nEven List: ");
        evenList.forEach(x -> System.out.print(x+"\t"));
        List<Integer> oddList = list.stream().filter(x -> x%2!=0).collect(Collectors.toList());
        System.out.print("\nOdd List: ");
        oddList.forEach(x -> System.out.print(x+"\t"));
    }
}