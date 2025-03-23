
public class OperacionesHelper {
    public static <T extends Number> void ejecutarOperacion(Operable<T> oper, int opcion, T otro) {
        switch (opcion) {
            case 1 -> System.out.println("Resultado: " + oper.suma(otro));
            case 2 -> System.out.println("Resultado: " + oper.resta(otro));
            case 3 -> System.out.println("Resultado: " + oper.producto(otro));
            case 4 -> System.out.println("Resultado: " + oper.division(otro));
            case 6 -> System.out.println("Resultado: " + oper.raizCuadrada());
            case 7 -> System.out.println("Resultado: " + oper.raizCubica());
            default -> System.out.println("Opción inválida.");
        }
    }
}
