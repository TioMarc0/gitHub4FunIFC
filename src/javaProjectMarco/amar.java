package javaProjectMarco;
import java.util.Scanner;
public class amar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ent = new Scanner(System.in);
		System.out.println("se a Ana  ama o Marco digite sim, se n�o, digite n�o");
		String amar = ent.next();
		if ("sim" .equalsIgnoreCase(amar)) {
			System.out.println("Ent�o a ana ama o Marco :D ");
		}else if ("n�o" .equalsIgnoreCase(amar)) {
			System.out.println("A Ana ama o Marco sim");
			ent.close();
		}
		
				
	}

}
