package Four;

public class Cykel {
    private String mærke;
    private String farve;
    private double pris;

    public Cykel(String mærke, String farve, double pris) {
        this.mærke = mærke;
        this.farve = farve;
        this.pris = pris;
    }

    public double getPris() {
        return pris;
    }
}
