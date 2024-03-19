package employeeclass;

/**
 * 
 * @author Amber Bruil abruil@varsitycollege.co.za ST10114407
 */
public class Employee {
    
    // Employee's attributes
    private int empNum;
    private String empFirstName;
    private String empLastName;
    private double empSalary;
    private double hello;

    // Default constructor
    public Employee()
    {
        
    }
    
    // Master constructor
    public Employee(int empNum, String empFirstName, String empLastName, 
                    double empSalary)
    {
        this.empNum = empNum;
        this.empFirstName = empFirstName;
        this.empLastName = empLastName;
        this.empSalary = empSalary;
    }
    
    //--------------------------------------------------------------------------
    // Getters and Setters for the Employee's attributes
    public int getEmpNum()
    {
        return empNum;
    }

    public void setEmpNum(int empNum)
    {
        this.empNum = empNum;
    }

    public String getEmpLastName()
    {
        return empLastName;
    }

    public void setEmpLastName(String empLastName)
    {
        this.empLastName = empLastName;
    }

    public String getEmpFirstName()
    {
        return empFirstName;
    }

    public void setEmpFirstName(String empFirstName)
    {
        this.empFirstName = empFirstName;
    }

    public double getEmpSalary()
    {
        return empSalary;
    }

    public void setEmpSalary(double empSalary)
    {
        this.empSalary = empSalary;
    }
     //-------------------------------------------------------------------------
 
    
    //--------------------------------------------------------------------------
    // Method to print the details of an employee
    
    // NOTE:  method cannot be static because it accesses instance variables 
    // (empNum, empFirstName, empLastName, empSalary) to print the details of a 
    // specific employee. Since static methods do not have access to instance
    // variables, making PrintDetails() static would result in an error when 
    // trying to access these variables.
    public void PrintDetails() 
    {
        System.out.println("Employee number: " + empNum);
        System.out.println("Employee First Name: " + empFirstName);
        System.out.println("Employee Last Name: " + empLastName);
        System.out.println("Employee's Salary: " + empSalary);
    }
}
// ------------------------ 0o0o0o End of File 0o0o0o --------------------------
