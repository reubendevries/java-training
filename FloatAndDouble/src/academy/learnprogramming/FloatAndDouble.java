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
        
        // 
        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5d / 3d;

        System.out.printf("My Int Value: %d%n", myIntValue);
        System.out.printf("My Float Value: %f%n", myFloatValue);
        System.out.printf("My Double Value: %f%n", myDoubleValue);
        
        // a kilo calculator
        double numberOfPounds = 200d;
        double myTotalKilos = numberOfPounds * 0.45359237;
        System.out.printf("%f Lbs turns into %f Kilos%n", numberOfPounds, myTotalKilos);
    }
}
