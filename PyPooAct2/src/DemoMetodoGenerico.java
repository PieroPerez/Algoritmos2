// Clase DemoMetodoGenerico para probar un método genérico
public class DemoMetodoGenerico {

    // Método genérico para comparar si dos arreglos son iguales
    static <T extends Comparable<T>> boolean igualArrays(T[] x, T[] y) {
        if (x.length != y.length)  // Compara las longitudes de los arreglos
            return false;  // Si son diferentes, devuelve false

        for (int i = 0; i < x.length; i++)  // Recorre los elementos de los arreglos
            if (!x[i].equals(y[i]))  // Compara cada elemento
                return false;  // Si encuentra un elemento diferente, devuelve false

        return true;  // Si todos los elementos son iguales, devuelve true
    }

    public static void main(String[] args) {
        Integer nums[] = {1, 2, 3, 4, 5};  // Arreglo de enteros
        Integer nums2[] = {1, 2, 3, 4, 5}; // Arreglo de enteros igual a nums
        Integer nums3[] = {1, 2, 7, 4, 5}; // Arreglo de enteros diferente a nums
        Integer nums4[] = {1, 2, 7, 4, 5, 6}; // Arreglo de enteros con longitud diferente

        // Prueba el método igualArrays con diferentes arreglos
        System.out.println("nums es igual a nums: " + igualArrays(nums, nums));  // true
        System.out.println("nums es igual a nums2: " + igualArrays(nums, nums2)); // true
        System.out.println("nums es igual a nums3: " + igualArrays(nums, nums3)); // false
        System.out.println("nums es igual a nums4: " + igualArrays(nums, nums4)); // false

        // Prueba con arreglos de Double (descomenta estas líneas para probar)
        Double dvals1[] = {1.1, 2.2, 3.3, 4.4, 5.5};  // Arreglo de doubles
        Double dvals2[] = {1.1, 2.2, 3.3, 4.4, 5.5};  // Arreglo de doubles igual a dvals1
        System.out.println("dvals1 es igual a dvals2: " + igualArrays(dvals1, dvals2)); // true
        
        
        Double dvals[]={1.1,2.2,3.3,4.4,5.5};
        if(igualArrays(nums,dvals))
        	System.out.println("nums es igual a dvals");
      //A
      //B
      //C
      //D
    }
}