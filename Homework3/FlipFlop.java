public class FlipFlop {   

   public static void main(String[] args) {
   		int numeroActual=0;
		int x=0;
   		System.out.println(args[0]);
	

   	  numeroActual = Integer.parseInt(args[0].toString());
		while(x<numeroActual)
		{
			
			if((x%3==0) && (x%5==0)){
			// si el numero es divisible dentro de 3 y 5 imprima "FlipFlop"
			System.out.println("FlipFlop");
								}
			else if(x%3==0){
   				// si el numero es divisible dentro de 3 imprima "Flip"
				System.out.println("Flip");
						}
				else if(x%5==0){	

   					// si el numero es divisible dentro de 5 imprima "Flop"
					System.out.println("Flop");
							}
					else{

   				// de lo contrario, imprima el numero
      				System.out.println(x);
					}
		
		x++;
		}
	}

}