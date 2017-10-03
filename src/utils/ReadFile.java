package utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Администратор on 03.10.2017.
 */
public final class ReadFile {
    public static List<String> readTxtFile(String txtPath) {
        List<String> pathList = new ArrayList<>();
        String path;
        BufferedReader bufferedReader = null;
        try{
            bufferedReader = new BufferedReader(new java.io.FileReader(txtPath));
            path = bufferedReader.readLine();
            while(path!=null){
                pathList.add(path);
            }
            bufferedReader.close();
        } catch (Exception e) {
            System.out.println("Wrong txt file path");
            pathList = null;
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException ioe){
                ioe.printStackTrace();
            }
        }
        return pathList;
    }
}
