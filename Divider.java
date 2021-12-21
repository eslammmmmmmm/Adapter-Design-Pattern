
package adapter;

import java.math.BigDecimal;


public class Divider implements dividerInterface{

    BigDecimal quotient;
    @Override
    public BigDecimal divide(BigDecimal BigDecmial_1, BigDecimal BigDecmial_2,String process) {
        quotient=BigDecmial_1.divide(BigDecmial_2);
        return quotient;
    }
    
}
