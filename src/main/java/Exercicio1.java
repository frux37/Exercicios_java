import java.util.Scanner;
public class Exercicio1 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Informe o primeiro número");
        int num1 = entrada.nextInt();
        
        System.out.println("Informe o segundo número");
        int num2 = entrada.nextInt();
        
        if(num1>num2){
            System.out.printf("%d é o maior número ", num1);
        }
        else {
            System.out.printf("%d é o maior número", num2);
        }
        
        
    }
    
}
