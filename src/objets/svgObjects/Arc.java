package objets.svgObjects;

import objets.interfaces.IArc;

/**
 * Created by Vic on 26/10/2015.
 */
public class Arc implements IArc {

    private Cercle cercle;
    private double angle1;
    private double angle2;
    private boolean clockwise;

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
