/*
 * Tests to FA_algorithms.java
 */
package tests;

import finite_automaton.FA_algorithms;
import finite_automaton.FiniteAutomaton;
import java.util.ArrayList;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author fabiola
 */
public class FA_algorithmsTest {
    
    public FA_algorithmsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of isDeterministic method, of class FA_algorithms.
     */
    @Test
    public void testIsDeterministic() {
        System.out.println("isDeterministic");
        FiniteAutomaton f = null;
        FA_algorithms instance = new FA_algorithms();
        boolean expResult = false;
        boolean result = instance.isDeterministic(f);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isComplete method, of class FA_algorithms.
     */
    @Test
    public void testIsComplete() {
        System.out.println("isComplete");
        FiniteAutomaton f = null;
        FA_algorithms instance = new FA_algorithms();
        boolean expResult = false;
        boolean result = instance.isComplete(f);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of determinize method, of class FA_algorithms.
     */
    @Test
    public void testDeterminize() {
        System.out.println("determinize");
        FiniteAutomaton f = null;
        FA_algorithms instance = new FA_algorithms();
        instance.determinize(f);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of complete method, of class FA_algorithms.
     */
    @Test
    public void testComplete() {
        System.out.println("complete");
        FiniteAutomaton f = null;
        FA_algorithms instance = new FA_algorithms();
        instance.complete(f);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of minimize method, of class FA_algorithms.
     */
    @Test
    public void testMinimize() {
        System.out.println("minimize");
        FiniteAutomaton f = null;
        FA_algorithms instance = new FA_algorithms();
        instance.minimize(f);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove_unreachable method, of class FA_algorithms.
     */
    @Test
    public void testRemove_unreachable() {
        System.out.println("remove_unreachable");
        FiniteAutomaton f = null;
        FA_algorithms instance = new FA_algorithms();
        FiniteAutomaton expResult = null;
        FiniteAutomaton result = instance.remove_unreachable(f);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove_dead method, of class FA_algorithms.
     */
    @Test
    public void testRemove_dead() {
        System.out.println("remove_dead");
        FiniteAutomaton f = null;
        FA_algorithms instance = new FA_algorithms();
        FiniteAutomaton expResult = null;
        FiniteAutomaton result = instance.remove_dead(f);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equivalent_state method, of class FA_algorithms.
     */
    @Test
    public void testEquivalent_state() {
        System.out.println("equivalent_state");
        FiniteAutomaton f = null;
        FA_algorithms instance = new FA_algorithms();
        FiniteAutomaton expResult = null;
        FiniteAutomaton result = instance.equivalent_state(f);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of union method, of class FA_algorithms.
     */
    @Test
    public void testUnion() {
        System.out.println("union");
        FiniteAutomaton fa = null;
        FiniteAutomaton fb = null;
        FA_algorithms instance = new FA_algorithms();
        FiniteAutomaton expResult = null;
        FiniteAutomaton result = instance.union(fa, fb);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of complement method, of class FA_algorithms.
     */
    @Test
    public void testComplement() {
        System.out.println("complement");
        FiniteAutomaton f = null;
        FA_algorithms instance = new FA_algorithms();
        FiniteAutomaton expResult = null;
        FiniteAutomaton result = instance.complement(f);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of intersection method, of class FA_algorithms.
     */
    @Test
    public void testIntersection() {
        System.out.println("intersection");
        FiniteAutomaton fa = null;
        FiniteAutomaton fb = null;
        FA_algorithms instance = new FA_algorithms();
        FiniteAutomaton expResult = null;
        FiniteAutomaton result = instance.intersection(fa, fb);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of difference method, of class FA_algorithms.
     */
    @Test
    public void testDifference() {
        System.out.println("difference");
        FiniteAutomaton fa = null;
        FiniteAutomaton fb = null;
        FA_algorithms instance = new FA_algorithms();
        FiniteAutomaton expResult = null;
        FiniteAutomaton result = instance.difference(fa, fb);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of reverse method, of class FA_algorithms.
     */
    @Test
    public void testReverse() {
        System.out.println("reverse");
        FiniteAutomaton f = null;
        FA_algorithms instance = new FA_algorithms();
        FiniteAutomaton expResult = null;
        FiniteAutomaton result = instance.reverse(f);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of recognize method, of class FA_algorithms.
     */
    @Test
    public void testRecognize() {
        System.out.println("recognize");
        FiniteAutomaton f = null;
        String sentence = "";
        FA_algorithms instance = new FA_algorithms();
        boolean expResult = false;
        boolean result = instance.recognize(f, sentence);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of enumeration method, of class FA_algorithms.
     */
    @Test
    public void testEnumeration() {
        System.out.println("enumeration");
        FiniteAutomaton fa = null;
        int size = 0;
        FA_algorithms instance = new FA_algorithms();
        ArrayList<String> expResult = null;
        ArrayList<String> result = instance.enumeration(fa, size);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
