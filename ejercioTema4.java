import javax.swing.JOptionPane;
public class ejercioTema4 {
    public static void main(String[] args) {
        int numeroIf = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero:"));
        if (numeroIf>0) {
            JOptionPane.showMessageDialog(null,"El número es positivo");
        }

            else if(numeroIf == 0) {
                JOptionPane.showMessageDialog(null,"El número es Cero");
            }
                else if(numeroIf<0){
                    JOptionPane.showMessageDialog(null,"El número es Negativo");
                }


    }

}
