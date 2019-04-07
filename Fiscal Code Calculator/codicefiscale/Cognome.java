package codicefiscale;
import java.util.Scanner; 

/**
 *
 * @author xStevatt
 */
public class Cognome
{
    public String workOnCognome(String cognome_temp)
    {
        String codicefiscale = ""; 
        String vocali = ""; 
        String consonanti = ""; 
        
        String cognome = cognome_temp.toUpperCase(); 
        
        for(int i = 0; i < cognome.length(); i++)
        {
            if(cognome.charAt(i) == 'A' || cognome.charAt(i) == 'E' || cognome.charAt(i) == 'I' || cognome.charAt(i) == 'O' || cognome.charAt(i) == 'U')
            {   
                vocali += cognome.charAt(i); 
            }
            else
            {
                 consonanti += cognome.charAt(i);
            }
        }
        
        if(consonanti.length() >= 3)
        {
            codicefiscale = consonanti.substring(0, 3); 
        }
        
        if(consonanti.length() == 2 && vocali.length() > 0)
        {   
            codicefiscale += consonanti; 
            codicefiscale += vocali.substring(0, 1); 
        }
        
        if(consonanti.length() == 1 && vocali.length() == 1)
        {
            codicefiscale += consonanti;  
            codicefiscale += vocali; 
            codicefiscale += "X"; 
        }
        
        if(consonanti.length() == 2 && vocali.length() == 0)
        {   
            codicefiscale += consonanti; 
            codicefiscale += "X"; 
        }
        
        if(consonanti.length() == 1 && vocali.length() == 0)
        {   
            codicefiscale += consonanti; 
            codicefiscale += "X";  
            codicefiscale += "X";  
        }
        
        if(consonanti.length() == 1 && vocali.length() >= 2)
        {
            codicefiscale += consonanti.substring(0, 1); 
            codicefiscale += consonanti.substring(0, 2); 
        }
        
        if(consonanti.length() == 0 && vocali.length() >= 3)
        {
            codicefiscale += vocali.substring(0, 3); 
        }
        
        if(consonanti.length() == 0 && vocali.length() == 2)
        {
            codicefiscale += vocali.substring(0, 2); 
            codicefiscale += "X"; 
        }
        
        if(consonanti.length() == 0 && vocali.length() == 1)
        {
            codicefiscale += vocali;
            codicefiscale += "X";  
            codicefiscale += "X";  
        }
        
        return codicefiscale; 
    }
}
