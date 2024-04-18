using System;
using System.Threading;
using Chapter10Exercises.Properties;
using static System.Console;

namespace Chapter10Exercises
{
    
    internal class Chapter10Exercises
    {
        
        public static void Main(string[] args)
        {

            

        }//end main
        
        //2 and 3
        /* Create an application class named PhotoDemo that demonstrates the methods of
        three related classes for a company that develops photographs. Create a class named
        Photo that includes fields for width and height in inches and properties for each field.
        Include a protected price field, and set it to $3.99 for an 8-inch by 10-inch photo,
        $5.99 for a 10-inch by 12-inch photo, and $9.99 for any other size (because custom
        cutting is required). The price field requires a get accessor but no set accessor. Also
        include a ToString() method that returns a string constructed from the return value
        of the object’s GetType() method and the values of the fields. Derive two subclasses—
        MattedPhoto and FramedPhoto. The MattedPhoto class includes a string field to
        hold a color, and the FramedPhoto class includes two string fields that hold the frame’s
        material (such as silver) and style (such as modern). The price for a MattedPhoto
        increases by $10 over its base cost, and the price for a FramedPhoto increases by $25
        over its base cost. Each subclass should include a ToString() method that overrides
        the parent class version. */
        
        
        /* a. Create an application named JobDemo that declares and uses Job objects. The
        Job class holds job information for a home repair service. The class has five
        properties that include a job number, customer name, job description, estimated
        hours, and price for the job. Create a constructor that requires parameters for all
        the data except price. Include auto-implemented properties for the job number,
        customer name, and job description, but not for hours or price; the price field value
        is calculated as estimated hours times $45.00 whenever the hours value is set. Also
        create the following for the class:
        •• An Equals() method that determines two Jobs are equal if they have the same job number
        •• A GetHashCode() method that returns the job number
        •• A ToString() method that returns a string containing all job information
        The JobDemo application declares a few Job objects, sets their values, and
        demonstrates that all the methods work as expected. 
        
        b. Using the Job class you created in Exercise 3a, write a new application named
        JobDemo2 that creates an array of five Job objects. Prompt the user for values for
        each Job. Do not allow duplicate job numbers; force the user to reenter the job
        when a duplicate job number is entered. When five valid objects have been entered,
        display them all, plus a total of all prices.
        
        c. Create a RushJob class that derives from Job. A RushJob has a $150.00 premium
        that is added to the normal price of the job. Override any methods in the parent
        class as necessary. Write a new application named JobDemo3 that creates an array
        of five RushJobs. Prompt the user for values for each, and do not allow duplicate
        job numbers. When five valid RushJob objects have been entered, display them all,
        plus a total of all prices.
        
        d. Make any necessary modifications to the RushJob class so that it can be sorted by
        job number. Modify the JobDemo3 application so the displayed orders have been
        sorted. Save the application as JobDemo4. */
        
    }//end class
    
}//end namespace