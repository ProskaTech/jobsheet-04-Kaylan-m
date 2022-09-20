/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
//Percobaan 4 Penggunaan Operator Logika dan Boolean AND
package com.pbo.prak4;

/**
 *
 * @author Kayla Nahda Muadzah (21343052)
 */
public class TestAND {

    public static void main(String[] args) {
        int i = 0;
        int j = 10;
        boolean test = true;
        
        //demonstrasi &&
        test = (i > j) && (j++ > 9);
        System.out.println(i);
        System.out.println(j);
        System.out.println(test);
        
        //demonstrasi &
        test = (i > j) & (j++ > 9);
        System.out.println(i);
        System.out.println(j);
        System.out.println(test);
    }
}
