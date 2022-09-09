/*
@Author: JUDITH JASMINE M

Title: A class called Account, which models a bank account of a customer, is designed as shown 
in the following class diagram. The methods credit(amount) and debit(amount) add or subtract 
the given amount to the balance. The method transferTo(anotherAccount, amount) transfers the given 
amount from this Account to the given anotherAccount. Write the Account class.
*/


import java.util.*;

 class IDFC
{
	double balance;
	
	public void credit(double amount)
	{
		balance = balance+amount;
	}
	
	public void credit_1(double amount)
	{
		balance = balance+amount;
	}
	
	
	public double getBalance()
	{
	
	return balance;
	
	}
	
	
	public void debit(double amount, IDFC anotherAccount)
	{
		anotherAccount.credit_1(amount);
		balance=balance-amount;
		System.out.println("You want to transfer the amount: "+ amount);
		System.out.println();
		System.out.println("---------After Transfer balance amount------------");
		System.out.println();
	}
	}
	
	class IOB
	{
		public static void main(String[]args)
		{
			IDFC obj = new IDFC();
		    obj.credit(5000);
			System.out.println();
			System.out.println("Balance Amount in Account1: "+obj.getBalance());
			
			IDFC obj1 = new IDFC();
			obj1.credit_1(20000);
			System.out.println("Balance Amount in Account2: "+obj1.getBalance());
			System.out.println();
            
			obj1.debit(2000, obj);
			
			System.out.println("After transfer balance amount in Account1: "+obj.getBalance());
			System.out.println("After transfer balance amount in Account2: "+obj1.getBalance());
			
		}
	}