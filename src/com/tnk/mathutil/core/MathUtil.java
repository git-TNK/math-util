/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tnk.mathutil.core;

/**
 *
 * @author TNK
 */
public class MathUtil {
    //Trong class này cung cấp cho ai đó nhiều hàm xử lý toán học
    //clone class math của JDK
    //Hàm thư viện xài chung cho ai đó, kh cần lưu lại trạng thái/giá trị
    //chọn thiết kế static
    
    //hàm tính giai thừa !!!
    // n! = 1.2.3.4.5....n
    //kh có giai thừa cho số âm
    //0! = 1! = 1 = quy ước
    //quy ước tính n! trong khoảng từ 0 - 20
    
    
    
//    public static long getFactorial(int n){
//        if(n < 0 || n > 20){
//            throw new IllegalArgumentException("Invalid argument. N must be between 0 - 20");
//        }
//        if(n == 0 || n == 1){
//            return 1;
//        }
//        long product = 1;
//        for (int i = 1; i <= n; i++) {
//            product *= i;
//        }
//        return product;
//    }
    
    
    
    public static long getFactorial(int n){
        if(n < 0 || n > 20)
            throw new IllegalArgumentException("n must be in 0 - 20");
        if(n ==0 || n == 1)
            return 1;
        return n * getFactorial(n -1);
    }
}
