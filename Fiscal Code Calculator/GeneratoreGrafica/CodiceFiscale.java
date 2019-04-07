package GeneratoreGrafica;
import javax.swing.JFrame;

/**
 * @author Stefano Valloncini aka xStevatt
 */

public class CodiceFiscale 
{
    public static void main(String[] args) 
    {   
        Schermata1 gui = new Schermata1(); 
        
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setSize(525, 450);
        gui.centreWindow(gui);
        gui.setResizable(false);
        gui.setTitle("CodiceFiscale | Stefano Valloncini | 4CI - 2018/2019");
        gui.setVisible(true);
    }
}
