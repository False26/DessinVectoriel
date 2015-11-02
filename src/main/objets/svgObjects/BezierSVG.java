package main.objets.svgObjects;

import main.objets.Crayon;
import main.objets.interfaces.IBezier;
import main.objets.interfaces.IChemin;
import main.objets.interfaces.ICircuit;
import main.objets.interfaces.IPoint;

import java.awt.*;

/**
 * Created by Vic on 26/10/2015.
 */
public class BezierSVG implements IBezier, ISVG {

    private SegmentSVG base;
    private PointSVG parametre;


    @Override
    public String dessiner() {
        return this.creation().toString();
    }

    public SVG creation(){
        SVG bezier = new SVG("path");
        String value = "M "+
                this.base.getPointA().getAbscisse()+" "+
                this.base.getPointA().getOrdonnee()+" Q "+
                this.parametre.getAbscisse()+" "+
                this.parametre.getOrdonnee()+" "+
                this.base.getPointB().getAbscisse()+ " "+
                this.base.getPointB().getOrdonnee();
        bezier.addAttribute("d",value);

        return bezier;

    }

    @Override
    public boolean inserer(ICircuit contenant) {
        return false;
    }

    @Override
    public String etiqueter(String s) {
        return null;
    }
}
