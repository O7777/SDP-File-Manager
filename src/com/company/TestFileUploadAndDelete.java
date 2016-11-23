package com.company;



public class TestFileUploadAndDelete {

    public static void main(String[] args){

//        Stock abcStock = new Stock();
        FileObject SDPLectureFiles = new FileObject("MVC.pdf", "Lecture 9","Said Abduvaliev");

//        BuyStock buyStockOrder = new BuyStock(abcStock);
//        SellStock sellStockOrder = new SellStock(abcStock);
        UploadFile uploadFile = new UploadFile(SDPLectureFiles);
        DeleteFile deleteFile = new DeleteFile(SDPLectureFiles);

//        Broker broker = new Broker();
//        broker.takeOrder(buyStockOrder);
//        broker.takeOrder(sellStockOrder);
        FileManager fileManager = new FileManager();
        fileManager.chooseFile(uploadFile);
        fileManager.chooseFile(uploadFile);
        fileManager.chooseFile(deleteFile);

        fileManager.manageFile();

//        broker.placeOrders();

    }
}
