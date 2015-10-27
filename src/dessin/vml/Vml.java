package dessin.vml;

import objets.Crayon;
import objets.interfaces.Objet;

import java.io.File;

/**
 * Created by Amaury on 26/10/2015.
 */
public class Vml {
    private Crayon crayon;
    private int top;
    private int left;
    private int height;
    private int width;

    public Vml(int top, int left, int height, int width, Crayon crayon) {
        this.top = top;
        this.left = left;
        this.height = height;
        this.width = width;
        this.crayon = crayon;
    }

    public Crayon getCrayon() {
        return crayon;
    }

    public int getTop() {
        return top;
    }

    public int getLeft() {
        return left;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public File creerFichier () {
        File f = new File("./output.vml");

        return f;
    }
}
