import java.util.ArrayList;  // Importa la clase ArrayList para usar listas dinámicas
import java.util.Iterator;   // Importa la interfaz Iterator para recorrer la lista

// Clase genérica Bolsa que implementa la interfaz Iterable
public class Bolsa<T> implements Iterable<T> {
    private ArrayList<T> lista = new ArrayList<T>();  // Lista para almacenar objetos de tipo T
    private int tope;  // Límite máximo de objetos que se pueden almacenar

    // Constructor que recibe el límite máximo de objetos
    public Bolsa(int tope) {
        this.tope = tope;  // Asigna el valor del límite al atributo tope
    }

    // Método para agregar un objeto a la bolsa
    public void add(T objeto) {
        if (lista.size() < tope) {  // Verifica si hay espacio en la bolsa
            lista.add(objeto);  // Agrega el objeto a la lista
        } else {
            throw new RuntimeException("No caben más objetos en la bolsa");  // Lanza una excepción si no hay espacio
        }
    }

    // Método para obtener un iterador de la lista
    @Override
    public Iterator<T> iterator() {
        return lista.iterator();  // Devuelve un iterador para recorrer la lista
    }
}