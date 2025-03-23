// Clase Golosina que representa una golosina con un nombre y un peso
public class Golosina {
    private String nombre;  // Atributo para almacenar el nombre de la golosina
    private double peso;    // Atributo para almacenar el peso de la golosina

    // Constructor que recibe el nombre y el peso de la golosina
    public Golosina(String nombre, double peso) {
        this.nombre = nombre;  // Asigna el nombre
        this.peso = peso;      // Asigna el peso
    }

    // Método para obtener el nombre de la golosina
    public String getNombre() {
        return nombre;  // Devuelve el nombre
    }

    // Método para modificar el nombre de la golosina
    public void setNombre(String nombre) {
        this.nombre = nombre;  // Asigna un nuevo nombre
    }

    // Método para obtener el peso de la golosina
    public double getPeso() {
        return peso;  // Devuelve el peso
    }

    // Método para modificar el peso de la golosina
    public void setPeso(double peso) {
        this.peso = peso;  // Asigna un nuevo peso
    }

    // Método para representar la golosina como una cadena de texto
    @Override
    public String toString() {
        return "Golosina{" + "nombre='" + nombre + '\'' + ", peso=" + peso + '}';  // Devuelve una representación en String
    }
}