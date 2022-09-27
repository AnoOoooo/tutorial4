package tuto4;

//import junit.framework.Test;
//import junit.framework.TestCase;
//import junit.framework.TestSuite;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import sun.jvm.hotspot.utilities.Assert;

public class TestCalc2  extends Calc{

    @Test
    public void CalcTest(){
        int res=subtract(1,2);
        Assertions.assertEquals(res,-1);
    }

}

