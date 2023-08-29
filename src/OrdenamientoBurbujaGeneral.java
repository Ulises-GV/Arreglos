import java.util.Random;

public class OrdenamientoBurbujaGeneral {
    public static void main(String[] args) {


        String[] productos = {"estufa", "lavadora", "choco krispis", "guitarra", "toalla toallin"};

        int total = productos.length;

        //usamos nuestro metodo de ordenamiento para Strings
        sortBurbuja(productos);
        System.out.println("-------------Arreglo ordenado------------");
        for (int a = 0; a < total; a++) {
            System.out.println("arreglo " + a + " " + productos[a]);
        }

        //llenamos un arreglo con la clase Random
        Random aleatorios = new Random();
        Double [] numeros = new Double[30]; // ojo nuestro arreglo no puede ser de tipo primitivo
                                            //tiene que ser de la clase wrapper ya que la clase padre es Object

        int totalnum = numeros.length;
        for (int i = 0; i < totalnum; i++){
            numeros[i] = -15.00 + aleatorios.nextDouble(10.50 + 15.00);
            //System.out.println("i = " + numeros[i]);
        }

        //volvemos a usar nuestro metodo sortBurbuja ahora para numeros
        sortBurbuja(numeros);
        System.out.println("---------Arreglo numeros ordenado-----------");
        for (int i=0; i<totalnum; i++){
            System.out.println("numero = "+ (i+1) +": " + numeros[i]);
        }

    }
    //usamos Object porque todas las clases heredan de el y asi podemos ordenar cualquier tipo de objeto
    public static void sortBurbuja(Object[] arreglo){
        int total = arreglo.length;
        int contador = 0;
        for (int i = 0; i < total - 1; i++) {
            for (int j = 0; j < total - 1 - i; j++) {
                //si queremos que sea de mayor a menor solo cambiamos > 0
                if ( ((Comparable) arreglo[j + 1]).compareTo(arreglo[j]) < 0) { //casting con comparable para que compare cualquier tipo object
                    Object aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                }
                contador++;
            }
        }
        System.out.println("contador = " + contador);
    }
}