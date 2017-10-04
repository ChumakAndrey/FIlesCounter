package main;

import model.FolderInfo;
import utils.FilesCounter;
import utils.ReadFile;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Администратор on 03.10.2017.
 */
public class Controller {

    public static List<FolderInfo> getFolderInfo(String txtPath){
        List<FolderInfo> resultList = new ArrayList<>();
        List<String> pathsList = ReadFile.readTxtFile(txtPath);

        for(String path : pathsList){
            long filesQuantity = FilesCounter.amountOfFiles(path);
            FolderInfo singleFolder = new FolderInfo(path, filesQuantity);
            resultList.add(singleFolder);
        }
        return resultList;
    }
}
