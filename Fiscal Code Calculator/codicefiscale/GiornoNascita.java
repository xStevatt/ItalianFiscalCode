package codicefiscale;
import java.util.Scanner; 
import java.io.IOException;

/**
 *
 * @author Stefano Valloncini aka xStevatt
 */

public class GiornoNascita 
{
    public String workOnGiorno(String giorno, String sesso) 
    {   
        String codicefiscale = ""; 
        
        if(sesso.equalsIgnoreCase("Femminile") || sesso.equalsIgnoreCase("Female"))
        {
            int totalegiorni = Integer.parseInt(giorno) + 40; 
            codicefiscale = String.valueOf(totalegiorni); 
        }
        
        else
        {
            if(Integer.parseInt(giorno) > 10)
            {
                codicefiscale += giorno;
            }
            
            else
            {
                codicefiscale += "0" + giorno; 
            }
        }
        
        return codicefiscale; 
    }
}
