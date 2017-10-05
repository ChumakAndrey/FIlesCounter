package main;

import model.FolderInfo;
import utils.FileWriter;
import utils.FilesCounter;
import utils.ReadFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

/**
 * Created by Администратор on 02.10.2017.
 */
public class Main {

    public static void main(String[] args) {
        List<String> pathsColection = null;
        List<FolderInfo> folderInfos = null;

        if ((args != null) && (args.length == 2)) {

            File fileToRead = new File(args[0]);

            if (fileToRead.exists() && fileToRead.isFile()) {
                pathsColection = ReadFile.readTxtFile(args[0]);
                folderInfos = FilesCounter.getFoldersInfo(pathsColection);
                FileWriter.writeToFile(folderInfos, args[1]);

            } else {
                System.out.println("Can't read file " + args[0]);
            }


        } else {
            System.out.println("Check command line. Parameters are incorrect.");
        }

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String userCommand;
        try{
            while (true){
                System.out.println("To quit type \"q\"...");
                System.out.println("To find out amount of files in any folder, enter path..." );
                userCommand = bufferedReader.readLine();

                if (userCommand.equalsIgnoreCase("q")) break;

                File file = new File(userCommand);
                if ((file.exists()) && (file.isFile())) {
                    pathsColection = ReadFile.readTxtFile(userCommand);
                    folderInfos = FilesCounter.getFoldersInfo(pathsColection);
                    FileWriter.writeToFile(folderInfos, args[1]);
                } else System.out.println("You entered incorrect path. Check it.");
            }
        } catch (IOException e){
            e.printStackTrace();
        }

    }


}
