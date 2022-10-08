//Faça um programa que peça dois números e imprima a soma entre eles
import java.util.Scanner; //Pacote importa (Habilita) o teclado
public class Exercicio3 {
    public static void main(String[] args) throws Exception {
        Scanner enterScanner = new Scanner(System.in); // Atribui o nome "enterScanner" à entrada do teclado
        double x; // Aloca na memoria um espaço para a variável x 
        double y; // Aloca na memoria um espaço para a variável y
        System.out.println("Digite um número: "); // Imprime na tela a mensagem
        x = enterScanner.nextInt(); //Grava o valor digitado na variável x
        System.out.println("Digite outro número: "); // Imprime na tela a mensagem
        y = enterScanner.nextInt(); //Grava o valor digitado na variável y

        enterScanner.close(); //Encerra as entradas do teclado

        double z; // Aloca na memoria um espaço para o valor da soma z 
        z = x + y; // Realiza a soma entre as variáveis x e y 
        System.out.println("A soma é igual a " + z); // Imprime na tela a mensagem + o resultado da soma
    }
}
