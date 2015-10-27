package dessin.vml;

/**
 * Created by Amaury on 26/10/2015.
 */
public enum vmlTypes {

    ARC("arc"),
    RECTANGLE("rect"),
    BEZIER("curve"),

    // pour un cercle, faire un arc allant de 0 à 360°
    CERCLE("arc"),
    POLYGONE("polyline"),

    // pour une ligne, relier le dernier au premier point
    LIGNE("line")
    
    ;

    private String type = "";

    vmlTypes(String type) {
        this.type = type;
    }

    public String toString(){
        return type;
    }

}
