import finite_automaton.*;
import regular_expression.*;
import regular_grammar.*;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Transformation {
    protected ArrayList<FiniteAutomaton> listFA;
    protected ArrayList<RegularExpression> listRE;
    protected ArrayList<RegularGrammar> listRG;
    
    Transformation(){
       
    }
    
    public RegularGrammar AFtoRG(FiniteAutomaton f){
        //add grammar to list
        return new RegularGrammar();
    }
    
    public FiniteAutomaton RGtoAF(RegularGrammar g){
        return new FiniteAutomaton();
    }
    
    public FiniteAutomaton DeSimone(RegularExpression e) {
        return new FiniteAutomaton();
    }
    
    public void Intersection(RegularGrammar g1, RegularGrammar g2) {
        FiniteAutomaton a1 = RGtoAF(g1);
        FiniteAutomaton a2 = RGtoAF(g2);
        FA_algorithms alg = new FA_algorithms();
        FiniteAutomaton a3 = alg.intersection(a1, a2);
        listFA.add(a3);
    }
    public void Intersection(RegularExpression e1, RegularExpression e2) {
        FiniteAutomaton a1 = DeSimone(e1);
        FiniteAutomaton a2 = DeSimone(e2);
        FA_algorithms alg = new FA_algorithms();
        FiniteAutomaton a3 = alg.intersection(a1, a2);
        listFA.add(a3);
    }
    
    //falta diferença e reverso
        
}
