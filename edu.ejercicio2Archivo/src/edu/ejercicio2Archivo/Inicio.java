package edu.ejercicio2Archivo;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Inicio {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean continuar = true;

		String respuesta = "y";
		try {
			PrintWriter archivo = new PrintWriter("archivo.csv");

			System.out.println("Nombre completo");
			archivo.print(sc.next() + ", ");
			System.out.println("Telefono");
			archivo.print(sc.next() + ", ");
			System.out.println("Correo Electronico");
			archivo.print(sc.next());
			archivo.println();
			
				
			
			
			
			
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
