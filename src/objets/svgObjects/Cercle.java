package objets.svgObjects;

import objets.interfaces.ICercle;

/**
 * Created by Vic on 26/10/2015.
 */
public class Cercle implements ICercle {
    private Point centre;
    private double rayon;

    public Cercle(Point centre, double rayon) {
        this.centre = centre;
        this.rayon = rayon;
    }

    public Point getCentre() {
        return centre;
    }

    public void setCentre(Point centre) {
        this.centre = centre;
    }

    public double getRayon() {
        return rayon;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
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
