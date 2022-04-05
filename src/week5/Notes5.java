package week5;

import java.util.Optional;

public class Notes5 {
    static int count = 0;
    public static void main(String[] args) {
       // if (count <20){
           // System.out.println(count++);
           // main(null);
      //  }
     //   System.out.println(sumToN(3));
       /* int[] Is = {1, 2, 3};
        something("jsfkj",2, 3, 4, 5);
        something("fdsf", Is);
        Optional<String> myString = Optional.of("daw");
        myString =Optional.empty();

        */
        System.out.println(fib(8));
    }

    // sum up all numbers including n.
    private static int sumToN(int n) {
        if (n==1)
            return 1;
        return sumToN(n-1) + n;
    }

    public static void something (String name, int...arguments){
        System.out.println(name);
        System.out.println (arguments.length);
    }

    // fib(n) = fib(n-1) + fib(n-2)

    public static int fib(int n){
        // show through an exception for negative numbers
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        return fib(n-1) + fib(n-2);
    }
}
