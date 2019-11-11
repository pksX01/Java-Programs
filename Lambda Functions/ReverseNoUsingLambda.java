import java.util.List;
import java.util.Scanner;

public interface Reverse{
    public String reverseString(String str);
}
public class ReverseNoUsingLambda{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        String number = sc.nextLine();
       Reverse reverse = str -> new StringBuffer(str).reverse().toString();
       System.out.print("Reversed number is "+reverse.reverseString(number));
    }
}