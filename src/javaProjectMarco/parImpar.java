package javaProjectMarco;
import java.util.Scanner;
public class parImpar {
//Fa�a um Programa que pe�a um n�mero inteiro e se este n�mero for par, transforme-o em impar e vice-versa.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ent = new Scanner(System.in);
		System.out.print("Informe o n�mero: ");
		int num = ent.nextInt();
		if ((num % 2)==0) 
		System.out.println("n�mero convertido para impar: " + ((num)+1));
		else if ((num % 2)!=0) 
			System.out.println("n�mero convertido para par: " + ((num)+1));
		else 
			System.out.println("zero");
			ent.close();
	
	}

}
