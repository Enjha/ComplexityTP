package fr.yann;

import fr.yann.fibonacci.Fibonacci;
import fr.yann.graph.Graph;
import fr.yann.graph.GraphAlgorithm;

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
    } */

    public static void main(String[] args) {
        ArrayList<LinkedList<Integer>> listSommet = new ArrayList<>();

        Graph graph = new Graph(listSommet,8);
        graph.addEdge(0,1);
        graph.addEdge(1,2);
        graph.addEdge(1,3);
        graph.addEdge(1,4);
        graph.addEdge(2,5);
        graph.addEdge(2,3);
        graph.addEdge(2,4);
        graph.addEdge(3,4);
        graph.addEdge(3,6);
        graph.addEdge(4,7);

        GraphAlgorithm algo = new GraphAlgorithm();

        /* Question 1
        ArrayList<Integer> testDensity = new ArrayList<>();
        testDensity.add(2);
        testDensity.add(3);
        testDensity.add(5);
        testDensity.add(1);
        System.out.println(algo.checkDensity(graph, testDensity));
        */

        System.out.println(algo.calculMaxDensity(graph));
        System.out.println(listSommet);

        /* Question 3
        System.out.println(algo.calculMaxDensityFull(graph));
        */

    }

}
