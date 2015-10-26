package dessin.eps;

import objets.Objet;

import java.io.File;

/**
 * Created by Amaury on 26/10/2015.
 */
public class Eps {
    private Objet[] objets;


    public File creerFichier () {
        File f = new File("./output.eps");

        return f;
    }
}
