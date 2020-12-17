package Expense_Splitter;

public class TotalSpending {
	@SuppressWarnings("null")
	public static Integer[] totalspend(String[] splitter_name,AddExpense[] expense_list) {
		int no_of_splitter=splitter_name.length;
		int no_of_expense=expense_list.length;
		Integer spends[]= new Integer[no_of_splitter];
		int spend=0;
		System.out.println(no_of_splitter);
		System.out.println(no_of_expense);
		System.out.println("----------");
		for(int i=0;i<no_of_splitter;i++) { 
			for(int j=0;j<no_of_expense;j++) {
				if(expense_list[j].paid_by.equalsIgnoreCase(splitter_name[i])) {
				//	System.out.println(expense_list[j].paid_by);
				spend=spend+expense_list[j].amount;
				//System.out.println(spend);
				spends[i]=spend;
			//	System.out.println(expense_list[j].amount);
				}
			}
		}
		//System.out.println(spends);
		return spends;
	}

}
