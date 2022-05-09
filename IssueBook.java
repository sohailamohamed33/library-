/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.AdminSection;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author 20122
 */
public class IssueBook {
    private Book book;
    private Student student;
    private String issuedate;
    private String returnDate;

    public IssueBook(Book book, Student student, String issuedate, String returnDate) {
        this.book = book;
        this.student = student;
        this.issuedate = issuedate;
        this.returnDate = returnDate;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public String getIssuedate() {
        return issuedate;
    }

    public void setIssuedate(String issuedate) {
        this.issuedate = issuedate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }
    
    public void addToFile() throws FileNotFoundException, IOException{
        FileWriter f = new FileWriter("issue.txt",true);
        BufferedWriter out = new BufferedWriter(f);
	  out.write(book.getCallnumber()+","+student.getName()+","+student.getId()+","+student.getPhonenumber()+","+issuedate+","+returnDate+"\n");
	  out.close();
    }  
    
    
}
