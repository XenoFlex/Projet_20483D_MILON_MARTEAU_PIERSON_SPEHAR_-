/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testconflits;

/**
 *
 * @author ALEX
 */
public class TestConflits {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double test=3.123456789012345678901234567890123456789;
        System.out.println(test);
        float test2=(float) test;
        System.out.println(test2+test);
        System.out.println(test2+"test");
        System.out.println(test2+"test"+test);
    }
    
}
