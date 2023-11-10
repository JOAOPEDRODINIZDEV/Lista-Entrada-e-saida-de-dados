import java.util.Scanner;

public class Questao08{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Informe o valor da diária normal: ");
        double diariaNormal = scanner.nextDouble();

        int numApartamentos = 42;
        double taxaPromocao = 0.22;
        double taxaOcupacaoSemPromocao = 0.40;
        double taxaOcupacaoComPromocao = 0.70;
        int numMeses = 1; 

        double diariaPromocao = diariaNormal * (1 - taxaPromocao);
        double receitaSemPromocao = numApartamentos * diariaNormal * taxaOcupacaoSemPromocao * numMeses;
        double receitaComPromocao = numApartamentos * diariaPromocao * taxaOcupacaoComPromocao * numMeses;
        double lucroOuPrejuizo = receitaComPromocao - receitaSemPromocao;

        System.out.printf("Diária durante a promoção: R$ %.2f\n", diariaPromocao);
        System.out.printf("Receita média sem a promoção: R$ %.2f\n", receitaSemPromocao);
        System.out.printf("Receita média com a promoção: R$ %.2f\n", receitaComPromocao);
        System.out.printf("Lucro ou prejuízo mensal com a promoção: R$ %.2f\n", lucroOuPrejuizo);

    }
}
