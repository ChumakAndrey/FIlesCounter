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
            /*if(!file.exists()){
                file.createNewFile();
            }*/

            printWriter = new PrintWriter(file.getAbsoluteFile());
            int i = 1;
            try{
                for(FolderInfo info : folderInfoList) {

                    directoryInfo = String.format("%d) %s;",
                            i++,
                            info.toString());
                    printWriter.println(directoryInfo);
                    System.out.println(directoryInfo);
                }
            } finally {
                printWriter.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
