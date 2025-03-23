
import java.util.Scanner;

public class MenuOperaciones {
    public static void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("\\nMenú de Operaciones Clases Genéricas:");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Producto");
            System.out.println("4. División");
            System.out.println("5. Potencia");
            System.out.println("6. Raíz Cuadrada");
            System.out.println("7. Raíz Cúbica");
            System.out.println("8. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            if (opcion == 8) {
                continuar = false;
                break;
            }

            System.out.print("Ingrese el tipo de número (1 = Integer, 2 = Double): ");
            int tipo = scanner.nextInt();

            if (tipo == 1) {
                System.out.print("Ingrese un número entero: ");
                int num1 = scanner.nextInt();
                OperacionesMathInteger oper = new OperacionesMathInteger(num1);

                if (opcion <= 4) {
                    System.out.print("Ingrese otro número entero: ");
                    int num2 = scanner.nextInt();
                    OperacionesHelper.ejecutarOperacion(oper, opcion, num2);
                } else if (opcion == 5) {
                    System.out.print("Ingrese el exponente: ");
                    int exponente = scanner.nextInt();
                    System.out.println("Resultado: " + oper.potencia(exponente));
                } else {
                    OperacionesHelper.ejecutarOperacion(oper, opcion, null);
                }
            } else if (tipo == 2) {
                System.out.print("Ingrese un número decimal: ");
                double num1 = scanner.nextDouble();
                OperacionesMathDouble oper = new OperacionesMathDouble(num1);

                if (opcion <= 4) {
                    System.out.print("Ingrese otro número decimal: ");
                    double num2 = scanner.nextDouble();
                    OperacionesHelper.ejecutarOperacion(oper, opcion, num2);
                } else if (opcion == 5) {
                    System.out.print("Ingrese el exponente: ");
                    int exponente = scanner.nextInt();
                    System.out.println("Resultado: " + oper.potencia(exponente));
                } else {
                    OperacionesHelper.ejecutarOperacion(oper, opcion, null);
                }
            } else {
                System.out.println("Opción inválida.");
            }
        }
        scanner.close();
    }
}
