import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        System.out.println("Quanto está a contação do Dolar do momento atual?: ");
        float cotacao = ler.nextFloat();

        System.out.println("Digite o valor em dolar: ");
        float dola = ler.nextFloat();
        float convercao = cotacao * dola;

        System.out.println("O valor em real é de :"+convercao);
    }
}
