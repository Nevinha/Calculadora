import java.util.Scanner;


public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int op = 0;
		Scanner key = new Scanner (System.in);
		do{
			
			Calculadora numeros = new Calculadora ();
			System.out.println("Op��es: \n1- Somar\n2- Subtrair\n3- Multiplicar\n4- Dividir\n5- Sair");
			op = key.nextInt();
			if (op == 5)
				break;
			else{
				System.out.println("Digite n�mero 1:");
				float a = key.nextFloat();
				System.out.println("Digite n�mero 2:");
				float b = key.nextFloat();
				switch (op){
				case 1:
					System.out.println("A soma �: "+numeros.soma(a, b));
				break;
				case 2:
					System.out.println("A diferen�a �: "+numeros.diferen�a(a, b));
				break;
				case 3:
					System.out.println("O produto �: "+numeros.produto(a, b));
				break;
				case 4:
					System.out.println("A diferen�a �: "+numeros.quociente(a, b));
				break;
				default:
					System.out.println("Op��o inv�lida!!");
				break;
				}
			}
			
			
		} while (op != 5);
		

	}

}
