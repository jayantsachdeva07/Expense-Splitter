package Expense_Splitter;

import java.util.Scanner;

public class AddExpense {
	String Expense_name;
	int amount;
	String paid_by;
	String split_by;
	Scanner sc= new Scanner(System.in);
	
	public AddExpense() {
		System.out.println("Enter the Expense name");
		String exp_name= sc.next();
		Expense_name=exp_name;
		System.out.println("Enter amount");
		int amt= sc.nextInt();
		amount=amt;
		System.out.println("Enter the name of payer");
		String payer= sc.next();
		paid_by=payer;
		System.out.println("Enter the spli type(equal/unequal/percentage)");
		String split= sc.next();
		split_by=split;
		
	};
	
}
