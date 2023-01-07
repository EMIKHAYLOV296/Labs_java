import org.junit.Assert;
import org.junit.Test;
import ru.rsatu.app.ForTest;
import ru.rsatu.dep.Dep;

public class ForTestTest {
    @Test
    public void testJson() {
        String input = "{\"name\":\""+Dep.getString()+"\"}";
        String result = "{\"name\":\"Hi, im dependency\"}";
        Assert.assertEquals(result, 
        ForTest.jsonToString(ForTest.stringToJson(input)));
    }
}