/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.tnk.mathutil.test.core;

import com.tnk.mathutil.core.MathUtil;
import junit.framework.Assert;
import org.junit.Test;




/**
 *
 * @author TNK
 */
public class MathUtilityTest {
    //Đây là class sẽ sử dụng các hàm của thư viện framework  để kiểm tra code chính
    @Test
    public void testGetFactorialGivenRightArgumentReturnsWell(){
        int n = 1; //test tinh huong tu te tinh huong dau vao may phai chay dung
        long expected = 1;
        long actual = MathUtil.getFactorial(n); //goi ham core/app chinh/code chinh
        //so sanh expected vs actual dung xanh xanh do do, framework
        Assert.assertEquals(expected, actual);
        //gop them vai case nua
        Assert.assertEquals(1, MathUtil.getFactorial(1));
        Assert.assertEquals(2, MathUtil.getFactorial(2));
        Assert.assertEquals(6, MathUtil.getFactorial(3));
        Assert.assertEquals(24, MathUtil.getFactorial(4));
        Assert.assertEquals(120, MathUtil.getFactorial(5));
    }
    //assertEqual kh dung so sanh 2 ngoai le duoc
    // Equal  la bang nhau hay kh tren value !!!!
    
    
//    @Test(expected = IllegalNumberFormatException.class)
//    public void testGetFactorialGivenWrongArgumentThrownException(){
//        MathUtil.getFactorial(-5);
//    }
    
//   @Test(expected = Exception.class)
//    public void testMyself(){
//        MathUtil.getFactorial(-5);
//    }
    //phai cung exception thi moi chay ra mau xanh dc
    
    @Test(expected = IllegalArgumentException.class)
    public void testGetFactorialGivenWrongArgumentThrownException(){
        MathUtil.getFactorial(-5);
    }
//    @Test
//    public void testGetFactorialGivenWrongArgumentThrownException_LambdaExpression(){
//        MathUtil.getFactorial(-5);
//    }
    
}
