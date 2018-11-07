/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Equipo
 */
import java.util.ArrayList;
public class User {
        ArrayList<Event> eventos=new ArrayList<>();
    void addEvent(Event e){
        eventos.add(e);
    }
    Event getEvent(int n){
        return eventos.get(n);
    }

    
}
