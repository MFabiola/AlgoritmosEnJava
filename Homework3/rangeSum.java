/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Complete el algoritmo:
Dados 2 numeros (limite inferior y superior), recorra el rango e imprima los numeros dentro de este rango.

*/

public class rangeSum {   

   public static void main(String[] args) {
		int valor1;
		int valor2;
		valor1= Integer.parseInt(args[0].toString());
		valor2= Integer.parseInt(args[1].toString());
	if(valor2<valor1){		
		while(valor2<valor1-1)
		{
		valor2++; 
         System.out.println(valor2);
  		}    
  		} else if(valor1<valor2)
			{
			while(valor1<valor2-1)
			{
			valor1++;
		System.out.println(valor1);
			}
			}	
	}

}