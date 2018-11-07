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
public class State {
    private String name, description;
    private boolean hasFailed, canFail;
    private int duration;
    
    String getName(){
        return name;
    }
    void setName(String nombre){
        name=nombre;
    }
     String getDescription(){
        return description;
    }
    void setDescription(String descripcion){
        name=descripcion;
    }
     boolean getHasFailed(){
        return hasFailed;
    }
    void setHasFailed(boolean fallo){
        hasFailed=fallo;
    }
    boolean getCanFail(){
        return canFail;
    }
    void setCanFail(boolean puedeFallar){
        canFail=puedeFallar;
    }
    int getDuration(){
        return duration;
    }
    void setDuration(int duracion){
        duration=duracion;
    }

}
