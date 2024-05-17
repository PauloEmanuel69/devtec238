package AtividadesRealizadas;

public class AtidadeD {
	public static void main(String[] args) {
        int contador = 0;
        
        // Utilizando um loop while para imprimir "livre" enquanto contador for menor que 5
        while (contador < 5) {
            System.out.println("livre");
            contador++;
        }
        
        // Utilizando um loop for para imprimir "livre" 5 vezes
        for (int i = 0; i < 5; i++) {
            System.out.println("livre");
        }
    }
}

