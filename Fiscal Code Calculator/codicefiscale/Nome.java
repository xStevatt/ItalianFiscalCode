package codicefiscale;
import java.util.Scanner; 

/**
 *
 * @author Stefano Valloncini
 */

public class Nome 
{       
    public String workOnNome(String nome_temp)
    {   
        String codicefiscale = ""; 
        String vocali = ""; 
        String consonanti = ""; 
        
        String nome = nome_temp.toUpperCase(); 
        
        for(int i = 0; i < nome.length(); i++)
        {
            if(nome.charAt(i) == 'A' || nome.charAt(i) == 'E' || nome.charAt(i) == 'I' || nome.charAt(i) == 'O' || nome.charAt(i) == 'U')
            {   
                vocali += nome.charAt(i); 
            }
            else
            {
                consonanti += nome.charAt(i);
            }
        }
        
        if(consonanti.length() >= 4)
        {
            codicefiscale += consonanti.charAt(0); 
            codicefiscale += consonanti.charAt(2);
            codicefiscale += consonanti.charAt(3);
        }
        
        if(consonanti.length() == 3)
        {
            codicefiscale += consonanti; 
        }
        
        if(consonanti.length() == 2 && vocali.length() >= 1)
        {
            codicefiscale += consonanti; 
            codicefiscale += vocali.substring(0, 1); 
        }
        
        if(consonanti.length() == 2 && vocali.length() == 0)
        {
            codicefiscale += consonanti; 
            codicefiscale += "X";
        }
        
        if(consonanti.length() == 1 && vocali.length() == 0)
        {
            codicefiscale = consonanti; 
            codicefiscale += "X"; 
            codicefiscale += "X";
        }
        
        if(consonanti.length() == 0 && vocali.length() >= 3)
        {
            codicefiscale += vocali.substring(0, 3); 
        }
        
        if(consonanti.length() == 1 && vocali.length() == 1)
        {
            codicefiscale += consonanti; 
            codicefiscale += vocali; 
            codicefiscale += "X";
        }
        
        if(consonanti.length() == 0 && vocali.length() == 2)
        {
            codicefiscale += vocali; 
            codicefiscale += "X";
        }
        
        return codicefiscale; 
    }   
}
