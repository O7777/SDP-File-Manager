package com.company;


import java.util.ArrayList;
import java.util.List;

public class FileManager {

    private List<File> fileList = new ArrayList<File>();

    public void chooseFile(File chosenFile){
        fileList.add(chosenFile);
    }

    public void manageFile(){

        for (File order : fileList) {
            order.execute();
        }
        fileList.clear();
    }

}
