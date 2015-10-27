package dessin.vml.VmlObjects;

import dessin.vml.Vml;
import dessin.vml.vmlTypes;
import objets.Crayon;
import objets.interfaces.Objet;


/**
 * Created by Amaury on 27/10/2015.
 */
public class VmlArc extends Vml {
    private int startAngle;
    private int endAngle;


    public VmlArc (Crayon crayon, int top, int left, int width, int height, int startAngle, int endAngle) {
        super(top,left,height,width,crayon);
        this.startAngle = startAngle;
        this.endAngle = endAngle;
    }

    public String vmlScript () {
        return "<v:"+vmlTypes.ARC.name()+"\n" +
                "style=\"top:"+getTop()+";left:"+getLeft()+";width:"+getWidth()+";height:"+getHeight()+"\"\n" +
                "startangle=\""+startAngle+"\" endangle=\""+endAngle+"\">\n" +
                "</v:"+vmlTypes.ARC.name()+">";
    }


}
