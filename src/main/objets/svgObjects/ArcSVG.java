package main.objets.svgObjects;

import main.objets.Crayon;
import main.objets.interfaces.IArc;
import main.objets.interfaces.IChemin;
import main.objets.interfaces.ICircuit;
import main.objets.interfaces.IPoint;

import java.awt.*;

/**
 * Created by Vic on 26/10/2015.
 */
public class ArcSVG implements IArc {

    private CercleSVG cercle;
    private double angle1;
    private double angle2;
    private boolean clockwise;


    @Override
    public String dessiner() {
        return null;
    }

    @Override
    public boolean inserer(ICircuit contenant) {
        return false;
    }

    @Override
    public String etiqueter(String s) {
        return null;
    }
}

