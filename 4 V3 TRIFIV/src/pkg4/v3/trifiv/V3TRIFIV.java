package pkg4.v3.trifiv;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class V3TRIFIV {

    public static void main(String[] args) throws IOException {
        
        BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
        int numero;
        
        System.out.println("Dame el numero");
            numero = Integer.parseInt(bufEntrada.readLine());
            
           System.out.println(retornaMultiplo(numero));
        
    }
    
    public static String retornaMultiplo (int num){
        
        int mult3;
        int mult5;
        
        mult3 = num % 3;
        mult5 = num % 5;
        
         if(mult3 == 0 && mult5 == 0){
                return "TRIVIV";
            }else if(mult3 ==0){
                return "TRI";
            }else if(mult5 == 0){
                return "FIV";
            }
        
        return null;
        }
    
}
