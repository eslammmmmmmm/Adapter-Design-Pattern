
package adapter;

import java.math.BigDecimal;


public class Adapter {

   
    public static void main(String[] args) {
        processAdapter proc =new processAdapter();
        BigDecimal bd1 = new BigDecimal("1245.123");
        BigDecimal bd2 =new BigDecimal("981.123");
        
        proc.Adapter(bd1,bd2,"multiplier");    
        proc.Adapter(bd1,bd2,"divide");

        
    }
    
}
