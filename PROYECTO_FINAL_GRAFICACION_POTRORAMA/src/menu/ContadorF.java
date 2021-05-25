
package menu;

import java.util.Random;

/**
 *
 * @author MOY-PC
 */

public class ContadorF {

    
    public int[] getCardNumbers() {
        
        int[] numero = new int[20];
        int contador= 0;
        
        while(contador< 20) {
            Random r = new Random();
            int cart = r.nextInt(10) + 1;
            int num = 0;
            
            for (int i = 0; i < 20; i++) {
                if(numero[i] == cart) {
                    num++;
                }
            }
            if(num < 2) {
                numero[contador] = cart;
                contador++;
            }
        }
        
        
        return numero;
    }
            
}


    
