import java.util.ArrayList;
import java.util.Collections;

public class ProductoAdyacentes {
    public static void main(String[] args) {
        run();
    }

    public static void run(){
        int[] prueba = {1, -4, 2, 2, 5, -1};
        ArrayList<Integer> productos = calcularProductos(prueba);
        System.out.println(productoAdayacentes(productos));
    }

    public static ArrayList<Integer> calcularProductos(int[] listaNumeros){
        ArrayList<Integer> productos = new ArrayList<>();

    /* recorro la lista hasta la penultima posicion */

        for(int i = 0; i < ((listaNumeros.length)-1); i++ ) {
            productos.add(listaNumeros[i]*listaNumeros[i+1]);
        }
        return productos;
    }
    public static int productoAdayacentes(ArrayList<Integer> listaProductos){

        /* retorno el mayor numero de la lista */

        return Collections.max(listaProductos);
    }
}
