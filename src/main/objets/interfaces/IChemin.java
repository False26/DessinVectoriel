package main.objets.interfaces;

import main.objets.Crayon;

/**
 * Created by Amaury on 27/10/2015.
 */
public interface IChemin {


    /**
     * Ajoute le chemin dans le fichier de sortie
     * @return true si l'ajout a bien �t� effectu�, false sinon
     */
    public String dessiner();


    /**
     * Insere le chemin le circuit en argument
     * @param contenant
     * @return si l'ajout a bien �t� effectu�, false sinon
     */
    public boolean inserer(ICircuit contenant);


    /**
     * Etiquette le chemin au centre
     * @param s
     * @return true si l'ajout a bien �t� effectu�, false sinon
     */
    public String etiqueter(String s);
}
