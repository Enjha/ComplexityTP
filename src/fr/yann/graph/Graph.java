package fr.yann.graph;

import java.util.ArrayList;
import java.util.LinkedList;

public class Graph {

    private ArrayList<LinkedList<Integer>> listSommet;

    public Graph(ArrayList<LinkedList<Integer>> listSommet){
        this.listSommet = listSommet;
    }

    public ArrayList<LinkedList<Integer>> getListSommet() {
        return listSommet;
    }

    public void setListSommet(ArrayList<LinkedList<Integer>> listSommet) {
        this.listSommet = listSommet;
    }

    public boolean isTransitionExist(int e1, int e2){
        return listSommet.get(e1).contains(e2);
    }
}
