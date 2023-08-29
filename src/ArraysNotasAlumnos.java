import java.util.Scanner;

public class ArraysNotasAlumnos {
    public static void main(String[] args) {
        int numAlumnos = 10;
        double[] claseMatematicas = new double [numAlumnos];
        double[] claseHistoria = new double[numAlumnos];
        double[] claseBiologia = new double[numAlumnos];
        double[] claseIngles = new double[numAlumnos];

        Scanner s =  new Scanner(System.in);
        System.out.println("Ingresa las notas para cada alumno en la clase de matematicas");
        for(int i = 0; i <numAlumnos; i++ ){
            System.out.print((i+1) + ": " );
            claseMatematicas[i] = s.nextDouble();
        }
        System.out.println("Ingresa las notas para cada alumno en la clase de historia");
        for(int i = 0; i <numAlumnos; i++ ){
            System.out.print((i+1) + ": " );
            claseHistoria[i] = s.nextDouble();
        }
        System.out.println("Ingresa las notas para cada alumno en la clase de biologia");
        for(int i = 0; i <numAlumnos; i++ ){
            System.out.print((i+1) + ": " );
            claseBiologia[i] = s.nextDouble();
        }System.out.println("Ingresa las notas para cada alumno en la clase de ingles");
        for(int i = 0; i <numAlumnos; i++ ){
            System.out.print((i+1) + ": " );
            claseIngles[i] = s.nextDouble();
        }
        for (int i =0; i<numAlumnos; i++){
            System.out.print((i+1)+ ": " +claseMatematicas[i] + " ");
            System.out.print( " " +claseHistoria[i]+ " ");
            System.out.print(" " +claseBiologia[i]+ " ");
            System.out.print(" " +claseIngles[i]+ " ");
            System.out.println();
        }
        //ahora vamos a sacar el promedio de cada asignatura

        double sumaMatematicas = 0;
        double sumaHistoria = 0;
        double sumaBiologia = 0;
        double sumaIngles = 0;
        for (int i = 0; i < numAlumnos; i++){
            sumaMatematicas = sumaMatematicas + claseMatematicas[i];
            sumaHistoria = sumaHistoria + claseHistoria[i];
            sumaBiologia = sumaBiologia + claseBiologia[i];
            sumaIngles = sumaIngles + claseIngles[i];
        }

        double promedioMatematicas = sumaMatematicas/numAlumnos;
        double promedioHistoria = sumaHistoria/numAlumnos;
        double promedioBiologia = sumaBiologia/numAlumnos;
        double promedioIngles = sumaIngles/numAlumnos;

        System.out.println("promedioMatematicas = " + promedioMatematicas);
        System.out.println("promedioHistoria = " + promedioHistoria);
        System.out.println("promedioBiologia = " + promedioBiologia);
        System.out.println("promedioIngles = " + promedioIngles);

        System.out.println("Promedio general de todos los cursos = " + (promedioIngles
        + promedioHistoria + promedioBiologia + promedioMatematicas)/4.0 );

        System.out.println("ingrese identificador del alumno de 1 a 10");
        int id = s.nextInt();

        double promedioAlumno = (claseMatematicas[id-1] + claseHistoria[id-1] + claseBiologia[id-1]
        + claseIngles[id-1])/4.0;

        System.out.println("promedioAlumno " + (id) + " = " + promedioAlumno);

    }
}
