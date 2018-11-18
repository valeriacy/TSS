package StatesBuilder;

import Builder.StateBuilder;
import Modelo.State;
import Modelo.StatesNames;

import java.util.Random;

/**
 * Created by Jp on 12/11/2018.
 */
public class FiscaliaBuilder implements StateBuilder{

    private StatesNames fiscaliaName;
    private String description;
    private boolean hasFailed;
    private int msDuration;
    private Random random;
    private int maxDuration;
    private StateBuilder nextStateBuilder;

    public FiscaliaBuilder(){
        random= new Random();
        fiscaliaName =StatesNames.FISCALIA;
        description ="Documento ingresado en las oficinas de la fiscalia";
        hasFailed = hasFailed();
        maxDuration = 140;
        msDuration = generateDuration();
        nextStateBuilder=new InvestigacionBuilder(hasFailed);
    }

    private boolean hasFailed(){
        int randomNumber = (int) (random.nextDouble()*10);
        boolean isFailed=randomNumber>7;
        if(isFailed){
            description+="\n El acusado no se presento en la fecha citada";
        }
        return isFailed;
    }

    private int generateDuration(){
        return (int) (random.nextDouble()*maxDuration)+1;
    }

    public State buildState(){
        String name = fiscaliaName.toString(fiscaliaName);
        return new State(name,description,hasFailed,msDuration);
    }

    public StateBuilder nextStateBuilder(){
        return nextStateBuilder;
    }

    public boolean hasNextBuilder(){
        return nextStateBuilder!=null;
    }
}
