package codicefiscale;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author xStevatt
 */
public class CodiceGenerator
{   
    
    public String creaOggetti(String nome, String cognome, String giorno, String mese, String anno, String comune, String sesso) throws FileNotFoundException, IOException 
    {   
        // questo metodo crea gli oggetti, ognuno dei quali rappresenta una parte del codice fiscale
        // salva in una variabile nome, cognome ecc., che poi verrano salvati su file su richiesta
        
        Cognome cg= new Cognome(); // calcolo cifre cognome
        String $1 = cg.workOnCognome(cognome);

        Nome nm = new Nome(); // calcolo cifre nome
        String $2 = nm.workOnNome(nome);
        
        AnnoNascita a = new AnnoNascita(); // calcolo cifre anno nascita
        String $3 = a.workOnAnno(anno); 
        
        MeseNascita m = new MeseNascita(); // calcolo cifre mese nascita
        String $4 = m.workOnMese(mese); 
        
        GiornoNascita g = new GiornoNascita(); // calcolo cifre giorno nascita
        String $5 = g.workOnGiorno(giorno, sesso); 
        
        CodiceComune com = new CodiceComune(); // calcolo cifre comune nascita
        String $6 = com.workOnCodice(comune); 
        
        CifraControllo cf = new CifraControllo(); // calcolo cifra fi controllo
        String $7 = cf.calcCodice($1 + $2 + $3 + $4 + $5 + $6); 
        
        String codicefiscale = ($1 + $2 + $3 + $4 + $5 + $6 + $7).replaceAll("\\s+",""); 
        
        System.out.print("\nCodice Fiscale: ");
        System.out.println(codicefiscale);
        return codicefiscale.toUpperCase(); 
               
        } 
}
