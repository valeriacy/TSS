import Builder.RandomProcessBuilder;
import Modelo.Event;
import Modelo.ProcessConstructor;
import Modelo.StatesNames;

import java.util.Date;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String eventDescription="La victima estaba cocinando asi bien japibirdaytuyu pero aparecio este animal y le dio una" +
                                " cachetada a la pobre :'v";
        String eventLocationDescription="En su casa pe donde mas xdxdxd";
        long systemMs=System.currentTimeMillis();
        Date eventDate=new Date(systemMs);
        Date eventDelationDate=new Date(systemMs+10000);
        StatesNames initialState=StatesNames.FELCV;

        ProcessConstructor processBuilder=new RandomProcessBuilder();
        Event event=new Event(eventDescription,
                              eventLocationDescription,
                              eventDate,
                              eventDelationDate,
                              processBuilder,
                              initialState);
        System.out.println(event);
    }
    
}
