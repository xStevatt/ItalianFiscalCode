package codicefiscale;

/**
 *
 * @author xStevatt
 */
public class CifraControllo
{    
    
    public String calcCodice(String codicefiscale)
    {   
        String c = "";
	String char_posPari = "";
	String char_posDispari = "";
	int counter=0;
		
        for(int i = 0 ; i < codicefiscale.length(); i++)
	{
            if(i % 2 == 0) 
		char_posDispari += codicefiscale.charAt(i); 
            else
		char_posPari += codicefiscale.charAt(i);
	}
        
		for(int i = 0; i <char_posDispari.length(); i++)
                {
			switch(char_posDispari.charAt(i))
                        {
			case '0': counter += 1;
                        break;
			case '1': counter += 0;
                        break;
			case '2': counter += 5;
                        break;
			case '3': counter += 7;
                        break;
			case '4': counter += 9;
                        break;
			case '5': counter += 13;
                        break;
			case '6': counter += 15;
                        break;
			case '7': counter += 17;
                        break;
			case '8': counter += 19;
                        break;
			case '9': counter += 21;
                        break;
			case 'A': counter += 1;
                        break;
			case 'B': counter += 0;
                        break;
			case 'C': counter += 5;
                        break;
			case 'D': counter += 7;
                        break;
			case 'E': counter += 9;
                        break;
			case 'F': counter += 13;
                        break;
			case 'G': counter += 15;
                        break;
			case 'H': counter += 17;
                        break;
			case 'I': counter += 19;
                        break;
			case 'J': counter += 21;
                        break;
			case 'K': counter += 2;
                        break;
			case 'L': counter += 4;
                        break;
			case 'M': counter += 18;
                        break;
			case 'N': counter += 20;
                        break;
			case 'O': counter += 11;
                        break;
			case 'P': counter += 3;
                        break;
			case 'Q': counter += 6;
                        break;
			case 'R': counter += 8;
                        break;
			case 'S': counter += 12;
                        break;
			case 'T': counter += 14;
                        break;
			case 'U': counter += 16;
                        break;
			case 'V': counter += 10;
                        break;
			case 'W': counter += 22;
                        break;
			case 'X': counter += 25;
                        break;
			case 'Y': counter += 24;
                        break;
			case 'Z': counter += 23;
                        break;
                        
			}
		}
                
		for(int i = 0 ;i < char_posPari.length(); i++)
                {
			switch(char_posPari.charAt(i))
                        {
			case '0': counter += 0;
                        break;
			case '1': counter += 1;
                        break;
			case '2': counter += 2;
                        break;
			case '3': counter += 3;
                        break;
			case '4': counter += 4;
                        break;
			case '5': counter += 5;
                        break;
			case '6': counter += 6;
                        break;
			case '7': counter += 7;
                        break;
			case '8': counter += 8;
                        break;
			case '9': counter += 9;
                        break;
			case 'A': counter += 0;
                        break;
			case 'B': counter += 1;
                        break;
			case 'C': counter += 2;
                        break;
			case 'D': counter += 3;
                        break;
			case 'E': counter += 4;
                        break;
			case 'F': counter += 5;
                        break;
			case 'G': counter += 6;
                        break;
			case 'H': counter += 7;
                        break;
			case 'I': counter += 8;
                        break;
			case 'J': counter += 9;
                        break;
			case 'K': counter += 10;
                        break;
			case 'L': counter += 11;
                        break;
			case 'M': counter += 12;
                        break;
			case 'N': counter += 13;
                        break;
			case 'O': counter += 14;
                        break;
			case 'P': counter += 15;
                        break;
			case 'Q': counter += 16;
                        break;
			case 'R': counter += 17;
                        break;
			case 'S': counter += 18;
                        break;
			case 'T': counter += 19;
                        break;
			case 'U': counter += 20;
                        break;
			case 'V': counter += 21;
                        break;
			case 'W': counter += 22;
                        break;
			case 'X': counter += 23;
                        break;
			case 'Y': counter += 24;
                        break;
			case 'Z': counter += 25;
                        break;
			}
		}
		switch(counter % 26)
                {
		case 0: c = "A";
                break;
		case 1: c = "B";
                break;
		case 2: c = "C";
                break;
		case 3: c = "D";
                break;
		case 4: c = "E";
                break;
		case 5: c = "F";
                break;
		case 6: c = "G";
                break;
		case 7: c = "H";
                break;
		case 8: c = "I";
                break;
		case 9: c = "J";
                break;
		case 10: c = "K";
                break;
		case 11: c = "L";
                break;
		case 12: c = "M";
                break;
		case 13: c = "N";
                break;
		case 14: c = "O";
                break;
		case 15: c = "P";
                break;
		case 16: c = "Q";
                break;
		case 17: c = "R";
                break;
		case 18: c = "S";
                break;
		case 19: c = "T";
                break;
		case 20: c = "U";
                break;
		case 21: c = "V";
                break;
		case 22: c = "W";
                break;
		case 23: c = "X";
                break;
		case 24: c = "Y";
                break;
		case 25: c = "Z";
                break;
		}
		return c;
    }
}
