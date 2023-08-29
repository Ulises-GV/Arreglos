import java.util.Random;

public class EemploUsosArrays {
    public static void main(String[] args) {

        //codigo que determina los numeros pares e impares de un arreglo y los guarda en otros dos

        int [] a, pares, impares;

        a = new int[10];
        int longitud_a= a.length;
        int longitud_pares = 0;
        int longitud_impares = 0;

        //llenamos el arreglo con numeros aleatorios
        Random aleatorio = new Random();

        for(int i = 0; i<longitud_a; i++){
            a[i] = -5 + aleatorio.nextInt(5 + 5);
          //  System.out.println(a[i]);
        }

        //averiguamos que longitud tendra cada arreglo
        for (int i = 0; i < longitud_a; i++){
            if (a[i] %2 == 0){
                longitud_pares++;
            }else{
                longitud_impares++;
            }
        }

        pares = new int[longitud_pares];
        impares = new int[longitud_impares];

        //System.out.println("longitud_pares = " + longitud_pares);
        //System.out.println("longitud_impares = " + longitud_impares);
        int j = 0; //usamos dos variables para que nos ayuden a llenar los arreglos usando postincrementos
        int k = 0;
        for(int i = 0; i<longitud_a; i++){
            if (a[i] % 2 ==0){
                pares[j++] = a[i];
            }else{
                impares[k++] = a[i];
            }

        }


        //finalmente imprimimos el resultado de cada arreglo

        System.out.println("Estos son los pares wey: ");
        for (int i = 0; i < longitud_pares; i++){
            System.out.println(pares[i]);
        }
        System.out.println();
        System.out.println("Estos son los impares wey: ");
        for (int i = 0; i < longitud_impares; i++){
            System.out.println(  impares[i]);
        }

        //--------------------------------------------------------------------------------------------------
        //Metodo que determina el maximo valor en un array

        a = new int [10];
        System.out.println();

        for (int i = 0; i < a.length; i++){
            a[i] = aleatorio.nextInt(100);
            //System.out.println( a[i]);
        }

        int max = 0;
        for(int i = 1; i <a.length; i++){
         //   max = (a[max] >a[i])? max: i;
            if (a[max] < a[i]){
                max = i;
            }else{
                max = max;
            }
        }
        System.out.println("max = " + a[max]);


        //----------------------------------------------------------------------------------------------------

        // Identificar si un arreglo es creciente o decreciente o desordenado o con todos los elementos iguales
        // tambien lo podemos usar para un arreglo de strings alfabeticamente con el metodo compareTo()

        //int []  b;

        //b = new int[10];
        boolean creciente = false;
        boolean decreciente = false;

        /*for (int i=0; i<a.length;i++){
            a[i] = i;
        }*/

        /*int m = 0;
        for (int i=9; i >= 0; i--){
            b[m++] = i;
            System.out.println(b[i]);
        }*/

        //int [] b = {1,3,6,7,8,3,2,1,5,10};
        int [] b = {3,3,3,3,3,3,3,3,3,3};

        for (int i = 0; i< b.length-1; i++){
            if (b[i] < b[++i]){
                creciente = true;
            }
            if(b[i] > b[++i]){
                decreciente = true;
            }
        }
        //System.out.println("creciente = " + creciente);
        //System.out.println("decreciente = " + decreciente);
        //System.out.println("a[1] = " + b[1]);
        //System.out.println("a[2] = " + b[2]);

        if(creciente == true && decreciente== false){
            System.out.println("el arreglo es creciente");
        }else if(creciente == true && decreciente == true){
            System.out.println("el arreglo es desordenado");
        } else if (creciente == false && decreciente == false) {
            System.out.println("Todos los elementos son iguales");
        } else {
            System.out.println("el arreglo es decreciente");
        }
        //--------------------------------------------------------------------------------------------

        //ejmplo modificando  el arreglo en reverso y tambien imprimirlo en reverso sin modificar
        // tambien lo podemos usar para un arreglo de strings alfabeticamente con el metodo compareTo()
        a  = new int[10];

        for (int i = 0; i < a.length; i++){
            a[i] = i;
        }

        //imprimiendo al reves sin alterar
        System.out.println("imprimiendo al reves");
        for(int i = 9; 0 <= i; i--){
            System.out.println(a[i]);
        }

        //modifcando el arreglo al reverso
        System.out.println("Arreglo modificado");
        int aux1;
        int aux2;
        int m = a.length;
        for(int i = 0; i < a.length/2; i++){
            aux1 = a[i];
            aux2 = a[m-i-1];
            a[i] = aux2;
            a[m-i-1] = aux1;
        }

        for (int i =0; i < a.length; i++){
            System.out.println(a[i]);
        }

        //---------------------------------------------------------------------------------------------
        //combinar elementos variables de dos arreglos en un solo arreglo

        int [] c = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50};
        a = new int[20];
        int [] d = {2, 4, 6, 8, 10, 12, 14, 16,18, 20};

        m = 0;
        int n = 0;
        for(int i = 0; i < a.length; i++ ){
            a[i] = c[m++];
            a[i+1] = d[n++];
            i++;
        }
        // otra forma
        /*for(int i = 0; i < a.length/2; i++ ){
            a[m++] = c[i];
            a[m++] = d[i];
        }*/

        System.out.println();
        System.out.println("arreglo combinado");
        for (int i = 0; i< a.length; i++){
            System.out.println(a[i]);
        }

        //------------------------------------------------------------------------------------------------
        //ahora para que podamos meter dos valores consecutivos de cada arreglo y no uno y uno

        int aux = 0;
        for(int i = 0; i < a.length/2; i+=2){
            for (int l=0; l<2; l++){
               a[aux++] = c[i+l];
            }
            for (int l=0; l<2; l++){
                a[aux++] = d[i+l];
            }
        }

        System.out.println();
        System.out.println("arreglo combinado 2 elementos");
        for (int i = 0; i< a.length; i++){
            System.out.println(a[i]);
        }

    }

}
