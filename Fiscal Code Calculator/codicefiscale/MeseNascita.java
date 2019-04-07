package codicefiscale;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner; 

/**
 *
 * @author xStevatt
 */

public class MeseNascita
{   
    public String workOnMese(String mesenascita)
    {   
        String codicefiscale = ""; 
        
        if(mesenascita.equalsIgnoreCase("Gennaio") || mesenascita.equalsIgnoreCase("January"))
        {
            codicefiscale = "A"; 
        }
        if(mesenascita.equalsIgnoreCase("Febbraio") || mesenascita.equalsIgnoreCase("February"))
        {
            codicefiscale = "B"; 
        }
        if(mesenascita.equalsIgnoreCase("Marzo") || mesenascita.equalsIgnoreCase("March"))
        {
            codicefiscale = "C"; 
        }
        if(mesenascita.equalsIgnoreCase("Aprile") || mesenascita.equalsIgnoreCase("April"))
        {
            codicefiscale = "D"; 
        }
        if(mesenascita.equalsIgnoreCase("Maggio") || mesenascita.equalsIgnoreCase("May"))
        {
            codicefiscale = "E"; 
        }
        if(mesenascita.equalsIgnoreCase("Giugno") || mesenascita.equalsIgnoreCase("June"))
        {
            codicefiscale = "H"; 
        }
        if(mesenascita.equalsIgnoreCase("Luglio") || mesenascita.equalsIgnoreCase("July"))
        {
            codicefiscale = "L";
        }
        if(mesenascita.equalsIgnoreCase("Agosto") || mesenascita.equalsIgnoreCase("August"))
        {
            codicefiscale = "M"; 
        }
        if(mesenascita.equalsIgnoreCase("Settembre") || mesenascita.equalsIgnoreCase("September"))
        {
            codicefiscale = "P"; 
        }
        if(mesenascita.equalsIgnoreCase("Ottobre") || mesenascita.equalsIgnoreCase("October"))
        {
            codicefiscale = "R"; 
        }
        if(mesenascita.equalsIgnoreCase("Novembre") || mesenascita.equalsIgnoreCase("November"))
        {
            codicefiscale = "S"; 
        }
        if(mesenascita.equalsIgnoreCase("Dicembre") || mesenascita.equalsIgnoreCase("December"))
        {
            codicefiscale = "T"; 
        }
        
        return codicefiscale; 
    }
}
