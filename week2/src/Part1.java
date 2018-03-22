import java.lang.*;
public class Part1 {
	public String findSimpleGene (String dna){
		String result=" ";
		int startIndex=dna.indexOf("ATG");
		if(startIndex==-1){
			return "";
		}
		int stopIndex=dna.indexOf("TAA",startIndex+3);
		if(stopIndex==-1){
			return " ";
		}
		result=dna.substring(startIndex,stopIndex+3);
		if((stopIndex-startIndex)%3 == 0){
			return result;
		}
		return "no valid gene";
	}
	
		public void testSimpleGene (){
			String dna="ATCGATCTAGTAAATC";
			System.out.println("DNA strand is" +dna);
			String gene=findSimpleGene(dna);
			System.out.println("gene is" +gene);
			
			dna="ACTGATGCCACTGAA";
			System.out.println("DNA strand is" +dna);
			gene=findSimpleGene(dna);
			System.out.println("gene is" +gene);
			
			dna="ATGATCGTAGACTAGTAAATGTA";
			System.out.println("DNA strand is" +dna);
			gene=findSimpleGene(dna);
			System.out.println("gene is   " +gene);
			
			 dna="ATCGATCTAGTAAATC";
			System.out.println("DNA strand is" +dna);
			 gene=findSimpleGene(dna);
			System.out.println("gene is" +gene);
			
		    dna="ATCGATCTAGTAAATC";
			System.out.println("DNA strand is" +dna);
			gene=findSimpleGene(dna);
			System.out.println("gene is" +gene);
			
	}
		

		public static void main(String[] args){
			Part1 p=new Part1();
			Part3 p3=new Part3();
			p.testSimpleGene();
			p3.testing();
			p3.lastPart("", "");
		}
	
}
