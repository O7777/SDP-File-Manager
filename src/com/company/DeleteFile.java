package com.company;



public class DeleteFile implements File{
    private FileObject abcStock;

    public DeleteFile(FileObject abcStock){
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.deleteFile();
    }
}
