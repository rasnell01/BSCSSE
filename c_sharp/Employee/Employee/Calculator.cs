using System;
using static System.Console;

namespace Employee
{
    
    abstract class Calculator
    {
        
        public abstract void display();
        
    }//end class

    class ECalculator : Calculator
    {
        public override void display()
        {
            
            WriteLine("What do you do now?");
            
        }//end inherited abstract method
        
    }//end class

    
    
    
    
    interface IShape
    {
        
        int CalculateAreas();
        int CalculateParameters();
        int CalculateRate();
        int CalculateDistance();
        
    }//end interface
    
}//end namespace
