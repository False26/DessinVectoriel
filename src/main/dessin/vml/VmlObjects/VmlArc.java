package main.dessin.vml.VmlObjects;

import main.dessin.vml.Vml;
import main.dessin.vml.vmlTypes;
import main.objets.Crayon;


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
        return "<v:"+ vmlTypes.ARC.name()+"\n" +
                "style=\"top:"+getTop()+";left:"+getLeft()+";width:"+getWidth()+";height:"+getHeight()+"\"\n" +
                "startangle=\""+startAngle+"\" endangle=\""+endAngle+"\">\n" +
                "</v:"+vmlTypes.ARC.name()+">";
    }


}
