package Modelo;

/**
 * Created by Jp on 11/11/2018.
 */
public enum StatesNames {

    FELCV,
    MINISTERIO_PUBLICO,
    FISCALIA,
    INVESTIGACION,
    JUICIO,
    DICTAMEN;

    public String toString(StatesNames name){
        switch (name){
            case FELCV:
                return "FELCV";
            case MINISTERIO_PUBLICO:
                return "Ministerio Publico";
            case FISCALIA:
                return "Fiscalia";
            case INVESTIGACION:
                return "Investigacion";
            case JUICIO:
                return "Juicio";
            default :
                return "Dictamen";
        }
    }

    public StatesNames toStateName(String state){
        switch (state){
            case "FELCV":
                return FELCV;
            case "Ministerio Publico":
                return MINISTERIO_PUBLICO;
            case "Fiscalia":
                return FISCALIA;
            case "Investigacion":
                return INVESTIGACION;
            case "Juicio":
                return JUICIO;
            default:
            return DICTAMEN;
        }
    }
}

