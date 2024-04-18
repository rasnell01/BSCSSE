using System;
using System.Threading;
using Chapter10Exercises.Properties;
using static System.Console;

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
namespace Chapter10Exercises
{
    
    public class PhotoDemo
    {

        

    }//end class
    
}//end namespace