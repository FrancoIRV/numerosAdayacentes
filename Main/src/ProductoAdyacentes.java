public class ProductoAdyacentes {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        System.out.println("---COMENZANDO---");
        long[] prueba = {4,5,0,8,1,7,7};

        try {
            listaEstado(prueba);
            long resultado = calcularProductosMaximo(prueba);
            System.out.println("El producto adyacente máximo es: " + resultado);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    public static void listaEstado(long[] listaNumeros) throws Exceptions {

        /* si listaNumeros esta vacia o solo con 1 valor lanzamos Exeptions*/
        if (listaNumeros == null) {
            throw new Exceptions("La lista de numeros no puede ser nula");
        }
        if (listaNumeros.length < 2) {
            throw new Exceptions("La lista debe contener al menos dos elementos");
        }

    }

    public static long calcularProductosMaximo(long[] listaNumeros) throws Exceptions {

        /* Iniciamos con el valor minimo, evitando errores con los negativos */
        long maxProducto = Long.MIN_VALUE;

        for (int i = 0; i < listaNumeros.length - 1; i++) {
            long producto = listaNumeros[i] * listaNumeros[i + 1];
            if (producto > maxProducto) {
                maxProducto = producto;
            }
        }
        return maxProducto;
    }
}
