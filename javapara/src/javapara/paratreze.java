package javapara;
import java.util.Scanner;
public class paratreze {
	    public static void main(String[] args) {
	        Scanner ler = new Scanner(System.in);

	        System.out.print("Digite um número: ");
	        int num = ler.nextInt();

	        for (int i = 1; i <= num; i++) {
	            System.out.println(i);
	        }

	        ler.close();
	    }
	}
