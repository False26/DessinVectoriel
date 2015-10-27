package main.objets.svgObjects;

import main.objets.Crayon;
import main.objets.interfaces.IChemin;
import main.objets.interfaces.IPoint;
import main.objets.interfaces.Objet;

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
