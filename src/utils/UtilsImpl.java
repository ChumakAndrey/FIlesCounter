package utils;

import java.io.File;

/**
 * Created by Администратор on 02.10.2017.
 */
public class UtilsImpl implements Utils {
    long countedFiles=0;
    /**
     * Рекурсивный метод, который считает количество файлов в папке.
     * Если в заданной директории есть вложенные папки, метод вызывает сам себя.
     *
     * @param path полный путь к директории, в которой нужен подсчет файлов.
     **/
    @Override
    public long amountOfFiles(String path) {
        File folder = new File(path);
        if (folder.exists()){
        File[] fileArray = folder.listFiles();
        for(File file : fileArray) {
            if (file.isDirectory()) {
                countedFiles = amountOfFiles(file.getPath());
            } else {
                countedFiles++;
            }
        }
        } else{
            System.out.println("Directory " + path + " doesn't exist. Please check it.");
        }
        return countedFiles;
    }


}
