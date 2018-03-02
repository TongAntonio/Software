import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

public class LogAnalyzerTest {

    LogAnalyzer analyzer;

   /* private class StubExtensionManager implements IExtensionManager{
        private boolean stubValidValue = false;

        @Override
        public boolean isValidExtension(String filename){
            return stubValidValue;
        }
    } */

    @BeforeEach
    public void setup()
    {
        //analyzer = new LogAnalyzer();
    }

    @Test
    public void TestIsValidFileNameValidFile() {
        boolean result = analyzer.isValidLogFileName("whatever.SLF");
        assertTrue(result,"Filename should be valid");
    }

    @Test
    public void TestIsValidFileNameValidFileLowerCase() {
        boolean result = analyzer.isValidLogFileName("whatever.SLF");
        assertTrue(result,"Filename should be valid");
    }

    @Test
    public void TestIsValidFileNameValidFileUpperCase() {
        boolean result = analyzer.isValidLogFileName("whatever.SLF");
        assertTrue(result,"Filename should be valid");
    }

    @Test
    public void testIsValidFileNameThrowsExceptionEmptyName()
    {
        Throwable exception = assertThrows(IllegalArgumentException.class, ()-> { analyzer.isValidLogFileName("EmptyName"); });
    }

    @AfterEach
    public void testIsValidFileNameThrowsExceptionNullName()
    {
        Throwable exception = assertThrows(IllegalArgumentException.class, ()-> { analyzer.isValidLogFileName("NullName"); });
    }

    @AfterAll
    public void testIsValidFileNameValidFileRememberTrue()
    {
        analyzer.isValidLogFileName("whatever.slf");
        assertTrue(analyzer.getWasLastFileNameValid());
    }

    @Test
    void testSin()
    {
        Calculator cal = new Calculator();
        assertTimeout(Duration.ofMillis(10),()->{cal.sin(30);});
    }

    @Test
    public void testIsValidFileNameTooShortName(){
       /* StubExtensionManager stubMgr = new StubExtensionManager();
        stubMgr.stubValidValue = true;

        //LogAnalyzer analyzer = new LogAnalyzer();
        analyzer.setExtensionManager(stubMgr);

        boolean result = analyzer.isValidLogFileName("a.slf");
        assertFalse(result,"File name should be more than 5 characters");*/
    }
}