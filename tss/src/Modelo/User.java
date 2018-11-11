package Modelo;
import java.util.ArrayList;

public class User {
    private ArrayList<Event> events;

    public User(){
        events=new ArrayList<>();
    }

    public ArrayList<Event> getEvents() {
        return events;
    }
}
