package main.dessin.svg;

import main.dessin.Dessin;
import main.objets.svgObjects.CercleSVG;
import main.objets.Crayon;
import main.objets.interfaces.Objet;

/**
 * Created by Amaury on 26/10/2015.
 */
public class Svg implements Dessin{

    private String header;
    private String content;
    private String footer;
    private Crayon crayon;


    /*Example :

    <svg height="100" width="100">
  <circle cx="50" cy="50" r="40" stroke="black" stroke-width="3" fill="red" />
</svg>

     */

    public Svg(int height, int width){
        this.header = "<svg height="+height+" width="+width+"> \n ";
        this.content = "";
        this.footer = "</svg>";

    }

    public void ajouter (String s){
        this.content += s + "\n";
    }

    @Override
    public String convertir(Objet o) {
        //TODO : switchCase

        if(o instanceof CercleSVG){
            return "<circle cx="+((CercleSVG) o).getCentre().getAscisse()
                    +" cy="+((CercleSVG) o).getCentre().getOrdonnee()
                    +" r="+((CercleSVG) o).getRayon()+" />";
        }

        return null;
    }


    @Override
    public void interpreter(Objet[] objets) {
        //TODO : for o in objets, convertir, ou changerCrayon selon la nature

    }

    @Override
    public void changerCrayon(Crayon c) {
        this.crayon = c;
    }


}
