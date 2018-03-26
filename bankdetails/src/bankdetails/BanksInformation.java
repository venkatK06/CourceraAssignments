package bankdetails;
import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;


public class BanksInformation {
		
  HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
     String line;  
     String[] split;

     public static void main(String args[]) {
    	 BanksInformation info = new BanksInformation();
           info.readData();
           info.searchData();

     }

     private void readData() {
           try {
                 BufferedReader bufferreader = new BufferedReader(new FileReader("data.txt"));
                 while (( line = bufferreader.readLine()) != null) {
                       split = line.split("\t");
                       System.out.println(split[0] + "----------------------" + split[1]);
                       ArrayList<String> newValue = map.get(split[0]);
                       if (newValue == null) {
                             newValue = new ArrayList<String>();
                             newValue.add(split[1]);
                             map.put(split[0], newValue);

                       } else {
                             newValue.add(split[1]);
                             map.put(split[0], newValue);
                       }
                 }
                 bufferreader.close();
           } catch (Exception e) {
                 System.out.println(e);
           }

     }

     private void searchData() {
           System.out.println("Enter the name");
           Scanner scanner = new Scanner(System.in);
           String input = scanner.next();
           ArrayList<String> searchedValue = map.get(input);
           if (searchedValue == null) {
                 for (Map.Entry<String, ArrayList<String>> m : map.entrySet()) {
                	// System.out.println("get value is " + m.getValue());
                       for (String obj : m.getValue()) {
                             if (obj.equals(input)) {
                                   System.out.println("banks  with  " +obj  + "   account are " + m.getKey());
                             }
                       }
                 }
                 searchData();
           } else {
                 System.out.println("Accounts  with   " + input+  "  are       " + searchedValue);
                 searchData();
           }
     }

}
