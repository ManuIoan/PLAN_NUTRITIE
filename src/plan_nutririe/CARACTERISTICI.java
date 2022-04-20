
package plan_nutririe;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Calendar;
import java.text.SimpleDateFormat;


public class CARACTERISTICI {
    private int gr_act,vr,gen,activitate,h, luni; //greutate actuala,inaltime,varsta, gen
    boolean inputGen = true, inputVarsta = true, inputH = true, inputGreutate = true, inputAct = true, inputLuni = true;
    // Initializare default a unei persoane.
    public CARACTERISTICI()
    {
        this.gr_act = 0;
        this.h = 0;
        this.vr = 0;
        this.gen =0;
        this.activitate = 0;
        this.luni = 0;
    }
    
    // Citirea datelor pentru o persoana.
    public void citire() throws IOException
    {
        Scanner tst = new Scanner(System.in);
        
        try
        {
            String fileName = "myfile1.txt";
            File myObj = new File(fileName);
            if(myObj.createNewFile())
            {
                ///////////////// CITIRE GENUL PERSOANEI ///////////////////
                System.out.println("Ce gen sunteti:\n0 - FEMININ\n1 - MASCULIN");
                while (inputGen) {
                    String gen_citire = tst.nextLine();
                    Integer gen_val = null;
                    try {
                        gen_val = Integer.parseInt(gen_citire);
                    } catch (NumberFormatException e) {
                        System.err.println("Trebuie sa citesti o valoare valida ( 0 sau 1 )");
                        continue;
                    }
                    if(gen_val == 0 || gen_val == 1) { inputGen = false; this.gen = gen_val; }
                    else { 
                        System.err.println("Trebuie sa citesti o valoare valida ( 0 sau 1 )");
                        continue; 
                    }
                }
                
                /////////////////////////////////////////////////////////////
                
                
                
                ///////////////// CITIRE VARSTA PERSOANEI ///////////////////
                
                System.out.println("Varsta dumneavoastra:");
                
                while (inputVarsta) {
                    String varsta_citire = tst.nextLine();
                    Integer varsta_val = null;
                    try {
                        varsta_val = Integer.parseInt(varsta_citire);
                    } catch (NumberFormatException e) {
                        System.err.println("Trebuie sa citesti o valoare valida ( intre 12 si 120 )");
                        continue;
                    }
                    if(varsta_val >= 12 && varsta_val <= 120) { inputVarsta = false; this.vr = varsta_val; }
                    else { 
                        System.err.println("Trebuie sa citesti o valoare valida ( intre 12 si 120 )");
                        continue; 
                    }
                }
                
                /////////////////////////////////////////////////////////////
              
                
                ///////////////// CITIRE INALTIMEA PERSOANEI ////////////////
                
                
                System.out.println("Inaltimea dumneavoastra in centimetri: ");
                
                while (inputH) {
                    String inaltime_citire = tst.nextLine();
                    Integer inaltime_val = null;
                    try {
                        inaltime_val = Integer.parseInt(inaltime_citire);
                    } catch (NumberFormatException e) {
                        System.err.println("Trebuie sa citesti o valoare valida ( intre 120 si 210 )");
                        continue;
                    }
                    if(inaltime_val >= 120 && inaltime_val <= 210) { inputH = false; this.h = inaltime_val; }
                    else { 
                        System.err.println("Trebuie sa citesti o valoare valida ( intre 120 si 210 )");
                        continue; 
                    }
                }
                
                /////////////////////////////////////////////////////////////
              
                
                ///////////////// CITIRE GREUTATEA PERSOANEI ////////////////
           
                System.out.println("Greutatea dumneavoastra in kilograme: ");
                
                
                while (inputGreutate) {
                    String greutate_citire = tst.nextLine();
                    Integer greutate_val = null;
                    try {
                        greutate_val = Integer.parseInt(greutate_citire);
                    } catch (NumberFormatException e) {
                        System.err.println("Trebuie sa citesti o valoare valida ( intre 40 si 200 )");
                        continue;
                    }
                    if(greutate_val >= 40 && greutate_val <= 200) { inputGreutate = false; this.gr_act = greutate_val; }
                    else { 
                        System.err.println("Trebuie sa citesti o valoare valida ( intre 40 si 200 )");
                        continue; 
                    }
                }

                /////////////////////////////////////////////////////////////
                
                
                ///////////////// CITIRE ACTIVITATEA PERSOANEI //////////////
                if( gen == 1) System.out.println("Sunteti activ din punct de vedere sportiv? \n0 - NU\n1 - DA ");
                else System.out.println("Sunteti activa din punct de vedere sportiv? \n0 - NU\n1 - DA ");
                
                
                while (inputAct) {
                    String act_citire = tst.nextLine();
                    Integer act_val = null;
                    try {
                        act_val = Integer.parseInt(act_citire);
                    } catch (NumberFormatException e) {
                        System.err.println("Trebuie sa citesti o valoare valida ( 0 sau 1 )");
                        continue;
                    }
                    if(act_val == 0 || act_val == 1) { inputAct = false; this.activitate = act_val; }
                    else { 
                        System.err.println("Trebuie sa citesti o valoare valida ( 0 sau 1 )");
                        continue; 
                    }
                }
                
                /////////////////////////////////////////////////////////////
                
                ///////////////// CITIRE DURATA PROGRAM NUTRITIE ////////////
           
                System.out.println("Pe cate luni doriti acest program? ");
                
                
                while (inputLuni) {
                    String luni_citire = tst.nextLine();
                    Integer luni_val = null;
                    try {
                        luni_val = Integer.parseInt(luni_citire);
                    } catch (NumberFormatException e) {
                        System.err.println("Trebuie sa citesti o valoare valida ( intre 1 si 12 )");
                        continue;
                    }
                    if(luni_val >= 1 && luni_val <= 12) { inputLuni = false; this.luni = luni_val; }
                    else { 
                        System.err.println("Trebuie sa citesti o valoare valida ( intre 1 si 12 )");
                        continue; 
                    }
                }

                /////////////////////////////////////////////////////////////
                
                
                // PRINTARE IN FISIERUL myfile1.txt DATELE SETATE DE LA TASTATURA.
                Calendar calendar = Calendar.getInstance();
                SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
                

                PrintWriter fileout;
                fileout = new PrintWriter(new FileWriter("myfile1.txt"));
                fileout.println(gen); 
                fileout.println(vr);
                fileout.println(h);
                fileout.println(gr_act);
                fileout.println(activitate);
                fileout.close();
                
                PrintWriter fileout2;
                fileout2 = new PrintWriter(new FileWriter("durata_program.txt"));
                String formatted = format1.format(calendar.getTime());
                fileout2.println("Adaugare program la: " +formatted);
                calendar.add(Calendar.MONTH, luni);
                String formatted2 = format1.format(calendar.getTime());
                fileout2.println("Acest program va dura "+luni+" luni pana pe "+formatted2);
                fileout2.close();
            }
            else
            {
                // IN CAZUL IN CARE FISIERUL myfile1.txt EXISTA DIN FISIER SE VOR CITI VALORILE ATRIBUITE VARIABILELOR SI PROGRAMUL VA INTREBA DACA DORITI SA REINTRODUCETI DATELE.
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
                int k;
                if(h==0) k=1;
                else {
                    System.out.println("Vrei sa iti reintroduci datele?\n\nTasteaza 1 in cazul in care vrei sa le reintroduci.\nTasteaza 0 in cazul in care nu vrei sa le reintroduci.");
                    k = tst.nextInt();
                }
                if(k==1) {
                    File f1=new File("myfile1.txt");
                    if(f1.delete()) {
                        citire();
                    }
                }

                //!!!!AR TRENUI SA FOLOSESTI GUI DACA SI NUMAI DACA SUNT DATE FOLOSITE



            }
        }
        catch(IOException e){
            System.out.println("An error occured.");
        }
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
    // Metode GET pentru aflarea unor variabile.
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
    
    /// Exceptii de eroare in cazul in care nu reusesc.
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
