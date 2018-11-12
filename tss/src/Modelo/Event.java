
package Modelo;

import java.util.Date;
public class Event {
    private String description;
    private String locationDescription;
    private double latitude;
    private double longitude;
    private Date date;
    private Date delationDate;
    private Process process;

    public Event(String description, String locationDescription, Date date, Date delationDate, ProcessBuilder processBuilder, StatesNames initialState) {
        this.description = description;
        this.locationDescription = locationDescription;
        this.date = date;
        this.delationDate = delationDate;
        process=processBuilder.generateProcess(initialState);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocationDescription() {
        return locationDescription;
    }

    public void setLocationDescription(String locationDescription) {
        this.locationDescription = locationDescription;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDelationDate() {
        return delationDate;
    }

    public void setDelationDate(Date delationDate) {
        this.delationDate = delationDate;
    }

    public Process getProcess() {
        return process;
    }

    @Override
    public String toString(){
        String output="Description del evento: "+description+"\n";
        output+="Sucedio en: "+locationDescription+"\n";
        output+="El hecho ocurrio el "+date+"\n";
        output+="Se presento la denuncia el "+delationDate+"\n";
        output+="Descripcion del proceso:\n\n---------------------------- \n"+process;
        return output;
    }
}
