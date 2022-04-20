
package plan_nutririe;


public class MESE {
    private int cal_tot, m_d, pranz, cina, ziua, luna,nr;

    public String[] proteine_pc;
    public String[] carbohidrati_d;
    public String[] proteine_d;
    public String[] carbohidrati_pc;
    public String[] gustare;
    
    
    // Initializare a clasei MESE
    public MESE(int cal, int z, int l, int kal) 
    {
        this.nr = kal;
        this.cal_tot = cal;
        this.ziua = z;
        this.luna = l;
        this.pranz = (2*cal)/5;
        this.m_d = cal/5;
        this.cina = (2*cal)/5;
        this.proteine_pc = new String[]{"somon", "pui", "stiuca", "iepure", "crap", "rață", "plătica", "vitel", "somn", "miel", "macrou", "oaie", "biban", "porc"};
        this.carbohidrati_d = new String[]{"tarate de grau", "covrigi", "curmale", "cereale cu lapte","caise", "nuci", "banane", "fistic", "mere", "migdale", "nuci pecan", "capsuni"};
        this.proteine_d = new String[]{"oua fierte", "sunca","lapte", "icre", "jambon", "salam", "oua prajite", "branza"};
        this.carbohidrati_pc = new String[]{"cartofi pisati", "linte", "pilaf", "cartofi prajiti", "fasole", "mazare"};
        this.gustare = new String[]{"amandina", "tort", "inghetata", "salata de fructe"};
    }
    
   
    // Metode de returnare pentru afisarea in GUI a meselor.
    public String returnare1()
    {
        int i = this.ziua%10, j = this.ziua%10,k = this.ziua%7, l = this.ziua%7, m = this.ziua%4;
        return "Micul dejun va avea "+ this.m_d/2+" calorii de "+ this.proteine_d[k]+" si "+this.m_d/2+ " calorii de "+ this.carbohidrati_d[j]+" ";
        
    }
    public String returnare2()
    {   int i = this.ziua%10, j = this.ziua%10,k = this.ziua%7, l = this.ziua%7, m = this.ziua%4;
        return "Pranzul va avea "+(2*this.pranz)/5+" calorii de "+ this.proteine_pc[(i+5)%10]+", "+ (2*this.pranz)/5+ " calorii de "+ this.carbohidrati_pc[(l+3)%6]+" si "+this.pranz/5+" calorii de "+ this.gustare[(m+2)%3]+" ";
                 
    }
    
    public String returnare3()
    {   int i = this.ziua%10, j = this.ziua%10,k = this.ziua%7, l = this.ziua%7, m = this.ziua%4;
        return "\nCina va avea "+ (2*this.cina)/5+ " calorii de "+ this.proteine_pc[i%10]+ ", "+ (2*this.cina)/5+ " calorii de "+ this.carbohidrati_pc[l%6]+" si "+ this.cina/5+ " calorii de "+ this.gustare[m%3]+" ";
    }
    
     /*
    public void distribuire()
    {
        int i = this.ziua%10, j = this.ziua%10,k = this.ziua%7, l = this.ziua%7, m = this.ziua%4;
        System.out.println("Micul dejun va avea "+ this.m_d/2+" calorii de "+ this.proteine_d[k]+" si "+this.m_d/2+ " calorii de "+ this.carbohidrati_d[j]);
        System.out.println("Pranzul va avea "+(2*this.pranz)/5+" calorii de "+ this.proteine_pc[(i+5)%10]+", "+ (2*this.pranz)/5+ " calorii de "+ this.carbohidrati_pc[(l+3)%6]+" si "+this.pranz/5+" calorii de "+ this.gustare[(m+2)%3]);
        System.out.println("Cina va avea "+ (2*this.cina)/5+ " calorii de "+ this.proteine_pc[i%10]+ ", "+ (2*this.cina)/5+ " calorii de "+ this.carbohidrati_pc[l%6]+" si "+ this.cina/5+ " calorii de "+ this.gustare[m%3]);        
    }
    */
}
