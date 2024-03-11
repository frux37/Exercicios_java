import javax.swing.JOptionPane;
public class Exercicio2 {

    public static void main(String[] args) {
        
        String numero1 = JOptionPane.showInputDialog("Informe um número");
        String numero2 = JOptionPane.showInputDialog("Informe o segundo número: ");
        
        int num1 = Integer.parseInt(numero1);
        int num2 = Integer.parseInt(numero2);
        int resultado;
        
        if(num1>num2){
            JOptionPane.showMessageDialog(null, num1);
            resultado = num1 - num2;
            JOptionPane.showMessageDialog(null, resultado);
        }
        else {
            JOptionPane.showMessageDialog(null, num2);
            resultado = num2 - num1;
            JOptionPane.showMessageDialog(null, resultado);
        }
        
    }
    
}
