/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Complete el algoritmo:

Despliege la multiplicacion desde 0 hasta un valor 'n' dado.
Ej:
Si si ingresa 6
mostrar
1x2x3x4x5x6=720

*/

public class productToNumber {   

   public static void main(String[] args) {
		int x=1;
		int valor;
		int producto=1;
   		valor = Integer.parseInt(args[0].toString());
		System.out.print("1");
		while(x!=valor)
		{
		x=x+1;
		producto=producto*x;
		
		System.out.print("x"+x); 		    
		}
		
		System.out.print("=" +producto );	
			
	}
}