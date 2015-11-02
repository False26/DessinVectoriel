package main.objets.svgObjects;

import main.objets.Crayon;
import main.objets.interfaces.ICercle;
import main.objets.interfaces.IChemin;
import main.objets.interfaces.ICircuit;
import main.objets.interfaces.IPoint;

import java.awt.*;

/**
 * Created by Vic on 26/10/2015.
 */
public class CercleSVG implements ICercle, ISVG {
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
    public String remplir() {

        SVG cercle = this.creation();
        cercle.addAttribute("fill", "red");

        return null;
    }

    @Override
    public String dessiner() {


        return this.creation().toString();
    }

    public SVG creation() {

        SVG cercle = new SVG("circle");
        cercle.addAttribute("cx", String.valueOf(this.centre.getAbscisse()));
        cercle.addAttribute("cy", String.valueOf(this.centre.getOrdonnee()));
        cercle.addAttribute("r", String.valueOf(this.getRayon()));

        return cercle;
    }

    @Override
    public boolean inserer(ICircuit contenant) {
        return false;
    }

    @Override
    public String etiqueter(String s) {
        return null;
    }


    public static void main(String[] args) {

        PointSVG point = new PointSVG(5,5);


        CercleSVG a = new CercleSVG(point,2);

        System.out.println(a.dessiner());

    }

}