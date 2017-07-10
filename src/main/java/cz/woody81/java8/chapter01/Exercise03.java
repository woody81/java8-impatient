package cz.woody81.java8.chapter01;

import org.junit.Test;

import java.io.File;
import java.util.Arrays;

public class Exercise03 {

  @Test
  public void run() {
    File parentDir = new File("../");
    System.out.println(Arrays.toString(list(parentDir, ".txt")));
  }

  private static File[] list(File dir, String extension) {
    return dir.listFiles(d -> d.getName().endsWith(extension));
  }

}

