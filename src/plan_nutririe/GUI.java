
package plan_nutririe;

import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class GUI extends JFrame implements ActionListener {
    JButton button,button2;
    JLabel label, sub_label, lgen, lvr, lh, lgr, lact;
    /*JMenuBar calendar_menu;
    JMenu calendar_menu_sub;
    JMenuItem calendar_menu_exit;*/
    int ok=-1;
    private String Alim1,Alim2,Alim3;
    private String Lin1, Lin2;
    GUI(String alim1, String alim2, String alim3) throws FileNotFoundException
    {   
        // Setare alimentare dupa mese
        this.Alim1 = alim1;
        this.Alim2 = alim2;
        this.Alim3 = alim3;
        
        // Setare logo colt stanga sus pentru GUI.
        ImageIcon image2 = new ImageIcon("logo.jpg");
        
        
        // Variabile default pentru setarile persoanei.
        int gen = 0 ;
        int vr = 0 ;
        int h = 0;
        int gr_act = 0;
        int activitate = 0;
        
        // Fisiere din care se citesc datele
        File myObj2 = new File("myfile1.txt");
        File myObj3 = new File("durata_program.txt");
        
        
        // Citire
        Scanner myReader = new Scanner(myObj2);
        while(myReader.hasNextInt())
        {
            gen = myReader.nextInt();
            vr = myReader.nextInt();
            h = myReader.nextInt();
            gr_act = myReader.nextInt();
            activitate = myReader.nextInt();
        }
        myReader.close();
        
        Scanner fileReader = new Scanner(myObj3);
        while(fileReader.hasNextLine())
        {
            this.Lin1 = fileReader.nextLine();
            this.Lin2 = fileReader.nextLine();
        }
        fileReader.close();
        
        //
        
        // Creare panels
        JPanel title2 = new JPanel();
        title2.setBackground(new Color(255,255,224));
        title2.setBounds(0,350,7000,37);
        title2.setLayout( new GridBagLayout() );
        title2.setLayout(new BoxLayout(title2, BoxLayout.Y_AXIS));
        title2.setAlignmentX(Component.LEFT_ALIGNMENT);
        
        
        
        JPanel alim1Panel = new JPanel();
        alim1Panel.setBackground(new Color(255,255,224));
        alim1Panel.setBounds(0,387,7000,25);
        alim1Panel.setLayout( new GridBagLayout() );
        alim1Panel.setLayout(new BoxLayout(alim1Panel, BoxLayout.Y_AXIS));
        alim1Panel.setAlignmentX(Component.LEFT_ALIGNMENT);
        
        JPanel alim2Panel = new JPanel();
        alim2Panel.setBackground(new Color(255,255,224));
        alim2Panel.setBounds(0,412,7000,25);
        alim2Panel.setLayout( new GridBagLayout() );
        alim2Panel.setLayout(new BoxLayout(alim2Panel, BoxLayout.Y_AXIS));
        alim2Panel.setAlignmentX(Component.LEFT_ALIGNMENT);
        
        JPanel alim3Panel = new JPanel();
        alim3Panel.setBackground(new Color(255,255,224));
        alim3Panel.setBounds(0,437,7000,25);
        alim3Panel.setLayout( new GridBagLayout() );
        alim3Panel.setLayout(new BoxLayout(alim3Panel, BoxLayout.Y_AXIS));
        alim3Panel.setAlignmentX(Component.LEFT_ALIGNMENT);
        
        JPanel redPanel = new JPanel();
        redPanel.setBackground(new Color(173,216,230));
        redPanel.setBounds(0, 0, 700, 80);
       
        //redPanel.setLayout(null);
        
        JPanel bluePanel = new JPanel();
        
        bluePanel.setBounds(0, 80, 7000, 25);
        bluePanel.setLayout( new GridBagLayout() );
        bluePanel.setLayout(new BoxLayout(bluePanel, BoxLayout.Y_AXIS));
        bluePanel.setAlignmentX(Component.LEFT_ALIGNMENT);
        bluePanel.setBackground(new Color(255,240,245));
        //bluePanel.setLayout(null);
        
        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(new Color(255,240,245));
        greenPanel.setBounds(0, 105, 700, 25);
        greenPanel.setLayout( new GridBagLayout() );
        greenPanel.setLayout(new BoxLayout(greenPanel, BoxLayout.Y_AXIS));
        greenPanel.setAlignmentX(Component.LEFT_ALIGNMENT);
        //greenPanel.setLayout(null);
            
            
        JPanel albPanel = new JPanel();
        albPanel.setBackground(new Color(255,240,245));
        albPanel.setBounds(0, 130, 700, 25);  
        albPanel.setLayout( new GridBagLayout() );
        albPanel.setLayout(new BoxLayout(albPanel, BoxLayout.Y_AXIS));
        albPanel.setAlignmentX(Component.LEFT_ALIGNMENT);
            
        
        JPanel verdePanel = new JPanel();
        verdePanel.setBackground(new Color(255,240,245));
        verdePanel.setBounds(0, 155, 700, 25);
        verdePanel.setLayout( new GridBagLayout() );
        verdePanel.setLayout(new BoxLayout(verdePanel, BoxLayout.Y_AXIS));
        verdePanel.setAlignmentX(Component.LEFT_ALIGNMENT);
        
        JPanel purPanel = new JPanel();
        purPanel.setBackground(new Color(255,240,245));
        purPanel.setBounds(0, 180, 700, 25);
        purPanel.setLayout( new GridBagLayout() );
        purPanel.setLayout(new BoxLayout(purPanel, BoxLayout.Y_AXIS));
        purPanel.setAlignmentX(Component.LEFT_ALIGNMENT);
        /*button = new JButton();
        button.setBounds(100, 100, 75, 40);
        button.addActionListener(this);
        button.setText("Masculin");
        button.setFocusable(false);
        button.setBackground(Color.lightGray);
        button.setBorder(BorderFactory.createEtchedBorder());
        
        button2 = new JButton();
        button2.setBounds(200, 100, 75, 40);
        button2.addActionListener(this);
        button2.setText("Feminin");
        button2.setFocusable(false);
        button2.setBackground(Color.lightGray);
        button2.setBorder(BorderFactory.createEtchedBorder());
        
        
        calendar_menu = new JMenuBar();
        calendar_menu_sub = new JMenu("File");
        calendar_menu_exit = new JMenuItem("Test");
        
        calendar_menu_sub.add(calendar_menu_exit);
        calendar_menu.add(calendar_menu_sub);
        */
        
        ///
        
        
        // Creare labels
        
        label = new JLabel();
        label.setText("Programul de nutritie");
        
        label.setFont(new Font("MV Boli",Font.PLAIN,30));//font
        label.setHorizontalTextPosition(JLabel.CENTER);// set text lef,center or right on image icon
        label.setVerticalTextPosition(JLabel.TOP);//set text top, center or bottom
        label.setIconTextGap(0);// set deparatarea -/+
        label.setVerticalAlignment(JLabel.TOP);// ti - l pun e vertical
        label.setHorizontalAlignment(JLabel.CENTER);
        
        sub_label = new JLabel();
        sub_label.setText(this.Lin1+" / "+this.Lin2);
        
        sub_label.setFont(new Font("MV Boli",Font.PLAIN,15));//font
        sub_label.setHorizontalTextPosition(JLabel.CENTER);// set text lef,center or right on image icon
        sub_label.setVerticalTextPosition(JLabel.BOTTOM);//set text top, center or bottom
        sub_label.setIconTextGap(0);// set deparatarea -/+
        sub_label.setVerticalAlignment(JLabel.CENTER);// ti - l pun e vertical
        sub_label.setHorizontalAlignment(JLabel.CENTER);
        
        ///
        
        //lgen, lvr, lh, lgr, lact;
        

        String act = new String();
        if(gen == 1) {
            if(activitate == 1) {
                act = "Esti activ din punct de vedere sportiv ";
            } else {
                act = "Din pacate, nu esti activ din punct de vedere sportiv ";
            }
        } else {
            if(activitate == 1) {
                act = "Esti activa din punct de vedere sportiv ";
            } else {
                act = "Din pacate, nu esti activa din punct de vedere sportiv, sportul este benefic ! ";
            }
        }
        lact = new JLabel();
        lact.setText(act);
        lact.setBounds(100, 100000, 100, 100);
        lact.setFont(new Font("MV Boli",Font.PLAIN,15));//font

        
        JLabel Alim = new JLabel();
        Alim.setText(this.Alim1);
        Alim.setBounds(100, 100000, 100, 100);
        Alim.setFont(new Font("MV Boli",Font.PLAIN,15));//font
        
        JLabel Alim22 = new JLabel();
        Alim22.setText(this.Alim2);
        Alim22.setBounds(100, 100000, 100, 100);
        Alim22.setFont(new Font("MV Boli",Font.PLAIN,15));//font
        
        JLabel Alim33 = new JLabel();
        Alim33.setText(this.Alim3);
        Alim33.setBounds(100, 100000, 100, 100);
        Alim33.setFont(new Font("MV Boli",Font.PLAIN,15));//font
        
        
        lgr = new JLabel();
        lgr.setText("Greutatea dumneavoastra este de "+gr_act+ " kg");
        lgr.setBounds(100, 100000, 100, 100);
        lgr.setFont(new Font("MV Boli",Font.PLAIN,15));//font
        
        
        

        // the attachment part
        lh = new JLabel();
        lh.setText("Inaltimea dumneavoastra este de "+h+" cm ");
        lh.setBounds(100, 100000, 100, 100);
        lh.setFont(new Font("MV Boli",Font.PLAIN,15));//font
        
        String a = (gen == 1) ? "masculin" : "feminin";
        lgen = new JLabel();
        lgen.setText("Genul este " +a);
        lgen.setBounds(100, 100000, 100, 100);
        lgen.setFont(new Font("MV Boli",Font.PLAIN,15));//font
        
        lgen.setIconTextGap(0);// set deparatarea -/+
        
        lvr = new JLabel();
        lvr.setText("Varsta este de "+vr+" ani ");
        lvr.setBounds(100, 100000, 100, 100);
        lvr.setFont(new Font("MV Boli",Font.PLAIN,15));//font
        
        lgen.setIconTextGap(0);// set deparatarea -/+
        
        JLabel title3 = new JLabel();
        title3.setText("Programul din aceasta zi este: ");
        title3.setBounds(100, 100000, 100, 100);
        title3.setFont(new Font("MV Boli",Font.PLAIN,20));//font
        
        title3.setIconTextGap(0);// set deparatarea -/+
        
        
        this.setTitle("Nutritia");
        this.setLayout(new FlowLayout());
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// cu asta inchizi
        this.setResizable(false); // nu poate fi resizable.
        this.setSize(700, 500);// sets x-dimensions and y-dimensions
        this.setLocationRelativeTo(null); // Acest lucru adauga frame-ul direct pe mijlocul ecranului
        this.getContentPane().setBackground(new Color(238,232,170));
        this.setLayout(null);
        this.setAlwaysOnTop(true);
        //this.add(calendar_menu);
        
        // ADAUGARE PANELS
        this.add(redPanel);
        this.add(greenPanel);
        this.add(bluePanel);
        this.add(albPanel);
        this.add(verdePanel);
        this.add(purPanel);
        this.add(alim1Panel);
        this.add(alim2Panel);
        this.add(alim3Panel);
        this.add(title2);
        ///
       
        alim1Panel.add(Alim);
        alim2Panel.add(Alim22);
        alim3Panel.add(Alim33);
           
        title2.add(title3);
        albPanel.add(lh);
        verdePanel.add(lgr);
        purPanel.add(lact);
        bluePanel.add(lvr);
        redPanel.add(label);
        redPanel.add(sub_label);
        greenPanel.add(lgen);
        this.setVisible(true);
        
        
       
        
        //frame.add(label);
        ImageIcon image = new ImageIcon("logo.jpg");
        this.setIconImage(image.getImage());

        //System.out.println("Genul este:"+gen+"\nVarsta este:"+vr+"\nInaltimea este:"+h+"\nGreutatea este: "+gr_act+"\nActivitate este: "+activitate);
            
     
}
        
    
@Override
    public void actionPerformed(ActionEvent e) {
        int ok=-1;
        if(e.getSource()==button)
        {
           button.setEnabled(false);
           button2.setEnabled(false);
           ok=0;
           System.out.println(2);
        }
        if(e.getSource()==button2)
        {
            button.setEnabled(false);
            button2.setEnabled(false);
            ok=1;
            System.out.println(1);
        } 
    }
    public int Gen()
    {
      if(ok==0)
          return 8;
      else return 1000;
    }
    
    
    
}

