package torta;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {



    public static void main(String[] args) {

        Torta tortis = new Torta(FormaTorta.CORAZON, "Corazones", "fea", "vainilla", Set.of("chocolate","vainilla"), 0.0);
        System.out.println(tortis.getIngredientes());
        System.out.println(tortis.toString());
        Torta torta = new Torta();

    }
}

