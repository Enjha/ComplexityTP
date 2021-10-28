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

    public ArrayList<Integer> calculMaximalDensity(Graph graph) {
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


    public ArrayList<Integer> calculMaximumDensityFull(Graph graph) {
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
            if (tmp.size() > maxDensity.size())
                maxDensity = tmp;
            tmp = new ArrayList<>();
        }
        return maxDensity;
    }

    public ArrayList<Integer> calculMaxixmumDensityNotFull(Graph graph) {
        int index = getIndexMaximalList(graph.getListSommet());
        ArrayList<Integer> tmp = new ArrayList<>();
        tmp.add(index);
        for (int i = graph.getListSommet().get(index).size()-1; i >= 0 ; i--) {
            tmp.add(graph.getListSommet().get(index).get(i));
            if(!checkDensity(graph,tmp))
                tmp.remove(graph.getListSommet().get(index).get(i));
        }
        return tmp;
    }

    public int getIndexMaximalList(ArrayList<LinkedList<Integer>> list) {
        LinkedList<Integer> maxList = new LinkedList<>();
        int index = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).size() > maxList.size()) {
                maxList = list.get(i);
                index = i;
            }
        }
        return index;
    }
}
