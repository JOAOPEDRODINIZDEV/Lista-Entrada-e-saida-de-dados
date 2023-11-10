import java.util.Scanner;
public class Questao09{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

System.out.print("Informe um valor inteiro de três dígitos: ");

int valor = Integer.parseInt(scanner.next());

if(valor < 100 || valor > 999){
System.out.println("Valor fora da faixa permitida");
System.exit(0);
}

int temp = valor;
int inverso = 0; 

while(temp != 0){
inverso = (inverso * 10) + (temp % 10);
temp = temp / 10;
}

System.out.println("O valor original é: " + valor);
System.out.println("O valor invertido é: " + inverso);
    }
}