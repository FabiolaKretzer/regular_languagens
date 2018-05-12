/*
 * Tests to Transformation.java
 */
package tests;

import finite_automaton.FiniteAutomaton;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import regular_expression.RegularExpression;
import regular_grammar.RegularGrammar;

public class TransformationTest {
    
    public TransformationTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of AFtoRG method, of class Transformation.
     */
    @Test
    public void testAFtoRG() {
        /**System.out.println("AFtoRG");
        FiniteAutomaton f = null;
        Transformation instance = new Transformation();
        RegularGrammar expResult = null;
        RegularGrammar result = instance.AFtoRG(f);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");*/
    }

    /**
     * Test of RGtoAF method, of class Transformation.
     */
    @Test
    public void testRGtoAF() {
        /**System.out.println("RGtoAF");
        RegularGrammar g = null;
        Transformation instance = new Transformation();
        FiniteAutomaton expResult = null;
        FiniteAutomaton result = instance.RGtoAF(g);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");*/
    }

    /**
     * Test of DeSimone method, of class Transformation.
     */
    @Test
    public void testDeSimone() {
        /**System.out.println("DeSimone");
        RegularExpression e = null;
        Transformation instance = new Transformation();
        FiniteAutomaton expResult = null;
        FiniteAutomaton result = instance.DeSimone(e);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");*/
    }

    /**
     * Test of Intersection method, of class Transformation.
     */
    @Test
    public void testIntersection_RegularGrammar_RegularGrammar() {
        /**System.out.println("Intersection");
        RegularGrammar g1 = null;
        RegularGrammar g2 = null;
        Transformation instance = new Transformation();
        instance.Intersection(g1, g2);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");*/
    }

    /**
     * Test of Intersection method, of class Transformation.
     */
    @Test
    public void testIntersection_RegularExpression_RegularExpression() {
        /**System.out.println("Intersection");
        RegularExpression e1 = null;
        RegularExpression e2 = null;
        Transformation instance = new Transformation();
        instance.Intersection(e1, e2);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");*/
    }

    /**
     * Test of Difference method, of class Transformation.
     */
    @Test
    public void testDifference_RegularGrammar_RegularGrammar() {
        /**System.out.println("Difference");
        RegularGrammar g1 = null;
        RegularGrammar g2 = null;
        Transformation instance = new Transformation();
        instance.Difference(g1, g2);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");*/
    }

    /**
     * Test of Difference method, of class Transformation.
     */
    @Test
    public void testDifference_RegularExpression_RegularExpression() {
        /**System.out.println("Difference");
        RegularExpression e1 = null;
        RegularExpression e2 = null;
        Transformation instance = new Transformation();
        instance.Difference(e1, e2);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");*/
    }

    /**
     * Test of Reverse method, of class Transformation.
     */
    @Test
    public void testReverse_RegularGrammar() {
        /**System.out.println("Reverse");
        RegularGrammar g1 = null;
        Transformation instance = new Transformation();
        instance.Reverse(g1);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");*/
    }

    /**
     * Test of Reverse method, of class Transformation.
     */
    @Test
    public void testReverse_RegularExpression() {
        /**System.out.println("Reverse");
        RegularExpression e1 = null;
        Transformation instance = new Transformation();
        instance.Reverse(e1);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");*/
    }
    
}
