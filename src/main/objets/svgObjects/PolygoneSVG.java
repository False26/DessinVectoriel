package main.objets.svgObjects;

import main.objets.Crayon;
import main.objets.interfaces.IChemin;
import main.objets.interfaces.ICircuit;
import main.objets.interfaces.IPoint;
import main.objets.interfaces.IPolygone;

import java.awt.*;

/**
 * Created by Vic on 26/10/2015.
 */
public class PolygoneSVG implements IPolygone  {

    private PointSVG[] points;


    @Override
    public String remplir() {
        return null;
    }

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
