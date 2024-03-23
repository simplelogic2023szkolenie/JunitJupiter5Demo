import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyFirstTest {

    @Test()
    public void someTest(){
        int i = 10;
        Assertions.assertEquals(10,i);
    }
}
