package main.objets.svgObjects;

import main.objets.Crayon;
import main.objets.interfaces.IChemin;
import main.objets.interfaces.ICircuit;
import main.objets.interfaces.IPoint;
import main.objets.interfaces.ISegment;

import java.awt.*;

/**
 * Created by Vic on 26/10/2015.
 */
public class SegmentSVG implements ISegment, ISVG {
    private PointSVG pointA;
    private PointSVG pointB;



    public PointSVG getPointB() {
        return pointB;
    }

    public void setPointB(PointSVG pointB) {
        this.pointB = pointB;
    }

    public PointSVG getPointA() {
        return pointA;
    }

    public void setPointA(PointSVG pointA) {
        this.pointA = pointA;
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
        SVG segment = new SVG("path");
        String value = "M "+this.getPointA().getAbscisse()+" "+
                this.getPointA().getOrdonnee()+ "L "+
                this.getPointB().getAbscisse()+ " "+
                this.getPointB().getOrdonnee();
        segment.addAttribute("d", value);

        return segment;
    }
}
