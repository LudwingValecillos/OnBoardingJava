package day_3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Pet gori = new Pet("Gori",PetType.GATO,4);
        Pet lulu = new Pet("lulu",PetType.GATO,4);
        Pet yummi = new Pet("yummi",PetType.GATO,5);
        Pet camila = new Pet("camila",PetType.PERRO,11);

        List<Pet> mascotas = new ArrayList<>();
        mascotas.add(gori);
        mascotas.add(lulu);
        mascotas.add(yummi);




        Person ludwing = new Person("Ludwing","Valecillos","95931847",24, 1.70,false, mascotas);
        ludwing.addPet(camila);
        ludwing.presentar();

        System.out.println("--------------------------");
        Person pablo = new Person("pablo","Valecillos","95931847",24, 1.70,false);
        pablo.presentar();

        System.out.println(camila.getOwner());
    }
}
