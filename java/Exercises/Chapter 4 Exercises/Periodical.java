class Publication extends Periodical{
	
	String editor;
	String volume;
	String number;
	
	Loan loanPeriod();
	Loan fineRate();
	Article[] articles;
	
}