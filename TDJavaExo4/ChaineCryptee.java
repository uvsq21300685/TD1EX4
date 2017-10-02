

/**
 */
public class ChaineCryptee
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private String enClair;
    private int decalage;

    /**
     * Constructeur d'objets de classe ChaineCryptee
     */
    public ChaineCryptee(String enClair, int Decalage)
    {
        this.decalage = decalage;
        this.enClair = enClair;
    }

    public String Decrypte()
    {
        return enClair;
    }
    
    public static char decaleCaractere ( char c , int decalage ) {
     return (c < 'A' || c > 'Z' ) ? c : (char) ((( c - 'A' + decalage)%26 ) + 'A');
    }

    public String Crypte()
    {
        String ch = "";
        int i;
        char c;
        for(i=0;i<enClair.length();i++)
           { c=decaleCaractere(enClair.charAt(i),this.decalage); 
             ch += c;}
        return ch;
    }
}
