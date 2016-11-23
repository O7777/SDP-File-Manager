package com.company;


public class UploadFile implements  File{

    private FileObject abcStock;

    public UploadFile(FileObject abcStock){
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.uploadFile();
    }

}
