public abstract class Rostlina {
    protected String nazev;
    protected double cena;
    protected double potrebnaPlocha;
    protected double sanceNaRust;
    public Rostlina(String nazev, double cena, double potrebnaPlocha, double sanceNaRust) {
        this.nazev = nazev;
        this.cena = cena;
        this.potrebnaPlocha = potrebnaPlocha;
        this.sanceNaRust = sanceNaRust;
    }
    public abstract void zavlažit();

}
