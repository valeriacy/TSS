package Modelo;

import java.util.ArrayList;

/**
 * Created by Jp on 11/11/2018.
 */
public class Process {

    private ArrayList<State> evolution;

    public Process(){
        evolution=new ArrayList<>();
    }

    public ArrayList<State> getEvolution() {
        return evolution;
    }

    public void addState(State state) {
        evolution.add(state);
    }

    @Override
    public String toString(){
        String output="";
        for(State state : evolution){
            output+=state+"\n---------------------------- \n";
        }
        return output;
    }
}
