public class Kralik extends Zvire {
    public Kralik(String jmeno, String velikost, String specialniPec) {
        super("Kralik", jmeno, velikost, specialniPec);
    }

    @Override
    public void hladit() {
        System.out.println("Kralik " + jmeno + " byl pohlažen.");
    }

}
