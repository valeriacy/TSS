package StatesBuilder;

import Builder.StateBuilder;
import Modelo.State;
import Modelo.StatesNames;

import java.util.Random;

/**
 * Created by Jp on 12/11/2018.
 */
public class InvestigacionBuilder implements StateBuilder {
    private StatesNames investigacionName;
    private String description;
    private boolean hasFailed;
    private int msDuration;
    private Random random;
    private int maxDuration;
    private StateBuilder nextStateBuilder;

    public InvestigacionBuilder(boolean hasPreviousStateFailed){
        random= new Random();
        investigacionName =StatesNames.INVESTIGACION;
        maxDuration = 140;
        generateByPreviousState(hasPreviousStateFailed);
        nextStateBuilder=new JuicioBuilder(hasFailed);
    }

    private void generateByPreviousState(boolean hasFailed){
        if(hasFailed){
            description ="No se llego a esta instancia del proceso";
            this.hasFailed = true;
            msDuration = 0;
        }else {
            description ="Se inicio la investigacion";
            this.hasFailed = hasFailed();
            msDuration = generateDuration();
        }
    }

    private boolean hasFailed(){
        int randomNumber = (int) (random.nextDouble()*10);
        boolean isFailed=randomNumber>4;
        if(isFailed){
            description+="\n No se encontraron suficientes pruebas, el caso se archiva";
        }else {
            description+="\n Se encontraron pruebas convincentes del crimen, se continua con el caso";
        }
        return isFailed;
    }

    private int generateDuration(){
        return (int) (random.nextDouble()*maxDuration)+1;
    }

    public State buildState(){
        String name = investigacionName.toString(investigacionName);
        return new State(name,description,hasFailed,msDuration);
    }

    public StateBuilder nextStateBuilder(){
        return nextStateBuilder;
    }

    public boolean hasNextBuilder(){
        return nextStateBuilder!=null;
    }
}
