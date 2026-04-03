import java.util.Random;
import java.util.Scanner;

class JogoAdivinha {
    public static void main(String[] args) {
    //numeros aléatorios
    Scanner scanner = new Scanner(System.in);
    Random aleatorio = new Random();
    
    int numeroSecreto = aleatorio.nextInt(100) + 1;
    int numero;

    System.out.println("Bem vindos ao jogo de adivinhção!");
    System.out.println("Digite um numero: ");
    numero = scanner.nextInt();

    while (numero != numeroSecreto) {  // Continua enquanto não acertar
        if (numero > numeroSecreto) {
            System.out.println("O número " + numero + " está maior que o número sorteado");
            System.out.println(" Tente novamente!");
        }
        else if (numero < numeroSecreto) {
            System.out.println("O numero " + numero + " está menor que o número sorteado");
            System.out.println(" Tente novamente");
        }
        numero = scanner.nextInt();
    }

    System.out.println("PARABENS! o número " + numero + " é o número sorteado, você está com sorte");
    scanner.close();}
}

