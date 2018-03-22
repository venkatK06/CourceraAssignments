package babybirths.miniprojectt;


import edu.duke.*;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
public class babyBirths {
	
	
	public void totalBirths(){
		//System.out.println("hiii111");
		FileResource fr = new FileResource ("C:\\Users\\Bobby's-PC\\Downloads\\us_babynames_small\\testing\\yob2012short.csv");  
		CSVParser csvparser  = fr.getCSVParser();
		//System.out.println("hiii");
		int totalnumberofBirths = 0;
		int boyscount1=0;
		int girlscount2=0;
		
		for(CSVRecord csvrecord : csvparser){
			System.out.println("NAME    " + csvrecord.get(0) + " " +csvrecord.getRecordNumber());
			
			
			int numberofborns=Integer.parseInt(csvrecord.get(2));
			totalnumberofBirths += numberofborns;	
			if(csvrecord.get(1).equals("M")){
				boyscount1 ++;
				
			}
			else{
				girlscount2 ++;
			}
			
		}
		System.out.println("total  number of births are " + totalnumberofBirths);
			
		System.out.println("the number of girls names   " + girlscount2);
		System.out.println("the number of boys names   " + boyscount1);
	}
	public int getRank (int year,String name, String gender){
		
		int rank=0;
		int rank2=2;
		int namechecker=0;
		FileResource fr = new FileResource ("C:\\Users\\Bobby's-PC\\Downloads\\us_babynames_small\\testing\\yob2012short.csv"); 
		
		CSVParser csvparser  = fr.getCSVParser();
		for(CSVRecord csvrecord : csvparser){
			if(csvrecord.get(1).equals("gender")){
				rank++;
			
			if(csvrecord.get(0).equals("name")){
				
				 namechecker=1;
				 break;
			}
		  }
		}
		
		
		if  (namechecker==1)
		return rank ;
		else
			return rank2;
	}
	
	public void checkinggetRank(){
		
		int result=getRank(2012,"Ava","F");
		System.out.println("the rank is:  "+result);
		
		
	}
	
	
	
	public static void main(String[] args){
		babyBirths bb = new babyBirths();
		bb.totalBirths();
		bb.checkinggetRank();
		
		
	}
	
	

}
