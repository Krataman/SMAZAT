public class Main {
    public static void main(String[] args) {
        Farmar farmar = new Farmar();
        farmar.pridatRostlinu(new Jablko());
        farmar.pridatRostlinu(new Mrkev());
        farmar.pridatRostlinu(new Jablko());
        farmar.pridatZvire(new Koza("Farad", "velká", "žádná"));
        farmar.pridatZvire(new Kralik("Minit", "malá", "žádná"));

        farmar.nakupPozemek(1000.0, 10.0);
        farmar.prodejPozemek(new Pozemek(5.0));

        farmar.rozsirStodolu();
        farmar.kupMistoVeStodole(500.0);
    }
    }