/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.AdminSection;
import static GUI.AdminSection.support.contactNoCheck;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.*;

/**
 *
 * @author 20122
 */
public final class Librarian {
   private String name;
   private String password;
   private String address;
   private String phonenumber;
   private String city;
   private String email;
   private boolean check=true;
   
    public Librarian() {
    }

    public Librarian(String name, String password, String address, String phonenumber, String city, String email) {
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
    }

    public boolean check1(){
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
    public void addToFile() throws FileNotFoundException, IOException{
        FileWriter f = new FileWriter("librarians.txt",true);
        BufferedWriter out = new BufferedWriter(f);
	  out.write(name+","+password+","+address+","+phonenumber+","+city+","+email+"\n");
	  out.close();
    }  
    public void readFile() throws FileNotFoundException{
        int count=0;
        File f= new File("librarians.txt");
        Scanner s = new Scanner(f);
        while(s.hasNextLine()){
            String x = s.nextLine();
            String tokens[]= x.split(",");
            tokens[0]=this.name;
            tokens[1]=this.password;
            tokens[2]=this.address;
            tokens[3]=this.phonenumber;
            tokens[4]=this.city;
            tokens[5]=this.email;
            count++;
        }
    }
    
       
       
       
       
       
   }
    
    
   
