package utils;

import java.io.File;

/**
 * Created by Администратор on 02.10.2017.
 */
public class UtilsImpl implements Utils {
    /**
     * Рекурсивный метод, который считает количество файлов в папке.
     * Если в заданной директории есть вложенные папки, метод вызывает сам себя.
     *
     * @param path полный путь к директории, в которой нужен подсчет файлов.
     **/
    @Override
    public long amountOfFiles(String path) {
        long countedFiles=0;
        File folder = new File(path);
        File[] fileArray = folder.listFiles();
        for(File file : fileArray){
            if(file.isDirectory()){
                amountOfFiles(file.getPath());
            }
            countedFiles++;
        }
        return countedFiles;
    }


}
