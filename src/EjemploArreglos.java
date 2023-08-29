import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class EjemploArreglos {
    public static void main(String[] args) {

        int[] numeros = new int[5];

        numeros[0] = 90;
        numeros[1] = Integer.valueOf(15); //otra forma de asignar como lo vimos unboxing
        numeros[2] = (int)36L;
        numeros[3] = 48;
        numeros[4] = 5;

        Arrays.sort(numeros); // nos permite ordenar numeros o arreglos de Strings
        int i = numeros[0];
        int j = numeros[1];
        int k = numeros[2];
        int l = numeros[3];
        int m = numeros[4];


        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println("l = " + l);
        System.out.println("m = " + m);

        //------------------------------------------------------------------------------------------------------

        String [] productos = {"estufa", "lavadora", "choco krispis", "guitarra", "toalla toallin"};

        int total = productos.length;

        Arrays.sort(productos);
        System.out.println("-------------Arreglo ordenado------------");
        for(int a = 0; a < total; a++ ){
            System.out.println("arreglo " + a + " "+ productos[a]);
        }

        arregloInverso(productos); //asi llamamos un metodo estatico en la clase main que recibe por argumento un arreglo
        System.out.println("-------------Arreglo ordenado inverso------------");
        for(int a = 0; a < total; a++ ){
            System.out.println("arreglo " + a + " "+ productos[a]);
        }

        //otra forma de hacer lo mismo es usar la clase collections con el metodo reverse que recibe una lista
        //con el metodo .asList convertimos nuestro arreglo en una lista
        Collections.reverse(Arrays.asList(productos));
        System.out.println("-------------Arreglo ordenado inverso API------------");
        for(int a = 0; a < total; a++ ){
            System.out.println("arreglo " + a + " "+ productos[a]);
        }

    }
    //usamos un metodo estatico que no devuelve nada para ordenar
    public static void arregloInverso(String [] arreglo){
        //ordena de manera inversa los elementos del arreglo
        int total = arreglo.length;
        for(int a = 0; a < total/2; a++) {
            String primero = arreglo[a];
            String finall = arreglo[total - 1 - a];
            arreglo[a] = finall;
            arreglo[total - 1 - a] = primero;
        }

    }
}
