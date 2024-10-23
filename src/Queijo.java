public class Queijo extends HamburguerDecorator {

    public Queijo(Hamburguer hamburguer) {
        super(hamburguer);
    }

    @Override
    public float getPreco() {
        return super.getPreco() + 2.0f;
    }
}
