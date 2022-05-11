import org.junit.Assert;
import org.junit.Test;

public class CalculadoraTest {

    @Test
    public void sumarTest(){
       double resultado = 16;
       Calculadora calculadora = new Calculadora();
       //doubles tiene problemas de oofset, se acomoda con delta
        Assert.assertEquals(16.0,calculadora.sumar(8 , 8) , 0.001);

    }
    
    @Test
    public void restarTest(){
        Calculadora calculadora = new Calculadora();
        double resultado = 0.0;
        Assert.assertEquals(0.0, calculadora.restar(8,8),0.001);
    }
}
