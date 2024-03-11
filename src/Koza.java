public class Koza extends Zvire {
    public Koza(String jmeno, String velikost, String specialniPec) {
        super("Koza", jmeno, velikost, specialniPec);
    }

    @Override
    public void hladit() {
        System.out.println("Koza " + jmeno + " byla pohlazena");
    }
}
