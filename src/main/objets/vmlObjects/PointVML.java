package main.objets.vmlObjects;

import main.objets.Crayon;
import main.objets.interfaces.IChemin;
import main.objets.interfaces.IPoint;
import main.objets.svgObjects.ISVG;
import main.objets.svgObjects.SVG;

import java.awt.*;

/**
 * Created by Amaury on 27/10/2015.
 */
public class PointVML implements IPoint, ISVG {

    private double abscisse;
    private double ordonnee;

    public PointVML(double abscisse, double ordonnee) {
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
