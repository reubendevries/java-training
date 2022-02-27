package FloatAndDouble.src.academy.learnprogramming;

public class FloatAndDouble {
    public static void main(String[] args) {

        // prints out the maximum and minimum float values.
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.printf("Float minimum value: %f%n", myMinFloatValue);
        System.out.printf("Float maximum value: %f%n", myMaxFloatValue);

        // prints out the maximum and minimum double values.
        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.printf("Double minimum value: %f%n", myMinDoubleValue);
        System.out.printf("Double maximum value: %f%n", myMaxDoubleValue);
        
        int myIntValue = 5;
        float myFloatValue = (float) 5.25;
        double myDoubleValue = 5.25d;

        System.out.printf("My Int Value: %d%n", myIntValue);
        System.out.printf("My Float Value: %f%n", myFloatValue);
        System.out.printf("My Double Value: %f%n", myDoubleValue);
    }
}
