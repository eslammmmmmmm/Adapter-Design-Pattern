
package adapter;

import java.math.BigDecimal;

public class processAdapter implements adapterInterface{
dividerAdapter adaptermulti;
    @Override
    public void Adapter(BigDecimal BigDecmial_1, BigDecimal BigDecmial_2,String process) {
        if(process=="multiplier" ||process=="divide")
        {
            adaptermulti=new dividerAdapter();
            adaptermulti.Adapter(BigDecmial_1, BigDecmial_2, process);
        }
        
    }

        
    
}
