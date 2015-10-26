package dessin.svg;

import objets.Crayon;

/**
 * Created by Amaury on 26/10/2015.
 */
public class Svg {

    private String header;
    private String content;
    private String footer;
    private Crayon crayon;


    /*Example :

    <svg height="100" width="100">
  <circle cx="50" cy="50" r="40" stroke="black" stroke-width="3" fill="red" />
</svg>

     */

    public Svg(int height, int width){
        this.header = "<svg height="+height+" width="+width+"> \n ";
        this.content = "";
        this.footer = "</svg>";

    }

    public void ajouter (String s){
        this.content += s + "\n";
    }


}
