package com.company;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileObject {

    private DateFormat dateFormat = new SimpleDateFormat("dd MMM, yyyy - HH:mm");
    private Date d = new Date();

    private Object attachment;
    private String name, author, fileFormat;
    private String date;

    public FileObject(Object attachment, String name, String author){
        this.attachment = attachment;
        this.name = name;
        this.author = author;
        fileFormat = attachment.toString();
        date = dateFormat.format(d);

        setFileFormat();
    }

    private void setFileFormat(){

        fileFormat= fileFormat.substring(fileFormat.lastIndexOf("."));
    }

    public void uploadFile(){
        System.out.println("Uploading File...\nFile: " + name + fileFormat
                + "\nAuthor: " + author + "\nUploaded: " + date
                + "\nFILE  SUCCESSFULLY UPLOADED\n");
    }

    public void deleteFile(){
        System.out.println("Deleting File...\nFile: " + name + fileFormat
                + "\nAuthor: " + author + "\nUploaded: " + date
                + "\nFILE SUCCESSFULLY DELETED\n");
    }







}
