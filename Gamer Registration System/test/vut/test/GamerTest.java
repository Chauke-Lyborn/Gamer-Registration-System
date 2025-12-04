/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package vut.test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import vut.data.AmGamer;
import vut.data.ProGamer;

/**
 *
 * @author chauk
 */
public class GamerTest {
    
    
    
    
    
    

    //Testing the genCode() od Ameteur
    @Test
    public void testGenCodeAmGamer1() {
        AmGamer objAmGamer = new AmGamer("981211", "Tshepo Lekoka", 25, 3);
        assertEquals("A981211-3", objAmGamer.genCode());

    }

    @Test
    public void testGenCodeAmGamer2() {
        AmGamer objAmGamer = new AmGamer("090725", "Glad Maimele", 14, 1);
        assertEquals("A090725-1", objAmGamer.genCode());

    }

    @Test
    public void testGenCodeAmGamer3() {
        AmGamer objAmGamer = new AmGamer("020412", "Golden Similo ", 21, 2);
        assertEquals("A020412-2", objAmGamer.genCode());

    }

    @Test
    public void testGenCodeProGamer1() {
        ProGamer objProGamer = new ProGamer("890428", "Vushaka Chauke", 34, 18, 75);
        assertEquals("P7534-18", objProGamer.genCode());
    }

    @Test
    public void testGenCodeProGamer2() {
        ProGamer objProGamer = new ProGamer("870725", "Tumelo Lenotha", 36, 2, 56);
        assertEquals("P5636-02", objProGamer.genCode());
    }

    //Testing calculateDiscount()
    @Test
    public void testcalculateDiscountProGamer1() {
        ProGamer objProGamer = new ProGamer("980826", "Mbali Mantso", 25 , 8, 34);
        assertEquals(200, objProGamer.calculateDiscount(500));
    }

    @Test
    public void testcalculateDiscountProGamer2() {
        ProGamer objProGamer = new ProGamer("940929", "Mania Mangope ", 29, 13, 65);
        assertEquals(250, objProGamer.calculateDiscount(500));
    }

    
    @Test
    public void testcalculateDiscountAmGamer1() {
        AmGamer objAmGamer = new AmGamer("951116", "Latricia Fisher ", 28, 3);
        assertEquals(0, objAmGamer.calculateDiscount(250));
    }

    @Test
    public void testcalculateDiscountAmGamer2() {
        AmGamer objAmGamer = new AmGamer("090725", "Glad Maimele", 14, 1);
       assertEquals(100, objAmGamer.calculateDiscount(250));
    }

    @Test
    public void testcalculateDiscountAmGamer3() {
        AmGamer objAmGamer = new AmGamer("060517", "Hluphile Tree ", 17, 1);
        assertEquals(75, objAmGamer.calculateDiscount(250));
    }

    @Test
    public void testcalculateDiscountAmGamer4() {
        AmGamer objAmGamer = new AmGamer("020412", "Golden Similo ", 21, 2);
         assertEquals(50, objAmGamer.calculateDiscount(250));
    }
}
