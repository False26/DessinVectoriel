package objets.svgObjects;

import objets.Crayon;
import objets.interfaces.IBezier;
import objets.interfaces.IChemin;
import objets.interfaces.IPoint;
import objets.interfaces.Objet;

import java.awt.*;

/**
 * Created by Vic on 26/10/2015.
 */
public class BezierSVG implements IBezier {

    private SegmentSVG base;
    private PointSVG parametre;


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
