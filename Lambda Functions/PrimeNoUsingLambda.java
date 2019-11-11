import java.util.function.UnaryOperator;

public class PrimeNoUsingLambda{
    static UnaryOperator<Integer> checkPrime;
    public static void main(String[] args) {
        checkPrime= (Integer x) -> { 
            for (int i=2;i<x;i++) 
                if (x%i==0){
                    System.out.println("Not a prime number");
                   return 0;
                }
            System.out.println("Prime number");
            return 1;
            };
            checkPrime.apply(27);
    }
}