package main.objets;

import org.w3c.dom.css.RGBColor;

import java.awt.*;

/**
 * Created by Vic on 26/10/2015.
 */
public class Crayon {

    public Crayon CRAYON = new Crayon(888,2);

    private int width;
    private Color color;

    public Crayon(int rgb, int i) {
        this.color = new Color(rgb);
        this.width = i;

    }
}
