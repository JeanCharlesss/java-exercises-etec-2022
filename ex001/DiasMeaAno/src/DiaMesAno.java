import java.util.Scanner;
public class DiaMesAno {
	public static void main (String[] args) {
		int dia,mes,ano;
		Scanner in = new Scanner (System.in);
		System.out.println("Digite a quantidade de dias");
		dia= in.nextInt();
		mes=dia/30;
		ano=dia/365;
		System.out.println("O n�mero de meses s�o "+mes+" e o n�mero de ano � "+ano);
	}

}
