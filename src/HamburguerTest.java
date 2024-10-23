import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class HamburguerTest {

    @Test
    void deveRetornarPrecoHamburguerSimples() {
        Hamburguer hamburguer = new HamburguerSimples();

        assertEquals(10.0f, hamburguer.getPreco());
    }

    @Test
    void deveRetornarPrecoHamburguerComQueijo() {
        Hamburguer hamburguer = new HamburguerSimples();
        hamburguer = new Queijo(hamburguer);

        assertEquals(12.0f, hamburguer.getPreco());
    }

    @Test
    void deveRetornarPrecoHamburguerComBacon() {
        Hamburguer hamburguer = new HamburguerSimples();
        hamburguer = new Bacon(hamburguer);

        assertEquals(13.0f, hamburguer.getPreco());
    }

    @Test
    void deveRetornarPrecoHamburguerComAlface() {
        Hamburguer hamburguer = new HamburguerSimples();
        hamburguer = new Alface(hamburguer);

        assertEquals(11.0f, hamburguer.getPreco());
    }

    @Test
    void deveRetornarPrecoHamburguerComQueijoEBacon() {
        Hamburguer hamburguer = new HamburguerSimples();
        hamburguer = new Queijo(hamburguer);
        hamburguer = new Bacon(hamburguer);

        assertEquals(15.0f, hamburguer.getPreco());
    }

    @Test
    void deveRetornarPrecoHamburguerComQueijoEAlface() {
        Hamburguer hamburguer = new HamburguerSimples();
        hamburguer = new Queijo(hamburguer);
        hamburguer = new Alface(hamburguer);

        assertEquals(13.0f, hamburguer.getPreco());
    }

    @Test
    void deveRetornarPrecoHamburguerComBaconEAlface() {
        Hamburguer hamburguer = new HamburguerSimples();
        hamburguer = new Bacon(hamburguer);
        hamburguer = new Alface(hamburguer);

        assertEquals(14.0f, hamburguer.getPreco());
    }

    @Test
    void deveRetornarPrecoHamburguerComTodosIngredientes() {
        Hamburguer hamburguer = new HamburguerSimples();
        hamburguer = new Queijo(hamburguer);
        hamburguer = new Bacon(hamburguer);
        hamburguer = new Alface(hamburguer);

        assertEquals(16.0f, hamburguer.getPreco());
    }
}
