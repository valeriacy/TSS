package Builder;

import Modelo.StatesNames;
import StatesBuilder.FelcvBuilder;
import StatesBuilder.MinisterioPublicoBuilder;

/**
 * Created by Jp on 11/11/2018.
 */
public class InitialStateFactory {

    public static StateBuilder getInitialState(StatesNames stateName){
        if(stateName== StatesNames.FELCV){
            return new FelcvBuilder();
        }
        else{
            return new MinisterioPublicoBuilder();
        }
    }
}
