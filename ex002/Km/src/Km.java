import java.util.Scanner;
public class Km {
	public static void main (String[] args) {
		Scanner in = new Scanner (System.in);
		int x,km;
		System.out.println("Digite a quantidade de metros");
		x= in.nextInt();
		km=x/1000;
		System.out.println("A convers�o de metros para � "+ km+"KM");
	}
}
