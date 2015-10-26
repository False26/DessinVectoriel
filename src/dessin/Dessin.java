package dessin;

import objets.Crayon;
import objets.Objet;

/**
 * Created by Vic on 26/10/2015.
 */
public interface Dessin {

    /**
     * Ajoute du XML en fin de fichier, juste avvant le footer
     * @param s le morceau de xml à ajouter
     */
    public void ajouter(String s);

    /**
     * Convertit un Objet en XML
     * @param o
     * @return
     */
    public String convertir(Objet o);


    public void interpreter(Objet[] objets);
    public void changerCrayon(Crayon c);

}
