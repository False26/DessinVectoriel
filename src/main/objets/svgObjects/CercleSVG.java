package main.objets.svgObjects;

import main.objets.Crayon;
import main.objets.interfaces.ICercle;
import main.objets.interfaces.IChemin;
import main.objets.interfaces.IPoint;
import main.objets.interfaces.Objet;

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
