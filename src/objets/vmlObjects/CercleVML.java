package objets.vmlObjects;

import objets.Crayon;
import objets.interfaces.ICercle;
import objets.interfaces.IChemin;
import objets.interfaces.IPoint;
import objets.interfaces.Objet;

import java.awt.*;

/**
 * Created by Amaury on 27/10/2015.
 */
public class CercleVML implements ICercle {
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
