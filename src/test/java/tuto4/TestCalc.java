package tuto4;

//import junit.framework.Test;
//import junit.framework.TestCase;
//import junit.framework.TestSuite;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import sun.jvm.hotspot.utilities.Assert;

public class TestCalc  extends Calc{

    @Test
    public void CalcTest(){
    int res=add(1,2);
    Assertions.assertEquals(res,3);
   }

}


