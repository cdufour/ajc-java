package project;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Part1
{
    public static void correctInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Donner un entier: ");
        int n = sc.nextInt();
        System.out.println("L'entier saisi est: " + n);
    }

    public static void main(String[] args) {
        while (true) {
            try {
                correctInput();
                break;
            } catch(InputMismatchException e) {
                System.out.println("Erreur de saisie");
            } finally {
                System.out.println("Fin");
            }
        }  
    }
}