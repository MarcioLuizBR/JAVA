import javax.swing.JOptionPane;

public class entradaDados {
    public static void main(String[] args) {
        int idade;
        idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade da pessoa"));
        // System.out.println("A idade informada foi: " + idade + " anos");

        if (idade >= 18) {
            JOptionPane.showMessageDialog(null,"A idade informada foi: " + idade + " anos");
            JOptionPane.showMessageDialog(null, "Entrada Permitida", "Atenção", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Entrada Proibida para menores de idade", "Atenção", JOptionPane.WARNING_MESSAGE);
        }
    }
}