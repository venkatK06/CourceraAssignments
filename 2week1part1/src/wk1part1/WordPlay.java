package wk1part1;

public class WordPlay {
	private boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        if (ch == 'a' | ch == 'e' | ch == 'i' | ch == 'o' | ch == 'u')
            return(true);
        else return(false);
    }
    
public void testingforisvowel() {
    char character = 'f';
    boolean result = isVowel(character);
    System.out.println(result);
}
    

private StringBuilder replaceVowels(StringBuilder phrase, Character ch) {
        for (int i = 0; i < phrase.length(); i++) {
               char character = phrase.charAt(i);
               if (isVowel(character))
            	   phrase.setCharAt(i, ch);
        }
        return(phrase);
    }
    
    public void testingmethodforreplaceVowels() {
        StringBuilder phrase = new StringBuilder("perfios software solutions");
        StringBuilder result = replaceVowels(phrase, '*');
        System.out.println(result);
    }

private StringBuilder emphasize(StringBuilder phrase, char ch) {
        for (int i = 0; i < phrase.length(); i++) {
            char character = phrase.charAt(i);
            if (character == ch) {
                if (i%2 == 0)
                	phrase.setCharAt(i, '*');
                else
                	phrase.setCharAt(i, '+');
            }
        }
        return(phrase);
    }
    
public void testingmethodforemphasize() {
        StringBuilder phrase = new StringBuilder("perfios softwaaaaaaare solutions");
        StringBuilder result = emphasize(phrase, 'a');
        System.out.println(result);
        
}
public static void main(String[] args){
	WordPlay obj = new WordPlay();
	obj.testingforisvowel();
	obj.testingmethodforreplaceVowels();
	obj.testingmethodforemphasize();
	CaesarCipher cipher = new CaesarCipher();
	cipher.testCaesar() ;
}
}
