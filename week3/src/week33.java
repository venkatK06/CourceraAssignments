
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import edu.duke.*;


public class week33 {
	private void tester(){
		
		FileResource fr = new FileResource("C:\\Users\\Bobby's-PC\\Downloads\\exports\\exports\\exportdata.csv");
		CSVParser parser = fr.getCSVParser();
	
	
	
	
	
	
	parser = fr.getCSVParser();
	countryInfo(parser, "Nauru");
	
	
	
	
	parser = fr.getCSVParser();
	listExportersTwoProducts(parser, "gold", "diamond");
	
	 
	parser = fr.getCSVParser();
	numberOfExporters(parser, "gold");
	
	
	
parser = fr.getCSVParser();
	bigExporters(parser, "$999,999,999,999");
	
	
}




private void bigExporters(CSVParser parser, String money) {
		
	for(CSVRecord record : parser){
		
		String currValue = record.get("Value (dollars)");
		
		if(currValue.length() > money.length()){
			
			System.out.println("big companies are" + record.get("Country") + ", " + record.get("Value (dollars)") );
		}
		
	}	
}



private void numberOfExporters(CSVParser parser, String element) {
	
	int count = 0; 
	
	for(CSVRecord record : parser){
		
		String exports = record.get("Exports");
		if(exports.contains(element))
			count ++;
		
	}

	
	System.out.println("There are " + count + " countries export " + element + ". ");
	
}





private void listExportersTwoProducts(CSVParser parser, String element1, String element2) {
	
	System.out.println();
	
	for(CSVRecord record : parser){
		
		String Exports = record.get("Exports");
		if(Exports.contains(element1) && Exports.contains(element2)){
			System.out.println(" ");
			
			System.out.println( record.get("Country") + " " + record.get("Exports"));
		}
		
	}
	
	
}



private void countryInfo(CSVParser parser, String country){
	
	
	for(CSVRecord record : parser){
		
		String currCountry = record.get("Country");
		
		
		
		if(currCountry.contains(country)){
			System.out.println(" ");
			
			System.out.println( record.get("Country") + " " + record.get("Exports") +" " + record.get("Value (dollars)") );
		}
		
	}
	
}



public static void main(String[] args){
	
	week33 Wk3 = new week33();
	
	Wk3.tester();
	
	
	
	
}
	

}
