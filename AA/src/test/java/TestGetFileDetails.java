import com.automationanywhere.botcommand.GetFileDetails;
import com.automationanywhere.botcommand.data.impl.NumberValue;
import com.automationanywhere.botcommand.exception.BotCommandException;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestGetFileDetails {
    GetFileDetails getFileDetails = new GetFileDetails();
    @Test
    void testReturnFileSize(){
        String  filePath = "E:\\workspace\\AA\\src\\main\\resources\\icons\\sample.svg";
        NumberValue actual = getFileDetails.action(filePath);
        Assert.assertEquals(  actual.getAsDouble(),5027.0);
    }


    @Test
    void testShouldThrowException(){
        Assert.assertThrows(BotCommandException.class,()->{
            getFileDetails.action("");
        });
    }
}
