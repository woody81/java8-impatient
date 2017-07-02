package cz.woody81.java8.chapter01;

import java.io.File;
import java.util.Arrays;

import org.junit.Test;

public class Exercise02 {
	
	@Test
	public void run() {
		File parentDir = new File(".");
		System.out.println(Arrays.toString(parentDir.listFiles(File::isDirectory)));
		System.out.println("---------------");
		System.out.println(Arrays.toString(parentDir.listFiles(dir -> dir.isDirectory())));
	}

}