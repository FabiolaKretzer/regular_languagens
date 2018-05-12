/*
 * Tests to FA_algorithms.java
 */
package tests;

import finite_automaton.FA_algorithms;
import finite_automaton.FiniteAutomaton;
import finite_automaton.State;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class FA_algorithmsTest {
    
    public FA_algorithmsTest() {
    }
    
    /**
     * Test of isDeterministic method, of class FA_algorithms.
     */
    @Test
    public void testIsDeterministic() {
        /**
        * Language not exist (00) and not exist (11)
        */
        Map<Character, ArrayList<State>> transitionsq0 = new HashMap<>();
        Map<Character, ArrayList<State>> transitionsq1 = new HashMap<>();
        Map<Character, ArrayList<State>> transitionsq2 = new HashMap<>();
        
        State q0 = new State("q0", true);
        State q1 = new State("q1", true);
        State q2 = new State("q2", true);
        
        State inicialA = q0;
        
        ArrayList<State> statesA = new ArrayList<>();
        statesA.add(q0);
        statesA.add(q1);
        statesA.add(q2);
        
        //transitionsq0.add('0', q1);
        //transitionsq0.add('1', q2);
        //transitionsq1.add('1', q2);
        //transitionsq2.add('0', q1);
        
        FiniteAutomaton automaton = new FiniteAutomaton();   
               
        FA_algorithms f = new FA_algorithms();
        
        assertEquals(false, f.isDeterministic(automaton)); 
    }
    
    /**
     * Test of isDeterministic method, of class FA_algorithms.
     */
   @Test
    public void testIsDeterministic2() {
        /**
        * Language Question 2 - list 0.4
        */
        Map<Character, ArrayList<State>> transitionsS = new HashMap<>();
        Map<Character, ArrayList<State>> transitionsA = new HashMap<>();
        Map<Character, ArrayList<State>> transitionsB = new HashMap<>();
        Map<Character, ArrayList<State>> transitionsC = new HashMap<>();
        Map<Character, ArrayList<State>> transitionsD = new HashMap<>();
        Map<Character, ArrayList<State>> transitionsF = new HashMap<>();
        
        State S = new State("S", true);
        State A = new State("A", false);
        State B = new State("B", false);
        State C = new State("C", false);
        State D = new State("D", false);
        State F = new State("F", true);
        
        State inicialA = S;
        
        ArrayList<State> statesA = new ArrayList<>();
        statesA.add(S);
        statesA.add(A);
        statesA.add(B);
        statesA.add(C);
        statesA.add(D);
        statesA.add(F);
        
        //transitionsS.add('0', A);
        //transitionsS.add('0', D);
        //transitionsS.add('1', F);
        //transitionsA.add('0', A);
        //transitionsA.add('0', B);
        //transitionsA.add('1', C);
        //transitionsA.add('1', E);
        //transitionsB.add('0', B);
        //transitionsC.add('0', A);
        //transitionsC.add('0', B);
        //transitionsD.add('0', B);
        //transitionsD.add('0', D);
        //transitionsD.add('1', C);
        //transitionsE.add('0', E);
        //transitionsE.add('1', E);
            
        FiniteAutomaton automaton = new FiniteAutomaton();   
               
        FA_algorithms f = new FA_algorithms();
        
        assertEquals(true, f.isDeterministic(automaton)); 
        f.determinize(automaton);
        assertEquals(false, f.isDeterministic(automaton)); 
       
    }
    /**
     * Test of isComplete method, of class FA_algorithms.
     */
    @Test
    public void testIsComplete() {
        /**
        * Language not exist (00) and not exist (11)
        */
        
        Map<Character, ArrayList<State>> transitionsq0 = new HashMap<>();
        Map<Character, ArrayList<State>> transitionsq1 = new HashMap<>();
        Map<Character, ArrayList<State>> transitionsq2 = new HashMap<>();
        
        State q0 = new State("q0", true);
        State q1 = new State("q1", true);
        State q2 = new State("q2", true);
        
        State inicialA = q0;
        
        ArrayList<State> statesA = new ArrayList<>();
        statesA.add(q0);
        statesA.add(q1);
        statesA.add(q2);
        
        //transitionsq0.add('0', q1);
        //transitionsq0.add('1', q2);
        //transitionsq1.add('1', q2);
        //transitionsq2.add('0', q1);
        
        FiniteAutomaton automaton = new FiniteAutomaton();   
               
        FA_algorithms f = new FA_algorithms();
        
        assertEquals(false, f.isComplete(automaton));
	f.complete(automaton);
        assertEquals(true, f.isComplete(automaton));
    }
    
    /**
     * Test of isComplete method, of class FA_algorithms.
     */
    @Test
    public void testIsComplete2() {
        /**
        * Language |x| is odd
        */
        
        Map<Character, ArrayList<State>> transitionsq0 = new HashMap<>();
        Map<Character, ArrayList<State>> transitionsq1 = new HashMap<>();
        
        State q0 = new State("q0", false);
        State q1 = new State("q1", true);
        
        State inicialA = q0;
        
        ArrayList<State> statesA = new ArrayList<>();
        statesA.add(q0);
        statesA.add(q1);
        
        //transitionsq0.add('a', q1);
        //transitionsq0.add('b', q1);
        //transitionsq1.add('a', q0);
        //transitionsq1.add('b', q0);
        
        FiniteAutomaton automaton = new FiniteAutomaton();   
               
        FA_algorithms f = new FA_algorithms();
        
        assertEquals(true, f.isComplete(automaton));
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
