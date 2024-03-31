package org.example.establos;

import java.util.LinkedList;
import java.util.List;

public class Establo<T> {

    private List<T> listaOvejas= new LinkedList<>();

    public Establo() {
    }

    public int tamanio(){
        return listaOvejas.size();
    }

    public T obtener(int i){
        return listaOvejas.get(i);
    }
    public void agregarOveja(T elemento){
        listaOvejas.add(elemento);
    }

    @Override
    public String toString() {
        return "Establo{" +
                "listaOvejas=" + listaOvejas +
                '}';
    }

}
