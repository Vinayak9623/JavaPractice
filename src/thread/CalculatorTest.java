package thread;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class CalculatorTest {


    @Test
    public void addTest(){
        Calculator calculator =new Calculator();
        int result=calculator.add(2,3);
        Assertions.assertEquals(5,result);
        Assertions.assertNotNull(result);
    }

    @Test
    public void multiTest(){
        Calculator calculator =new Calculator();
        int multi = calculator.multi(2, 5);
        Assertions.assertNotNull(multi);
        Assertions.assertEquals(10,multi);


    }

    @Test
    public void sustituteTest(){
        Calculator calculator =new Calculator();
        int result =calculator.sustitute(3,2);
        Assertions.assertEquals(1,result);
        Assertions.assertNotNull(result);
    }

}