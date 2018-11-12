package Builder;

import Modelo.Process;
import Modelo.ProcessBuilder;
import Modelo.State;
import Modelo.StatesNames;

/**
 * Created by Jp on 11/11/2018.
 */
public class RandomProcessBuilder implements ProcessBuilder{

    public Process generateProcess(StatesNames initialState){
        Process process=new Process();
        StateBuilder builder=InitialStateFactory.getInitialState(initialState);
        while (builder.hasNextBuilder()){
            State generatedState=builder.buildState();
            process.addState(generatedState);
            builder=builder.nextStateBuilder();
        }
        return process;
    }
}