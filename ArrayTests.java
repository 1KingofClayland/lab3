import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = {3};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);

    int[] input2 = {1,2,3};
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals(new int[]{3,2,1}, input2);

    int[] input3 = {1,2,3,4,5,6};
    ArrayExamples.reverseInPlace(input3);
    assertArrayEquals(new int[]{6,5,4,3,2,1}, input3);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));

    int[] input2 = {3};
    assertArrayEquals(new int[]{3}, ArrayExamples.reversed(input2));

    int[] input3 = { 1,2,3 };
    assertArrayEquals(new int[]{3,2,1}, ArrayExamples.reversed(input3));

    int[] input4 = { 1,2,3,4,5,6 };
    assertArrayEquals(new int[]{6,5,4,3,2,1}, ArrayExamples.reversed(input4));
  }

  @Test
  public void testAverageWithoutLowest() {
    double[] input1 = {};
    double[] input2 = {1};
    double[] input3 = {1,2,3};
    double[] input4 = {1,2,3,4};
    double[] input5 = {2,1,3};
    double[] input6 = {3,4,2,1,5};
    double[] input7 = {1,1,4,1};
    double[] input8 = {1,3,1};

    assertEquals(0.0, ArrayExamples.averageWithoutLowest(input1), 0.0);
    assertEquals(0.0, ArrayExamples.averageWithoutLowest(input2), 0.0);
    assertEquals(2.5, ArrayExamples.averageWithoutLowest(input3), 0.0);
    assertEquals(3.0, ArrayExamples.averageWithoutLowest(input4), 0.0);
    assertEquals(2.5, ArrayExamples.averageWithoutLowest(input5), 0.0);
    assertEquals(3.5, ArrayExamples.averageWithoutLowest(input6), 0.0);
    assertEquals(2.0, ArrayExamples.averageWithoutLowest(input7), 0.0);
    assertEquals(2.0, ArrayExamples.averageWithoutLowest(input8), 0.0);
  }
}
