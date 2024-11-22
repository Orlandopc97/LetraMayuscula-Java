import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        char letra;
        letra = JOptionPane.showInputDialog("ingresa una letra").charAt(0);

        if (Character.isUpperCase(letra)){
            JOptionPane.showMessageDialog(null,"La letra: " + letra + " esta en mayuscula");
        }else {
            JOptionPane.showMessageDialog(null,"La letra: " + letra + " esta en minuscula");
        }
    }
}