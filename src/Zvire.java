public abstract class Zvire {
    protected String druh;
    protected String jmeno;
    protected String velikost;
    protected String specialniPec;

    public Zvire(String druh, String jmeno, String velikost, String specialniPec) {
        this.druh = druh;
        this.jmeno = jmeno;
        this.velikost = velikost;
        this.specialniPec = specialniPec;
    }

    public abstract void hladit();

}
