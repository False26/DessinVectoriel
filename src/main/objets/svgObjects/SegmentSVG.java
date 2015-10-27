package main.objets.svgObjects;

import main.objets.Crayon;
import main.objets.interfaces.IChemin;
import main.objets.interfaces.IPoint;
import main.objets.interfaces.ISegment;

import java.awt.*;

/**
 * Created by Vic on 26/10/2015.
 */
public class SegmentSVG implements ISegment {
    private PointSVG point;

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
