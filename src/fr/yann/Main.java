package fr.yann;

import fr.yann.fibonacci.Fibonacci;
import fr.yann.graph.Graph;
import fr.yann.graph.GraphAlgorithm;
import fr.yann.graph.Sommet;

import java.io.*;
import java.util.*;

public class Main {

    /*
    //Fibonacci
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Veuillez entrez la valeur de n : ");
        int n = scan.nextInt();
        System.out.println("Quelle méthode voulez-vous utiliser ? 1-Récursive 2-Itérative 3-Exponentation de matrice.");
        Fibonacci fibo = new Fibonacci();
        int choice = scan.nextInt();
        long tempsDebut = System.currentTimeMillis();
        long tempsFin;
        switch (choice){
            case 1:
                System.out.println("Résultat de la foncion récursive: "+fibo.fibonacciRecursive(n));
                tempsFin = System.currentTimeMillis();
                System.out.println("Opération effectuée en: "+ (tempsFin - tempsDebut) / 1000F + " secondes.");
                break;
            case 2:
                System.out.println("Résultat de la foncion itérative: "+fibo.fibonacciIterative(n));
                tempsFin = System.currentTimeMillis();
                System.out.println("Opération effectuée en: "+ (tempsFin - tempsDebut) / 1000F + " secondes.");
                break;
            case 3:
                System.out.print("Résultat de la foncion Exponentation de matrice: ");
                fibo.fibonacciExponentation(n);
                tempsFin = System.currentTimeMillis();
                System.out.println("Opération effectuée en: "+ (tempsFin - tempsDebut) / 1000F + " secondes.");
                break;
            default:
                System.out.println("Veuillez entrer un choix valide.");
                break;
        }
    }
     */

    public static void main(String[] args) {
        ArrayList<LinkedList<Integer>> listSommet = new ArrayList<>();
        LinkedList<Integer> trans0 = new LinkedList<>();
        LinkedList<Integer> trans1 = new LinkedList<>();
        LinkedList<Integer> trans2 = new LinkedList<>();
        LinkedList<Integer> trans3 = new LinkedList<>();
        LinkedList<Integer> trans4 = new LinkedList<>();
        LinkedList<Integer> trans5 = new LinkedList<>();
        LinkedList<Integer> trans6 = new LinkedList<>();

        trans0.add(1);
        trans0.add(3);
        trans0.add(6);
        trans0.add(4);

        trans1.add(0);
        trans1.add(2);
        trans1.add(4);

        trans2.add(1);
        trans2.add(3);
        trans2.add(5);
        trans2.add(6);

        trans3.add(0);
        trans3.add(2);
        trans3.add(5);
        trans3.add(6);

        trans4.add(0);
        trans4.add(1);

        trans5.add(2);
        trans5.add(3);
        trans5.add(6);

        trans6.add(0);
        trans6.add(2);
        trans6.add(3);
        trans6.add(5);

        listSommet.add(trans0);
        listSommet.add(trans1);
        listSommet.add(trans2);
        listSommet.add(trans3);
        listSommet.add(trans4);
        listSommet.add(trans5);
        listSommet.add(trans6);

        Graph graph = new Graph(listSommet);
        GraphAlgorithm algo = new GraphAlgorithm();

        /* Question 1
        ArrayList<Integer> testDensity = new ArrayList<>();
        testDensity.add(2);
        testDensity.add(3);
        testDensity.add(5);
        testDensity.add(1);
        System.out.println(algo.checkDensity(graph, testDensity));
        */

        /* Question 2
        System.out.println(algo.calculMaxDensity(graph));
         */

        /* Question 3
        System.out.println(algo.calculMaxDensityFull(graph));
         */


    }

}
