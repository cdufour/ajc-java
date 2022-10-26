/*
Date: Octobre 2022
Auteur: Christophe D.
*/
public class Basics
{
    public static void main(String[] args) {
        System.out.println("Programme de demonstration");
        System.out.println("Hello World!");
        System.out.print("I am learning Java.");
        System.out.println("It is awesome!");
        //System.out.println(42 + 10);

        // types de variable
        int integer = 45630;
        short sh = 42;
        char character = 'c';
        double db = 3.14;
        float fl = 3.14f;
        boolean bool = true;
        // chaîne de caractères incluant une tabulation
        String str = "Formation\tJava";
        
        System.out.println(str);

        
        // exemples d'opérations
        short n1 = 2;
        short n2 = 8;
        int result = n1 + n2;
        System.out.println(result);
        System.out.println("Age:" + sh); // concaténation

        int x, y, z;
        x = y = z = 50;
        y = 10;
        System.out.println(x + y + z); // 110


        // explict casting
        double myDouble = 9.78d;
        int myInt = (int) myDouble; // Manual casting: double to int

        System.out.println(myDouble);   // Outputs 9.78
        System.out.println(myInt);      // Outputs 9

        int accu = 4;
        accu += 2;
        System.out.println(accu); // 6

        boolean bool_test = 4 > 3;
        System.out.println(bool_test); // true

        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the txt string is: " + txt.length());

        String txt2 = "We are the so-called \"Vikings\" from the north.";
        System.out.println(txt2);

        System.out.println(Math.max(5, 10));

        // conditions
        if (true) {
            System.out.println("Il est vrai que vrai est vrai");
        }

        boolean isValidCard = false;
        if (25 >= 18 && isValidCard) {
            System.out.println("Tu peux voter");
        } else {
            System.out.println("Tu ne pas peux voter");
        }

        String ternary_test = (false) ? "Success" : "Failure";
        System.out.println(ternary_test); // Failure


        // iterations
        // while loop
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }

        // for loop
        for (int j = 0; j < 5; j++) {
            System.out.println(j);
        }

        // for-each loop
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String car : cars) {
            System.out.println(car);
        }

        // break
        for (int k = 0; k < 10; k++) {
            if (k == 4) {
                break;
            }
            System.out.println(k);
        }

        // arrays
        int[] myNum = {2, 3, 4, 5};
        myNum[0] = 10;
        for (int n : myNum) {
            System.out.println(n * n);
        }
        System.out.println(myNum[3]); // prints last value


        // positionnal args
        if (args.length > 0) {
            String arg1 = args[0];
            System.out.println("arg1: " + arg1);
        }

    }
}