import java.util.Scanner;
public class Imc {
	public static void main (String [] args) {
		Scanner in = new Scanner (System.in);
		double peso, altura, imc;
		try {
		System.out.println("Digite seu peso: ");
		peso = in.nextDouble();
		System.out.println("Digite sua altura: ");
		altura = in.nextDouble ();
		imc = peso / (altura * altura);
		if (imc < 17) {
			System.out.println("Muito abaixo do peso. Seu IMC �"+imc);
		} else if (imc < 18.49) {
			System.out.println("Abaixo do peso. Seu IMC � "+imc);
		} else if (imc < 24.99) {
			System.out.println("Peso normal. Seu IMC � "+imc);
		} else if (imc < 34.99) {
			System.out.println("Obesidade I. Seu IMC � "+imc);
		} else if (imc < 39.99) {
			System.out.println("Obesidade II (severa). Seu IMC � "+imc);
		} else if (imc > 40) {
			System.out.println("Obesidade III (m�rbida). Seu IMC � "+imc);
		} else {
			System.out.println("Peso ou altura inv�lida.");
		} 	} catch (Exception erro) {
			System.out.println("Digite apenas n�meros que foram indicados. \n"
					+"Erro :"+erro+"\n"
					+"-------------execute novamente-------------");
		}
	}
}
