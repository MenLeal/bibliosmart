/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tools;
import javax.swing.JFrame;
import java.awt.Toolkit;

public class Helper {
    
    public static void setCenter(JFrame frame){
        
        double width = Toolkit.getDefaultToolkit().getScreenSize().getWidth();
        double height = Toolkit.getDefaultToolkit().getScreenSize().getHeight();
        
        width = (width - frame.getWidth())/2;
        height = (height - frame.getHeight())/2;
        
        frame.setLocation((int)width,(int)height);
        
        
    }
    public static String convertPassword(char[] password){
        String pass = "";
                
        for(int x = 0; x < password.length; x++){
            pass += password[x];
        }
        
        return pass;
    }
    public static void show(JFrame frame, String massege){
        
        javax.swing.JOptionPane.showMessageDialog(frame, massege);
    }
    public static boolean confirm(JFrame frame,String massege){
        if(javax.swing.JOptionPane.showConfirmDialog(frame, massege,"Confrim To Delete",javax.swing.JOptionPane.YES_NO_OPTION) == 0){
            return true;
        }else{
            return false;
        }
    }
    
}
