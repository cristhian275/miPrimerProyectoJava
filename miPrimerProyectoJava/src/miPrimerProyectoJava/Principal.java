/**
 * Este programa mostra ao aluno:
 * 1) Que um programa Java é construido dentro de um projeto Java.
 * 2) Todo programa Java deve ter uma classe com um método main.
 * 3) Como exibir informações no terminal (console) de Java.
 * 4) Como ler uma String do terminal (console) de Java.
 */
package miPrimerProyectoJava;
import java.util.Scanner;


/**
 * @author crist
 *DAta 03/02/2021
 *//
public class Principal {
	public static void main(String[] args) {
		System.out.println("Olá amigo!\nQual é o seu nome?");
		// Ler uma String do console usando a bibiloteca Scanner.
		Scanner in = new Scanner(System.in);
		String nome = in.nextLine();
		
		//Exibir uma string usando printf.
		System.out.printf("Olá %s!\n", nome);
		in.close();

	}

}
