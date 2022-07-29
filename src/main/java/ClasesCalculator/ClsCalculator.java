package ClasesCalculator;


import javax.swing.JOptionPane;


/**
 *
 * @author orlandoacevedo
 */
public class ClsCalculator {

    public static void main(String[] args) {

        String menu = """
                      seleccione una opcion:
                      
                      1. Operacion
                      2. Salir
                      """;
        var opcionMenu = JOptionPane.showInputDialog(menu);

        if (opcionMenu.equals("2")) {

        }
        
            
        do{
            opcionMenu = JOptionPane.showInputDialog(null, opcionMenu, "Calculadora", JOptionPane.DEFAULT_OPTION);
            try {
                if(opcionMenu.equals("1")){
                    Operations operaciones = new Operations();
                    operaciones.InicioOperaciones();
                }
                if(Integer.parseInt(opcionMenu) < 1 || Integer.parseInt(opcionMenu) > 2 || opcionMenu.equals("")){
                    JOptionPane.showMessageDialog(null, "Por favor introducir 1 o 2", "Calculadora", JOptionPane.ERROR_MESSAGE);
                }
            }
            catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Por favor introducir 1 o 2", "Calculadora", JOptionPane.ERROR_MESSAGE);
            }
//            if(option.equals("1")){
//                ClsOperaciones operaciones = new ClsOperaciones();
//                operaciones.InicioOperaciones();
//            }
//            if(Integer.parseInt(option) < 1 || Integer.parseInt(option) > 2 || option.equals("")){
//                JOptionPane.showMessageDialog(null, "Por favor introducir 1 o 2", "Calculadora", JOptionPane.ERROR_MESSAGE);
//            }
        }while(!opcionMenu.equals("2"));  
    }

        }
 
   
