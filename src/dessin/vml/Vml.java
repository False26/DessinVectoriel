package dessin.vml;

import objets.interfaces.Objet;

import java.io.File;

/**
 * Created by Amaury on 26/10/2015.
 */
public class Vml {
    private Objet[] objets;


    public File creerFichier () {
        File f = new File("./output.vml");

        return f;
    }
}
