package Codigo4;

import java.util.Scanner;

public class codigo4 {
	
	public static void main(String[] args) { //Se añade public static void por que no estaba y esta pidiendo que el usuario ingrese dato
		 try (Scanner s = new Scanner(System.in)) {
			System.out.println("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
			String j1 = s.nextLine();
			
			System.out.println("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
   //Se borra el scanner ya que solo va a una vez y esta mal ponerlo dos veces.
			String j2 = s.nextLine();
			
			if (j1 == j2) {
			  System.out.println("Empate");
			} else {
			  int g = 2;
			  switch(j1) { //Todos los swich tienen que tener un break para finalizar el caso 
			    case "piedra":
			      if (j2 == "tijeras") {
			        g = 1;
			      }
			      break;

			    case "papel":
			      if (j2 == ("piedra")) {
			        g = 1;
			        } //no finaliza con llave se agrega para cerrar el if 
			      break; 
			      
			    case "tijeras": //Le agregue la "S" por que en los demas dise tijeras
			      if (j2 == ("papel")) { //se puso los iguales igual que los demas 
			        g = 1;
			      }
			      break;
			    default:
			  } 
			  System.out.println("Gana el jugador " + g);
			}
		}
	 
	}
}