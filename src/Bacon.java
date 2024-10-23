public class Bacon extends HamburguerDecorator {

    public Bacon(Hamburguer hamburguer) {
        super(hamburguer);
    }

    @Override
    public float getPreco() {
        return super.getPreco() + 3.0f;
    }
}
