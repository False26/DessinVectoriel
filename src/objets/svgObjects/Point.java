package objets.svgObjects;

import objets.interfaces.IPoint;

/**
 * Created by Vic on 26/10/2015.
 */
public class Point implements IPoint {
    private double ascisse;
    private double ordonnee;

    public Point(double ascisse, double ordonnee) {
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

    @Override
    public boolean remplir() {
        return false;
    }

    @Override
    public boolean dessiner() {
        return false;
    }

    @Override
    public boolean inserer() {
        return false;
    }

    @Override
    public boolean etiqueter() {
        return false;
    }
}
