import java.util.Scanner;
public class Altura {
	public static void main (String [] args) {
		int idade,i=1,cIdoso=0,cJovem=0,cPessoa=0,maiorIdade=0,menorIdade=1000;
		double peso, altura,cPesoS=0,cPesoI=0,cAltura=0, mediaAltura, pPeso;
		Scanner in = new Scanner (System.in);
		for (i=1;i<=25;i++) {
			System.out.println("Digite a idade da "+i+" pessoa:");
			idade = in.nextInt();
			System.out.println("Digite a altura da "+i+" pessoa: ");
			altura = in.nextDouble();
			System.out.println("Digite o peso da "+i+" pessoa: ");
			peso = in.nextDouble();
			if (idade > 50) {
				cIdoso = cIdoso+ 1;
			}
			if (idade <= 20 && idade >= 10) {
				cJovem = cJovem + 1;
				cAltura = cAltura + altura;
			}
			if (peso <= 40) {
				cPessoa = cPessoa + 1;
			}
			if (idade >= maiorIdade) {
				maiorIdade = idade;
				cPesoS = peso;
			}
			if(idade <= menorIdade) {
				menorIdade = idade;
				cPesoI = peso;
			}
		}
		mediaAltura = cAltura / cJovem ;
		pPeso = 100 / 25 * cPessoa;
		System.out.println("Quantidade de pessos com mais 50 Anos: "+cIdoso+" pessoas");
		System.out.println("a M�dia das alturas com idade entre 10 e 20 anos: "+mediaAltura+"m");
		System.out.println("A porcentagem de pessoas com peso abaixo de 40KG: "+pPeso+"%");
		System.out.println("O peso da pessoa mais velha:"+cPesoS+"Kg");
		System.out.println("O peso da pessoa mais nova:"+cPesoI+"Kg");
		}
	}
		
