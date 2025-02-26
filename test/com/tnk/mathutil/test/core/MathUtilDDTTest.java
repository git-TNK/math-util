/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.tnk.mathutil.test.core;

import com.tnk.mathutil.core.MathUtil;
import junit.framework.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author TNK
 */
@RunWith(value = Parameterized.class)
public class MathUtilDDTTest {
    //tra ve mang 2 chieu 
    @Parameterized.Parameters //JUnit se chay qua tung dong cua Mang de lay ra tap data
    public static Object[][] initData(){
        return new Integer[][]{
            {0,1},{1,1},{2,2},{3,6},{4,24},{6,720}
        };
    }
    @Parameterized.Parameter(value = 0)
    public int n;
    @Parameterized.Parameter(value = 1)
    public long expected;
    @Test
    public void testGetWell(){
        Assert.assertEquals(expected , MathUtil.getFactorial(n));
    }
}
