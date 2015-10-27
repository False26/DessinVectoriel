package objets.svgObjects;

import objets.Crayon;
import objets.interfaces.ICercle;
import objets.interfaces.IChemin;
import objets.interfaces.IPoint;
import objets.interfaces.Objet;

import java.awt.*;

/**
 * Created by Vic on 26/10/2015.
 */
public class CercleSVG implements ICercle {
    private PointSVG centre;
    private double rayon;

    public CercleSVG(PointSVG centre, double rayon) {
        this.centre = centre;
        this.rayon = rayon;
    }

    public PointSVG getCentre() {
        return centre;
    }

    public void setCentre(PointSVG centre) {
        this.centre = centre;
    }

    public double getRayon() {
        return rayon;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }


    @Override
    public boolean remplir(Color c, String[] params) {
        return false;
    }

    @Override
    public boolean dessiner(IChemin chemin, Crayon crayon) {
        return false;
    }

    @Override
    public boolean inserer(Objet objet) {
        return false;
    }

    @Override
    public boolean etiqueter(String s, IPoint p) {
        return false;
    }
}
