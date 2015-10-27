package main.objets.interfaces;

import main.objets.Crayon;

import java.awt.*;

/**
 * Created by Amaury on 26/10/2015.
 */
public interface Objet {

    /**
     * remplit une forme géométrique
     * @param c la couleur
     * @param params les différents paramètres à appliquer
     * @return true si la forme a été remplie, false sinon
     */
    public boolean remplir(Color c, String[] params);


    /**
     * On dessine un chemin dans l'objet
     * @param chemin peut être un arc, une courbe de bézier, ...
     * @param crayon le crayon utilisé
     * @return true si le dessin a bien été effectué, false sinon
     */
    public boolean dessiner(IChemin chemin, Crayon crayon);


    /**
     * On insère un objet dans un autre Objet
     * @param objet l'objet à insérer
     * @return true si l'ajout a bien été effectué, false sinon
     */

    public boolean inserer(Objet objet);


    /**
     * On rajoute une étiquette à l'objet
     * @param s le label de l'étiquette
     * @param p le point sur lequel ajouter l'étiquette
     * @return true si l'ajout a bien été effectué, false sinon
     */
    public boolean etiqueter(String s, IPoint p);
}
