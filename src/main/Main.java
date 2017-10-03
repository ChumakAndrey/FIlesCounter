package main;

import utils.FilesCounter;

/**
 * Created by Администратор on 02.10.2017.
 */
public class Main {
    public static void main(String[] args){
        FilesCounter filesCounter = new FilesCounter();

        System.out.println(filesCounter.amountOfFiles("C:\\Java\\TestTask"));
    }

}
