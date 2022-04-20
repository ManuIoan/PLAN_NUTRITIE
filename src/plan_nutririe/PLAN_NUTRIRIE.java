
package plan_nutririe;

import java.io.FileNotFoundException;

public class PLAN_NUTRIRIE {

    
    public static void main(String[] args) throws FileNotFoundException {
        
        // Se creeaza o persoana din sub-clasa calorii avand extend pe caracteristici, caloriile necesare setandu-se la inceput pe 0.
        CARACTERISTICI pers = new CALORII();
        
        
        // Se citesc datele unei persoane, daca fisierul respectiv nu exista.
        pers.citire2();
        
        // Se seteaza calorile necesare pentru varsta, greutatea si inaltimea persoanei respective.
        pers.setCal_nec();
        
        // Se atribuie unor variabile locale datele necesare.
        int cal = pers.getCal();
        int c = pers.getTimp();
        Data d1 = new Data();
        int luna = d1.getMonth();
        int zi = d1.getDay();
        MESE m;
        //c-saptamani de facut,cal-pe saptamana
        /// Se calculeaza fiecare masa in fiecare zi pentru persoana respectiva.
        m = new MESE(cal, zi, luna, c);
        System.out.println("Se incarca interfata...");
        
        // Se afiseaza in GUI-ul respectiv ce trebuie sa consume persoana respectiva la fiecare dintre mesele zilei.
        String alim1 = m.returnare1();
        String alim2 = m.returnare2();
        String alim3 = m.returnare3();

        // Afisare GUI
        GUI gi = new GUI(alim1, alim2, alim3);
    }
    
}
