package main.dessin.vml.VmlObjects;

import main.dessin.vml.Vml;
import main.objets.Crayon;


/**
 * Created by Amaury on 27/10/2015.
 */
public class VmlArc extends Vml {
    private int top;
    private int left;
    private int width;
    private int height;
    private int startAngle;
    private int endAngle;


    public VmlArc (Crayon crayon, int top, int left, int width, int height, int startAngle, int endAngle) {
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
        this.startAngle = startAngle;
        this.endAngle = endAngle;
    }


}
