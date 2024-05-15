/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package test;

import employeeclass.Employee;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Amber Bruil <abruil@varsitycollege.co.za>
 */
public class EmployeeTest
{
    
    public EmployeeTest()
    {
    }
    
    @BeforeAll
    public static void setUpClass()
    {
    }
    
    @AfterAll
    public static void tearDownClass()
    {
    }

    /**
     * Test of getEmpNum method, of class Employee.
     */
    @Test
    public void testGetEmpNum()
    {
        System.out.println("getEmpNum");
        Employee instance = new Employee();
        int expResult = 0;
        int result = instance.getEmpNum();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmpNum method, of class Employee.
     */
    @Test
    public void testSetEmpNum()
    {
        System.out.println("setEmpNum");
        int empNum = 0;
        Employee instance = new Employee();
        instance.setEmpNum(empNum);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmpLastName method, of class Employee.
     */
    @Test
    public void testGetEmpLastName()
    {
        System.out.println("getEmpLastName");
        Employee instance = new Employee();
        String expResult = "";
        String result = instance.getEmpLastName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmpLastName method, of class Employee.
     */
    @Test
    public void testSetEmpLastName()
    {
        System.out.println("setEmpLastName");
        String empLastName = "";
        Employee instance = new Employee();
        instance.setEmpLastName(empLastName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmpFirstName method, of class Employee.
     */
    @Test
    public void testGetEmpFirstName()
    {
        System.out.println("getEmpFirstName");
        Employee instance = new Employee();
        String expResult = "";
        String result = instance.getEmpFirstName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmpFirstName method, of class Employee.
     */
    @Test
    public void testSetEmpFirstName()
    {
        System.out.println("setEmpFirstName");
        String empFirstName = "";
        Employee instance = new Employee();
        instance.setEmpFirstName(empFirstName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmpSalary method, of class Employee.
     */
    @Test
    public void testGetEmpSalary()
    {
        System.out.println("getEmpSalary");
        Employee instance = new Employee();
        double expResult = 0.0;
        double result = instance.getEmpSalary();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmpSalary method, of class Employee.
     */
    @Test
    public void testSetEmpSalary()
    {
        System.out.println("setEmpSalary");
        double empSalary = 0.0;
        Employee instance = new Employee();
        instance.setEmpSalary(empSalary);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of PrintDetails method, of class Employee.
     */
    @Test
    public void testPrintDetails()
    {
        System.out.println("PrintDetails");
        Employee instance = new Employee();
        instance.PrintDetails();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
