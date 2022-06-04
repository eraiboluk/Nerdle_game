/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package nerdle.pkg20011028;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.fail;
import org.junit.Test;
import org.junit.*;
import junit.framework.TestCase;


/**
 *
 * @author eraib
 */
public class ana_menuTest extends TestCase{

    @Test
    public void testIsNumeric1() {
        String string = "5";
        boolean expResult = true;
        boolean result = ana_menu.isNumeric(string);
        assertEquals(expResult, result);
      
    }
    @Test
    public void testIsNumeric2() {
        String string = "+";
        boolean expResult = false;
        boolean result = ana_menu.isNumeric(string);
        assertEquals(expResult, result);
      
    }
    
    @Test
    public void testGenerateEquation1() {
        
        System.out.println("generateEquation1");
        ana_menu instance = new ana_menu();
        String[] result = instance.generateEquation();
        assertEquals(true,instance.isNumeric(result[0]));
        
    }
    @Test
    public void testGenerateEquation2() {
        
        System.out.println("generateEquation2");
        ana_menu instance = new ana_menu();
        String[] result = instance.generateEquation();
        assertEquals(true,instance.isNumeric(result[result.length-1]));
        
    }
    @Test
    public void testGenerateEquation3() {
        
        System.out.println("generateEquation2");
        ana_menu instance = new ana_menu();
        String[] result = instance.generateEquation();
        if(result.length==7)
            assertEquals(7,result.length);
        else if(result.length==8)
            assertEquals(8,result.length);
        else if(result.length==9)
            assertEquals(9,result.length);
        else
            fail();
    }
}
