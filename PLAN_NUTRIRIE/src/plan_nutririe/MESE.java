
package plan_nutririe;
import java.io.File;
import java.util.Random;

public class MESE {
    private int cal_tot, m_d, pranz, cina, ziua, luna,nr;

    public String[] proteine_pc;
    public String[] carbohidrati_d;
    public String[] proteine_d;
    public String[] carbohidrati_pc;
    public String[] proteine_c;
    public String[] carbohidrati_c;
    public String[] gustare;
    Random rand = new Random();
    String fileName = "date_membru.txt";
    File myObj = new File(fileName);
    
    public MESE(int cal, int z, int l, int kal) 
    {
        this.nr = kal;
        this.cal_tot = cal;
        this.ziua = z;
        this.luna = l;
        this.pranz = (2*cal)/5;
        this.m_d = cal/5;
        this.cina = (2*cal)/3;
        this.proteine_pc = new String[]{"somon", "pui", "stiuca", "iepure", "crap", "rață", "plătica", "vitel", "somnul", "miel", "macrou", "oaie", "biban", "porc", "ton", "lapte", };
        this.carbohidrati_d = new String[]{"tarate de grau", "covrigi", "curmale", "cereale cu lapte","caise", "nuci", "banane", "fistic", "mere", "migdale", "nuci pecan", "capsuni"};
        this.proteine_d = new String[]{"oua fierte", "sunca","lapte", "icre", "jambon", "salam", "oua prajite", "branza"};
        this.carbohidrati_pc = new String[]{"cartofi pisati", "linte", "pilaf", "cartofi prajiti", "fasole", "mazare"};
        
        this.proteine_c = new String[]{"salata cu pui", "branza slaba", "peste slab"};
        this.carbohidrati_c = new String[]{"linte", "pilaf"};
        this.gustare = new String[]{"amandina", "tort", "inghetata", "salata de fructe"};
    }
    
    public void distribuire()
    {
        if(myObj.exists())
        {
            int i = this.ziua%10, j = this.ziua%10,k = this.ziua%7, l = this.ziua%7, m = this.ziua%4;
            
            int random_p_cina = rand.nextInt(proteine_c.length);
            int random_carbo_cina = rand.nextInt(carbohidrati_c.length);
            int cal_mic = 0, cal_pranz = 0, cal_cina = 0, cal_total = 0;
            cal_mic = this.m_d/2+this.m_d/2;
            cal_pranz = (2*this.pranz)/5+(2*this.pranz)/5+this.pranz/5;
            cal_cina = (this.cina)/3+(this.cina)/5+(this.cina)/6;
            cal_total = cal_mic+cal_pranz+cal_cina;
            System.out.println("Micul dejun va avea "+ this.m_d/2+" calorii de "+ this.proteine_d[k]+" si "+this.m_d/2+ " calorii de "+ this.carbohidrati_d[j]);
            System.out.println("Total calorii mic-dejun: "+ cal_mic +" calorii.");
            System.out.println("Pranzul va avea "+(2*this.pranz)/5+" calorii de "+ this.proteine_pc[(i+5)%10]+" "+ (2*this.pranz)/5+ " calorii de "+ this.carbohidrati_d[(l+3)%6]+" si "+this.pranz/5+" calorii de "+ this.gustare[(m+2)%4]);
            System.out.println("Total calorii pranz: "+ cal_pranz +" calorii.");   
            
            System.out.println("Cina va avea "+(this.cina)/3+" calorii de "+ this.proteine_c[random_p_cina]+" "+ (this.cina)/5+ " calorii de "+ this.carbohidrati_c[random_carbo_cina]+" si "+this.cina/6+" calorii de "+ this.gustare[(m+2)%4]);
            System.out.println("Total calorii cina: "+ cal_cina +" calorii."); 
            
            System.out.println("\n\nIn aceasta va trebui sa consumati "+cal_total+" calorii.");
            //10,10,7,7,4



            /*int k=0,l=0,m=0,n=0,o=0;
            for(int i=0;i<this.nr;i++)
                for(int j=0;j<7;j++)
                {
                    if(k==12)k=0;


                    System.out.println("La micul dejun se va manca "+this.m_d/2+" calorii de "+this.carbohidrati_d[k++] );
                }   
            */
        }
        else System.out.println("Fisierul nu a fost putut incarcat.");
        
        
    }
    
    
    
    
}
