import com.automationanywhere.botcommand.SplitString;
import com.automationanywhere.botcommand.data.Value;
import com.automationanywhere.botcommand.data.impl.ListValue;
import static org.testng.Assert.*;

import com.automationanywhere.botcommand.data.impl.StringValue;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestSplitString {
    SplitString splitString = new SplitString();
    @Test
    void shouldReturnList(){
        ListValue<String> actual = splitString.action("mike#mike","");
        assertEquals(String.valueOf(actual.get(0)),"m");
    }
}
