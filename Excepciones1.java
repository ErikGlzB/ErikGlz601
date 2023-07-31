package excepciones1;

import javax.swing.JOptionPane;

public class Excepciones1 {

  
    public static void main(String[] args) {
       int x,y;
        try {
            
        x = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese numero 1:", "Solicito datos",3));
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage() + " No es numero ENTERO");
        }
        
        
    }
    
}
