public interface Operation{
    public int perform(int x, int y);
}

public class ArithmaticOpWithLambda{
    public static void main(String[] args) {
        Operation add = (x,y) -> x+y;
        Operation sub = (x,y) -> x-y;
        Operation mul = (x,y) -> x*y;
        System.out.println("Addition: "+add.perform(5, 4));
        System.out.println("Subtraction: "+sub.perform(5, 4));
        System.out.println("Multiplication: "+mul.perform(5, 4));
    }
}
