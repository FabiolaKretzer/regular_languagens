package transformation;
import finite_automaton.*;
import regular_expression.*;
import regular_grammar.*;
import java.util.ArrayList;

/*
 * 
 */

public class Transformation {
    protected ArrayList<FiniteAutomaton> listFA;
    protected ArrayList<RegularExpression> listRE;
    protected ArrayList<RegularGrammar> listRG;
    FA_algorithms alg;
    public Transformation(){
        this.alg = new FA_algorithms();
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
        FiniteAutomaton a3 = alg.intersection(a1, a2);
        listFA.add(a3);
    }
    public void Intersection(RegularExpression e1, RegularExpression e2) {
        FiniteAutomaton a1 = DeSimone(e1);
        FiniteAutomaton a2 = DeSimone(e2);
        FiniteAutomaton a3 = alg.intersection(a1, a2);
        listFA.add(a3);
    }
    
    public void Difference(RegularGrammar g1, RegularGrammar g2) {
        FiniteAutomaton a1 = RGtoAF(g1);
        FiniteAutomaton a2 = RGtoAF(g2);
        FiniteAutomaton a3 = alg.difference(a1, a2);
        listFA.add(a3);
    }
    public void Difference(RegularExpression e1, RegularExpression e2) {
        FiniteAutomaton a1 = DeSimone(e1);
        FiniteAutomaton a2 = DeSimone(e2);
        FiniteAutomaton a3 = alg.difference(a1, a2);
        listFA.add(a3);
    }
    
    public void Reverse(RegularGrammar g1) {
        FiniteAutomaton a1 = RGtoAF(g1);
        FiniteAutomaton a3 = alg.reverse(a1);
        listFA.add(a3);
    }
    public void Reverse(RegularExpression e1) {
        FiniteAutomaton a1 = DeSimone(e1);
        FiniteAutomaton a3 = alg.reverse(a1);
        listFA.add(a3);
    }
    
    //falta diferença e reverso
        
}
