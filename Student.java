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
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author 20122
 */
public class Student {
    private String name;
    private String password;
    private String address;
   private String phonenumber;
   private String city;
   private String email;
    private String id;
    private boolean check=true;
    private int i=0; // to count how many books

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public Student(String name, String password, String address, String phonenumber, String city, String email, String id,int i) {
       if(!"".equals(name))
        this.name = name;
        else
            check=false;
        if(!"".equals(password))
        this.password = password;
        else
            check=false;
        if(!"".equals(address))
        this.address = address;
        else
            check=false;
        if(contactNoCheck(phonenumber)) {
            this.phonenumber = phonenumber;
        } else 
            check=false;
        if(!"".equals(city))
        this.city = city;
        else
            check=false;
        
        String regex = "^(.+)@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        if (matcher.matches())
        this.email = email;
        else 
            check=false;
        if(contactNoCheck(id)) {
            this.id = id;
        } else 
            check=false;
        this.i=i;
       
    }

    public boolean isCheck() {
        return check;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        if(contactNoCheck(phonenumber)) {
            this.phonenumber = phonenumber;
        } else 
            check=false;
    }
        

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        String regex = "^(.+)@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        if (matcher.matches())
        this.email = email;
        else 
            check=false;
    }    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

//    public Book getBook1() {
//        return book1;
//    }
//
//    public void setBook1(Book book1) {
//        this.book1 = book1;
//    }
//
//    public String getIssuedate1() {
//        return issuedate1;
//    }
//
//    public void setIssuedate1(String issuedate1) {
//        this.issuedate1 = issuedate1;
//    }
//
//    public String getReturndate1() {
//        return returndate1;
//    }
//
//    public void setReturndate1(String returndate1) {
//        this.returndate1 = returndate1;
//    }
//
//    public Book getBook2() {
//        return book2;
//    }
//
//    public void setBook2(Book book2) {
//        this.book2 = book2;
//    }
//
//    public String getIssuedate2() {
//        return issuedate2;
//    }
//
//    public void setIssuedate2(String issuedate2) {
//        this.issuedate2 = issuedate2;
//    }
//
//    public String getReturndate2() {
//        return returndate2;
//    }
//
//    public void setReturndate2(String returndate2) {
//        this.returndate2 = returndate2;
//    }
//
//    public Book getBook3() {
//        return book3;
//    }
//
//    public void setBook3(Book book3) {
//        this.book3 = book3;
//    }
//
//    public String getIssuedate3() {
//        return issuedate3;
//    }
//
//    public void setIssuedate3(String issuedate3) {
//        this.issuedate3 = issuedate3;
//    }
//
//    public String getReturndate3() {
//        return returndate3;
//    }
//
//    public void setReturndate3(String returndate3) {
//        this.returndate3 = returndate3;
//    }
    
      public void addToFile() throws FileNotFoundException, IOException{
        FileWriter f = new FileWriter("students.txt",true);
        BufferedWriter out = new BufferedWriter(f);
	  out.write(name+","+password+","+address+","+phonenumber+","+city+","+email+","+id+"\n");
	  out.close();
    }  
    
}
