package training;

import com.training.MyMath;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.math.BigInteger;

public class MyMathTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();


    @Test
    public void fibonacciCyclicLessThanZero() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("N expected to be in range: [93 > n > 0]");
        long fib = MyMath.fibonacciCyclic(-1);
    }

    @Test
    public void fibonacciCyclicOutOfLong() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("N expected to be in range: [93 > n > 0]");
        long fib = MyMath.fibonacciCyclic(93);
    }

    @Test
    public void fibonacciCyclicTest() {
        long expected = 12586269025L;
        long actual = MyMath.fibonacciCyclic(50);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void fibonacciRecursiveLessThanZero() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("N expected to be in range: [93 > n > 0]");
        long fib = MyMath.fibonacciRecursive(-1);
    }

    @Test
    public void fibonacciRecursiveOutOfLong() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("N expected to be in range: [93 > n > 0]");
        long fib = MyMath.fibonacciRecursive(93);
    }

    @Test
    public void fibonacciRecursiveTest() {
        long expected = 55;
        long actual = MyMath.fibonacciRecursive(10);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void factorialCyclicLessThanZero() {
        thrown.expect(IllegalArgumentException.class);
        long fac = MyMath.factorialCyclic(-1);
    }

    @Test
    public void factorialCyclicZero() {
        long expected = 1;
        long actual = MyMath.factorialCyclic(0);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void factorialCyclicTest() {
        long expected = 120;
        long actual = MyMath.factorialCyclic(5);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void factorialRecursiveLessThanZero() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Factorial for negative numbers is undefined!");
        long fac = MyMath.factorialRecursive(-1);
    }

    @Test
    public void factorialRecursiveZero() {
        long expected = 1;
        long actual = MyMath.factorialRecursive(0);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void factorialRecursiveTest() {
        long expected = 120;
        long actual = MyMath.factorialRecursive(5);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void factorialBigLessThanZero() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Factorial for negative numbers is undefined!");
        BigInteger fac = MyMath.factorialBig(-1);
    }

    @Test
    public void factorialBigZero() {
        BigInteger expected = BigInteger.ONE;
        BigInteger actual = MyMath.factorialBig(0);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void factorialBigTest() {
        BigInteger expected = new BigInteger("93326215443944152681699238856266700490715968264381621468592963895217599993229915608941463976156518286253697920827223758251185210916864000000000000000000000000");
        BigInteger actual = MyMath.factorialBig(100);
        Assert.assertEquals(expected, actual);
    }

}
