using System;
using static System.Console;

namespace Employee
{
    internal class Program
    {
        public static void Main(string[] args)
        {

            Employee employee = new CommissionEmployee();
            WriteLine(employee.getSalary());
            ECalculator eCalculator = new ECalculator();
            
            //comes out as 1
            double d = 7 % 2.0;
            WriteLine(d);

            string alpha = "a1b2c3d4e5";
            char[] beta = Convert.ToChar(alpha);

        }//end main
        
    }//end class
    class Employee
    {

        public double salary = 15000;

        public virtual double getSalary()
        {
            
            WriteLine("Inside the parent getSalary");
            return salary;
            
            
        }//end method


    }//end class

    class CommissionEmployee : Employee
    {
        private double commissionRate;

        public double CommissionRate
        {
            get { return commissionRate; }
            set
            {
                commissionRate = value;
                salary = 0;
            }
        }//end method
        
    }//end class
    
}//end namespace