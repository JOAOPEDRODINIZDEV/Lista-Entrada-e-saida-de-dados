import java.util.Scanner;

public class questao05 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua iadde: ");
        float anos = scanner.nextFloat();
        
        System.out.println("Digite quantos meses: ");
        float meses = scanner.nextFloat();

        System.out.println("Digite quantos dias: ");
        double dias = scanner.nextFloat();

        double dias_anos = (anos*365);
        double dias_meses = (meses*30);
        double resultado = (dias) + (dias_anos) + (dias_meses);

        System.out.println("Quantidade em dias é: "+ resultado);
    }   
}
