package questao3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Insira sua mensagem");
		String message = scanner.nextLine();

		String contente = ":-)";
		String chateado = ":-(";

		int contenteValue = 0;
		int chateadoValue = 0;

		for (int i = 0; i < message.length(); i++) {
			if (message.substring(i).startsWith(contente)) {
				contenteValue++;
			} else if (message.substring(i).startsWith(chateado)) {
				chateadoValue++;
			}
		}

		System.out.println();
		if (contenteValue == chateadoValue) {
			System.out.println("Neutro");
		} else if (contenteValue > chateadoValue) {
			System.out.println("Divertido");
		} else if (chateadoValue > contenteValue) {
			System.out.println("Chateado");
		}

	}

}
