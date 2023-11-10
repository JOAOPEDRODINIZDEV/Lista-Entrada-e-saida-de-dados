import java.util.Scanner;
public class Questao03{

    public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite a TEMPO");
    float TEMPO = scanner.nextFloat();

    System.out.println("Digite a velocidade: ");
    float VELOCIDADE = scanner.nextFloat();
  
    float distancia = TEMPO * VELOCIDADE;
    System.out.println("A distancia foi de: "+ distancia);

    float listros = distancia /12;
    System.out.println("A quantidade de litros utilizado foi de: "+ listros);



    }
}
