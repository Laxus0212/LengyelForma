package lengyelforma;

import java.util.ArrayList;

public class LengyelFormaSzamolas {


    private String lengyelForma;
    private ArrayList <Integer> verem;

    public LengyelFormaSzamolas(String lengyelForma) {
        this.lengyelForma = lengyelForma;
        verem = new ArrayList<>();
        int index = 0;
        while (index < lengyelForma.length()) {
            char elem = lengyelForma.charAt(index);
            System.out.println(elem);
            index++;
            boolean szamE;

            try {

                Integer.parseInt(String.valueOf(elem));
                szamE = true;

            } catch (NumberFormatException e) {
                szamE = false;
            }

            if (szamE) {
                verem.add(Integer.parseInt(String.valueOf(elem)));
            }
            if(!szamE){              
               int ertek1=verembol();
               int ertek2=verembol();
               int eredmeny=kiszamol(ertek2, elem, ertek1);
               verem.add(eredmeny);
            }
        }
        int vegeredmeny = verembol();
        System.out.println(vegeredmeny);
    }
    public int verembol(){
        int szam = verem.get(verem.size()-1);
        verem.remove(verem.size()-1);
        
        
        return szam;
    }
    
    public int kiszamol(int ertek2, char muvelet, int ertek1){
        int kifejezes = 0;
        switch (muvelet) {
  case '+': 
      kifejezes = ertek2 + ertek1;
      break;
      case '-':
          kifejezes = ertek2 - ertek1;
      break;
          case '*':  
              kifejezes = ertek2 * ertek1;
      break;
          case '/': 
              kifejezes = ertek2 / ertek1;
      break;
        }     
        return kifejezes;
    }
    
// Verem.ürít
//Ciklus amíg (nem üres lengyel_forma)
//    elem: lengyel_forma.elso_elem
//    ha (elem típusa adat)
//        verembe(elem)
//     ha (elem típusa művelet)
//        érték1=veremből()
//        érték2=veremből()
//        eredmény=kiszámol(érték2, művelet, érték1) (figyelni kell, érték2-érték1)
//        verembe(eredmény)
//    elágazás vége
//Ciklus vége
//Végeredmény=veremből()
}
