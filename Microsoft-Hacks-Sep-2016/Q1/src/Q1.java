import java.util.*;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.CharacterIterator;


public class Q1 {
	
	public static void main(String args[]) throws FileNotFoundException, IOException{
		
		char extract;
		
		boolean isAll = true;
		
		//System.out.println(args[0] + "\n" + args[1]);
		
		ArrayList<Character> toPrint = new ArrayList<Character>();
		ArrayList<String> eachLine = new ArrayList<String>();
		
		Scanner in = new Scanner(System.in);
		String[] word;
		//String line = in.nextLine();
		String input = "Common-characters_InputForSubmission.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(input))) {
			String line;
		    while ((line = br.readLine()) != null) {
		    	
		    	String[] words = line.split("\\s+");
		    	words = line.split("\\s+");
				if(words.length < 2){
					continue;
				}
				
				for(int j=0; j<words[0].length(); j++){
					extract = words[0].charAt(j);//eachLine.get(0).charAt(j);//
					isAll = true;
					
					for(int i=1; i<words.length; i++){
						if(words[i].indexOf(extract) < 0){
							//System.out.println("Gets Here");
							isAll = false;
							break;
						}
					}
					if(isAll == true){
						if(!toPrint.contains(extract)){
							toPrint.add(extract);
						}
					}
				}
				
				for(int k=0; k<150; k++){
					if(toPrint.contains((char)(k))){
						System.out.print((char)k);
					}
				}
				System.out.println();
				toPrint.clear();
		    }
		}
		
		//while(line != ""){
			
		//	eachLine.add(line);
		//}
		
		
		
		//for(int j = 0; j < eachLine.size(); j++){
			
			//for(int i=1; i<eachLine.size(); i++){
				//if(eachLine.get(i).indexOf(extract) < 0){
				
		/*for(int k=0; k < toPrint.size(); k++){
			System.out.print(toPrint.get(k));
		}*/
	}
}
