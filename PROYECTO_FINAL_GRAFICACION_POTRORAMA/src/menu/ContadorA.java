
package menu;

import java.util.Random;

/**
 *
 * @author MOY-PC
 */

public class ContadorA {

    
    public int[] getCardNumbers() {
        
        int[] numero2 = new int[28];
        int contador2= 0;
        
        while(contador2< 28) {
            Random r = new Random();
            int cart = r.nextInt(14) + 1;
            int num = 0;
            
            for (int i = 0; i < 24; i++) {
                if(numero2[i] == cart) {
                    num++;
                }
            }
            if(num < 2) {
                numero2[contador2] = cart;
                contador2++;
            }
        }
        
        
        return numero2;
    }
            
}


    
