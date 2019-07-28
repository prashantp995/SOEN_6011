import org.junit.Assert;

public class ValidatorTest {

  /**
   * When user inputs valid numeric number and values is  not with in range of datatype  then
   * function should return false
   */
  @org.junit.Test
  public void testValidateInputRangeInvalidInput() {
    double inputValue = 2 * Double.MAX_VALUE;
    double inputValueNegative = -2 * Double.MAX_VALUE;
    Assert.assertFalse(ValidationUtil.validateInputRange(inputValue));
    Assert.assertFalse(ValidationUtil.validateInputRange(inputValueNegative));
  }

  /**
   * When user inputs valid numeric number and value is with in range of datatype , but output
   * returned by function is more/less than datatype can store then function should return false
   */
  @org.junit.Test
  public void testValidateOutputRange() {
    Assert.assertFalse(ValidationUtil.validateOutputRange(Double.NEGATIVE_INFINITY));
    Assert.assertFalse(ValidationUtil.validateOutputRange(Double.POSITIVE_INFINITY));
  }
}