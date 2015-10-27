package main.dessin.vml;


import main.dessin.Dessin;
import main.dessin.writerXml.VmlWriter;
import main.objets.Crayon;
import main.objets.interfaces.Objet;

import java.io.File;

/**
 * Created by Amaury on 26/10/2015.
 */
public class Vml implements Dessin {
    private Crayon crayon;
    private String header;
    private String content;
    private String footer;
    private static final VmlWriter vw = new VmlWriter();

    public Vml(Crayon crayon) {
        this.crayon = crayon;
        this.header = "<style>v\\: * { behavior:url(#default#VML); display:inline-block }</style>"+
            "<xml:namespace ns=\"urn:schemas-microsoft-com:vml\" prefix=\"v\" />";
        this.content = "";
    }

    public void addParameter (String parameterName, String parameterValue) {
        setContent(getContent()+vw.addParameter(parameterName,parameterValue));
    }

    @Override
    public void ajouter(String s) {
        setContent(getContent()+s+"\n");
    }

    @Override
    public String convertir(Objet o) {
        return null;
    }

    @Override
    public void interpreter(Objet[] objets) {

    }

    @Override
    public void changerCrayon(Crayon c) {

    }

    public void setCrayon(Crayon crayon) {
        this.crayon = crayon;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setFooter(String footer) {
        this.footer = footer;
    }

    public String getHeader() {
        return header;
    }

    public String getContent() {
        return content;
    }

    public String getFooter() {
        return footer;
    }

    public Crayon getCrayon() {
        return crayon;
    }


}
