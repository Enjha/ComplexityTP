package fr.yann.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Random;

public class GraphAlgorithm {

    public boolean checkDensity(Graph graph, ArrayList<Integer> subGroup) {
        for (Integer i : subGroup) {
            for (Integer j : subGroup) {
                if (!Objects.equals(i, j)) {
                    if (!graph.isTransitionExist(i, j))
                        return false;
                }
            }
        }
        return true;
    }

    public ArrayList<Integer> calculMaxDensity(Graph graph) {
        Random random = new Random();
        int randomInt = random.nextInt(graph.getListSommet().size() - 1);
        ArrayList<Integer> maxDensity = new ArrayList<>();
        maxDensity.add(graph.getListSommet().indexOf(graph.getListSommet().get(randomInt)));
        for (Integer i : graph.getListSommet().get(randomInt)) {
            maxDensity.add(i);
            if (!checkDensity(graph, maxDensity)) {
                maxDensity.remove(i);
            }
        }
        return maxDensity;
    }

    public ArrayList<Integer> calculMaxDensityFull(Graph graph) {
        ArrayList<Integer> maxDensity = new ArrayList<>();
        ArrayList<Integer> tmp = new ArrayList<>();
        for (LinkedList<Integer> transitions : graph.getListSommet()) {
            tmp.add(graph.getListSommet().indexOf(transitions));
            for (Integer i : transitions) {
                tmp.add(i);
                if (!checkDensity(graph, tmp)) {
                    tmp.remove(i);
                }
            }
            System.out.println(maxDensity+"  "+tmp);
            if(tmp.size() > maxDensity.size())
                maxDensity = tmp;
            tmp = new ArrayList<>();
        }
        return maxDensity;
    }

    public ArrayList<Integer> calculMaxDensityNotFull(Graph graph) {
        ArrayList<Integer> maxDensity = new ArrayList<>();
        return maxDensity;
    }
}
