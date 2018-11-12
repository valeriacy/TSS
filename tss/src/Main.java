import Builder.RandomProcessBuilder;
import Modelo.Event;
import Modelo.ProcessBuilder;
import Modelo.StatesNames;

import java.util.Date;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String eventDescription="";
        String eventLocationDescription="";
        long systemMs=System.currentTimeMillis();
        Date eventDate=new Date(systemMs);
        Date eventDelationDate=new Date(systemMs+10000);
        StatesNames initialState=StatesNames.FELCV;
        ProcessBuilder processBuilder=new RandomProcessBuilder();
        Event event=new Event(eventDescription,
                              eventLocationDescription,
                              eventDate,
                              eventDelationDate,
                              processBuilder,
                              initialState);
        System.out.println(event);
    }
    
}
