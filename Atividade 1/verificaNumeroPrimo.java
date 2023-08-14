package atividade;


public class Atividade {

    public static int verificaNumeroPrimo(Integer n) {
        if (n <= 1) {
            return 0; // 0 e 1 não são primos
        }
        
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return 0; // Número não é primo
            }
        }
        
        return 1; // Número é primo
    }

    public static void main(String[] args) {
        Integer numero = 17; // Alterar este valor caso queira verificar outro número
        
        int resultado = verificaNumeroPrimo(numero);
        
        if (resultado == 1) {
            System.out.println(numero + " é primo.");
        } else {
            System.out.println(numero + " não é primo.");
        }
    }
}
