package week5;

public class BinarySearch {

    public static void main(String[] args) {
        int[] data = {1, 2, 3, 5, 9, 11, 15};

        System.out.println("11: " + contains(data, 11));
        System.out.println("12: " + contains(data, 12));

        System.out.println("1: " + contains(data, 1));
        System.out.println("15: " + contains(data, 15));
        System.out.println("2: " + contains(data, 2));
        System.out.println("4: " + contains(data, 4));
        System.out.println("0: " + contains(data, 0));
        System.out.println("99: " + contains(data, 99));


    }

    public static boolean contains(int[] data, int lookingFor) {
   // boolean foundIt = false;

        int start = 0;
        int end = data.length;
        return contains(data, lookingFor, start, end);

    //return foundIt;

    }

    private static boolean contains(int[] data, int lookingFor, int start, int end) {
        //base case?
        // when we run out of spots in the array to check
        if (start >= end)
            return false;

        // we have a start, we an end (look up to the end, not including)
        int mid = (start + end)/2;
        if (lookingFor== data[mid])
            return true;
        else if (lookingFor < data[mid])
            return contains(data, lookingFor, start, mid);
        else
            return contains(data, lookingFor, mid+1, end);



    }

}
