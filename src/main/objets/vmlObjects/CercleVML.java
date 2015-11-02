package main.objets.vmlObjects;

import main.objets.Crayon;
import main.objets.interfaces.ICercle;
import main.objets.interfaces.IChemin;
import main.objets.interfaces.ICircuit;
import main.objets.interfaces.IPoint;

import java.awt.*;

/**
 * Created by Amaury on 27/10/2015.
 */
public class CercleVML implements ICercle {

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
