package employeeclass;

/**
 *
 * @author Amber Bruil abruil@varsitycollege.co.za ST10114407
 */
public class MainClass
{
    //--------------------------------------------------------------------------
    // Main Method
    public static void main(String[] args)
    {        
        // Creating an employee instance
        Employee emp = new Employee();
        
        // Using the employee instance to employ the master constructor to 
        // initialise values for our employ
        emp = new Employee(512, "Adam", "Williams", 25.000);
        
        // Print message
        emp.PrintDetails();
        
        // Changing the last name of the employee
        emp.setEmpFirstName("Hendricks");
        
        // Print new message
        System.out.println("\nNew message with updated Employee's last name");
        emp.PrintDetails();
                
                
    }   
// ------------------------ 0o0o0o End of File 0o0o0o --------------------------    
}
