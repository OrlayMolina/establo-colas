package org.example.establos;

public class Oveja implements Comparable<Oveja> {

    private String nombre;
    private int peso;

    public Oveja(String nombre, int peso) {
        this.nombre = nombre;
        this.peso = peso;
    }

    public  int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public int compareTo(Oveja a) {
        if(this.peso == a.peso) {
            return 0;
        }
        if(this.peso >a.peso) {
            return 1;
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return "Oveja " + nombre + " " +
                "peso=" + peso
                ;
    }
}
