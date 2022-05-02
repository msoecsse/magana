package week8;

public class HashDriver {
    public static void main(String[] args) {
        HashtableChain<Integer, Character> hashTable = new HashtableChain<>();
        hashTable.put(0, '?');
        hashTable.put(1, 'A');
        hashTable.put(2, 'B');
        hashTable.put(3, 'C');
        hashTable.put(4, 'D');
        hashTable.put(5, 'F');
        hashTable.put(6, 'G');
        hashTable.put(105, 'H');
        hashTable.put(103, 'I');
        hashTable.put(206, 'J');
        hashTable.put(0, '?');
        hashTable.put(-5, '.');
        System.out.println(hashTable.get(2));

        System.out.println(hashTable.toString());

        System.out.println(HashtableChain.whatIsTheHashCode(206));
        System.out.println("For a table length of 101 (hardcoded inital value here)"
        + ", hashCode of " +HashtableChain.whatIsTheHashCode(206) + "\n is index "+
                (HashtableChain.whatIsTheHashCode(206)%101));
        System.out.println(hashTable.currentLoadFactor());

    }
}
