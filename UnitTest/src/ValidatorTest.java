import org.junit.Assert;

public class ValidatorTest {

  @org.junit.Test
  public void validateInputRange_InvalidInput() {
    double input_value = 2 * Double.MAX_VALUE;
    double input_value_negative = -2 * Double.MAX_VALUE;
    Assert.assertFalse(ValidationUtil.validateInputRange(input_value));
    Assert.assertFalse(ValidationUtil.validateInputRange(input_value_negative));
  }

  @org.junit.Test
  public void validateOutputRange() {
    Assert.assertFalse(ValidationUtil.validateOutputRange(Double.NEGATIVE_INFINITY));
    Assert.assertFalse(ValidationUtil.validateOutputRange(Double.POSITIVE_INFINITY));
  }
}