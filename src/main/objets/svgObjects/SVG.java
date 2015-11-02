package main.objets.svgObjects;

/**
 * Created by Vic on 02/11/2015.
 */
public class SVG {

    private String type;
    private String header;
    private String content;
    private String footer;

    public SVG(String type){
        this.type = type;
        header =  "<"+type+" ";
        content="";
        footer =  " />";
    }

    public void addAttribute(String name, String value){
        content += name+" = \""+value+"\" ";
    }

    public String toString(){
        return header+content+footer;
    }

}
