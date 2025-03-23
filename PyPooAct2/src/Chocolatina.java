// Clase Chocolatina que representa una chocolatina con una marca
public class Chocolatina {
    private String marca;  // Atributo para almacenar la marca de la chocolatina

    // Constructor que recibe la marca de la chocolatina
    public Chocolatina(String marca) {
        this.marca = marca;  // Asigna la marca al atributo
    }

    // Método para obtener la marca de la chocolatina
    public String getMarca() {
        return marca;  // Devuelve la marca
    }

    // Método para modificar la marca de la chocolatina
    public void setMarca(String marca) {
        this.marca = marca;  // Asigna una nueva marca
    }

    // Método para representar la chocolatina como una cadena de texto
    @Override
    public String toString() {
        return "Chocolatina{" + "marca='" + marca + '\'' + '}';  // Devuelve una representación en String
    }
}