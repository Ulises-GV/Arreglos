import java.util.Arrays;
import java.util.Collections;

public class OrdenamientoBurbuja {
    public static void main(String[] args) {


        String[] productos = {"estufa", "lavadora", "choco krispis", "guitarra", "toalla toallin"};

        int total = productos.length;

        int contador = 0;

        //ordenamiento burbuja
        for (int i = 0; i < total; i++) {
            for (int j = 0; j < total; j++) {
                if (productos[i].compareTo(productos[j]) < 0) {
                    String aux = productos[i];
                    productos[i] = productos[j];
                    productos[j] = aux;
                }
                contador++;
            }
        }
        System.out.println("contador = " + contador);

        int contador2 = 0; //numero de iteraciones necesarias
        //ordenamiento burbuja optimizado
        for (int i = 0; i < total - 1; i++) {
            for (int j = 0; j < total - 1 - i; j++) {
                if (productos[j + 1].compareTo(productos[j]) < 0) {
                    String aux = productos[j];
                    productos[j] = productos[j + 1];
                    productos[j + 1] = aux;
                }
                contador2++;
            }
        }

        System.out.println("contador2 = " + contador2);

        System.out.println("-------------Arreglo ordenado------------");
        for (int a = 0; a < total; a++) {
            System.out.println("arreglo " + a + " " + productos[a]);
        }

    }
}