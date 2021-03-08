package lengyelforma;

import java.util.HashSet;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.util.Stack;

public class Alakito {

    public Alakito() throws ScriptException {
        Atalakit();

    }
//ciklus amíg nincs vége a kifejezésnek
//    akt kifejezés aktuális eleme
//    elágazás akt szerint:
//        ha (akt == '(') {
//                verembe(akt);
//            } 
//         ha (akt= szám) {
//                lengyelforma += akt;
//            } 
//ha (akt == '*'  akt == '/'  akt == '-' || akt == '+') {
//                ha a verem üres, akkor  {
//                    verembe(akt);
//                } különben  {
//                    ciklus amíg  (verem nem üres és ?)) {
//                        ha a verem tetején lévő elem precedenciája >= az akt elem precedenciájával, akkor  {
//    kivesszük az elemet a veremből és a lengyel formába tesszük.
//                        } 
//                    }
//                    verembe(akt);
//                }
//
//            } 
//ha (akt == ')') {
//                ciklus amíg  ( a veremből kivett elem != '(') {
//a veremből kivett elemet a lengyel formához tesszük
//                }
//            }
//        }
//        ciklus amíg  (a verem nem üres) {
//            a veremből kivett elemet a  lengyel formába tesszük.
//        }

    private void Atalakit() throws ScriptException {
        ScriptEngineManager mgr = new ScriptEngineManager();
        ScriptEngine engine = mgr.getEngineByName("JavaScript");
        String szam1 = "1";
        String muveletiJel = "-";
        String szam2 = "3";
        Stack verem = new Stack();
        String muvelet = szam1 + muveletiJel + szam2;
        verem.push(engine.eval(muvelet));

        String kifejezes = "";
        String   aktElem;
        int i = 0;
        char szam = szamok();
        String utolsoElem = "";
        String lengyelForma = "";
        while (i < kifejezes.length()) {
            aktElem = (String.valueOf(kifejezes.length() - i));
            if (aktElem.equals("(")) {
                verem.push(aktElem);
            }
            if (szamE()/*Character.isDigit(aktElem)*/) {
                lengyelForma += aktElem;
            }else 
            if (aktElem.equals("*") || aktElem.equals("/") || aktElem.equals("-") || aktElem.equals("+")) {
                if(verem.isEmpty()){
                    verem.push(aktElem);
                }else{
                    while(!(verem.isEmpty())){
                        if(/*Precedencia(legfelso) >= Precedencia(aktElem)*/String.valueOf(verem.lastIndexOf(i)) >= aktElem){                           
                            int j = verem.lastIndexOf(i);
                            verem.size();
                            verem.pop();
                        }
                    }
                    verem.push(aktElem);
                }
            }
            if(aktElem.equals(")")){
                while(){
                    
                }
            }
        }
    }

//    private void verembe(char aktElem) {
//
//    }

    private char szamok(String kifejezes) {

        for (int i = 0; i < kifejezes.length(); i++) {
            if (kifejezes.length() - i == '0') {
                return 0;
            }
            if (kifejezes.length() - i == '1') {
                return 1;
            }
            if (kifejezes.length() - i == '2') {
                return 2;
            }
            if (kifejezes.length() - i == '3') {
                return 3;
            }
            if (kifejezes.length() - i == '4') {
                return 4;
            }
            if (kifejezes.length() - i == '5') {
                return 5;
            }
            if (kifejezes.length() - i == '6') {
                return 6;
            }
            if (kifejezes.length() - i == '7') {
                return 7;
            }
            if (kifejezes.length() - i == '8') {
                return 8;
            }
            if (kifejezes.length() - i == '9') {
                return 9;
            }

        }
        return 0;
    }

    private boolean szamE() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
