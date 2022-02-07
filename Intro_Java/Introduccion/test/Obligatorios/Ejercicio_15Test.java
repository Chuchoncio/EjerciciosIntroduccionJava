/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Obligatorios;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Juan Manuel
 */
public class Ejercicio_15Test {
    
//    public Ejercicio_15Test() {
//    }
//    
//    @BeforeClass
//    public static void setUpClass() {
//    }
//    
//    @AfterClass
//    public static void tearDownClass() {
//    }
//    
//    @Before
//    public void setUp() {
//    }
//    
//    @After
//    public void tearDown() {
//    }
//
//    @Test
//    public void testMain() {
//        System.out.println("main");
//        String[] args = null;
//        Ejercicio_15.main(args);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    @Test
//    public void testMenu() {
//        System.out.println("menu");
//        Ejercicio_15.menu();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    @Test
    public void testSumar() {
        int actual = Ejercicio_15.sumar(2, 3);
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    public void testRestar() {
        int actual = Ejercicio_15.restar(3, 2);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void testMultiplicar() {
        int actual = Ejercicio_15.multiplicar(5, 10);
        int expected = 50;
        assertEquals(expected, actual);
    }

//    @Test
//    public void testDividir() {
//        double actual = Ejercicio_15.dividir(6, 3);
//        double expected = 2;
//        assertEquals(expected, actual);
//    }
    
}
