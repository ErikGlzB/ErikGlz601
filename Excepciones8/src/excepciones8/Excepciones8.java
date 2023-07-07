
package excepciones8;

public class Excepciones8 {

    public static void main(String[] args) {
       
        try {
            
            Class.forName("ClassNoExistente");
        } catch (ClassNotFoundException e) {
            System.out.println("La clase ingresada no se encuentra");
        }
        
    }
    
}
