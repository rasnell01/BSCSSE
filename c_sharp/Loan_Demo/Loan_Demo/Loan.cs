using System;
using System.Threading;
using static System.Console;

namespace Loan_Demo
{
    
    class Loan
    {
        
        protected string CustomeName { get; set;}

        protected int accountNumber;
        protected int AccountNumber
        {
            get
            {
                return accountNumber;
            }
            set
            {
                AccountNumber = value;
            }
            
        }

        protected double LoanAmmount { get; set; }

        public Loan()
        {
            WriteLine("I call a loan constructor");
            AccountNumber = -100;
        }

        ~Loan()
        {
            
            WriteLine("Inside destructor");
            
        }

        public int getAccountNumber()
        {
            return AccountNumber;
        }

        public void setAccountNumber(int loan)
        {
            this.AccountNumber = loan;
        }
    }//end class
    
}//end namespace