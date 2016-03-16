/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countvowels;

import javax.swing.JOptionPane;

/**
 *
 * @author Adam
 */
public class CountVowels {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String input = JOptionPane.showInputDialog(null, "Please enter a word or sentence:");
        int totalVowels = VowelCount(input);
        JOptionPane.showMessageDialog(null, "The total number of vowels you entered was: " + totalVowels);
        
        
    }
    
    public static int VowelCount(String input){
        
        String checkVowel = null;
        int vowelCount = 0;
        //char vowelChar;
        StringBuilder input1 = new StringBuilder();
        input1.append(input);
        for(int i=0;i<input1.length();i++){
            Character vowelChar = input1.charAt(i);
            checkVowel = vowelChar.toString();
            System.out.println(checkVowel);
            switch (checkVowel) {
                case "a":
                    vowelCount++;
                    break;
                case "e":
                    vowelCount++;
                    break;
                case "i":
                    vowelCount++;
                    break;
                case "o":
                    vowelCount++;
                    break;
                case "u":
                    vowelCount++;
                    break;
            }
        }
        return vowelCount;
    }
    
}
