package main.objets.vmlObjects;

import main.objets.Crayon;
import main.objets.interfaces.IChemin;
import main.objets.interfaces.ICircuit;
import main.objets.interfaces.IPoint;
import main.objets.interfaces.ISegment;

import java.awt.*;

/**
 * Created by Amaury on 27/10/2015.
 */
public class SegmentVML implements ISegment {

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
