import java.util.Scanner;

 public class App {
    
     // Início do Programa
     public static void main(String[] args) throws Exception {

     // Declaração de Variaveis
     double  fahrenheit;
     double celsius;
     
     // Solicitação de Dados
     Scanner teclado = new Scanner(System.in);
     System.out.println("Digite a temperatura em fahrenheit: ");
     fahrenheit = teclado.nextDouble();
     teclado.close();

     // Calculo Celsius
     celsius = 5 * ((fahrenheit - 32) / 9);

     // Exibir a Resposta para o Usuário
     System.out.println("A temperatura em celsius é " + celsius);
    }
}



