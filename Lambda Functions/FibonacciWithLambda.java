import java.util.function.UnaryOperator;

public class FibonacciWithLambda{
    static UnaryOperator<Integer> fib;
    public static void main(String[] args) {
        fib = (Integer x) -> {return (x==1)? 0 : (x==2) ? 1 : fib.apply(x-1)+fib.apply(x-2);};
        System.out.println(fib.apply(5));
    }
}