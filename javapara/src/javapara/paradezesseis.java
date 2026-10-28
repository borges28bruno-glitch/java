package javapara;
import java.util.Scanner;
public class paradezesseis {
	    public static void main(String[] args) {
	        Scanner ler = new Scanner(System.in);

	        int maior = 0;

	        for (int i = 1; i <= 10; i++) {
	            System.out.print("Digite o " + i + "º número: ");
	            int num = ler.nextInt();

	            if (i == 1 || num > maior) {
	                maior = num;
	            }
	        }

	        System.out.println("Maior valor: " + maior);

	        ler.close();
	    }
	}