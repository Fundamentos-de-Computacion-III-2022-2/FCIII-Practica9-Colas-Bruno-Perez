public class Colas {
    NodoCola inicio,fin;
    int tamaño;
    public Colas(){
        inicio = fin = null;
        tamaño = 0;
    }
    public boolean estaVacia(){
        return inicio == null;
    }
    public void insertar (int elemento){
        NodoCola nuevo = new NodoCola (elemento);
        if(estaVacia()){
            inicio = nuevo;
        } else{
            fin.siguiente = nuevo;
        }
        fin = nuevo;
        tamaño++;
    }
    public int quitar(){
        int aux = inicio.dato;
        inicio = inicio.siguiente;
        tamaño--;
        return aux;
    }
    public int inicioCola(){
        return inicio.dato;
    }
    public int tamañoCola(){
        return tamaño;
    }
}