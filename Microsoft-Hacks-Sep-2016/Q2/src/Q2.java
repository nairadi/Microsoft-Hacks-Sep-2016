import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Collections;

public class Q2{
	
	public static void main(String args[])throws FileNotFoundException, IOException{
		//28 50 45 35 42 32 48 55 30 51 31 41 53 37 36 29 38 46 44 43 47 34 33 49 40 39 56
		ArrayList<Integer> arl = new ArrayList<Integer>();
		ArrayList<String> eachLine = new ArrayList<String>();
		
		String input = "Common-characters_InputForSubmission.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(input))) {
			String line;
		    while ((line = br.readLine()) != null) {
		    	
		    	String[] words = line.split("\\s+");
		    	words = line.split("\\s+");
				if(words.length < 2){
					System.out.println();
					continue;
				}
				for(int i=0; i < words.length; i++){
					arl.add(Integer.parseInt(words[i]));
				}
				Collections.sort(arl);
				
		    }
		}
	}
}
