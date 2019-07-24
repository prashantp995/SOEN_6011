import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.Assert;
import org.junit.Test;

public class SinhFunctionTest {

  @Test
  public void InitCalculation_invalidInput() {
    SinhFunction sinhFunction = new SinhFunction();
    ByteArrayInputStream input = new ByteArrayInputStream("My string".getBytes());
    System.setIn(input);
    final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    final PrintStream originalOut = System.out;
    final PrintStream originalErr = System.err;
    System.setOut(new PrintStream(outContent));
    System.setErr(new PrintStream(errContent));
    sinhFunction.InitCalculation();

    Assert.assertTrue(UIMessages.ERROR_MESSAGE.equalsIgnoreCase(outContent.toString().trim()));
    System.setOut(originalOut);
    System.setErr(originalErr);
  }


  @Test
  public void validateAndCalculateSinhx() {
  }

  @Test
  public void calculateSinh() {
  }
}