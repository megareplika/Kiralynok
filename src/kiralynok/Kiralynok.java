package kiralynok;

import java.io.IOException;

public class Kiralynok {
    public static void main(String[] args) throws IOException {
        Tabla tabla = new Tabla('#');
        //4.feladat
        System.out.println("4. feladat");
        tabla.megjelenit();
        //6.feladat
        System.out.println("6. feladat");
        tabla.elhelyez(8);
        tabla.megjelenit();
    }
}