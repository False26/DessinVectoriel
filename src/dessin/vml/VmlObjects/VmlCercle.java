package dessin.vml.VmlObjects;

import dessin.vml.Vml;
import dessin.vml.vmlTypes;
import objets.Crayon;

/**
 * Created by Amaury on 27/10/2015.
 */
public class VmlCercle extends Vml {

    public VmlCercle(int top, int left, int height, int width, Crayon crayon) {
        super(top, left, height, width, crayon);
    }

    public String vmlScript () {
        return "<v:"+ vmlTypes.CERCLE+"\n"+
                "style=\"top:"+getTop()+";left:"+getLeft()+";width:"+getWidth()+";height:"+getHeight()+"\"\n" +
                "</v:"+ vmlTypes.CERCLE+">";
    }
}
