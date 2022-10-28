package project;

import java.util.Scanner;
import java.util.InputMismatchException;

import project.exception.InputException;


public class Part2_2
{
    public static void correctInput() throws InputException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Donner un entier: ");
        int n = sc.nextInt();

        // si l'entier saisi est inférieur, on lève une exception
        if (n < 10) {
            throw new InputException("valeur < 10");
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
            } catch(InputException e) {
                System.out.println(e.getMessage());
            }
        }  
    }
}