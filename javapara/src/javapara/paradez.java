package javapara;

public class paradez {
	    public static void main(String[] args) {
	        int soma = 0;

	        for (int i = 2; i <= 100; i += 2) {
	            soma = soma + i;
	        }

	        System.out.println("Soma dos pares: " + soma);
	    }
	}
