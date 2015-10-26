package dessin.vml;

/**
 * Created by Amaury on 26/10/2015.
 */
public enum vmlTypes {

    RECTANGLE("rect"),
    ARC("arc"),
    // pour un cercle, faire un arc allant de 0 à 360°
    CERCLE("arc"),
    BEZIER("curve"),
    LIGNE("line");

    private String type = "";

    vmlTypes(String type) {
        this.type = type;
    }

    public String toString(){
        return type;
    }

}
