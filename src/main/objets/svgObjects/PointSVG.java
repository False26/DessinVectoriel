package main.objets.svgObjects;

import main.objets.interfaces.IPoint;

/**
 * Created by Vic on 26/10/2015.
 */
public class PointSVG implements IPoint, ISVG {
    private double abscisse;
    private double ordonnee;

    public PointSVG(double abscisse, double ordonnee) {
        this.abscisse = abscisse;
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

    @Override
    public SVG creation() {
        return null;
    }
}
