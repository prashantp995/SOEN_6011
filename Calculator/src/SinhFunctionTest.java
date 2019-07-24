import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SinhFunctionTest {

  private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
  private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
  private final PrintStream originalOut = System.out;
  private final PrintStream originalErr = System.err;

  @Before
  public void setUpStreams() {
    System.setOut(new PrintStream(outContent));
    System.setErr(new PrintStream(errContent));
  }

  @After
  public void restoreStreams() {
    System.setOut(originalOut);
    System.setErr(originalErr);
  }

  @Test
  public void InitCalculation_invalidInput() {
    SinhFunction sinhFunction = new SinhFunction();
    ByteArrayInputStream input = new ByteArrayInputStream("My string".getBytes());
    System.setIn(input);
    sinhFunction.InitCalculation();
    Assert.assertTrue(UIMessages.ERROR_MESSAGE.equalsIgnoreCase(outContent.toString().trim()));
    System.setIn(System.in);
  }

  @Test
  public void InitCalculation_validInput() {
    SinhFunction sinhFunction = new SinhFunction();
    ByteArrayInputStream input = new ByteArrayInputStream("1".getBytes());
    System.setIn(input);
    sinhFunction.InitCalculation();
    System.out.println(outContent.toString().trim().contains("1.17520119364"));
    System.setIn(System.in);
  }


  @Test
  public void validateAndCalculateSinhx() {
  }

  @Test
  public void calculateSinh() {
  }
}