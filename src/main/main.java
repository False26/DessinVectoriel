package main;

import main.objets.Crayon;
import main.objets.interfaces.IChemin;
import main.objets.svgObjects.CercleSVG;
import main.objets.svgObjects.PointSVG;
import main.objets.svgObjects.SegmentSVG;

/**
 * Created by Vic on 27/10/2015.
 */
public class main {


    public static void main(String[] args) {
        // Importer un fichier .txt qui contient les instructions
        // Appeler le parser
        // Le parser détermine si on veut du SVG ou VML ou les deux et renvoie un objet du type :
        /*
        IChemin[] chemins =  { new CercleSVG(new PointSVG(0, 0), 40) , new SegmentSVG(new PointSVG(0,0), new PointSVG(20,20))};
        for(IChemin c : chemins){
            c.dessiner();

            //si c'est pas un chemin mais un crayon on a Crayon.CRAYON = c;
*/

    }

}
