package Controladores;

import java.util.Scanner;

import Servicios.OperativaImplementacion;
import Servicios.OperativaInterfaz;

public class inicio {

	public static void main(String[] args) {
		
		OperativaInterfaz oi = new OperativaImplementacion();
		
		Scanner sc = new Scanner(System.in);
		int numero = oi.numeroAleatorio();
		oi.compararNumero(numero);

		
	}

}
