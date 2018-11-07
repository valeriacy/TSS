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
import java.util.Date;
public class Event {
    private String  description, location;
    private Date eventDate; 
    private Date delationDate;
    private int duration;
   
    public String getdescriptionE(){
        return description;
    }
 
    public void setdescriptionE(String descripcion){
        description=descripcion;
    }
    
    public String geteventLocation(){
        return location;
    }
    
    public void seteventLocation (String evento){
        location=evento;
    }
    
    public Date getEventDate(){
        return eventDate;
    }
    
    public void setEventDate (Date dia){
        eventDate= dia;
    }
    
    public Date getdelationDate(){
        return delationDate;
    }
    
    public void setdelationDate (Date  diaD){
       delationDate=diaD;
    }
}
