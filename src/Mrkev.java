public class Mrkev extends Rostlina {
    public Mrkev() {
        super("Mrkev", 0.5, 1.0, 0.8);
    }
    @Override
    public void zavlažit() {
        this.sanceNaRust += 1.1;
    }
}
