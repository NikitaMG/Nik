import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

public class TaskTest {
    @Test
    public void testTask(){
        Task task = new Task();
        Assert.assertEquals(3,task.romanToInt("III"));
        Assert.assertEquals(58,task.romanToInt("LVIII"));
        Assert.assertEquals(1994,task.romanToInt("MCMXCIV"));
    }
    @After
    public void cleanUp(){
        System.setOut(null);
    }
}
