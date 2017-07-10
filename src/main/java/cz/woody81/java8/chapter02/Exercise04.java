package cz.woody81.java8.chapter02;

import org.junit.Test;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by Ondra on 9. 7. 2017.
 */
public class Exercise04 {

  @Test
  public void perform() {
    int[] numbers = {1, 4, 9, 16};
    System.out.println(Arrays.toString(IntStream.range(1, 5).map(p -> p * p).toArray()));
  }

}
