import java.util.Scanner;
public class MediaNota {
	public static void main (String[] args) {
		double nota1,nota2,notaMedia;
		Scanner in = new Scanner (System.in);
		System.out.println("Digite a primeira nota do aluno");
		nota1 = in.nextDouble();
		System.out.println("Digite a segunda nota do aluno");
		nota2 = in.nextDouble();
		notaMedia = (nota1+nota2)/2;
		System.out.println("A nota m�dia do aluno � "+notaMedia);
	}
}
