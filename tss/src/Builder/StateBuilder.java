package Builder;

import Modelo.State;

/**
 * Created by Jp on 11/11/2018.
 */
public interface StateBuilder {

    StateBuilder nextStateBuilder();

    State buildState();

    boolean hasNextBuilder();
}
