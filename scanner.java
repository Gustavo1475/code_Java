import java.util.Scanner;

public class scanner {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Vamos inserir os valores");
		System.out.print("Inserir o primeiro valor:");
		int primeiroValor = entrada.nextInt();
		System.out.print("Inserir o segundo valor:");
		int segundoValor = entrada.nextInt();
		System.out.print("Inserir o terceiro valor:");
		int terceirovalor = entrada.nextInt();
		System.out.print("Inserir o quarto valor:");
		int quartoValor = entrada.nextInt();
		entrada.close();

		int resultado = (primeiroValor + segundoValor) * terceirovalor / (quartoValor - 3);
		System.out.println("O resultado da operação é igual a: " + resultado + ".");
	}
}


