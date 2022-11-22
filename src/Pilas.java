public class Pilas {
    private Nodo cima;
    int tamaño;
    public Pilas(){
        cima = null;
        tamaño = 0;
    }
    //Metodo para saber cuando la pila esta vacia
    public boolean estaVacia(){
        return cima == null;
    }
    //Metodo para empujar (push) un elemento en la pila
    public void empujar(int elemento){
        Nodo nuevo = new Nodo(elemento);
        nuevo.siguiente=cima;
        cima = nuevo;
        tamaño++;
    }
    //Metodo para sacar (pop) un elemento en la pila
    public int sacar(){
        int auxiliar = cima.dato;
        cima = cima.siguiente;
        tamaño--;
        return auxiliar;
    }
    //Metodo para saber quien esta en la cima de la pila
    public int cima(){
        return cima.dato;
    }
    //Metodo para saber el tamaño de la pila
    public int tamañoPila(){
        return tamaño;
    }
    //Metodo para limpiar(vaciar) la pila
    public void limpiarPila(){
        while(!estaVacia()){
            sacar();
        }
    }
}