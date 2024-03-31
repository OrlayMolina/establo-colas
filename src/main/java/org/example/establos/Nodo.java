package org.example.establos;

public class Nodo<T> {

    private Nodo siguienteNodo;
    private T valorNodo;

    /**
     * Constructor de la clase Nodo
     * @param valorNodo Elemento que se guarda en el Nodo
     */
    public Nodo(T valorNodo) {
        this.valorNodo = valorNodo;
    }

    public Nodo(Nodo siguienteNodo, T valorNodo) {
        this.siguienteNodo = siguienteNodo;
        this.valorNodo = valorNodo;
    }

    //Metodos get y set de la clase Nodo

    public Nodo<T> getSiguienteNodo() {
        return siguienteNodo;
    }


    public void setSiguienteNodo(Nodo<T> siguienteNodo) {
        this.siguienteNodo = siguienteNodo;
    }


    public T getValorNodo() {
        return valorNodo;
    }


    public void setValorNodo(T valorNodo) {
        this.valorNodo = valorNodo;
    }
}
