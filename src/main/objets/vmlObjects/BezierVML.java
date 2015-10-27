package main.objets.vmlObjects;

import main.objets.Crayon;
import main.objets.interfaces.IBezier;
import main.objets.interfaces.IChemin;
import main.objets.interfaces.IPoint;

import java.awt.*;

/**
 * Created by Amaury on 27/10/2015.
 */
public class BezierVML implements IBezier {
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
