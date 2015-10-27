package main.dessin.vml.vmlObjectsOutput;

import main.dessin.vml.Vml;
import main.dessin.vml.vmlTypes;
import main.dessin.writerXml.VmlWriter;
import main.objets.Crayon;
import main.objets.vmlObjects.ArcVML;

import java.util.ArrayList;


/**
 * Created by Amaury on 27/10/2015.
 */
public class VmlArcOutput {
    private static final VmlWriter vw = new VmlWriter(vmlTypes.ARC);
    private ArcVML arcVml;
    private ArrayList<String> parameterNames;
    private ArrayList<String> parameterValues;


    public VmlArcOutput(ArcVML arcVml) {
        this.arcVml = arcVml;
        this.parameterNames = new ArrayList<String>();
        this.parameterValues = new ArrayList<String>();
    }

    public void addParameter (String parameterName, String parameterValue) {
        parameterNames.add(parameterName);
        parameterValues.add(parameterValue);
    }

    public String generateOutput () {
        String s = vw.addHeader();
        for (int i=0; i<parameterNames.size() ; i++) {
            s+=vw.addParameter(parameterNames.get(i),parameterValues.get(i));
        }
        s+=vw.addFooter();
        return s;
    }


}
