package dessin.vml;

/**
 * Created by Amaury on 26/10/2015.
 */
public enum vmlTypes {

    RECTANGLE("rect"),

    LIGNE("line");

    private String type = "";

    vmlTypes(String type) {
        this.type = type;
    }

    public String toString(){
        return type;
    }

}
