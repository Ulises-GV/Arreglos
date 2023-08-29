import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class EjemploArreglos2 {
    public static void main(String[] args) {
        //insertar un numero en la pocion n de una arreglo de tal manera que permaanesca ordenado

        int [] a = new int[7];
        int numero, posicion;

        Scanner s = new Scanner(System.in);

        for (int i = 0; i< a.length-1; i++){
            System.out.print("ingresa un numero wey: ");
            a[i] = s.nextInt();
        }
        Arrays.sort(a);


        System.out.println();

        System.out.println("Ingresa un numero para ingresar wey");
        numero = s.nextInt();

        posicion = 0;
        while(posicion < 6 && numero > a[posicion]){
            posicion++;
        }

        for(int i = a.length-2; i>= posicion; i--){
            a[i+1] = a[i];
        }

        a[posicion] = numero;
        System.out.println("Nuevo arreglo ordenado: ");
        for (int i = 0; i<a.length; i++){
            System.out.println(i+ " --> " + a[i]);
        }

        //------------------------------------------------------------------------------------------
        //ejemplo eliminar un elemento de un arreglo

        a =  new int[10];

        for(int i = 0; i< a.length; i++){
            System.out.print("Ingresa un numero wey: ");
            a[i] = s.nextInt();
        }

        System.out.println();
        System.out.println("ingresa un numero para eliminar wey: ");
        posicion = s.nextInt();

        for(int i = posicion; i < a.length-1; i++ ){
            a[i] = a[i+1];
        }

        /*for (int i = 0; i< a.length; i++){
            System.out.println(i+ " --> " + a[i]);
        }*/

        int [] b = new int[a.length-1];
        System.arraycopy(a, 0, b, 0, b.length);

        for (int i = 0; i< b.length; i++){
            System.out.println(i+ " --> " + b[i]);
        }

        //--------------------------------------------------------------------------------------------
        //buscar elementos en un arreglo

        String[] nombres = {"pirata", "medio_metro", "cholondrina", "bocho" };

        System.out.println("Ingrese el nombre que desea buscar");
        String nombre = s.next();
        boolean existe = false;
        int i;
        for(i = 0; i < nombres.length; i++){
            if(nombres[i].compareTo(nombre) == 0){
                existe = true;
                break;
            }
        }
        if(existe) {
            System.out.println("Ese nombre esta en la posicion " + i);
        }else{
            System.out.println("no existe ese nombre");
        }

        //tambien lo podemos hacer con arreglos de numeros

        int[] numeros = new int[10];
        Scanner es = new Scanner(System.in);

        System.out.println("Ingrese los numeros");
        for(int j =0; j< numeros.length; j++){
            numeros[j] = es.nextInt();
        }
        System.out.println("\r\nIngrese numero a buscar");
        int num  = es.nextInt();
        int j =0;
        // tambien lo podemos hacer usando un while
        /*while(j < numeros.length && numeros[j] != num){
            j++;
        }*/
        //Tambien lo podemos hacer usando un for
        for(j = 0; j <numeros.length && numeros[j] != num; j++){}

        if (j == numeros.length) {
            System.out.println("Elemento no encontrado");
        }else if(numeros[j] == num){
            System.out.println("Elemento encontrado en la posicion: " + j);

        }

        //----------------------------------------------------------------------------------------
        // ejemplo desplazar una posicion

        numeros = new int[10];
        int ultimo;
        Random aleatorio = new Random();

        j = 0;
        for(j = 0; j< numeros.length; j++){
            numeros[j] = aleatorio.nextInt(100);
        }
        Arrays.sort(numeros);
        /*System.out.println("numeros aleatorios");
        for(j = 0; j< numeros.length; j++){
            System.out.println(numeros[j]);
        }*/

        ultimo = numeros[numeros.length-1];
        for(j =numeros.length-2; j>= 0; j-- ){
            numeros[j+1] = numeros[j];
        }

        numeros[0] = ultimo;

        System.out.println();
        System.out.println("el arreglo final despues de dezplazar todos los elementos una posicion");
        for( j = 0; j< numeros.length; j++ ){
            System.out.println(numeros[j]);
        }

        //-----------------------------------------------------------------------------------------------


    }
}
