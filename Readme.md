
# OOP-Java Assignments
___
## Lab: 01
Q.1 Write a simple java program with command-line argument in java.
### Code:

```
// Write a simple java program with command-line argument in java.

public class Lab_01_Task {
	
	public static void main(String[] args) {
		
		System.out.println("Lab Manual by H-R-S");
	}
}

```
### Output :
``` Lab Manual by H-R-S ```
___
## Lab: 02
Q.1 Program the following.
Implement the following equation

```3x^4 sin(180x) + 4x^3 cos(90x) + x^2 sin(tan(45)) + 7x + 9cos(90x^2)```

Where x may be user defined value.

### Code:

```
/* Implement the following equation
 
    3x4sin(180x) + 4x3cos(90x) + x2sin(tan(45)) + 7x + 9cos(90x2 )

 where x may be user defined value. */

import java.util.Scanner; 

public class Lab_02_Assignment {
	
	public static void main(String[] args)
	{ 	
		//	   3x4sin(180x) + 4x3cos(90x) + x2sin(tan(45)) + 7x + 9cos(90x2 )
		int x;
		Scanner input = new Scanner(System.in); 
		System.out.println("Enter value of x : ");
		x = input.nextInt();
	
		double eq=3*Math.pow(x, 4)+4*Math.pow(x, 3)*Math.cosh(90*x)+Math.pow(x, 2)*Math.sin(Math.tan(45))+7*x+9*Math.cos(90*Math.pow(x, 2));
	
		System.out.println("3x4sin(180x) + 4x3cos(90x) + x2sin(tan(45)) + 7x + 9cos(90x2 ) = " + eq);
	}
	
}


```
### Output :
```
Enter value of x : 
1
3x4sin(180x) + 4x3cos(90x) + x2sin(tan(45)) + 7x + 9cos(90x2 ) = 2.4408065886356817E39 
```
___

## Lab: 03
Q.1 Write a program 1 of this lab using switch statement.
### Code:
```
// Write a program 1 of this lab using switch statement.

import java.util.Scanner;

public class Lab_03_Assignment_01 {
	
	// Switch Case
		public static void main(String args[])
		{
			int num;
			Scanner input = new Scanner(System.in); 
			System.out.println("Enter Number from 1-10: ");
			num = input.nextInt();
			String numbers;
			switch(num)
			{
			case 1:
				System.out.println("One");
				break;
			case 2:
				System.out.println("Two");
				break;
			case 3:
				System.out.println("Three");
				break;
			case 4:
				System.out.println("Four");
				break;
			case 5:
				System.out.println("Five");
				break;
			case 6:
				System.out.println("Six");
				break;
			case 7:
				System.out.println("Seven");
				break;
			case 8:
				System.out.println("Eight");
				break;
			case 9:
				System.out.println("Nine");
				break;
			case 10:
				System.out.println("Ten");
				break;
			default:
				System.out.println("Invalid Month");
				break;
			}
		}
}
```
### Code Output:
```
Enter Number from 1-10: 
3
Three
```

Q.2 The Fibonacci sequence is defined by the following rule. The first 2 values in the sequence are 1, 1. Every subsequent value is the sum of the 2 values preceding it. Write a Java Program that print the nth value of the Fibonacci sequence? 
### Code:
```
/* 2. The Fibonacci sequence is defined by the following rule. 
 * The first 2 values in the sequence are 1, 1. Every subsequent 
 * value is the sum of the 2 values preceding it. Write a Java 
 * Program that print the nth value of the Fibonacci sequence?  */

import java.util.Scanner;

public class Lab_03_Assignment_02 {
	
	// Fibinacco
		public static void main(String[] args) {

			int n,firstTerm = 0, secondTerm = 1;
			Scanner input = new Scanner(System.in); 
			System.out.println("Enter any number: ");
			n = input.nextInt();
			for(int i=1;i<n;i++)
			{
				int nextTerm = firstTerm + secondTerm;
			      firstTerm = secondTerm;
			      secondTerm = nextTerm;
				
			      System.out.println("Fibinacco series of"+nextTerm);
			}
			
		}
}
```

### Code Output:
```
Enter any number: 
10
Fibinacco series of1
Fibinacco series of2
Fibinacco series of3
Fibinacco series of5
Fibinacco series of8
Fibinacco series of13
Fibinacco series of21
Fibinacco series of34
Fibinacco series of55
```

Q.3 Write a Java program that prompts the user for an integer and then prints out all the prime numbers up to that Integer?  
### Code:
```
/*3.Write a Java program that prompts the user for an integer 
 * and then prints out all the prime numbers up to that Integer?  */

import java.util.Scanner;

public class Lab_03_Assignment_03 {
	
	// Prime
    public static void main(String[] args) {
		
		int n, i;
		Scanner input = new Scanner(System.in);
		System.out.println("Find prime numbers");
		System.out.println("Enter any number greater than 1: ");
		n = input.nextInt();

		if (n == 1) {
			System.out.println("1 is not a prime number neither there are prime Numbers less than 1");
		} else if (n == 2) {
			System.out.println(n + " is the smallest prime number");
		} else if (n > 2) {
			for (i = 3; i < n; ++i) {

				if (i % 2 != 0) {
					System.out.println("Prime numbers less than"+n+" are"+i);
				}			
			}
		}
	}
}
```
### Code Output:
```
Find prime numbers
Enter any number greater than 1: 
2
2 is the smallest prime number
```
___

## Lab: 04
Q.1 Create a class Calculator with following details;
•	The class should contain default and parameterized constructor. The constructors should just print the statement as follows.
o	“Inside Default Constructor”
o	“Inside Parameterized Constructor”.
•	The class should contain following data fields and methods;
int square = 2 ; 
int cube = 3;
o	calculateSquare(int x)
o	calculateCube(int x)
o	calculateFactorial (int x)
o	generateTable(int x)
•	Create objects of this class using both Constructors in main Class.
•	Call all three functions via object.
### Code:
#### Main.java:
```
package Calculator;

public class Main {
	
public static void main (String arg[]) {
		
		// Calling Trigonometric Functions
		trignometric_function t_f = new trignometric_function();
		
		// Calling Math Operators
		math_operators m_o = new math_operators();
		
		// Calling Arithmetic Function
		arthimatic_function a_f = new arthimatic_function();
		
		// Print Trigonometric Functions
		System.out.println("Sin(2) : " + t_f.sin(2));     // SinQ
		System.out.println("Cos(2) : " + t_f.cos(2));     // CosQ
		System.out.println("Tan(2) : " + t_f.tan(2));     // TanQ
		System.out.println("Cot(2) : " + t_f.cot(2));     // CotQ
		System.out.println("Sec(2) : " + t_f.sec(2));     // SecQ
		System.out.println("Cosec(2) : " + t_f.cosec(2)); // CosecQ
		
		// Print Math Operators
		System.out.println("2x10^2 : " + m_o.exp(2));     // Exponent
		System.out.println("2! : " + m_o.fac(2));         // Factorial
		System.out.println("2^2 : " + m_o.pow(2, 2));     // Power
		System.out.println("sqrt(4) : " + m_o.sqrtt(4));  // Square Root
		
		// Print Arithmetic Functions
		System.out.println("2+2 : " + a_f.sum(2, 2));     // Addition
		System.out.println("2-4 : " + a_f.sub(2, 4));     // Subtraction
		System.out.println("2*2 : " + a_f.mul(2, 2));     // Multiplication
		System.out.println("4/2 : " + a_f.div(4, 2));     // Division
		System.out.println("2%4 : " + a_f.mod(2, 4));     // Module
	}
}
```
#### Arithmetic_functions.java:
```
package Calculator;

public class arthimatic_function {
	
	// Addition Function
	float sum(float a, float b) {
		return (a + b);
	}
	
	// Subtraction Function
	float sub(float a, float b) {
		return (a - b);
	}
	
	// Multiply Function
	float mul(float a, float b) {
		return (a * b);
	}
	
	// Divide Function
	float div(float a, float b) {
		return (a / b);
	}
	
	// Module Function
	float mod(float a, float b) {
		return (a % b);
	}
}
```
#### Math_Operators.java:
```
package Calculator;

public class math_operators {
	
	// Exponent Function
    double exp(double x) {
		
    	math_operators m_o = new math_operators();
		
		double t = 0;
		
		for (double n = 0; n <= 14; n++) {
			
			t = t + (m_o.pow(x, n) / m_o.fac(n));
		}
		
		return t;
	}
    
    // Power Function
    double pow(double b, double p) {    // b : base, p : power
		double t = 1;
		
		for (double i = 1; i <= p; i++ ) {
			t = t*b;
		}
		
		return t;
	}
    
    // Factorial Function
    double fac(double f) {
		double t = 1;
		
		for (double i = 1; i <= f; i++) {
			t = t * i;
		}
		
		return t;
	}
    
    // Square Root Function
    double sqrtt(double a) { 
    	double temp;

    	double sqrt = a / 2;

    	do {
    		temp = sqrt;
    		sqrt = (temp + (a / temp)) / 2;
    	} while ((temp - sqrt) != 0);

    	return sqrt;
        }
}
```
#### Trigonometric_Functions.java:
```
package Calculator;

public class trignometric_function {

	double sin(double x) {
		
		math_operators m_o = new math_operators();
		
		double t = 0;
				
		for(double n = 0; n < 14; n++) {
			
			t = t + ((m_o.pow(-1, n) * m_o.pow(x, 2 * n + 1)) / m_o.fac(2 * n + 1) );
		}
		
		return t;
	}
	
	double cos(double x) {
		
		math_operators m_o = new math_operators();
		
		double t = 0;
				
		for(double n = 0; n < 14; n++) {
			
			t = t + ((m_o.pow(-1, n) * m_o.pow(x, 2 * n)) / m_o.fac(2 * n) );
		}
		
		return t;
	}
	
	double tan(double x) {
		
		trignometric_function t_f = new trignometric_function();
		
		double t = 0;
		
		t = (t_f.sin(x) / t_f.cos(x));
		
		return t;
	}
	
   double cot(double x) {
		
	   new trignometric_function();
		
		double t = 0;
		
		t = (1 / tan(x));
		
		return t;
	}
   
   double sec(double x) {
		
	   new trignometric_function();
		
		double t = 0;
		
		t = (1 / cos(x));
		
		return t;
	}
   
   double cosec(double x) {
		
	   new trignometric_function();
		
		double t = 0;
		
		t = (1 / sin(x));
		
		return t;
	}
} 
```
### Code Output:
```
Sin(2) : 0.9092974268256817
Cos(2) : -0.41614683654714246
Tan(2) : -2.1850398632615184
Cot(2) : -0.4576575543602859
Sec(2) : -2.4029979617223804
Cosec(2) : 1.0997501702946164
2x10^2 : 7.3890560703259105
2! : 2.0
2^2 : 4.0
sqrt(4) : 2.0
2+2 : 4.0
2-4 : -2.0
2*2 : 4.0
4/2 : 2.0
2%4 : 2.0
```
___
## Lab: 05
Q.1 Q. 1.	Design a class named Account that contains: 
•	A private int data field named id for the account (default 0). 
•	A private double data field named balance for the account (default 0).
•	A private double data field named annualInterestRate that stores the current interest rate (default 0). Assume all accounts have the same interest rate. 
•	A private Date data field named dateCreated that stores the date when the account was created.
•	A no-arg constructor that creates a default account. 
•	A constructor that creates an account with the specified id and initial balance. 
•	The accessor and mutator methods for id, balance, and annualInterestRate.
•	The accessor method for dateCreated. 
•	A method named getMonthlyInterestRate() that returns the monthly interest rate. 
•	A method named getMonthlyInterest() that returns the monthly interest. 
•	A method named withdraws that withdraws a specified amount from the account. 
•	A method named deposit that deposits a specified amount to the account. 
 (Hint: Monthly interest is balance * monthlyInterestRate. 
	monthlyInterestRate is annualInterestRate / 12. 
	Note that annualInterestRate is a percentage. You need to divide it by 100.
Write a test program that creates an Account object with an account ID of 1122, a balance of $20,000, and an annual interest rate of 4.5%. Use the withdraw method to withdraw $2,500, use the deposit method to deposit $3,000, and print the balance, the monthly interest, and the date when this account was created.
### Code:
#### Account.java:
```
// Public Account Class
public class Account {
	
    private int id = 0;                              // default value is 0
    private double balance = 0.0;                    // default value is 0
    private static double annualInterestRate = 0.0;  // default value is 0
    private java.util.Date dateCreated;              // Store Date when Account is created

    // Non-argument constructor that creates a default account
    public Account() {
        dateCreated = new java.util.Date();
    }

    // Constructor that creates an account with the specified id and initial balance.
    public Account(int id, double balace) {
        this();
        this.id = id;
        this.balance = balance;
    }

    // Accessor and mutator methods for id, balance, and annualInterestRate.
    
    // For Id
    public int getId() {
        return this.id;
    }

    // For Balance
    public double getBalance() {
        return this.balance;
    }

    // For Annual Interest Rate
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    // Accessor method for dateCreated.
    public String getDateCreated() {
        return this.dateCreated.toString();
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    // getMonthlyInterestRate() Method that returns the monthly interest rate.
    public double getMonthlyInterestRate() {
        return (annualInterestRate / 100) / 12 ;  // Formula: annualInterestRate(in %) / 12. 
    }

    // getMonthlyInterest() Method that returns the monthly interest.
    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }

    // withdraw Method that withdraws a specified amount from the account.
    public void withdraw(double amount) {
        this.balance -= amount;  // Formula: balance - amount
    }

    // deposit Method that deposits a specified amount to the account.
    public void deposit(double amount) {
        this.balance += amount;  // Formula: balance + amount
    }
}
```
#### Lab_05_assignment01.java:
```
// Test Program
public class lab05_assignment01 {

	public static void main(String[] args) {
		
		// creates an Account object with an account ID of 1122 and a balance of $20,000
        Account account = new Account(1122, 20000);      // ( ID: 1122, Balance: 20,000)
        
        // an Annual interest rate of 4.5%
        account.setAnnualInterestRate(4.5);
        
        // withdraw method to withdraw $2,500
        System.out.println("\nWithdrawing $2,500...");
        account.withdraw(2500.0);
        
        // deposit method to deposit $3,000
        System.out.println("\nDepositing $3,000...");
        account.deposit(3000.0);
        
        // print the balance, the monthly interest, and the date when this account was created
        System.out.println("\nDisplaying updated info.");
        System.out.println("\nAccount ID : " + account.getId());
        System.out.println("Account Balance : " + account.getBalance());
        System.out.println("Monthly interest rate : " + account.getMonthlyInterestRate());
        System.out.println("Date account was created : " + account.getDateCreated());
    }
}
```
### Code Output:
```
Withdrawing $2,500...

Depositing $3,000...

Displaying updated info.

Account ID : 1122
Account Balance : 500.0
Monthly interest rate : 0.00375
Date account was created : Mon Oct 04 14:11:34 PKT 2021
```
___
## Lab: 06
Q. 1 Write a Java program that checks whether a given string is a palindrome or not. Ex: MADAM is a palindrome? 
### Code:
```
import java.util.Scanner;

public class palindromeChecker {
	
	public static void main(String args[])
	   {
	      String str, rev = "";
	      
	      // Takes String from user
		  Scanner scan = new Scanner(System.in);
	 
	      System.out.println("Enter a string:");
	      str = scan.nextLine();
	 
	      int length = str.length();
	 
	      for ( int i = length - 1; i >= 0; i-- )
	         rev = rev + str.charAt(i);
	 
	      // If-Else to check weather the string is Palindrome or not.
	      if (str.equals(rev))
	         System.out.println(str+" is a palindrome");
	      else
	         System.out.println(str+" is not a palindrome");
	   }
}
```
### Code Output: 01
```
Enter a string:
OOP-Java Lab manual by H-R-S
OOP-Java Lab manual by H-R-S is not a palindrome
```
### Code Output: 02
```
Enter a string:
civic
civic is a palindrome
```

Q.2 Write a Java program for sorting a given array of numbers in ascending order? 
### Code:
```
import java.util.Scanner;

public class sortingArray {
	    public static void main(String[] args) 
	    {
	    	int count, temp;
	    	
	    	//User inputs the array size
	        Scanner scan = new Scanner(System.in);
	        System.out.print("Enter number of elements you want in the array: ");
	        count = scan.nextInt();
	    
	        int num[] = new int[count];
	        System.out.println("Enter array elements:");
	        for (int i = 0; i < count; i++) 
	        {
	            num[i] = scan.nextInt();
	        }
	        scan.close();
	        for (int i = 0; i < count; i++) 
	        {
	            for (int j = i + 1; j < count; j++) { 
	                if (num[i] > num[j]) 
	                {
	                    temp = num[i];
	                    num[i] = num[j];
	                    num[j] = temp;
	                }
	            }
	        }
	        System.out.print("Array Elements in Ascending Order: ");
	        for (int i = 0; i < count - 1; i++) 
	        {
	            System.out.print(num[i] + ", ");
	        }
	        System.out.print(num[count - 1]);
	        }
}
```
### Code Output:
```
Enter number of elements you want in the array: 5
Enter array elements:
1
3
5
4
2
Array Elements in Ascending Order: 1, 2, 3, 4, 5
```

Q.3 Write a Java program to multiply two given matrices using 2D array.
### Code:
```
public class multiplyingMatrices {
	
	public static void main(String args[]){ 
		
		// Creating two matrices    
		int a[][]={{1,2,3},{4,5,6},{7,8,9}};
		
		int b[][]={{1,2,3},{4,5,6},{7,8,9}};    
		    
		// Creating another matrix to store the multiplication of two matrices    
		int c[][]=new int[3][3];  //3 rows and 3 columns  
		    
		// Multiplying and printing multiplication of 2 matrices using nested loop   
		for(int i=0;i<3;i++) {   
			
			for(int j=0;j<3;j++) {   
				
				c[i][j]=0;      
				
				for(int k=0;k<3;k++) {   
					
					c[i][j]+=a[i][k]*b[k][j];      
				} 
				
				System.out.print(c[i][j]+" ");  //printing matrix element  
			}
			
			System.out.println();//new line    
		}    
	}
}
```
### Code Output:
```
30 36 42 
66 81 96 
102 126 150 
```
___
## Lab: 07
Q.1 Design a class named Person and its two subclasses named Student and Employee. Make Faculty and Staff subclasses of Employee.
(The Person, Student, Employee, Faculty, and Staff classes)
A person has a name, address, phone number, and email address. A student has a class status (freshman, sophomore, junior, or senior). Define the status as a constant. An employee has an office, salary, and date hired. A faculty member has office hours and a rank. A staff member has a title. Override the toString method in each class to display the class name and the person’s name. 
Write a test program that creates a Person, Student, Employee, Faculty, and Staff, and invokes their toString() methods.
### Code:
#### Employee.java:
```
class Employee extends Person {
 private String office;
 private double salary;
 private String hireDate;
 
 public Employee(String name, String address, String phoneNumber, String emailAddress) {
  super(name, address, phoneNumber, emailAddress);
 }
 public String getOffice() {
  return this.office;
 }
 public void setOffice(String office) {
  this.office = office;
 }
 public double getSalary() {
  return this.salary;
 }
 public void setSalary(double salary) {
  this.salary = salary;
 }
 public String getHireDate() {
  return this.hireDate;
 }
 public void setHireDate(String hireDate) {
  this.hireDate = hireDate;
 }
 public String toString() {
  StringBuffer sb = new StringBuffer();
  sb.append(super.toString()+"\n");
  sb.append("\tOffice:").append(office).append("\n");
  sb.append("\tSalary:").append(salary).append("\n");
  sb.append("\tHire Date:").append(hireDate).append("\n"); 
  
  return sb.toString();
 }
}
```
#### Faculty.java:
```
class Faculty extends Employee {
 private String officeHours;
 private String rank;
 public Faculty(String name, String address, String phoneNumber, String emailAddress) {
  super(name, address, phoneNumber, emailAddress);
 }
 public String getOfficeHours() {
  return this.officeHours;
 }
 public void setOfficeHours(String officeHours) {
  this.officeHours = officeHours;
 }
 public String getRank() {
  return this.rank;
 }
 public void setRank(String rank) {
  this.rank = rank;
 }
 public String toString() {
  StringBuffer sb = new StringBuffer();
  sb.append(super.toString()+"\n");
  sb.append("\tOffice Hours:").append(officeHours).append("\n");
  sb.append("\tRank:").append(rank).append("\n");
  return sb.toString();
 }
}
```
#### Person_Info.java:
```
public class Person_Info {

 public static void main(String args[]) throws Exception {
	 
  Person p = new Person(" Amir Liaquat", 
		  " Liaquatabad 2 no. , Karachi, Pakistan", 
		  " 0321-000-0069", 
		  " amirLiaquat@gmail.com");
  
  System.out.println("Person Details are:");
  System.out.println(p.toString());
  
  Student s = new Student(" Muhammad Haris", 
		  " Gulshan-e-Iqbal, Karachi, Pakistan", 
		  " 0311-222-4501", 
		  " muhammad.51379@iqra.edu.pk");
  
  s.setStatus(" Sophomore");
  
  System.out.println("Student Details are:");
  System.out.println(s.toString());
  
  Employee e = new Employee(" Saba Sherazi", 
		  " Defence phase 4, Karachi, Pakistan", 
		  " 044-111-1113", 
		  " sabaSherazi@gmail.com");
  
  e.setOffice(" Bhadurabad");
  e.setSalary(100000);
  e.setHireDate(" 09-02-2021");
  
  System.out.println("Employee Details are:");
  System.out.println(e.toString());
  
  Faculty f = new Faculty(" John Cena",
		  " 69 street, Chicago, United States", 
		  " 9901-284-1222", 
		  " youCan'tSeeMe@johncena.com");
  
  f.setOffice(" Wachington BC");
  f.setSalary(120000);
  f.setHireDate(" 19-06-2021");
  f.setOfficeHours(" Day");
  f.setRank(" Manager");
  
  System.out.println("Faculty Details are:");
  System.out.println(f.toString());
  
  Staff st = new Staff(" Burak Deniz", 
		  " Istaklal street, Istambul, Turkey", 
		  " 882-111-7015", 
		  " BurakDeniz@gmail.com");
  
  st.setOffice(" Blue Mosuqe street");
  st.setSalary(800000);
  st.setHireDate(" 11-02-2021");
  st.setTitle(" Executive Director");
  System.out.println(" Staff Details are:");
  System.out.println(st.toString());
 }
}
```
#### Person.java:
```
class Person {
 private String name;
 private String address;
 private String phoneNumber;
 private String emailAddress;
 
 public Person(String name, String address, String phoneNumber, String emailAddress) {
  this.name = name;
  this.address = address;
  this.phoneNumber = phoneNumber;
  this.emailAddress = emailAddress;
 }
 
 public String getName() {
  return this.name;
 }
 public void setName(String name) {
  this.name = name;
 }
 public String getAddress() {
  return this.address;
 }
 public void setAddress(String address) {
  this.address = address;
 }
 public String getPhoneNumber() {
  return this.phoneNumber;
 }
 public void setPhoneNumber(String phoneNumber) {
  this.phoneNumber = phoneNumber;
 }
 public String getEmailAddress() {
  return this.emailAddress;
 }
 public void setEmailAddress(String emailAddress) {
  this.emailAddress = emailAddress;
 }
 public String toString() {
  StringBuffer sb = new StringBuffer();
  sb.append("\tName :").append(name).append("\n");
  sb.append("\tAddress :").append(address).append("\n");
  sb.append("\tPhone Number :").append(phoneNumber).append("\n");
  sb.append("\tEmail Address :").append(emailAddress).append("\n");
  
  return sb.toString();
 }
}
```
#### Staff.java:
```
class Staff extends Employee {
	
	private String title;
	
	public Staff(String name, String address, 
			String phoneNumber, String emailAddress) {
		super(name, address, phoneNumber, emailAddress);
    }
	
	public String getTitle() {
		
		return this.title;
    }
	
	public void setTitle(String title) {
		
		this.title = title;
    }
	
	public String toString() {
		
		StringBuffer sb = new StringBuffer();
        sb.append(super.toString()+"\n");
        sb.append("\tTitle:").append(title).append("\n");
  
        return sb.toString();
    }
}
```
#### Student.java:
```
class Student extends Person {
	
	private String status;
	
	public Student(String name, String address, 
			String phoneNumber, String emailAddress) {
		
		super(name, address, phoneNumber, emailAddress);
    }
	
	public String getStatus() {
		
		return this.status;
    }
	
	public void setStatus(String status) {
		
		this.status = status;
	}
	
	public String toString() {
		
		StringBuffer sb = new StringBuffer();
		sb.append(super.toString()+"\n");
		sb.append("\tStatus:").append(status).append("\n");  
		
		return sb.toString();
	}
}
```
### Code Output:
```
Person Details are:
	Name : Amir Liaquat
	Address : Liaquatabad 2 no. , Karachi, Pakistan
	Phone Number : 0321-000-0069
	Email Address : amirLiaquat@gmail.com

Student Details are:
	Name : Muhammad Haris
	Address : Gulshan-e-Iqbal, Karachi, Pakistan
	Phone Number : 0311-222-4501
	Email Address : muhammad.51379@iqra.edu.pk

	Status: Sophomore

Employee Details are:
	Name : Saba Sherazi
	Address : Defence phase 4, Karachi, Pakistan
	Phone Number : 044-111-1113
	Email Address : sabaSherazi@gmail.com

	Office: Bhadurabad
	Salary:100000.0
	Hire Date: 09-02-2021

Faculty Details are:
	Name : John Cena
	Address : 69 street, Chicago, United States
	Phone Number : 9901-284-1222
	Email Address : youCan'tSeeMe@johncena.com

	Office: Wachington BC
	Salary:120000.0
	Hire Date: 19-06-2021

	Office Hours: Day
	Rank: Manager

 Staff Details are:
	Name : Burak Deniz
	Address : Istaklal street, Istambul, Turkey
	Phone Number : 882-111-7015
	Email Address : BurakDeniz@gmail.com

	Office: Blue Mosuqe street
	Salary:800000.0
	Hire Date: 11-02-2021

	Title: Executive Director
```

___
## Lab_11
Q. JavaFx Controlls
### Code:
#### JavaFxControls.java:
```
package application;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class JavaFxControls extends Application{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		
		Label  heading= new Label("JavaFx Controls Lab 11");
		heading.setFont(Font.font ("Verdana", 30));
		//heading.setFont(Fon);
		
		//A button with an empty text caption.
		Button button1 = new Button("Wrong");
		//A button with the specified text caption.
		Button button2 = new Button("Accept");
		
		// Using radio buttons

		RadioButton radioButton1 = new RadioButton("Left");
        RadioButton radioButton2 = new RadioButton("Right");
        RadioButton radioButton3 = new RadioButton("Up");
        RadioButton radioButton4 = new RadioButton("Down");

        // using toggle group for single selection of radio buttons
        ToggleGroup radioGroup = new ToggleGroup();

        radioButton1.setToggleGroup(radioGroup);
        radioButton2.setToggleGroup(radioGroup);
        radioButton3.setToggleGroup(radioGroup);
        radioButton4.setToggleGroup(radioGroup);

        // Using CheckBox
        Label l = new Label("What do you listen:     ");  
        CheckBox c1 = new CheckBox("Radio 1");  
        CheckBox c2 = new CheckBox("Radio 106");  
        CheckBox c3 = new CheckBox("Radio");  
        CheckBox c4 = new CheckBox("FM GOLD");  
   
        //using ComboBOx
        Label l2 = new Label("Where do you live:     ");  
        ComboBox<String> comboBox = new ComboBox<String>();

        comboBox.getItems().add("Karachi");
        comboBox.getItems().add("Lahore");
        comboBox.getItems().add("Islamabd");
        comboBox.getItems().add("Peshawar");
        comboBox.getItems().add("Other...");
        
        // using date picker
        Label l3 = new Label("Date : ");  
        DatePicker datePicker = new DatePicker();

     // using ListView
        Label edu= new Label("Education");
		ObservableList<String> items= FXCollections.observableArrayList(
				"Phd", "Master", "Graduate", "Intermediate", "Matric");

		ListView<String> eduList= new ListView<String>(items);
		eduList.setPrefHeight(40);
        
        // adding button
        HBox h = new HBox(20);
		h.getChildren().addAll(button1, button2);
		
		// adding radio button 
        HBox h1 = new HBox(10,radioButton1, radioButton2, radioButton3, radioButton4);
        
        // adding check box
        HBox h2 = new HBox(10);  
        h2.getChildren().addAll(l,c1,c2,c3,c4);  
		// adding Combo box
        HBox h3 = new HBox(10);  
        h3.getChildren().addAll( l2,comboBox); 
		//adding date picker
        HBox h4 = new HBox(10, l3, datePicker);
        
        //adding list view
        HBox h5 = new HBox(10, edu, eduList);
        
        
        VBox v = new VBox(20);
        v.setPadding(new Insets(20));
		v.getChildren().addAll(heading, h1, h2, h3, h4, h5, h);
		
		Scene s = new Scene(v, 500, 500);
		
		stage.setScene(s);
		stage.show();
	}

}
```
___
## Lab_12
Q. JavaFxControls.java:
### Code:
#### FlowPaneExperiments.java
```
package application;
import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class FlowPaneExperiments extends Application  {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("HBox Experiment 1 Lab 12");

        Button button1 = new Button("Button Number 1 (BTN 1)");
        Button button2 = new Button("Button Number 2 (BTN 2)");
        Button button3 = new Button("Button Number 3 (BTN 3)");

        FlowPane flowpane = new FlowPane();

        flowpane.getChildren().add(button1);
        flowpane.getChildren().add(button2);
        flowpane.getChildren().add(button3);

        Scene scene = new Scene(flowpane, 200, 100);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}	
```
Q. GridPaneExperiments
### Code:
#### GridPaneExperiments.java:
```
package application;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GridPaneExperiments extends Application  {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("GridPane Experiment Lab 12");

        Button button1 = new Button("Button 1 (BTN 1)");
        Button button2 = new Button("Button 2 (BTN 2)");
        Button button3 = new Button("Button 3 (BTN 3)");
        Button button4 = new Button("Button 4 (BTN 4)");
        Button button5 = new Button("Button 5 (BTN 5)");
        Button button6 = new Button("Button 6 (BTN 6)");

        GridPane gridPane = new GridPane();

        gridPane.add(button1, 0, 0, 1, 1);
        gridPane.add(button2, 1, 0, 1, 1);
        gridPane.add(button3, 2, 0, 1, 1);
        gridPane.add(button4, 0, 1, 1, 1);
        gridPane.add(button5, 1, 1, 1, 1);
        gridPane.add(button6, 2, 1, 1, 1);

        Scene scene = new Scene(gridPane, 240, 100);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
```
Q. PieChartExperiments
### Code:
#### PieChartExperiments.java
```
package application;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PieChartExperiments extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("OOP Lab Marks Distribution JavaFX App Lab 12");

        PieChart pieChart = new PieChart();

        PieChart.Data slice1 = new PieChart.Data("Assignments", 175);
        PieChart.Data slice2 = new PieChart.Data("Task"  , 100);
        PieChart.Data slice3 = new PieChart.Data("Mids" , 25);
        PieChart.Data slice4 = new PieChart.Data("Finals" , 40);

        pieChart.getData().add(slice1);
        pieChart.getData().add(slice2);
        pieChart.getData().add(slice3);
        pieChart.getData().add(slice4);

        VBox vbox = new VBox(pieChart);

        Scene scene = new Scene(vbox, 400, 200);

        primaryStage.setScene(scene);
        primaryStage.setHeight(300);
        primaryStage.setWidth(1200);

        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
```

___
## Lab_13
Q. Login Screen
### Code
#### Login.java:
```
package application;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Reflection;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
 

public class Login extends Application {
 
	String user = "admin";
	String pw = "password";
	String checkUser, checkPw;
	
    public static void main(String[] args) {
        launch(args);
    }
     
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Login Form by H_R_S (Haris)");
        
        BorderPane bp = new BorderPane();
        bp.setPadding(new Insets(10,50,50,50));
        
        //Adding HBox
        HBox hb = new HBox();
        hb.setPadding(new Insets(20,20,20,30));
        
        //Adding GridPane
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(20,20,20,20));
        gridPane.setHgap(5);
        gridPane.setVgap(5);
        
       //Implementing Nodes for GridPane
        Label lblUserName = new Label("Username");
        final TextField txtUserName = new TextField();
        Label lblPassword = new Label("Password");
        final PasswordField pf = new PasswordField();
        Button btnLogin = new Button("Login");
        final Label lblMessage = new Label();
        
        //Adding Nodes to GridPane layout
        gridPane.add(lblUserName, 0, 0);
        gridPane.add(txtUserName, 1, 0);
        gridPane.add(lblPassword, 0, 1);
        gridPane.add(pf, 1, 1);
        gridPane.add(btnLogin, 2, 1);
        gridPane.add(lblMessage, 1, 2);
        
        //Reflection for gridPane
        Reflection r = new Reflection();
        r.setFraction(0.7f);
        gridPane.setEffect(r);
        
        //DropShadow effect 
        DropShadow dropShadow = new DropShadow();
        dropShadow.setOffsetX(5);
        dropShadow.setOffsetY(5);
        
        //Adding text and DropShadow effect to it
        Text text = new Text("Login Form");
        text.setFont(Font.font ("Verdana", 30));
        
        //Adding text to HBox
        hb.getChildren().add(text);
                          
        //Add ID's to Nodes
        bp.setId("bp");
        gridPane.setId("root");
        btnLogin.setId("btnLogin");
        text.setId("text");
                
        //Action for btnLogin
        btnLogin.setOnAction(new EventHandler<ActionEvent>() {
        	public void handle(ActionEvent event) {
        		checkUser = txtUserName.getText().toString();
        		checkPw = pf.getText().toString();
        		if(checkUser.equals(user) && checkPw.equals(pw)){
        			lblMessage.setText("Congratulations!");
        			lblMessage.setTextFill(Color.GREEN);
        		}
        		else{
        			lblMessage.setText("Incorrect user or password.");
        			lblMessage.setTextFill(Color.RED);
        		}
        		txtUserName.setText("");
        		pf.setText("");
        	}
        	});
       
        //Add HBox and GridPane layout to BorderPane Layout
        bp.setTop(hb);
        bp.setCenter(gridPane);  
        
        //Adding BorderPane to the scene and loading CSS
    	Scene scene = new Scene(bp);
    	primaryStage.setScene(scene);
    	primaryStage.setResizable(false);
    	primaryStage.show();
    }
}
```
Q. Next Screen
### Code:
#### NextPage.java:
```
package application;

import java.time.LocalDate;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class NextPage extends Application  {

	Stage window;
	Scene scene;
	
	public NextPage() {
	
		window= new Stage();
		window.setTitle("Add User (H_R_S)");
		window.setHeight(370);
		window.setWidth(400);
		window.setResizable(false);
		
		addcomponents();
		
		window.setScene(scene);
		window.show();
	
	}
	
	private void addcomponents() {
		//Text heading = new Text("Add User");
		
		Label name= new Label("Name");
		TextField ntext= new TextField();
		
		Label email= new Label("Email");
		TextField etext= new TextField();

		Label gender= new Label("Gender");
		ToggleGroup group= new ToggleGroup();
		RadioButton rmale= new RadioButton("Male");
		RadioButton rfemale= new RadioButton("Female");
		rmale.setToggleGroup(group);
		rfemale.setToggleGroup(group);
		
		Label edu= new Label("Education");
		ObservableList<String> items= FXCollections.observableArrayList(
				"Phd", "Master", "Graduate", "Intermediate", "Matric", "Secondary", "Primaray");

		ListView<String> eduList= new ListView<String>(items);
		eduList.setPrefHeight(40);
		
		
		Label loc= new Label("Location");
		ComboBox<String> locList= new ComboBox<String>();
		locList.getItems().add("Karachi");
		locList.getItems().add("Islamabad");
		locList.getItems().add("Multan");
		locList.getItems().add("Lahore");
		locList.getItems().add("Peshawer");
		locList.getItems().add("Other");
		
		Label dob= new Label("DOB");
		DatePicker date= new DatePicker();
		date.setValue(LocalDate.now());
		
		Button btnsignup= new Button("Add User");
		Button btnclear= new Button("Clear");
				
		GridPane layout= new GridPane();
		layout.setPadding(new Insets(20));
		layout.setVgap(10);
		layout.add(name, 0, 1);
		layout.add(ntext, 1, 1);
		layout.add(email, 0, 2);
		layout.add(etext, 1, 2);
		layout.add(gender, 0, 3);
		layout.add(rmale, 1, 3);
		layout.add(rfemale, 1, 3);
		layout.setMargin(rfemale, new Insets(0, 0, 0 , 80));
		
		layout.add(edu, 0, 4);
		layout.add(eduList, 1, 4);
		layout.add(loc, 0, 5);
		layout.add(locList, 1, 5);
		layout.add(dob, 0, 6);
		layout.add(date, 1, 6);
		layout.add(btnsignup, 1, 7);
		layout.add(btnclear, 1, 7);
		layout.setMargin(btnclear, new Insets(0, 0, 0 , 80));
	
		
		btnsignup.setOnAction(new EventHandler<ActionEvent>() {
			
			public void handle(ActionEvent arg0) {
				Alert alert= new Alert(AlertType.INFORMATION);
				alert.setHeaderText(null);
				alert.setContentText("Added successfully!!");
				alert.show();
			}
		});
		
		 scene= new Scene(layout);	
	}

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		
	}
}
```
Q. Menu Screen
### Code:
#### MenuTest.java:
```
package application;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioMenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class MenuTest extends Application {

  @Override
  public void start(Stage primaryStage) {
    BorderPane root = new BorderPane();
    Scene scene = new Scene(root, 300, 250, Color.WHITE);

    MenuBar menuBar = new MenuBar();
    menuBar.prefWidthProperty().bind(primaryStage.widthProperty());
    root.setTop(menuBar);

    // File menu - new, save, exit
    Menu fileMenu = new Menu("File");
    MenuItem newMenuItem = new MenuItem("New");
    MenuItem saveMenuItem = new MenuItem("Save");
    MenuItem exitMenuItem = new MenuItem("Exit");
    exitMenuItem.setOnAction(actionEvent -> Platform.exit());

    fileMenu.getItems().addAll(newMenuItem, saveMenuItem,
        new SeparatorMenuItem(), exitMenuItem);

    Menu webMenu = new Menu("Web");
    CheckMenuItem htmlMenuItem = new CheckMenuItem("HTML");
    htmlMenuItem.setSelected(true);
    webMenu.getItems().add(htmlMenuItem);

    CheckMenuItem cssMenuItem = new CheckMenuItem("CSS");
    cssMenuItem.setSelected(true);
    webMenu.getItems().add(cssMenuItem);

    Menu sqlMenu = new Menu("SQL");
    ToggleGroup tGroup = new ToggleGroup();
    RadioMenuItem mysqlItem = new RadioMenuItem("MySQL");
    mysqlItem.setToggleGroup(tGroup);

    RadioMenuItem oracleItem = new RadioMenuItem("Oracle");
    oracleItem.setToggleGroup(tGroup);
    oracleItem.setSelected(true);

    sqlMenu.getItems().addAll(mysqlItem, oracleItem,
        new SeparatorMenuItem());

    Menu tutorialManeu = new Menu("Tutorial");
    tutorialManeu.getItems().addAll(
        new CheckMenuItem("Java"),
        new CheckMenuItem("JavaFX"),
        new CheckMenuItem("Swing"));

    sqlMenu.getItems().add(tutorialManeu);

    menuBar.getMenus().addAll(fileMenu, webMenu, sqlMenu);

    primaryStage.setScene(scene);
    primaryStage.show();
  }
  public static void main(String[] args) {
    launch(args);
  }
}
```
