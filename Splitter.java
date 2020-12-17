package Expense_Splitter;

public class Splitter {
	public static void FinalSplitter(String[] splitter_name,Integer[] spends) {
		int no_of_splitter=splitter_name.length;
		
		for(int i=0;i<no_of_splitter;i++) {
			
			System.out.println(splitter_name[i]+"owes"+(spends[i]/no_of_splitter)+"with other splitters");
			
			
		}
		
		
	}
		
		
	

}
