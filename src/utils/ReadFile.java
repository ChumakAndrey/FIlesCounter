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
        BufferedReader bufferedReader = null;
        try{
            bufferedReader = new BufferedReader(new FileReader(txtPath));
            String path = null;
            while((path = bufferedReader.readLine())!=null){
                pathList.add(path);
            }
            bufferedReader.close();
        } catch (Exception e) {
            e.getMessage();
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
