
package adapter;

import java.math.BigDecimal;

public class dividerAdapter implements adapterInterface{
multiplierInterface AdapterMulti;
dividerInterface AdapterDivi;

  public void process(String process)
  {
     if(process=="multiplier")
         AdapterMulti=new Multiplier();
     else if(process=="divide") 
          AdapterDivi=new Divider();
  }

    @Override
    public void Adapter(BigDecimal BigDecmial_1, BigDecimal BigDecmial_2,String process) {
        if(process=="multiplier")
         AdapterMulti.multiply(BigDecmial_1, BigDecmial_2,process);
        else if(process=="divide") 
          AdapterDivi.divide(BigDecmial_1, BigDecmial_2,process);
        
    }
  
    
}
