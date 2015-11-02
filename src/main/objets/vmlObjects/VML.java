package main.objets.vmlObjects;

/**
 * Created by Amaury on 02/11/2015.
 */
public class VML {

    private String type;
    private String header;
    private String content;
    private String footer;

    public VML(String type){
        this.type = type;
        header =  "<v:"+type+" ";
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
