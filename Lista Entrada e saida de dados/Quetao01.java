import java.util.Scanner;
public class Quetao01{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero de 1 ate 9: ");
        int numero = scanner.nextInt();
        
        if(numero >=1 && numero <=10){
            System.out.println("Tabuada do " + numero + ":");
            for (int i = 1; i <= 10; i++){
                System.out.println(numero + " x " + i + " = " + (numero * i));
            }
        }else{
            System.out.println("Vocẽ digitou um numero maior que 9");
        }   
    } 
}



