package ByteShortIntLong.src.academy.learnprogramming;

public class Main {
    public static void main(String[] args) {
        //int myValue = 10000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.printf("Integer Minimum Value: %d%n", myMinIntValue);
        System.out.printf("Integer Minimum Value: %d%n", myMaxIntValue);
        // both of these options will cause an overflow error - but it will compile!
        System.out.println("Busted Max Value = " + (myMaxIntValue + 1));
        System.out.println("Busted Min value = " + (myMinIntValue - 1));
        // will also cause an overflow and will NOT compile!
        // int myMaxIntTest = 2147483648;


    }
}
