/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pbo.prak4;

/**
 *
 * @author Kayla Nahda Muadzah (21343052)
 */
public class kondisiOperator {
    public static void main(String[] args) {
    String status = "";
    int grade = 50;
    
    //mendapatkan status pelajar
    status = (grade >= 60) ? "Passed" : "Fail";
    
    //print status
    System.out.println(status);
    }
}