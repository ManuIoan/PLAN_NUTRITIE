
package plan_nutririe;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class CALORII extends CARACTERISTICI {
    Scanner tst = new Scanner(System.in);
    private int cal_nec;//calorii necesare
    private String BMI;
    public CALORII()
    {
        super();
        this.cal_nec =0;
        
    }
    
    public void citire2()
    {
        try {
            citire();
        } catch (IOException ex) {
            Logger.getLogger(CALORII.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    public int getBMI()
    {   
        int gr = getGr_act();
        float has = getH();
        return (int) (gr/((has/100)*(has/100)));
    }
    
    public int categories()
    {
        int BMI = getBMI();
        
        if(BMI<19)
            return 1;
        else if(BMI<25)
            return 2;
        else if(BMI<30)
            return 3;
        else return 4;
        
        
    }
    
    
    public void setCal_nec()
    {
        int cat = categories();
        int genPers = getGen();
        int gr = getGr_act();
        int varsta = getVr();
        
        
        cal_nec = 24*gr;
        if(cat ==1)
            if(genPers==0)
            cal_nec = cal_nec+200;
            else
                cal_nec = cal_nec+300;
        else
            if(cat==3)
                if(genPers==0)
                cal_nec = cal_nec - 400;
                else
                    cal_nec = cal_nec - 300;
            else
                if(cat==4)
                    if(genPers==0)
                    cal_nec = cal_nec - 700;
                    else
                        cal_nec = cal_nec - 600;
        
        if(varsta>30&& varsta<40)
            cal_nec = cal_nec+100;
        else if(varsta>40)
            cal_nec = cal_nec +200;
        
        int a = getActivitate();
        
        if(a == 1)
            cal_nec += 200;
       
    }
    public int getCal()
    {
        return cal_nec;
    }
// DE AICI STIU CATE CALORII TREBUIE SA CONSUME PE ZI
    public int getTimp()
    {
        int cat =categories();
        float has2, kal = 0;
        if(cat!=2)
        {
        has2 = this.getH();
        has2 = has2/100;
        has2 = has2 * has2;
        kal = 24*has2;
        
        }
        int grac = this.getGr_act();
        
        if(cat ==1 || cat==3)
            return (int) (grac-kal)*2;
        else 
        if(cat==4)
            return  (int) (grac-kal);
        
        return (int)kal;
        
    }
    
    
    
    
    
}
