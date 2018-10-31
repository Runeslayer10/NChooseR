/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nchooser;
import javax.swing.*;
/**
 *
 * @author blhad3491
 */
public class NChooseR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String listing = "";
        String nWord, rWord;
        int n, r, numways;

        nWord = JOptionPane.showInputDialog("Please enter how many objects you would "
                + "like to choose.");
        
        n = Integer.parseInt(nWord);

        rWord = JOptionPane.showInputDialog("Please enter how many objects you are "
                + "choosing from.");   
        
        r = Integer.parseInt(rWord);
        
        numways = factorial(n)/(factorial(r)*factorial(n-r));

        listing = "There are " + numways + " ways.";
        
        JOptionPane.showMessageDialog(null, listing);
    }                                         

    static public int factorial (int n) {
        if (n==1 || n==0) {
            return 1;
        } else {
            return (n*factorial(n-1));
        }
    }

    }
    

