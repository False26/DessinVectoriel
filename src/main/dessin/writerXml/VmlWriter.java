package main.dessin.writerXml;

import main.dessin.vml.vmlTypes;

/**
 * Created by Amaury on 27/10/2015.
 */
public class VmlWriter implements Writer {
    private vmlTypes vmlType;

    public VmlWriter (vmlTypes vmlType) {
        this.vmlType = vmlType;
    }

    @Override
    public String addHeader() {
        return "<v:"+vmlType.name()+"\n";
    }

    @Override
    public String addFooter() {
        return ">\n" +
                "<v:\""+vmlType.name()+">";
    }

    @Override
    public String addParameter(String parameterName, String parameterValue) {
        return parameterName + "=\""+parameterValue+"\"";
    }
}
