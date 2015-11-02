package main.objets.vmlObjects;

import main.objets.Crayon;
import main.objets.interfaces.IChemin;
import main.objets.interfaces.ICircuit;
import main.objets.interfaces.IPoint;
import main.objets.interfaces.ISegment;

import java.awt.*;

/**
 * Created by Amaury on 27/10/2015.
 */
public class SegmentVML implements ISegment, IVML {
    private PointVML depart;
    private PointVML fin;

    public SegmentVML(PointVML depart, PointVML fin) {
        this.depart = depart;
        this.fin = fin;
    }

    @Override
    public String dessiner() {
        return this.creation().toString();
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
    public VML creation() {
        VML vml = new VML("line");
        vml.addAttribute("from",""+this.getDepart().getAbscisse()+","+this.getFin().getOrdonnee());
        vml.addAttribute("to",""+this.getDepart().getOrdonnee()+","+this.getFin().getOrdonnee());
        return vml;
    }

    public PointVML getDepart() {
        return depart;
    }

    public void setDepart(PointVML depart) {
        this.depart = depart;
    }

    public PointVML getFin() {
        return fin;
    }

    public void setFin(PointVML fin) {
        this.fin = fin;
    }

    public static void main(String[] args) {
        PointVML depart = new PointVML(10,10);
        PointVML fin = new PointVML(100,100);

        SegmentVML segment = new SegmentVML(depart,fin);
        System.out.println(segment.dessiner());
    }

}
