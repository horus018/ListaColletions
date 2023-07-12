import java.util.ArrayList;
import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		ArrayList<Integer> numeros = new ArrayList<>();
		ArrayList<Integer> pares = new ArrayList<>();
		ArrayList<Integer> impares = new ArrayList<>();
		
		for (int i = 1; i <= 5; i++) {
			System.out.println("Digite um número ("+i+"/5)");
			Integer numero = Integer.parseInt(entrada.nextLine());
			numeros.add(numero);
		}
		entrada.close();
		
		for (Integer numero : numeros) {
			if (numero % 2 == 0) {
				pares.add(numero);
			}else {
				impares.add(numero);
			}
		}
		
		System.out.println("os números informados foram:");
		System.out.println(numeros);
		System.out.println("os números pares são:");
		System.out.println(pares);
		System.out.println("os números ípares são:");
		System.out.println(impares);
	}

}
