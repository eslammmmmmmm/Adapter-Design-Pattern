
package adapter;

import java.math.BigDecimal;


public class Multiplier implements multiplierInterface{
     BigDecimal product;
    @Override
    public BigDecimal multiply(BigDecimal BigDecmial_1, BigDecimal BigDecmial_2,String process) {
        product=BigDecmial_1.multiply(BigDecmial_2);
        return product;
    }
    
}
