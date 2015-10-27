package objets.svgObjects;

import objets.interfaces.IBezier;

/**
 * Created by Vic on 26/10/2015.
 */
public class Bezier implements IBezier {

    private Segment base;
    private Point parametre;

    @Override
    public boolean remplir() {
        return false;
    }

    @Override
    public boolean dessiner() {
        return false;
    }

    @Override
    public boolean inserer() {
        return false;
    }

    @Override
    public boolean etiqueter() {
        return false;
    }
}
