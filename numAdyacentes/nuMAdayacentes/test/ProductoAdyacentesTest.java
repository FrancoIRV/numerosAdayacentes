import java.util.ArrayList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ProductoAdyacentesTest {


    @Test
    void testCalcularProductosCasoLimite() {
        int[] prueba = {10000000000, 2, 3};
        ArrayList<Integer> productos = ProductoAdyacentes.calcularProductos(prueba);
        Assertions.assertEquals(20000000000
        , ProductoAdyacentes.productoAdayacentes(productos));
    }

    @Test
    void testCalcularProductosListaVacia() {
        int[] prueba = new int[0];
        ArrayList<Integer> pruebaProductos = new ArrayList();
        Assertions.assertEquals(pruebaProductos, ProductoAdyacentes.calcularProductos(prueba));
    }

    @Test
    void testCalcularProductos1Numero() {
        int[] prueba = new int[]{1};
        Assertions.assertEquals(1, ProductoAdyacentes.calcularProductos(prueba));
    }

    @Test
    void testCalcularProductosCasoIdeal() {
        int[] prueba = new int[]{1000, -1000, 2000, -2000, 3000, -3000, 4000, -4000, 5000, -5000, 6000, -6000, 7000, -7000, 8000, -8000, 9000, -9000, 10000, -10000};
        ArrayList<Integer> productos = ProductoAdyacentes.calcularProductos(prueba);
        Assertions.assertEquals(-1000000, ProductoAdyacentes.productoAdayacentes(productos));
    }

    @Test
    void testProductoAdayacentesEmpate() {
        ArrayList<Integer> prueba = new ArrayList();
        prueba.add(1);
        prueba.add(1);
        prueba.add(1);
        Assertions.assertEquals(1, ProductoAdyacentes.productoAdayacentes(prueba));
    }

    @Test
    void testProductoAdyacentesListaVacia() {
        ArrayList<Integer> prueba = new ArrayList();
        Assertions.assertNull(ProductoAdyacentes.productoAdayacentes(prueba));
    }
}
