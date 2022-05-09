/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.AdminSection;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import static jdk.nashorn.internal.objects.ArrayBufferView.length;

/**
 *
 * @author 20122
 */
public class support {
//       public static boolean isNumeric(String strNum) {
//           int i;
//           for(i=0;i<length(strNum);i++){
//    if (strNum == null) {
//        return false;
//    }
//    try {
//        double d = Double.parseDouble(strNum);
//    } catch (NumberFormatException nfe) {
//        return false;
//    }
//}
//           return true;
//       }
       public static boolean contactNoCheck(String contactNo){
           int i;
           for(i=0;i<contactNo.length();i++)
               if (!Character.isDigit(contactNo.charAt(i)))
                   return false;
             return true;
       }
       
    
}
