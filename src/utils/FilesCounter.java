package utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Администратор on 02.10.2017.
 */
public final class FilesCounter {
   private static long countedFiles=0;
    /**
     * Рекурсивный метод, который считает количество файлов в папке.
     * Если в заданной директории есть вложенные папки, метод вызывает сам себя.
     *
     * @param path полный путь к директории, в которой нужен подсчет файлов.
     **/
    public static long amountOfFiles(String path) {

        File folder = new File(path);
        File[] fileArray = folder.listFiles();
        for(File file : fileArray){
            if(file.isDirectory()){
                countedFiles = amountOfFiles(file.getPath());
            }
            else {
                countedFiles++;
            }
        }
        return countedFiles;
    }

    
}
