public class Noodle {
    private double lengthInCentimeters;
    private double widthInCentimeters;
    private String shape;
    protected String ingredients;
    protected String texture = "brittle";

    Noodle(double lenInCent, double wthInCent, String shp, String ingr) {
        this.lengthInCentimeters = lenInCent;
        this.widthInCentimeters = wthInCent;
        this.shape = shp;
        this.ingredients = ingr;
    }

    final public boolean isTasty() {
        return true;
    }

    public void cook() {
        System.out.println("Boiling.");
        this.texture = "cooked";
    }

    public static void main(String[] args) {
        Ramen yasaiRamen = new Ramen();
        System.out.println(yasaiRamen.isTasty());

        Noodle kaesespaetzle = new Spaetzle();
        kaesespaetzle.cook();
    }

}