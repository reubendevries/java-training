package CharBoolean.src.academy.learnprogramming;

public class CharBoolean {
     public static void main(String[] args) {
        
        // example of a char primitive data type.
        char myChar = 'D';
        char myUnicodeChar = '\u0044';
        char myCopyrightChar = '\u00A9';
        System.out.println(myChar);
        System.out.println(myUnicodeChar);
        System.out.println(myCopyrightChar);

        for (int i=1; i <= 10; i++) {
            System.out.println(i);
        }

        String[] cars = {"Volvo", "BMW", "Tesla", "Porsche", "Mercedes", "Audi"};
        for (String i : cars) {
            System.out.println(i);
        }
     }
}
