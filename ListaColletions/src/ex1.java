import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		ArrayList<String> nomes = new ArrayList<>();
		ArrayList<String> sobrenomes = new ArrayList<>();
		int contador = 0;
		
		for (int i = 1; i <= 3; i++) {
			System.out.println("Digite um nome ("+i+"/3)");
			String nome = entrada.nextLine();
			nomes.add(nome);
		}
		
		entrada.close();
		
		for (int i = 1; i <= 4; i++) {
			System.out.println("Digite um sobrenome ("+i+"/4)");
			String sobrenome = entrada.nextLine();
			sobrenomes.add(sobrenome);
		}
		
		for (String nome : nomes) {
			for (String sobrenome : sobrenomes) {
				contador++;
				System.out.println("("+contador+") "+ nome +" "+ sobrenome);
			}
		}
		
	}

}
