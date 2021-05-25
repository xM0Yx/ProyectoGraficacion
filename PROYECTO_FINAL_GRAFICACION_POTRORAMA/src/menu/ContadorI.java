
package menu;

import java.util.Random;

/**
 *
 * @author MOY-PC
 */

public class ContadorI {

    
    public int[] getCardNumbers() {
        
        int[] numero1 = new int[24];
        int contador1= 0;
        
        while(contador1< 24) {
            Random r = new Random();
            int cart = r.nextInt(12) + 1;
            int num = 0;
            
            for (int i = 0; i < 24; i++) {
                if(numero1[i] == cart) {
                    num++;
                }
            }
            if(num < 2) {
                numero1[contador1] = cart;
                contador1++;
            }
        }
        
        
        return numero1;
    }
            
}


    
