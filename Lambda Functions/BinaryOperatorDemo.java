import java.util.function.BinaryOperator;

public class BinaryOperatorDemo{
    public static void main(String[] args) {
        BinaryOperator<Integer> add = (x,y) -> x+y;
        BinaryOperator<Integer> sub = (x,y) -> x-y;
        BinaryOperator<Integer> mul = (x,y) -> x*y;
        System.out.println("Addition: "+add.apply(5,4));
        System.out.println("Subtraction: "+sub.apply(5, 4));
        System.out.println("Multiplication: "+mul.apply(5, 4));
    }
}