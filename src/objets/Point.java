package objets;

/**
 * Created by Vic on 26/10/2015.
 */
public class Point {
    private double ascisse;
    private double ordonnee;

    public Point(double ascisse, double ordonnee) {
        this.ascisse = ascisse;
        this.ordonnee = ordonnee;
    }

    public double getAscisse() {
        return ascisse;
    }

    public void setAscisse(double ascisse) {
        this.ascisse = ascisse;
    }

    public double getOrdonnee() {
        return ordonnee;
    }

    public void setOrdonnee(double ordonnee) {
        this.ordonnee = ordonnee;
    }
}
