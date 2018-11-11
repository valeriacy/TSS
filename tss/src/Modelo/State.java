package Modelo;

public class State {
    private String name;
    private String description;
    private boolean hasFailed;
    private boolean canFail;
    private int msDuration;

    public State(String name, String description, boolean hasFailed, boolean canFail, int msDuration) {
        this.name = name;
        this.description = description;
        this.hasFailed = hasFailed;
        this.canFail = canFail;
        this.msDuration = msDuration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isHasFailed() {
        return hasFailed;
    }

    public void setHasFailed(boolean hasFailed) {
        this.hasFailed = hasFailed;
    }

    public boolean isCanFail() {
        return canFail;
    }

    public void setCanFail(boolean canFail) {
        this.canFail = canFail;
    }

    public int getMsDuration() {
        return msDuration;
    }

    public void setMsDuration(int msDuration) {
        this.msDuration = msDuration;
    }
}
