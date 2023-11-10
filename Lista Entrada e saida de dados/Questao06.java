import java.util.Scanner;

public class Questao06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a quantidade de segundos do evento: ");
        float duracaoNoEvento = scanner.nextFloat();
        
        int horas = (int) (duracaoNoEvento / 3600);
        int minutos = (int) ((duracaoNoEvento % 3600) / 60);
        int segundos = (int) (duracaoNoEvento % 60);
        
        System.out.println("Duração: " + horas + " horas, " + minutos + " minutos, " + segundos + " segundos.");
        
        
    }
}
