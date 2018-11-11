package Modelo;

import java.util.ArrayList;

/**
 * Created by Jp on 11/11/2018.
 */
public class Process {

    private ArrayList<State> evolution;
    private State finalState;

    public Process(){
        evolution=new ArrayList<>();
    }

    public ArrayList<State> getEvolution() {
        return evolution;
    }

    public void addState(State state) {
        evolution.add(state);
    }

    public State getFinalState() {
        return finalState;
    }

    public void setFinalState(State finalState) {
        this.finalState = finalState;
    }
}
