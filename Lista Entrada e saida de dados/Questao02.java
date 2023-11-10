import java.util.Scanner;
public class Questao02{
    public static void main(String[] args){
        float c;
        float f;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero em celcius:");
        c = scanner.nextInt();
        f =(9*c+160)/5;
        System.out.println("A temperatura de celcius " +c+ " Convertido em faren é "+f);
    }

}
