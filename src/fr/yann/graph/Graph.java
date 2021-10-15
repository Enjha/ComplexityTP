package fr.yann.graph;

import java.util.ArrayList;
import java.util.LinkedList;

public class Graph {

    private ArrayList<LinkedList<Integer>> listSommet;

    public Graph(ArrayList<LinkedList<Integer>> listSommet, int nbSommet) {
        this.listSommet = listSommet;
        initializeGraph(nbSommet);
    }

    public void initializeGraph(int nbSommet){
        for (int i = 0; i < nbSommet; i++) {
            LinkedList<Integer> tmp = new LinkedList<>();
            listSommet.add(tmp);
        }
    }

    public ArrayList<LinkedList<Integer>> getListSommet() {
        return listSommet;
    }

    public void setListSommet(ArrayList<LinkedList<Integer>> listSommet) {
        this.listSommet = listSommet;
    }

    public boolean isTransitionExist(int e1, int e2) {
        return listSommet.get(e1).contains(e2);
    }

    public void addEdge(int t1, int t2) {
        listSommet.get(t1).add(t2);
        listSommet.get(t2).add(t1);
    }
}
