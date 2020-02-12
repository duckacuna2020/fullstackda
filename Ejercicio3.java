package Ejemplos;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        System.out.println("Ingrese las 5 Calificaciones");
        int [] MC = new int [5];
        int suma = 0;
        float pro = 0;
        
      
        
        for (int i = 0; i < 5; i++) {
            Scanner lee= new Scanner(System.in);
            MC[i]= lee.nextInt();
            suma = MC[i]+suma;
        }
        pro= suma/5;
        System.out.println("El promedio es: "+pro);
        System.out.println("4 a 7 = APROBADO\n1 a 3.9 = REPROBADO");
        if (pro>=4) {
            System.out.println("Estudiante APROBADO");
        }
        else {
            System.out.println("\t\tEstudiante REPROBADO");
        }
    }
}

        
    




