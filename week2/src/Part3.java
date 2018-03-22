
public class Part3 {

    public boolean twoOccurrences(String stringa, String stringb)
    {
        int startPosition = stringb.indexOf(stringa);
        if (startPosition == -1)
        {
            return false;
        } 
        int stopPosition = stringb.indexOf(stringa,startPosition+1);
        if (stopPosition == -1)
        {
            return false; 
        }
        return true;
    }    
 
    public void testing()
    {
        
       String stringa="by";
       String stringb="a story by abby long";
       boolean result = twoOccurrences(stringa,stringb);
       System.out.println("testing by is   "+result);
       
       
       stringa="a";
       stringb="banana";
       result = twoOccurrences(stringa,stringb);
       System.out.println("testing by is   "+result);
       
       
       stringa="atg";
       stringb="ctgtatgta";
       result = twoOccurrences(stringa,stringb);
       System.out.println("testing by is   "+result);
       
       
       stringa="an";
       stringb="banana";
       String result1 = lastPart(stringa,stringb);
       System.out.println("last aprt  is   "+result1);
       
       stringa="zoo";
       stringb="forest";
       result1 = lastPart(stringa,stringb);
       System.out.println("last aprt  is   "+result1);
    }
         
    public String lastPart(String stringa, String stringb)
    {
        
        if (stringb.indexOf(stringa) != -1)
        {
            int len=stringb.length();
            int lastIndex = stringb.lastIndexOf(stringa);
            return stringb.substring(lastIndex,len);          
        }
       
        return stringb;
    }

}
