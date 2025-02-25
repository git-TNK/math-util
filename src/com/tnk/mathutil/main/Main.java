/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tnk.mathutil.main;
import com.tnk.mathutil.core.MathUtil;
/**
 *
 * @author TNK
 */
public class Main {
    public static void main(String[] args) {
        //thu nghiem ham tinh giai thua coi dung nhu thiet ke khong
        //dua cac tinh huong su dung trong thuc te
        long expected = 120;
        int n = 5;
        long actual = MathUtil.getFactorial(n);
        System.out.println("5! = " + expected + " expected");
        System.out.println("5! = " + actual + " actual");
    }
}
