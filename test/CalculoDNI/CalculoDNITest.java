/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalculoDNI;

import calculodni.DNIClass;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author dawbio
 */
@RunWith(value=Parameterized.class)
public class CalculoDNITest {
    /**
     * Is a array for value prove , the validation a test
     * @return object of use in the test
     */
   @Parameters
   public static Iterable<Object[]> getData(){
       List <Object[]> obj=new ArrayList<>();
       obj.add(new Object[]{"454335636A",454335636,"A",true});
       obj.add(new Object[]{"567573643T",567573643,"T",false});
       obj.add(new Object[]{"547373474M",547373474,"M",false});
       return obj;
       
   }
    private String dni;
    private int a;
    private String b;

    private boolean exp;
    /**
     * Is a constructor of test for validation the function
     * @param dni is a dni for validation
     * @param a is a number 
     * @param b is a char
     * @param exp is a resol
     */
    public CalculoDNITest(String dni,int a, String b,boolean exp) { 
        this.dni=dni;
        this.a=a;
        this.b=b;
        this.exp=exp;
    }
    /**
     * Is a test for validation the dni
     */
     @Test
     public void testAdd() {
         
     DNIClass calc=new DNIClass(dni);
     boolean result =DNIClass.comprovar_dni(b,a);
     assertEquals(exp, result);
     }
    
}
