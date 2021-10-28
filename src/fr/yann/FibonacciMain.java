package fr.yann;

import fr.yann.fibonacci.Fibonacci;

import java.util.Scanner;

public class FibonacciMain {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Veuillez entrez la valeur de n : ");
        long n = scan.nextInt();
        scan.close();
        Fibonacci fibo = new Fibonacci();


        long tempsDebut3 = System.currentTimeMillis();
        System.out.print("Résultat de la foncion Exponentation de matrice: ");
        fibo.fibonacciExponentation(n);
        long tempsFin3 = System.currentTimeMillis();
        System.out.println("Opération effectuée en: " + (tempsFin3 - tempsDebut3) / 1000F + " secondes.");
        System.out.println("Veuillez entrer un choix valide.");

        long tempsDebut2 = System.currentTimeMillis();
        System.out.println("Résultat de la foncion itérative: " + fibo.fibonacciIterative(n));
        long tempsFin2 = System.currentTimeMillis();
        System.out.println("Opération effectuée en: " + (tempsFin2 - tempsDebut2) / 1000F + " secondes.");

        /*
        long tempsDebut1 = System.currentTimeMillis();
        System.out.println("Résultat de la foncion récursive: " + fibo.fibonacciRecursive(n));
        long tempsFin1 = System.currentTimeMillis();
        System.out.println("Opération effectuée en: " + (tempsFin1 - tempsDebut1) / 1000F + " secondes.");
        */

    }
}
