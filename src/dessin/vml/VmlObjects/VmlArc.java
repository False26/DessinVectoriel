package dessin.vml.VmlObjects;

import dessin.vml.Vml;
import dessin.vml.vmlTypes;
import objets.Crayon;
import objets.Objet;

/**
 * Created by Amaury on 27/10/2015.
 */
public class VmlArc extends Vml {
    private int top;
    private int left;
    private int width;
    private int height;
    private int startAngle;
    private int endAngle;


    public VmlArc (Crayon crayon, int top, int left, int width, int height, int startAngle, int endAngle) {
        super(crayon);
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
        this.startAngle = startAngle;
        this.endAngle = endAngle;
    }

    @Override
    public String convertir(Objet o) {

        return "<v:"+ vmlTypes.ARC.name()+"\n" +
                "style=\"top="+top+";left:"+left+";width:"+width+";height:"+200+"\"\n"+
                "startangle=\""+startAngle+"\" endangle=\""+endAngle+"\">\n"+
                "</v:"+vmlTypes.ARC.name()+">";
    }
}
