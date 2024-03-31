package org.example.establos;

public class Cola<T> {

    private Nodo<T> nodoPrimero, nodoUltimo;
    private int tamanio;

    /**
     * Agrega un elemento en la Cola
     * @param dato elemento a guardar en la Cola
     */
    public void encolar(T dato) {

        Nodo<T> nodo = new Nodo<>(dato);

        if(estaVacia()) {
            nodoPrimero = nodoUltimo = nodo;
        }else {
            nodoUltimo.setSiguienteNodo(nodo);
            nodoUltimo = nodo;
        }

        tamanio++;
    }

    /**
     * Verifica si la Cola est� vac�a
     * @return true si est� vac�a
     */
    public boolean estaVacia() {
        return nodoPrimero == null;
    }

    /**
     * Retorna y elimina el elemento que est� al incio de la Cola
     * @return Primer elemento de la Cola
     */
    public T desencolar() {

        if(estaVacia()) {
            throw new RuntimeException("La Cola est� vac�a");
        }

        T dato = nodoPrimero.getValorNodo();
        nodoPrimero = nodoPrimero.getSiguienteNodo();

        if(nodoPrimero==null) {
            nodoUltimo = null;
        }

        tamanio--;
        return dato;
    }

    /**
     * Verifica si la Cola es id�ntica a la actual
     * @param cola Cola a comparar
     * @return True si son iguales
     */
    public boolean sonIdenticas(Cola<T> cola) {

        Cola<T> clon1 = clone();
        Cola<T> clon2 = cola.clone();

        if(clon1.getTamanio() == clon2.getTamanio()) {

            while( !clon1.estaVacia() ) {
                if( !clon1.desencolar().equals( clon2.desencolar() ) ) {
                    return false;
                }
            }

        }else {
            return false;
        }

        return  true;
    }

    /**
     * Realizar un procedimiento que ingrese un elemento en la posición N de la cola.
     * Tener en cuenta que los demás elementos deben quedar en el mismo orden
     * @param valor
     * @param posicion
     */
    public void insertarEnPosicion(T valor, int posicion) {
        if (posicion < 0 || posicion > tamanio) {
            throw new IllegalArgumentException("La posición especificada está fuera de rango");
        }
        if (posicion == tamanio) {
            encolar(valor);
            return;
        }
        Nodo<T> anterior = null;
        Nodo<T> actual = nodoPrimero;
        for (int i = 0; i < posicion; i++) {
            anterior = actual;
            actual = actual.getSiguienteNodo();
        }
        Nodo<T> nuevoNodo = new Nodo<>(valor);
        nuevoNodo.setSiguienteNodo(actual);
        if (anterior == null) {
            nodoPrimero = nuevoNodo;
        } else {
            anterior.setSiguienteNodo(nuevoNodo);
        }
        tamanio++;
    }

    /**
     * Imprime una cola en consola
     */
    public void imprimir() {
        Nodo<T> aux = nodoPrimero;
        while(aux!=null) {
            System.out.print(aux.getValorNodo()+"\t");
            aux = aux.getSiguienteNodo();
        }
        System.out.println();
    }

    @Override
    protected Cola<T> clone() {

        Cola<T> nueva = new Cola<>();
        Nodo<T> aux = nodoPrimero;

        while(aux!=null) {
            nueva.encolar( aux.getValorNodo() );
            aux = aux.getSiguienteNodo();
        }

        return nueva;
    }

    public Nodo<T> getNodoPrimero() {
        return nodoPrimero;
    }

    public void setNodoPrimero(Nodo<T> nodoPrimero) {
        this.nodoPrimero = nodoPrimero;
    }

    public Nodo<T> getNodoUltimo() {
        return nodoUltimo;
    }

    public void setNodoUltimo(Nodo<T> nodoUltimo) {
        this.nodoUltimo = nodoUltimo;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }
}
