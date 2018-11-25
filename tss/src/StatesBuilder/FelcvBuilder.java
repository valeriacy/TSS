package StatesBuilder;

import Builder.StateBuilder;
import Modelo.State;
import Modelo.StatesNames;

import java.util.Random;

/**
 * Created by Jp on 12/11/2018.
 */
public class FelcvBuilder implements StateBuilder {

    private StatesNames felcvName;
    private String description;
    private boolean hasFailed;
    private int msDuration;
    private Random random;
    private int maxDuration;
    private StateBuilder nextStateBuilder;

    public FelcvBuilder(){
        random= new Random();
        felcvName =StatesNames.FELCV;
        description ="Documento ingresado en las oficinas de FELCV";
        hasFailed = false;
        maxDuration = 50;
        msDuration = generateDuration();
        nextStateBuilder=new MinisterioPublicoBuilder();
    }

    private int generateDuration(){
        return (int) (random.nextDouble()*maxDuration)+1;
    }

    public State buildState(){
        String name =felcvName.toString(felcvName);
        return new State(name,description,hasFailed,msDuration);
    }

    public StateBuilder nextStateBuilder(){
        return nextStateBuilder;
    }

    public boolean hasNextBuilder(){
        return nextStateBuilder!=null;
    }

}
