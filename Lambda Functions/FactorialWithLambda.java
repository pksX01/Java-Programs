import java.util.function.UnaryOperator;

public class FactorialWithLambda{
     static UnaryOperator<Integer> fact;
    public static void main(String[] args) {
       fact = (Integer x) -> {return (x==0) ? 1 : x*fact.apply(x-1);};
       System.out.println(fact.apply(5));
    }
}