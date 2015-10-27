package main.dessin.writerXml;

/**
 * Created by Amaury on 27/10/2015.
 */
public interface Writer {

    public String addHeader ();

    public String addFooter ();

    public String addParameter (String parameterName, String parameterValue);

}
