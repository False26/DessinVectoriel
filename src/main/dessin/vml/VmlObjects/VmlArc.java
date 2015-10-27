package main.dessin.vml.VmlObjects;

import main.dessin.vml.Vml;
import main.dessin.vml.vmlTypes;
import main.dessin.writerXml.VmlWriter;
import main.objets.Crayon;


/**
 * Created by Amaury on 27/10/2015.
 */
public class VmlArc extends Vml {
    private static final VmlWriter vw = new VmlWriter(vmlTypes.ARC);
    private int startAngle;
    private int endAngle;


    public VmlArc(Crayon crayon, String header, String content, String footer, int startAngle, int endAngle) {
        super(crayon, header, footer);
        setHeader(vw.addHeader());
        setFooter(vw.addFooter());
        this.startAngle = startAngle;
        this.endAngle = endAngle;
    }


    public void addParameter (String parameterName, String parameterValue) {
        setContent(getContent()+vw.addParameter(parameterName,parameterValue));
    }


}
