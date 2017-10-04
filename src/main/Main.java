package main;

import model.FolderInfo;
import utils.FileWriter;
import utils.FilesCounter;


import java.util.List;

import static utils.FilesCounter.amountOfFiles;

/**
 * Created by Администратор on 02.10.2017.
 */
public class Main {
    static String pathFile = "C:\\Java";
    static String resultFile = "C:\\Java\\FileCounter-master\\FIlesCounter\\result.csv";

    public static void main(String[] args){

        List<FolderInfo> folderInfos = Controller.getFolderInfo(pathFile);

        System.out.println(amountOfFiles(pathFile));


        FileWriter.writeToFile(folderInfos, resultFile);
    }




}
