public class Jablko extends Rostlina{

    public Jablko() {
        super("Jablko", 1.0, 2.0, 0.7);
    }

    @Override
    public void zavlažit() {
        this.sanceNaRust += 1;
    }
}
