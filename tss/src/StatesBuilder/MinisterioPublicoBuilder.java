package StatesBuilder;

import Builder.StateBuilder;
import Modelo.State;
import Modelo.StatesNames;

import java.util.Random;

/**
 * Created by Jp on 12/11/2018.
 */
public class MinisterioPublicoBuilder implements StateBuilder{
    private StatesNames minPubName;
    private String description;
    private boolean hasFailed;
    private int msDuration;
    private Random random;
    private int maxDuration;
    private StateBuilder nextStateBuilder;

    public MinisterioPublicoBuilder(){
        random= new Random();
        minPubName =StatesNames.MINISTERIO_PUBLICO;
        description ="Documento ingresado en las oficinas del ministerio publico";
        hasFailed = false;
        maxDuration = 20;
        msDuration = generateDuration();
        nextStateBuilder=new FiscaliaBuilder();
    }

    private int generateDuration(){
        return (int) (random.nextDouble()*maxDuration)+1;
    }

    public State buildState(){
        String name = minPubName.toString(minPubName);
        return new State(name,description,hasFailed,msDuration);
    }

    public StateBuilder nextStateBuilder(){
        return nextStateBuilder;
    }

    public boolean hasNextBuilder(){
        return nextStateBuilder!=null;
    }
}
