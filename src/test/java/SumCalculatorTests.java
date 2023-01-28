
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SumCalculatorTests {
    private SumCalculator sumCalculator;

    @BeforeEach
    public void beforeEach() {
        sumCalculator = new SumCalculator();
    }

    @Test
    public void testSum1InputHandledCorrectly() {
        //When
        int actual = sumCalculator.sum(1);
        //Then
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSum3InputHandledCorrectly() {
        //When
        int actual = sumCalculator.sum(3);
        //Then
        int expected = 6;
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void testThat0InputHandledCorrectly() {
        Assertions.assertThrows(IllegalArgumentException.class,
                ()->new SumCalculator().sum(0));
    }
}
