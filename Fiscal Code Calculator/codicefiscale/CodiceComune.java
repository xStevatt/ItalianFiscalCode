package codicefiscale;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner; 

/**
 *
 * @author Stefano Valloncini
 */

public class CodiceComune
{   
    public String workOnCodice(String comune) throws FileNotFoundException
    {   
        // metodo che ricerca nel file il comune
        
        Scanner reader = new Scanner(new File("codici_catastali.txt")); 
        
        comune = comune.toUpperCase();
        
        String temp = ""; 
        String temp2 = ""; 
        
        while(reader.hasNext())
        {   
            try
            {
                temp = reader.nextLine(); 
                temp2 = temp.substring(4, 5 + (comune.length()));
                
                if(temp2.contains(comune))
                    return temp.substring(0, 5); 
            }
            catch(Exception e)
            {
                continue; 
            }
        }
        
        return null; 
    }
}
