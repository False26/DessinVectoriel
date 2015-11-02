package main.objets.vmlObjects;

import main.objets.Crayon;
import main.objets.interfaces.IArc;
import main.objets.interfaces.IChemin;
import main.objets.interfaces.ICircuit;
import main.objets.interfaces.IPoint;

import java.awt.*;

/**
 * Created by Amaury on 27/10/2015.
 */
public class ArcVML implements IArc {

    private int top;
    private int left;
    private int width;
    private int height;
    private int startAngle;
    private int endAngle;

    public ArcVML(int top, int left, int width, int height, int startAngle, int endAngle) {
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
        this.startAngle = startAngle;
        this.endAngle = endAngle;
    }

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public int getLeft() {
        return left;
    }

    public void setLeft(int left) {
        this.left = left;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getStartAngle() {
        return startAngle;
    }

    public void setStartAngle(int startAngle) {
        this.startAngle = startAngle;
    }

    public int getEndAngle() {
        return endAngle;
    }

    public void setEndAngle(int endAngle) {
        this.endAngle = endAngle;
    }


    @Override
    public String dessiner() {
        return null;
    }

    @Override
    public boolean inserer(ICircuit contenant) {
        return false;
    }

    @Override
    public String etiqueter(String s) {
        return null;
    }
}
