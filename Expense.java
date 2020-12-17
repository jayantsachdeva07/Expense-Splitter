package Expense_Splitter;

import java.util.Scanner;

public class Expense {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
	

		System.out.println("Enter the number of splitters");
		int totalnumber= sc.nextInt();
		String[] list= splitter_array(totalnumber);
		System.out.println("Enter the number of Expenses");
		int expense_count= sc.nextInt();
		AddExpense[] expense=new AddExpense[expense_count];
		for(int i=0;i<expense_count;i++) {
			expense[i]= new AddExpense();
				
		}
		Integer[] spends=TotalSpending.totalspend(list, expense);
		Splitter.FinalSplitter(list,spends);
	}

		
	

	private static String[] splitter_array(int totalnumber) {
		String[] list= new String[totalnumber];
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<totalnumber;i++) {
			System.out.println("Enter name of "+ (i+1)+" splitter(without space)");
			String str= sc.next();
			list[i]=str;
		}
		return list;
		
	}

}
