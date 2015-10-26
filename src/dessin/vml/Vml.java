package dessin.vml;

import dessin.Dessin;
import objets.Crayon;
import objets.Objet;

import java.io.File;

/**
 * Created by Amaury on 26/10/2015.
 */
public class Vml implements Dessin {
    private String header;
    private String content;
    private String footer;
    private Crayon crayon;


    /*
    Example rectangle :
        <v:rect style='width:100pt;height:75pt' fillcolor="blue"
        strokecolor="red" strokeweight="3.5pt"/>


     */

    public Vml () {
    }


    public File creerFichier () {
        File f = new File("./output.vml");

        return f;
    }

    @Override
    public void ajouter(String s) {
        this.content += s + "\n";
    }

    @Override
    public String convertir(Objet o) {
        return null;
    }

    @Override
    public void interpreter(Objet[] objets) {

    }

    @Override
    public void changerCrayon(Crayon c) {
        this.crayon = c;
    }
}
