package dessin.vml;

import dessin.Dessin;
import objets.Crayon;
import objets.Objet;

import java.io.File;

/**
 * Created by Amaury on 26/10/2015.
 */
public abstract class Vml implements Dessin {
    private Crayon crayon;


    public File creerFichier () {
        File f = new File("./output.vml");

        return f;
    }


    @Override
    public void changerCrayon(Crayon c) {
        this.crayon = c;
    }
}
