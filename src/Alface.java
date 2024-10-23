public class Alface extends HamburguerDecorator {

    public Alface(Hamburguer hamburguer) {
        super(hamburguer);
    }

    @Override
    public float getPreco() {
        return super.getPreco() + 1.0f;
    }
}
