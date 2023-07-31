
package excepciones6;

public class Excepciones6 {

   
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        try {
            int element = numbers[5];
        
        System.out.println("El elemento es: " + element);
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Lo siento, haz ingresado un indice superior al maximo en el arreglo.");
        }
        
    }
}

    

