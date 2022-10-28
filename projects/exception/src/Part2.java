package project;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Part2
{
    public static void correctInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Donner un entier: ");
        int n = sc.nextInt();

        // si l'entier saisi est inférieur, on lève une exception
        if (n < 10) {
            throw new IllegalArgumentException("valeur < 10");
        }

        System.out.println("L'entier saisi est: " + n);
    }

    public static void main(String[] args) {
        while (true) {
            try {
                correctInput();
                break;
            } catch(InputMismatchException e) {
                System.out.println("Erreur de saisie");
            } catch(IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }  
    }
}