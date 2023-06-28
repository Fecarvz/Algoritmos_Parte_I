
public class HelloGoodbye {
	public static void main(String[] args) {
		if (args.length < 2) {
			System.out.println("Quantidade de argumentos invalida");
			return;
		}
		String nome1 = args[0];
		String nome2 = args[1];
		System.out.println("Hello "+ nome1 + " and " + nome2 + ".");
		System.out.println("Goodbye "+ nome2 + " and " + nome1 + ".");
	}
}
