package Hortari;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class electionPolls {

	public static void main(String[] args) {
		

		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the number of votes to be taken: ");
		int n = in.nextInt();
		
		String votes[] = new String[n];
		System.out.println("Enter votes: ");
		for(int i=0; i<n; i++){
		votes[i] = in.next();
		}
		
		
		findWinner(votes);
		
	}
	public static void findWinner(String votes[]){
			
	
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		for(String str : votes){
			if(map.keySet().contains(str))
				map.put(str, map.get(str) + 1);
			else
				map.put(str, 1);
		}
		
		int maxValueInMap = 0;
		String winner = "";
		for(Map.Entry<String, Integer> entry : map.entrySet()){
			String key = entry.getKey();
			Integer val = entry.getValue();
			if(val > maxValueInMap){
				maxValueInMap = val;
				winner = key;
			}
			else if(val == maxValueInMap){
				winner = key.substring(key.lastIndexOf(" ")+1);
			}
		
		}
		System.out.println("Winner is: "+winner);

	}

}
