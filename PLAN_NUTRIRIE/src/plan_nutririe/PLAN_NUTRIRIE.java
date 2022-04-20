
package plan_nutririe;

import java.io.FileNotFoundException;

public class PLAN_NUTRIRIE {

    
    public static void main(String[] args) throws FileNotFoundException {
        
        CARACTERISTICI pers = new CALORII();
        pers.citire2();
        pers.setCal_nec();
        int cal = pers.getCal();
        int c = pers.getTimp();
        Data d1 = new Data();
        int luna = d1.getMonth();
        int zi = d1.getDay();
        MESE m;
        //c-saptamani de facut,cal-pe saptamana
        m = new MESE(cal, zi, luna, c);
        m.distribuire();
        
        
    }
    
}
