package Builder;

import Modelo.Process;
import Modelo.ProcessConstructor;
import Modelo.State;
import Modelo.StatesNames;

/**
 * Created by Jp on 11/11/2018.
 */
public class RandomProcessBuilder implements ProcessConstructor {

    public Process generateProcess(StatesNames initialState){
        Process process=new Process();
        StateBuilder builder=InitialStateFactory.getInitialState(initialState);
        while (builder!=null){
            State generatedState=builder.buildState();
            process.addState(generatedState);
            builder=builder.nextStateBuilder();
        }
        return process;
    }
}