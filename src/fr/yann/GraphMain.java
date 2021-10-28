package fr.yann;

import fr.yann.graph.Graph;
import fr.yann.graph.GraphAlgorithm;

import java.util.*;

public class GraphMain {

    public static void main(String[] args) {
        ArrayList<LinkedList<Integer>> listSommet = new ArrayList<>();

        /* Graphe n°1
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
         */

        Graph graph = new Graph(listSommet,8);
        graph.addEdge(0,1);
        graph.addEdge(1,2);
        graph.addEdge(1,4);
        graph.addEdge(2,4);
        graph.addEdge(3,4);
        graph.addEdge(3,7);
        graph.addEdge(3,6);
        graph.addEdge(7,5);
        graph.addEdge(7,6);

        GraphAlgorithm algo = new GraphAlgorithm();

        /* Question 1
        ArrayList<Integer> testDensity = new ArrayList<>();
        testDensity.add(2);
        testDensity.add(3);
        testDensity.add(4);
        testDensity.add(1);
        System.out.println(algo.checkDensity(graph, testDensity));
        */

     //   /* Question 2
        long tempsDebut1 = System.currentTimeMillis();
        System.out.println(algo.calculMaximalDensity(graph));
        System.out.println("Opération effectuée en: " + (System.currentTimeMillis() - tempsDebut1) / 1000F + " secondes.");
     //    */

     //   /* Question 3
        long tempsDebut2 = System.currentTimeMillis();
        System.out.println(algo.calculMaximumDensityFull(graph));
        System.out.println("Opération effectuée en: " + (System.currentTimeMillis() - tempsDebut2) / 1000F + " secondes.");
     //   */

      //  /* Question 4
        long tempsDebut3 = System.currentTimeMillis();
        System.out.println(algo.calculMaxixmumDensityNotFull(graph));
        System.out.println("Opération effectuée en: " + (System.currentTimeMillis() - tempsDebut3) / 1000F + " secondes.");
       // */

    }

}
