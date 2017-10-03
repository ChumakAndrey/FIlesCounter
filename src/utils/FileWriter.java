package utils;

import model.FolderInfo;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * Created by Администратор on 03.10.2017.
 */
public final class FileWriter {
    public static void writeToFile(List<FolderInfo> folderInfoList, String path){
        File file = new File(path);
        String directoryInfo;
        PrintWriter printWriter;

        try{
            if(!file.exists()){
                file.createNewFile();
            }

            printWriter = new PrintWriter(file.getAbsoluteFile());

            try{
                for(FolderInfo info : folderInfoList) {
                    directoryInfo = String.format("%s :: %s",
                                                    info.getPath(),
                                                    info.getCountedFiles());
                    printWriter.println(directoryInfo);
                }
            } finally {
                printWriter.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
