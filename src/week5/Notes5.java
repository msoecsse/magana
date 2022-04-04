package week5;

public class Notes5 {
    static int count = 0;
    public static void main(String[] args) {
       // if (count <20){
           // System.out.println(count++);
           // main(null);
      //  }
        System.out.println(sumToN(3));
    }

    // sum up all numbers including n.
    private static int sumToN(int n) {
        if (n==1)
            return 1;
        return sumToN(n-1) + n;
    }
}
