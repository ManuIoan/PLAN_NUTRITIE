
package plan_nutririe;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CARACTERISTICI {
    private int gr_act,vr,gen,activitate, h;//greutate actuala,inaltime,varsta
    public CARACTERISTICI()
    {
        this.gr_act = 0;
        this.h = 0;
        this.vr = 0;
        this.gen =0;
        this.activitate = 0;
    }
    public void citire() throws IOException
    {
        Scanner tst = new Scanner(System.in);
        
        try {
            String fileName = "date_membru.txt";
            File myObj = new File(fileName);
            if(myObj.createNewFile())
            {
                //gen
                System.out.println("Ce gen sunteti:\n1-masculin\n0-feminin");
                gen = tst.nextInt();
                while(gen!= 0 && gen!=1)
                {
                    System.out.println("Nu ati introdus corect!!!");
                    System.out.println("Ce gen sunteti:\n1-masculin\n0-feminin");
                    gen = tst.nextInt();
                }

                //varsta
                System.out.println("Varsta dumneavoastra:");
                vr = tst.nextInt();
                while(vr<=12 || vr>=150)
                {
                     System.out.println("Nu ati introdus corect!!!");
                     System.out.println("\nVarsta dumneavoastra: ");
                     vr = tst.nextInt();
                }

                //inaltimea
                System.out.println("Inaltimea dumneavoastra in centimetri: ");
                h = tst.nextInt();
                while(h<=30 || h>=400)
                {
                    System.out.println("Nu ati introdus corect!!!");
                    System.out.println("\nInaltimea dumneavoastra in centimetri: ");
                    h = tst.nextInt();
                }

                //greutate
                System.out.println("Greutatea dumneavoastra in kilograme: ");
                gr_act = tst.nextInt();
                while(gr_act<=10 || gr_act >=600)
                {
                    System.out.println("Nu ati introdus corect!!!");
                    System.out.println("Greutatea dumneavoastra in kilograme: ");
                    gr_act = tst.nextInt();
                }
                System.out.println("Sunteti activi din punct de vedere sportiv ?\n0-NU\n1-DA ");
                this.activitate = tst.nextInt();
                while(this.activitate!= 0 && this.activitate!=1)
                {
                    System.out.println("Nu ati introdus corect!!!");
                    System.out.println("Sunteti activi din punct de vedere sportiv ?\n0-NU\n1-DA ");
                    this.activitate = tst.nextInt();
                }




                PrintWriter fileout;
                fileout = new PrintWriter(new FileWriter("date_membru.txt"));
                fileout.println(gen); 
                fileout.println(vr);
                fileout.println(h);
                fileout.println(gr_act);
                fileout.println(activitate);

                fileout.close();
        
            }
            else
            {
                Scanner fileReader = new Scanner(myObj); 
                
                while (fileReader.hasNextInt())
                {
                    this.gen = fileReader.nextInt();
                    this.vr = fileReader.nextInt();
                    this.h = fileReader.nextInt();
                    this.gr_act = fileReader.nextInt();
                    this.activitate = fileReader.nextInt();
                }
                fileReader.close();
                String gender;
                if(this.gen == 1) gender = "Masculin";
                else gender = "Feminin";
                System.out.println("Genul este: "+gender+"\nVarsta este: "+vr+"\nInaltimea este: "+h+"cm\nGreutatea este: "+gr_act+"kg\nActivitate este: "+this.activitate);
                System.out.println("Vrei sa iti reintroduci datele?\n1 - Refa datele\n0 - Pastreaza datele");
                
                
                if(tst.nextInt()==1) {
                    File here = new File("date_membru.txt");
                    if (here.delete()) {
                        System.out.println("Ce gen sunteti:\n1-masculin\n0-feminin");
                        gen = tst.nextInt();
                        while(gen!= 0 && gen!=1)
                        {
                            System.out.println("Nu ati introdus corect!!!");
                            System.out.println("Ce gen sunteti:\n1-masculin\n0-feminin");
                            gen = tst.nextInt();
                        }

                        //varsta
                        System.out.println("Varsta dumneavoastra:");
                        vr = tst.nextInt();
                        while(vr<=12 || vr>=150)
                        {
                             System.out.println("Nu ati introdus corect!!!");
                             //System.out.println("\nVarsta dumneavoastra: ");
                             vr = tst.nextInt();
                        }

                        //inaltimea
                        System.out.println("Inaltimea dumneavoastra in centimetri: ");
                        h = tst.nextInt();
                        while(h<=30 || h>=400)
                        {
                            System.out.println("Nu ati introdus corect!!!");
                            System.out.println("\nInaltimea dumneavoastra in centimetri: ");
                            h = tst.nextInt();
                        }

                        //greutate
                        System.out.println("Greutatea dumneavoastra in kilograme: ");
                        gr_act = tst.nextInt();
                        while(gr_act<=10 || gr_act >=600)
                        {
                            System.out.println("Nu ati introdus corect!!!");
                            System.out.println("Greutatea dumneavoastra in kilograme: ");
                            gr_act = tst.nextInt();
                        }
                        System.out.println("Sunteti activi din punct de vedere sportiv ?\n0-NU\n1-DA ");
                        this.activitate = tst.nextInt();
                        while(this.activitate!= 0 && this.activitate!=1)
                        {
                            System.out.println("Nu ati introdus corect!!!");
                            System.out.println("Sunteti activi din punct de vedere sportiv ?\n0-NU\n1-DA ");
                            this.activitate = tst.nextInt();
                        }




                        PrintWriter fileout;
                        fileout = new PrintWriter(new FileWriter("date_membru.txt"));
                        fileout.println(gen); 
                        fileout.println(vr);
                        fileout.println(h);
                        fileout.println(gr_act);
                        fileout.println(activitate);

                        fileout.close();
                    }
                }
            }
        }
        catch(IOException e){
            System.out.println("S-a produs o eroare.");
        }
        
        
        
        
        
        
        
        
        
        
        
        
    }
    public int getGr_act()
    {
        return this.gr_act;
    }
    public float getH()
    {
        return  this.h;
    }
    public int getVr()
    {
        return this.vr;
    }
    public int getGen()
    {
        return this.gen;
    }
    public int getActivitate()
    {
    return this.activitate;
    }
        
    void citire2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setCal_nec() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    int getCal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    int getTimp() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
    
}
