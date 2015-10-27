package main.objets.svgObjects;

import main.objets.Crayon;
import main.objets.interfaces.IChemin;
import main.objets.interfaces.IPoint;

import java.awt.*;

/**
 * Created by Vic on 26/10/2015.
 */
public class PointSVG implements IPoint {
    private double ascisse;
    private double ordonnee;

    public PointSVG(double ascisse, double ordonnee) {
        this.ascisse = ascisse;
        this.ordonnee = ordonnee;
    }

    public double getAscisse() {
        return ascisse;
    }

    public void setAscisse(double ascisse) {
        this.ascisse = ascisse;
    }

    public double getOrdonnee() {
        return ordonnee;
    }

    public void setOrdonnee(double ordonnee) {
        this.ordonnee = ordonnee;
    }

}
