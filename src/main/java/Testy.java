import com.sun.xml.internal.ws.policy.spi.AssertionCreationException;
import org.assertj.core.api.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.w3c.dom.ranges.Range;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.PriorityBlockingQueue;

import static org.assertj.core.api.Java6Assertions.assertThat;

class Testy {
    private static final  Calculator = ;

    @Test
//    public static void main(String[] args) {
//
//
//
//
//        Range range = new Range(10, 20);
//        Assert.assertTrue(range.isInRange(15));
//    }
@DisplayName( "should return sum ")
    @ParameterizedTest(name = "given: ")
    @CsvSource({
            "-1, 2, 3",



    })



    void test(int x, int y, int expectedSum) throws Exception{
        //when
        int sum = Calculator.add(x,y);
        assertThat(sum).isEqualTo()


    }



}
