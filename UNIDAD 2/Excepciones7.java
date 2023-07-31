package excepciones7;

public class Excepciones7 {

    public static void main(String[] args) {
        Object obj = "Hola mundo";
        
        try {
                   
        
        Integer num = (Integer) obj; 
        
        System.out.println("El número es: " + num);
            
        } catch (ClassCastException e) {
            System.out.println("La convercion de tipo de dato es incorrecta.");
        }
        
        
    }
    
}
