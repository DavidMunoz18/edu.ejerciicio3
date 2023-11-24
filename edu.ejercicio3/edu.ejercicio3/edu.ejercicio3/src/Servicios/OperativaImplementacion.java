package Servicios;

import java.util.Scanner;

public class OperativaImplementacion implements OperativaInterfaz {

	@Override
	public int numeroAleatorio() {
			
		
		int numeroRandom = (int)Math.floor(Math.random()*100);
	
		
		return numeroRandom;
	}

	private int pedirNumero() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Pide un numero aleatorio del 1 al 100");
		int numero = sc.nextInt();
		return numero;
	}

	@Override
	public void compararNumero(int numeroRandom) {
		
		for(int i=0; i<10; i++) {
			
			int numeroGuardado = pedirNumero();
			
			if(numeroRandom == numeroGuardado) {
				System.out.println("Felicidades has acertado");
				break;
			}
			else if(numeroGuardado > numeroRandom) {
				System.out.println("NumeroIntroducido es mayor que el numero random");
				
			}
			else {
				System.out.println("NumeroIntroducido es menor que el numero random");
			}
		}
		
		
		
	}
	

}
