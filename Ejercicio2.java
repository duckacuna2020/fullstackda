package Ejemplos;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0;
		int suma=0;
		int[]arreglo1= new int[num];			
			
			
			for (int i=0; i<arreglo1.length; i++) {
				arreglo1[i]= (int) (Math.random() *9);
				suma=suma+arreglo1[i];
			}
			
			System.out.println(suma);	
			
	}
}


