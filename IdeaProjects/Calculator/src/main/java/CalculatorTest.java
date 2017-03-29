import org.junit.Assert;
import org.junit.Test;

/**
 * Created by RMTestServices on 22/02/17.
 */
public class CalculatorTest {

    @Test
    public void testmetod1(){
        int a = 3;
        int b = 4;
        int heltal;
        int kontroll = a+b;

        Calculator calc = new Calculator();
        heltal = calc.addition(a,b);

        Assert.assertEquals(kontroll,heltal);
    }
    @Test
    public void testmetod2(){
        int a = 3;
        int b = 4;
        int heltal;
        int kontroll = a+b+1;

        Calculator calc = new Calculator();
        heltal = calc.addition(a,b);
        Assert.assertEquals(kontroll, heltal);
    }
    @Test
    public void testmetod3(){
        int a = 3;
        int b = 4;
        int heltal;
        int kontroll = a+b;

        Calculator calc = new Calculator();
        heltal = calc.addition(a,b);
        Assert.assertEquals(kontroll, heltal);
    }
    @Test
    public void testmetod4(){
        int a = 3;
        int b = 4;
        int heltal;
        int kontroll = a-b;

        Calculator calc = new Calculator();
        heltal = calc.subtraction(a,b);
        Assert.assertEquals(kontroll, heltal);
    }
    @Test
    public void testmetod5(){
        int a = 3;
        int b = 4;
        int heltal;
        int kontroll = a-b;

        Calculator calc = new Calculator();
        heltal = calc.subtraction(a,b);
        Assert.assertEquals(kontroll, heltal);
    }
    @Test
    public void testmetod6(){
        int a = 3;
        int b = -4;
        int heltal;
        int kontroll = a*b;

        Calculator calc = new Calculator();
        heltal = calc.multiplication(a,b);
        Assert.assertEquals(kontroll, heltal);
    }
    @Test
    public void seleniumtest(){
        int a = 3;
        int b = -4;
        int heltal;
        int kontroll = a*b;

        Calculator calc = new Calculator();
        heltal = calc.multiplication(a,b);
        Assert.assertEquals(kontroll, heltal);
    }



}
