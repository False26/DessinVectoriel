package main.objets.svgObjects;

import main.objets.interfaces.IPoint;

/**
 * Created by Vic on 26/10/2015.
 */
public class PointSVG implements IPoint {
    private double abscisse;
    private double ordonnee;

    public PointSVG(double ascisse, double ordonnee) {
        this.abscisse = ascisse;
        this.ordonnee = ordonnee;
    }

    public double getAbscisse() {
        return abscisse;
    }

    public void setAbscisse(double abscisse) {
        this.abscisse = abscisse;
    }

    public double getOrdonnee() {
        return ordonnee;
    }

    public void setOrdonnee(double ordonnee) {
        this.ordonnee = ordonnee;
    }

}
