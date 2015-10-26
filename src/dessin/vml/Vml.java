package dessin.vml;

import objets.Crayon;
import objets.Objet;

import java.io.File;

/**
 * Created by Amaury on 26/10/2015.
 */
public class Vml {
    private String header;
    private String content;
    private String footer;
    private Crayon crayon;


    public File creerFichier () {
        File f = new File("./output.vml");

        return f;
    }
}
