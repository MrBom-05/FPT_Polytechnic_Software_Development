/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ASM;

/**
 *
 * @author ANPRO
 */
public class pattern {
    
    
    public boolean ktMA(String sc){
        String pattern = "[a-zA-Z]{2}\\d{5}"; 
        return sc.matches(pattern);
    }
   

    public boolean ktTen(String sc) {
        String pattern = "[a-zA-Z\\s]{1,30}";
        return sc.matches(pattern);
    }
    
}
