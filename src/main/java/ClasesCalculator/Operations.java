package ClasesCalculator;

import javax.swing.JOptionPane;

/**
 *
 * @author orlandoacevedo
 */
public class Operations {
    String operations = """
                        1. Suma
                        2. Resta
                        3. Multiplación
                        4. División
                        5. Potencia
                        6. Raíz cuadrada de un número
                        7. Salir
                        """;
    String suma = "";

    public Operations() {
    }
        String operation = "";
        public void InicioOperaciones() {
        do {
            operation = JOptionPane.showInputDialog(null, operations, "Calculadora", JOptionPane.DEFAULT_OPTION);
            switch (operation) {
                case "1":
                    String suma1 = JOptionPane.showInputDialog(null, "Inserte un numero", "Calculadora", JOptionPane.PLAIN_MESSAGE);
                    String suma2 = JOptionPane.showInputDialog(null, "Inserte un numero", "Calculadora", JOptionPane.PLAIN_MESSAGE);
                    try {
                        double resultado1 = Math.round(Double.parseDouble(suma1) + Double.parseDouble(suma2) * 100.0) / 100.0;
                        JOptionPane.showMessageDialog(null, "El resultado es: " + resultado1, "Calculadora", JOptionPane.INFORMATION_MESSAGE);
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Por favor introducir numeros", "Calculadora", JOptionPane.ERROR_MESSAGE);
                    }
                    break;
                case "2":
                    String resta1 = JOptionPane.showInputDialog(null, "Inserte un numero", "Calculadora", JOptionPane.PLAIN_MESSAGE);
                    String resta2 = JOptionPane.showInputDialog(null, "Inserte un numero", "Calculadora", JOptionPane.PLAIN_MESSAGE);
                    try {
                        double resultado2 = Math.round(Double.parseDouble(resta1) - Double.parseDouble(resta2) * 100.0) / 100.0;
                        JOptionPane.showMessageDialog(null, "El resultado es: " + resultado2, "Calculadora", JOptionPane.INFORMATION_MESSAGE);
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Por favor introducir numeros", "Calculadora", JOptionPane.ERROR_MESSAGE);
                    }
                    break;
                case "3":
                    String mult1 = JOptionPane.showInputDialog(null, "Inserte un numero", "Calculadora", JOptionPane.PLAIN_MESSAGE);
                    String mult2 = JOptionPane.showInputDialog(null, "Inserte un numero", "Calculadora", JOptionPane.PLAIN_MESSAGE);
                    try {
                        double resultado3 = Math.round(Double.parseDouble(mult1) * Double.parseDouble(mult2) * 100.0) / 100.0;
                        JOptionPane.showMessageDialog(null, "El resultado es: " + resultado3, "Calculadora", JOptionPane.INFORMATION_MESSAGE);
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Por favor introducir numeros", "Calculadora", JOptionPane.ERROR_MESSAGE);
                    }
                    break;
                case "4":
                    String div1 = JOptionPane.showInputDialog(null, "Inserte un numero", "Calculadora", JOptionPane.PLAIN_MESSAGE);
                    String div2 = JOptionPane.showInputDialog(null, "Inserte un numero", "Calculadora", JOptionPane.PLAIN_MESSAGE);
                    if(div2.equals("0")){
                        JOptionPane.showMessageDialog(null, "Por favor introducir numeros diferentes de 0", "Calculadora", JOptionPane.ERROR_MESSAGE);
                        break;
                    }
                    try {
                        double resultado4 = Math.round(Double.parseDouble(div1) / Double.parseDouble(div2) * 100.0) / 100.0;
                        JOptionPane.showMessageDialog(null, "El resultado es: " + resultado4, "Calculadora", JOptionPane.INFORMATION_MESSAGE);
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Por favor introducir numeros", "Calculadora", JOptionPane.ERROR_MESSAGE);
                    }
                    break;
                case "5":
                    String pot1 = JOptionPane.showInputDialog(null, "Inserte un numero", "Calculadora", JOptionPane.PLAIN_MESSAGE);
                    String pot2 = JOptionPane.showInputDialog(null, "Inserte un numero", "Calculadora", JOptionPane.PLAIN_MESSAGE);
                    try {
                        double resultado5 = Math.round(Math.pow(Double.parseDouble(pot1), Double.parseDouble(pot2)) * 100.0) / 100.0;
                        JOptionPane.showMessageDialog(null, "El resultado es: " + resultado5, "Calculadora", JOptionPane.INFORMATION_MESSAGE);
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Por favor introducir numeros", "Calculadora", JOptionPane.ERROR_MESSAGE);
                    }
                    break;
                case "6":
                    String raiz = JOptionPane.showInputDialog(null, "Inserte un numero", "Calculadora", JOptionPane.PLAIN_MESSAGE);
                    try {
                        double resultado6 = Math.round(Math.sqrt(Double.parseDouble(raiz)) * 100.0) / 100.0;
                        JOptionPane.showMessageDialog(null, "El resultado es: " + resultado6, "Calculadora", JOptionPane.INFORMATION_MESSAGE);
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Por favor introducir numeros", "Calculadora", JOptionPane.ERROR_MESSAGE);
                    }
                    break;
                case "7":
                    JOptionPane.showMessageDialog(null, "Volvera al menú de inicio", "Calculadora", JOptionPane.INFORMATION_MESSAGE);
                    break;
            }

        } while (!operation.equals(
                "7"));
    }
}

