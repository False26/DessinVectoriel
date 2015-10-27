package main.dessin.vml;


import main.objets.Crayon;

import java.io.File;

/**
 * Created by Amaury on 26/10/2015.
 */
public class Vml {
    private Crayon crayon;
    private String header;
    private String content;
    private String footer;

    public Vml(Crayon crayon, String header, String footer) {
        this.crayon = crayon;
        this.header = header;
        this.content = "";
        this.footer = footer;
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
