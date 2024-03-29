/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shengzhangproject5;

/**
 *
 * @author shengzhang0830
 */
public class Customer 
{
    protected String firstName;
    protected String lastName;
    protected String ssn;
    
    // Default constructor
    public Customer()
    {
        firstName = "";
        lastName = "";
        ssn = "";     
    }
    
    // Constructor with first anme, last name, and ssn
    public Customer(String first, String last, String social)
    {
        firstName = first;
        lastName = last;
        ssn = social;
    }
    
    // Changeinfo updates the values of variables associated with the customer
    public void changeInfo(String first, String last, String social)
    {
        firstName = first;
        lastName = last;
        ssn = social;        
    }
    
    // getName is an accessor that returns the name of the customer
    public String getName()
    {
        String name = firstName + " " + lastName;
        return name;
    }
}
