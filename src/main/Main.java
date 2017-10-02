package main;

import utils.Utils;
import utils.UtilsImpl;

/**
 * Created by Администратор on 02.10.2017.
 */
public class Main {
    public static void main(String[] args){
        UtilsImpl utils = new UtilsImpl();

        System.out.println(utils.amountOfFiles("C:\\Java\\FileCounter-master\\FileCounter"));
    }

}
