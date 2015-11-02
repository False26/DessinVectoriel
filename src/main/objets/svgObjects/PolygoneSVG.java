package main.objets.svgObjects;

import main.objets.Crayon;
import main.objets.interfaces.IChemin;
import main.objets.interfaces.ICircuit;
import main.objets.interfaces.IPoint;
import main.objets.interfaces.IPolygone;

import java.awt.*;

/**
 * Created by Vic on 26/10/2015.
 */
public class PolygoneSVG implements IPolygone, ISVG  {

    private PointSVG[] points;


    @Override
    public String remplir() {
        return null;
    }

    @Override
    public String dessiner() {
        return null;
    }


    @Override
    public boolean inserer(ICircuit contenant) {
        return false;
    }

    @Override
    public String etiqueter(String s) {
        return null;
    }

    @Override
    public SVG creation() {


        SVG polygone = new SVG("path");
        boolean first = true;
        String value = "";
        for(PointSVG p : this.points){

            if(first){
                value += "M ";
                first = false;
            }
            else{
                value += "L ";
            }

            value += p.getAbscisse()+" "+p.getOrdonnee()+" ";

        }
        value+="Z ";
        polygone.addAttribute("d",value);
        return polygone;
    }
}
