package cz.woody81.java8.chapter01;

import org.junit.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Ondra on 8. 7. 2017.
 */
public class Exercise04 {
    @Test
    public void perform() {
        File root = new File("C:/");
        List<File> files = sortFiles(root);
        System.out.println(Arrays.toString(files.toArray()));
    }

    private List<File> sortFiles(File rootFile) {
        List<File> fileList = new ArrayList<File>();
        fileList.addAll(Arrays.asList(sortFilesByNameType(rootFile.listFiles(File::isDirectory))));
        fileList.addAll(Arrays.asList(sortFilesByNameType(rootFile.listFiles(File::isFile))));
        return fileList;
    }

    private File[] sortFilesByNameType(File[] filesByType) {
        Arrays.sort(filesByType, (first, second) -> {
            return first.getName().toLowerCase().compareTo(second.getName().toLowerCase());
        });
        return filesByType;
    }

}
