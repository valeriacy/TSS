package Modelo;

public class State {
    private String name;
    private String description;
    private boolean hasFailed;
    private int msDuration;

    public State(String name, String description, boolean hasFailed, int msDuration) {
        this.name = name;
        this.description = description;
        this.hasFailed = hasFailed;
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

    public int getMsDuration() {
        return msDuration;
    }

    public void setMsDuration(int msDuration) {
        this.msDuration = msDuration;
    }

    private int msToDays(){
        return msDuration/10;
    }

    @Override
    public String toString(){
        String output=description+"\n este estado duro: ";
        int days=msToDays();
        if(days>0){
            output+=days+" dia(s)";
        }else {
            output+=" algunas horas";
        }
        return output;
    }
}
