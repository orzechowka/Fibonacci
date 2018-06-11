import java.util.ArrayList;
import java.util.stream.Collector;

/**
 * Created by Anna on 2018-06-11.
 */
public class Fibonacci {

    public static void main(String[] args) {

        Fibonacci fib = new Fibonacci();
        fib.getFibo(10);
        System.out.println(fib.sum(5));

    }

    public ArrayList<Integer> getFibo(int number) {

        ArrayList<Integer> fibonacci = new ArrayList<Integer>();
        int a = 0;
        int b = 1;
        int result;
        fibonacci.add(a);
        fibonacci.add(b);
        
        for (int i = 2; i < number; i++) {
            result = a + b;
            fibonacci.add(result);
            a = fibonacci.get(i - 1);
            b = fibonacci.get(i);
        }

        fibonacci.forEach(System.out::println);
        return fibonacci;
    }

    public int sum(int number) {
        return getFibo(number).stream().mapToInt(Integer::intValue).sum();
    }
}
