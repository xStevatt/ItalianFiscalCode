package GeneratoreGrafica;

import codicefiscale.CodiceGenerator;
import java.awt.*; 
import java.io.*; 
import java.awt.event.*; 
import javax.swing.*; 
import java.util.logging.*;

/**
 *
 * @author Stefano Valloncini
 */

public class Schermata1 extends JFrame
{   
    
    private JLabel labelNome, labelCognome, labelSesso, labelGiorno, labelMese, labelAnno, labelComune, descrizione; 
    private JTextField fieldNome, fieldCognome, fieldGiorno, fieldAnno, fieldCodice, fieldComune;
    private JComboBox mesiTendina, sessoTendina;
    private JButton button1, bottonePulizia, bottoneLista; 
    private JRadioButton linguaIT, linguaEN; 
    private String linguaProgramma = "italian"; 
    
    String[] mesiIt = {"", "Gennaio", "Febbraio", "Marzo", "Aprile", "Maggio", "Giugno", "Luglio", "Agosto", "Settembre", "Ottobre", "Novembre", "Dicembre"};
    String[] mesiEng = {"", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    String[] sessiEng = {"", "Male", "Female"};
    String[] sessiIt = {"", "Maschile", "Femminile"}; 
    
    
    // centra la finestra nello schermo al momento dell'avvio
    
    public static void centreWindow(Window frame)
    {
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - frame.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - frame.getHeight()) / 2);
        frame.setLocation(x, y);
    }   
    
    
    public Schermata1()
    {   
        // pannello principale (sottostante)
        JPanel pannello = new JPanel(new BorderLayout()); 
        pannello.setBackground(Color.WHITE);
        
        // Crazione del PannelloDescrizione
        JPanel pannelloDescrizione = new JPanel();
        pannelloDescrizione.setBackground(Color.WHITE);
        descrizione = new JLabel("Benvenuto nel calcolatore del Codice Fiscale!"); 
        descrizione.setFont(new Font("Arial", Font.BOLD + Font.ITALIC, 20));
        descrizione.setForeground(new Color(238, 130, 238));
        pannelloDescrizione.add(descrizione);
        
        // Crazione del PannelloCentrale
        JPanel griglia1 = new JPanel();
        griglia1.setBackground(Color.WHITE);
        JPanel griglia = new JPanel(new GridLayout(9, 2, 0, 5));
        griglia.setBackground(Color.WHITE); 
        
        // Creazione del PannelloSottostante
        JPanel fondo1 = new JPanel();
        fondo1.setBackground(Color.WHITE);
        JPanel fondo = new JPanel(new GridLayout(4, 4)); 
        fondo.setBackground(Color.WHITE);
        
        // selettore della lingua
        linguaIT = new JRadioButton("Italiano", true); 
        linguaIT.setBackground(Color.WHITE);
        linguaEN = new JRadioButton("English", false); 
        linguaEN.setBackground(Color.WHITE);
        
        fondo1.add(linguaEN); 
        fondo1.add(linguaIT); 
        ButtonGroup gruppo = new ButtonGroup(); 
        
        gruppo.add(linguaEN); 
        gruppo.add(linguaIT);        
        
        // inserimento nome
        labelNome = new JLabel(""); 
        labelNome.setForeground(Color.black);
        griglia.add(labelNome);
        
        fieldNome = new JTextField(15); 
        fieldNome.setHorizontalAlignment(JTextField.CENTER);
        griglia.add(fieldNome); 
        
        // inserimento cognome
        labelCognome = new JLabel(""); 
        labelCognome.setForeground(Color.black);
        griglia.add(labelCognome);
        
        fieldCognome = new JTextField(15); 
        fieldCognome.setHorizontalAlignment(JTextField.CENTER);
        griglia.add(fieldCognome);
        
        // inserimento sesso
        labelSesso = new JLabel(""); 
        labelSesso.setForeground(Color.black);
        griglia.add(labelSesso);
        
        sessoTendina = new JComboBox();
        ((JLabel)sessoTendina.getRenderer()).setHorizontalAlignment(SwingConstants.CENTER); // // imposta i mesi con allineamento centrale
        
        griglia.add(sessoTendina);
        
        // inserimento comune di nascita
        labelComune = new JLabel(""); 
        labelComune.setForeground(Color.black);
        griglia.add(labelComune); 
        
        fieldComune = new JTextField(15); 
        fieldComune.setHorizontalAlignment(JTextField.CENTER);
        griglia.add(fieldComune);
        
                
        // inserimento giorno
        labelGiorno = new JLabel(""); 
        labelGiorno.setForeground(Color.black);
        griglia.add(labelGiorno); 
        
        fieldGiorno = new JTextField(15); 
        fieldGiorno.setHorizontalAlignment(JTextField.CENTER);
        griglia.add(fieldGiorno);
        
        // inserimento mese
        labelMese = new JLabel(""); 
        griglia.add(labelMese); 
        labelMese.setForeground(Color.black);
        
        mesiTendina = new JComboBox(mesiIt);
        ((JLabel)mesiTendina.getRenderer()).setHorizontalAlignment(SwingConstants.CENTER); // imposta i mesi con allineamento centrale
        griglia.add(mesiTendina);
        
        // inserimento anno
        labelAnno = new JLabel(""); 
        griglia.add(labelAnno); 
        labelAnno.setForeground(Color.black);
        
        fieldAnno = new JTextField(15); 
        fieldAnno.setHorizontalAlignment(JTextField.CENTER);
        griglia.add(fieldAnno);
        
        bottoneLista = new JButton(""); 
        bottoneLista.setIcon(new ImageIcon(new ImageIcon("lista.png").getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT)));
        
        // bottone per l'ottenimento del codice
        button1 = new JButton(""); 
        button1.setIcon(new ImageIcon(new ImageIcon("search.png").getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        
        // codice fiscale
        fieldCodice = new JTextField(20);
        fieldCodice.setEditable(false); 
        fieldCodice.setBackground(Color.LIGHT_GRAY);
        
        bottonePulizia = new JButton(""); 
        bottonePulizia.setIcon(new ImageIcon(new ImageIcon("clean2.png").getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT)));
        setLabels("italian");
            
        
        griglia1.add(griglia); 
        
        // ------------------------> Fine Griglia
        
        /*
        Evento: è in continua attesa che il pulsante venga premuto, in tal momento
                esso svolge una serie di azioni.
        */
        // bottone che calcola il codicefiscale
        event e1 = new event(); 
        button1.addActionListener(e1);
        
        // bottone che pulisce i campi di testo
        pulizia e2 = new pulizia(); 
        bottonePulizia.addActionListener(e2);
        
        // bottone per la lista
        bottoneLista.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) 
            {
                Lista ls = null;
                try {
                    ls = new Lista(linguaProgramma);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(Schermata1.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                ls.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                ls.setSize(500, 400);
                ls.centreWindow(ls);
                ls.setResizable(true);
                ls.setTitle("CodiceFiscale | Stefano Valloncini | 4CI - 2018/2019");
                ls.setVisible(true);
            }
        });
       
        
        // permette di usare invio al posto di cliccare sul pulsante
        this.getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER,0),"clickButton");

        this.getRootPane().getActionMap().put("clickButton", new AbstractAction()
        {
        public void actionPerformed(ActionEvent ae)
        {
    button1.doClick();
    System.out.println("Generate button cliccato");
        }
    });


        // selezione della lingua
        LinguaIT italiano = new LinguaIT(); 
        linguaIT.addItemListener(italiano);
        LinguaEN english = new LinguaEN(); 
        linguaEN.addItemListener(english);
        
        
        // aggiunta dei pannelli
        fondo.add(fieldCodice);
        fondo.add(button1); 
        fondo1.add(bottonePulizia); 
        fondo1.add(bottoneLista); 
        fondo1.add(fondo);
    
        pannello.add(pannelloDescrizione,BorderLayout.NORTH);
        pannello.add(griglia1,BorderLayout.CENTER);
        pannello.add(fondo1, BorderLayout.SOUTH);
        add(pannello);
  
    }
        
    private void setLabels(String type)
    {   
        descrizione.removeAll();
        labelNome.removeAll();
        labelCognome.removeAll();
        labelComune.removeAll();
        labelGiorno.removeAll();
        labelAnno.removeAll();
        labelMese.removeAll();
        labelSesso.removeAll();
        labelMese.removeAll();        
        
            switch(type)
            {
                case "italian": 
                    descrizione.setText("Benvenuto nel calcolatore del Codice Fiscale!");
                    setTitle("CodiceFiscale | Stefano Valloncini | 4CI - 2018/2019"); 
                    labelNome.setText("              Nome:");
                    labelCognome.setText("              Cognome:");
                    labelComune.setText("              Provincia:");
                    labelComune.setText("              Comune: "); 
                    labelGiorno.setText("              Giorno: ");
                    labelAnno.setText("              Anno: ");
                    labelSesso.setText("              Genere: ");
                    labelMese.setText("              Mese: ");
                    bottonePulizia.setText("Pulizia");
                    bottoneLista.setText(" Lista  "); 
                    
                    DefaultComboBoxModel sessoIT = new DefaultComboBoxModel(sessiIt);
                    sessoTendina.setModel(sessoIT);
                    DefaultComboBoxModel meseIT = new DefaultComboBoxModel(mesiIt);
                    mesiTendina.setModel(meseIT);
                    button1.setText("Trova il tuo codice!");
                    break; 
                case "english":
                    descrizione.setText("Welcome to the Fiscal Code Calculator!");
                    setTitle("FiscalCode | Stefano Valloncini | 4CI - 2018/2019"); 
                    labelNome.setText("              Name:");
                    labelCognome.setText("              Surname:");
                    labelComune.setText("              City: "); 
                    labelGiorno.setText("              Day: ");
                    labelAnno.setText("              Year: ");
                    labelSesso.setText("              Gender: ");
                    labelMese.setText("              Month: ");
                    bottonePulizia.setText(" Clean ");
                    bottoneLista.setText("List"); 
                    
                    DefaultComboBoxModel sessoENG = new DefaultComboBoxModel(sessiEng);
                    sessoTendina.setModel(sessoENG);
                    DefaultComboBoxModel meseENG = new DefaultComboBoxModel(mesiEng);
                    mesiTendina.setModel(meseENG);
                    button1.setText("Find your code!");
                    break; 
            }
    }
    
    private void pulisci()
    {
        fieldNome.setText("");
        fieldCognome.setText("");
        fieldComune.setText(""); 
        fieldGiorno.setText("");
        fieldAnno.setText("");
        fieldCodice.setText("");
        fieldCodice.setBackground(Color.lightGray);
        sessoTendina.setSelectedIndex(0);
        mesiTendina.setSelectedIndex(0);
    }
    
    
    private class LinguaEN implements ItemListener
    {
        public void itemStateChanged(ItemEvent e)
        {
            setLabels("english");
            linguaProgramma = "english"; 
        }
    }
    
    private class LinguaIT implements ItemListener
    {
        public void itemStateChanged(ItemEvent e)
        {
            setLabels("italian");
            linguaProgramma = "italian"; 
        }
    }
    
    private class pulizia implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            pulisci();
        }
    }
    
    
    private class event implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {   
            CodiceGenerator CODICEFISCALE = new CodiceGenerator(); 
            
            
            // prende i dati dalle caselle di testo
            String nome = fieldNome.getText().trim(); 
            String cognome = fieldCognome.getText().trim(); 
            String giorno = fieldGiorno.getText().trim();
            String anno = fieldAnno.getText().trim(); 
            String comune = fieldComune.getText().trim(); 
            String sesso = (String) sessoTendina.getSelectedItem();
            String mese = (String) mesiTendina.getSelectedItem(); 
            
            String codicefiscale = ""; 
            
            if(nome.length() > 0 && cognome.length() > 0 && (giorno.length() > 0 && Integer.parseInt(giorno) < 31) && mese.length() > 0 && (anno.length() > 0 && Integer.parseInt(anno) < 2200) && sesso.length() > 0 && comune.length() > 0)
            {   
                try 
                {   
                    codicefiscale = CODICEFISCALE.creaOggetti(nome, cognome, giorno, mese, anno, comune, sesso);
                    
                    BufferedWriter writer = new BufferedWriter(new FileWriter("codicifiscali.txt", true)); // con true non elimina il contenuto ogni volta che viene aggiunto qualcosa
                    
                    String nome_temp = nome.toUpperCase(); 
                    nome = nome_temp.substring(0, 1) + nome.substring(1);
                    
                    String cognome_temp = cognome.toUpperCase(); 
                    cognome = cognome_temp.substring(0, 1) + cognome.substring(1); 
                    
                    writer.write(nome + " " + cognome + ": " + codicefiscale);
                    writer.newLine();
                    
                    fieldCodice.setHorizontalAlignment(JTextField.CENTER);
                    descrizione.setForeground(new Color(238, 130, 238));
                    fieldCodice.setText(codicefiscale); 
                    fieldCodice.setFont(new Font("Dialog", Font.BOLD + Font.ITALIC, 15));
                    fieldCodice.setBackground(new Color(238, 130, 238));
                    
                    writer.close(); 
                } 
                catch (IOException ex)
                {
                    Logger.getLogger(Schermata1.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            else if(linguaProgramma.equalsIgnoreCase("english"))
            {
                JOptionPane.showMessageDialog(null, "Please insert correct data!");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Perfavore inserire i dati corretti!");
            }
        }
    }
}