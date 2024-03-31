package org.example.establos;

public class MainEstablo {


    public static void main(String[] args) {
        Establo<Oveja> establo = new Establo<>();
        Cola<Oveja> cola = new Cola<>();
        cola.encolar(new Oveja("Betsi", 45));
        cola.encolar(new Oveja("Lana", 50));
        cola.encolar(new Oveja("Jack", 55));
        cola.encolar(new Oveja("Barry", 48));

        cola.imprimir();
    }
}
