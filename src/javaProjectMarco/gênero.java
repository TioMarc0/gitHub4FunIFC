package javaProjectMarco;
import java.util.Scanner;
public class g�nero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ent = new Scanner(System.in);
		System.out.println("Informe seu g�nero - F/f (feminino) , M/m (masculino)");
		String sexo = ent.next();
		if ("f" .equalsIgnoreCase(sexo)) {
			System.out.println("sexo feminino");}
		else if ("m" .equalsIgnoreCase(sexo)) {
			System.out.println("sexo masculino");}
			ent.close();
		}

	}