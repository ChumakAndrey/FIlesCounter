package utils;

import model.FolderInfo;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Администратор on 02.10.2017.
 */
public final class FilesCounter {

    public static long amountOfFiles(String path) {
        long countedFiles=0;
        File folder = new File(path);
        File[] fileArray = folder.listFiles();
        for(File file : fileArray){
            if(file.isDirectory()){
                countedFiles = countedFiles + amountOfFiles(file.getPath());
            }
                countedFiles++;
        }
        return countedFiles;
    }

    public static List<FolderInfo> getFoldersInfo (List<String> pathColection){
        List<FolderInfo> resultList = new ArrayList<>();
        for (String path : pathColection){
            long amountOfFiles = amountOfFiles(path);
            FolderInfo folderInfo = new FolderInfo(path, amountOfFiles);
            resultList.add(folderInfo);
        }
        return resultList;
    }
}
