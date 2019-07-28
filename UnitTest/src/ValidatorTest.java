import org.junit.Assert;

public class ValidatorTest {

  @org.junit.Test
  public void testValidateInputRangeInvalidInput() {
    double inputValue = 2 * Double.MAX_VALUE;
    double inputValueNegative = -2 * Double.MAX_VALUE;
    Assert.assertFalse(ValidationUtil.validateInputRange(inputValue));
    Assert.assertFalse(ValidationUtil.validateInputRange(inputValueNegative));
  }

  @org.junit.Test
  public void testValidateOutputRange() {
    Assert.assertFalse(ValidationUtil.validateOutputRange(Double.NEGATIVE_INFINITY));
    Assert.assertFalse(ValidationUtil.validateOutputRange(Double.POSITIVE_INFINITY));
  }
}