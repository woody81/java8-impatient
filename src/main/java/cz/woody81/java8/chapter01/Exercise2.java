package cz.woody81.java8.chapter01;

import java.io.File;
import java.util.Arrays;

import org.junit.Test;

public class Exercise2 {
	
	@Test
	public void perform() {
		File parentDir = new File(".");
		File[] subDirs = parentDir.listFiles(File::isDirectory);
		System.out.println(Arrays.toString(subDirs));
	}

}