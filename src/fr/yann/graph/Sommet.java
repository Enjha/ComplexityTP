package fr.yann.graph;

import java.util.ArrayList;

public class Sommet {

    private int sommetNumber;
    private ArrayList<Integer> listTransition;

    public Sommet(int sommetNumber, ArrayList<Integer> listTransition) {
        this.sommetNumber = sommetNumber;
        this.listTransition = listTransition;
    }

    public int getSommetNumber() {
        return sommetNumber;
    }

    public void setSommetNumber(int sommetNumber) {
        this.sommetNumber = sommetNumber;
    }

    public ArrayList<Integer> getListTransition() {
        return listTransition;
    }

    public void setListTransition(ArrayList<Integer> listTransition) {
        this.listTransition = listTransition;
    }
}
