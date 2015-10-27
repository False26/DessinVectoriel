package dessin;

import objets.Crayon;
import objets.interfaces.Objet;

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

    /**
     * Traite les objets un par un.
     * @param objets un array d'objets
     */
    public void interpreter(Objet[] objets);

    /**
     * Change le crayon servant à dessiner
     * @param c
     */
    public void changerCrayon(Crayon c);

}
