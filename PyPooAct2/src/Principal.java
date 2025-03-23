// Clase Principal para probar la funcionalidad de la bolsa genérica
public class Principal {
    public static void main(String[] args) {
        // Bolsa de chocolatinas
        Bolsa<Chocolatina> bolsaChocolatinas = new Bolsa<>(3);  // Crea una bolsa con límite de 3 chocolatinas
        bolsaChocolatinas.add(new Chocolatina("Milka"));    // Agrega una chocolatina Milka
        bolsaChocolatinas.add(new Chocolatina("Ferrero"));  // Agrega una chocolatina Ferrero
        bolsaChocolatinas.add(new Chocolatina("Nestlé"));   // Agrega una chocolatina Nestlé

        System.out.println("Chocolatinas en la bolsa:");
        // Recorre la bolsa de chocolatinas usando un for-each
        for (Chocolatina chocolatina : bolsaChocolatinas) {
            System.out.println(chocolatina);  // Imprime cada chocolatina
        }

        // Bolsa de golosinas
        Bolsa<Golosina> bolsaGolosinas = new Bolsa<>(2);  // Crea una bolsa con límite de 2 golosinas
        bolsaGolosinas.add(new Golosina("Caramelo", 0.5));  // Agrega una golosina Caramelo
        bolsaGolosinas.add(new Golosina("Chicle", 0.2));    // Agrega una golosina Chicle

        System.out.println("\nGolosinas en la bolsa:");
        // Recorre la bolsa de golosinas usando un for-each
        for (Golosina golosina : bolsaGolosinas) {
            System.out.println(golosina);  // Imprime cada golosina
        }
    }
}