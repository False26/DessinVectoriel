package objets.interfaces;

import objets.Crayon;

import java.awt.*;

/**
 * Created by Amaury on 26/10/2015.
 */
public interface Objet {

    /**
     * remplit une forme g�om�trique
     * @param c la couleur
     * @param params les diff�rents param�tres � appliquer
     * @return true si la forme a �t� remplie, false sinon
     */
    public boolean remplir(Color c, String[] params);


    /**
     * On dessine un chemin dans l'objet
     * @param chemin peut �tre un arc, une courbe de b�zier, ...
     * @param crayon le crayon utilis�
     * @return true si le dessin a bien �t� effectu�, false sinon
     */
    public boolean dessiner(IChemin chemin, Crayon crayon);


    /**
     * On ins�re un objet dans un autre Objet
     * @param objet l'objet � ins�rer
     * @return true si l'ajout a bien �t� effectu�, false sinon
     */

    public boolean inserer(Objet objet);


    /**
     * On rajoute une �tiquette � l'objet
     * @param s le label de l'�tiquette
     * @param p le point sur lequel ajouter l'�tiquette
     * @return true si l'ajout a bien �t� effectu�, false sinon
     */
    public boolean etiqueter(String s, IPoint p);
}
