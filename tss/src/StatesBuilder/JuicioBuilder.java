package StatesBuilder;

import Builder.StateBuilder;
import Modelo.State;
import Modelo.StatesNames;

import java.util.Random;

/**
 * Created by Jp on 12/11/2018.
 */
public class JuicioBuilder implements StateBuilder{

    private StatesNames juicioName;
    private String description;
    private boolean hasFailed;
    private int msDuration;
    private Random random;
    private int maxDuration;
    private StateBuilder nextStateBuilder;

    public JuicioBuilder(boolean hasPreviousStateFailed){
        random= new Random();
        juicioName =StatesNames.JUICIO;
        maxDuration = 70;
        generateByPreviousState(hasPreviousStateFailed);
        nextStateBuilder=null;
    }

    private void generateByPreviousState(boolean hasFailed){
        if(hasFailed){
            description ="No se llego a esta instancia del proceso";
            this.hasFailed = true;
            msDuration = 0;
        }else {
            description ="Se convoco al acusado a un juicio";
            this.hasFailed = hasFailed();
            msDuration = generateDuration();
        }
    }

    private boolean hasFailed(){
        int randomNumber = (int) (random.nextDouble()*10);
        boolean isFailed=randomNumber>3;
        if(isFailed){
            description+="\n No se logro comprobar la culpa del acusado, este queda libre y sin cargos";
        }else {
            description+="\n Se logra comprobar la culpa del acusado y este es sentenciado a cadena perpetua";
        }
        return isFailed;
    }

    private int generateDuration(){
        return (int) (random.nextDouble()*maxDuration)+1;
    }

    public State buildState(){
        String name = juicioName.toString(juicioName);
        return new State(name,description,hasFailed,msDuration);
    }

    public StateBuilder nextStateBuilder(){
        return nextStateBuilder;
    }

    public boolean hasNextBuilder(){
        return nextStateBuilder!=null;
    }
}
