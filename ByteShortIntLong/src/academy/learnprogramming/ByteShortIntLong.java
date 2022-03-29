package ByteShortIntLong.src.academy.learnprogramming;

public class ByteShortIntLong {
    public static void main(String[] args) {
        
        int myValue = 10000;

        // will print out the maximum and minimum number for the primitive type of Integer.
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.printf("Integer Minimum Value: %d%n", myMinIntValue);
        System.out.printf("Integer Minimum Value: %d%n", myMaxIntValue);
        
        // both of these options will cause an overflow error - but it will compile!
        System.out.println("Busted Max Value = " + (myMaxIntValue + 1));
        System.out.println("Busted Min value = " + (myMinIntValue - 1));
        
        // if we increase this variable by one number it will also cause an overflow and will NOT compile!
        int myMaxIntTest = 2_147_483_647;

        // will print out the maximum and minimum number for the primitve type of Byte 
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;

        System.out.printf("Byte Minimum Value: %d%n", myMinByteValue);
        System.out.printf("Byte Maximum Value: %d%n", myMaxByteValue);

        // will print out the maximum and mimimum number for the primitive type of Short
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;

        System.out.printf("Short Minimum Value: %d%n", myMinShortValue);
        System.out.printf("Short Maximum Value: %d%n", myMaxShortValue);

        // will print out the maximum and minimum number for the primitive type of Long
        long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;

        System.out.printf("Long Minimum Value: %d%n", myMinLongValue);
        System.out.printf("Long Maximum Value: %d%n", myMaxLongValue);
        long bigLongLiteralValue = 2_147_483_647_234L;
        System.out.println(bigLongLiteralValue);

        short bigShortLiteralValue = 32767;

        int myTotal = (myMinIntValue / 2);
        byte myNewByteValue = (byte) (myMinByteValue / 2);
        short myNewShortValue = (short) (myMinShortValue / 2);
        
        // Primitive Types Challenge
        byte myByteNumber = 64;
        short myShortNumber = 16_432;
        int myIntNumber = 1_000_000;
        long myLongNumber = (long) (50_000L + (10 * myByteNumber) + myShortNumber + myIntNumber);
        System.out.println(myLongNumber);
    }
}
