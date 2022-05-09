/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.AdminSection;

import static GUI.AdminSection.support.contactNoCheck;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;


/**
 *
 * @author 20122
 */
public class Book {
    private String callnumber;
    private String name;
    private String author;
    private String publisher;
    private int quantity;
    private boolean check=true;
    
    public Book(String callnumber, String name, String author, String publisher, int quantity) {
       
        if(!"".equals(name))
        this.name = name;
        else
            check=false;
        if(!"".equals(author))
        this.author = author;
        else
            check= false;
        if(!"".equals(publisher))
        this.publisher = publisher;
        else
            check=false;
        if(!"".equals(quantity))
        this.quantity = quantity;
        else
            check=false;
        if(contactNoCheck(callnumber))
        this.callnumber = callnumber;
        else 
            check=false;
    }

    public String getCallnumber() {
        return callnumber;
    }

    public void setCallnumber(String callnumber) {
        if(contactNoCheck(callnumber))
        this.callnumber = callnumber;
        else 
            check=false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public boolean validtyCheck(){
        return check;
    }
    public void addToFile() throws FileNotFoundException, IOException{
        FileWriter f = new FileWriter("books.txt",true);
        BufferedWriter out = new BufferedWriter(f);
	  out.write(callnumber+","+ name+","+author+","+publisher+","+quantity+"\n");
	  out.close();
    }  
    
}
