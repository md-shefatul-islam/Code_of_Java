import java.lang.*;

import java.util.*;

import classes.*;

import interfaces.*;

import fileio.*;

 

public class Start

{

              public static void main(String args[])

              {

                           Scanner sc = new Scanner(System.in);

                           Bank b = new Bank();

                           FileReadWriteDemo frwd = new FileReadWriteDemo();

                          

                           System.out.println("Welcome to our Console Bank Project");

                          

                           boolean repeat = true;

                          

                           while(repeat)

                           {

                                         System.out.println("What do you want to do?\n");

                                         System.out.println("    1. Employee Management");

                                         System.out.println("    2. Customer Management");

                                         System.out.println("    3. Account Transaction");

                                         System.out.println("    4. Exit\n");

 

                                         System.out.print("Your Choice: ");

                                         int choice = sc.nextInt();

                                        

                                         switch(choice)

                                         {

                                                       case 1:

                                                      

                                                                    System.out.println("--------------------------------");

                                                                    System.out.println("You have choosen Employee Management");

                                                                   

                                                                    System.out.println("Choose any one Option from the followings\n");

                                                                    System.out.println("    1. Insert New Employee");

                                                                    System.out.println("    2. Remove Existing Employee");

                                                                    System.out.println("    3. Show All Employees");

                                                                    System.out.println("    4. Go Back\n");

                                                                   

                                                                    System.out.print("Your Option: ");

                                                                    int option1 = sc.nextInt();

                                                                   

                                                                    switch(option1)

                                                                    {

                                                                                  case 1:

                                                                                 

                                                                                                System.out.println("\n\n\n");

                                                                                                System.out.println("Insert New Employee");

                                                                                               

                                                                                                System.out.print("Enter Employee ID: ");

                                                                                                String empId1 = sc.next();

                                                                                                System.out.print("Enter Employee Name: ");

                                                                                                String name1 = sc.next();

                                                                                                System.out.print("Enter Employee Salary: ");

                                                                                                double salary1 = sc.nextDouble();

                                                                                               

                                                                                                Employee e1 = new Employee();

                                                                                                e1.setEmpId(empId1);

                                                                                                e1.setName(name1);

                                                                                                e1.setSalary(salary1);

                                                                                               

                                                                                                b.insertEmployee(e1);

                                                                                               

                                                                                                System.out.println("\n\n\n");

                                                                                                break;

                                                                                               

                                                                                 

                                                                                               

                                                                                  case 2:

                                                                                 

                                                                                                System.out.println("Remove Existing Employee");

                                                                                              

                                                                                                System.out.print("Enter Employee ID: ");

                                                                                                String empId3 = sc.next();

                                                                                               

                                                                                                Employee e3 = b.getEmployee(empId3);

                                                                                               

                                                                                                if(e3 != null)

                                                                                                {

                                                                                                             b.removeEmployee(e3);

                                                                                                }

                                                                                                System.out.println("\n\n\n");

                                                                                                break;

                                                                                               

                                                                                  case 3:

                                                                                 

                                                                                                System.out.println("Show All Employees");

                                                                                                b.showAllEmployees();

                                                                                                System.out.println("\n\n\n");

                                                                                                break;

                                                                                               

                                                                                  case 4:

                                                                                 

                                                                                                System.out.println("Going Back......");

                                                                                                System.out.println("\n\n\n");

                                                                                                break;

                                                                                               

                                                                                  default:

                                                                                 

                                                                                                System.out.println("XXXXXXXXXXXXXXXXXXXXX");

                                                                                                System.out.println("Invalid Option");

                                                                                                System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXX");

                                                                                                break;

                                                                    }

                                                                   

                                                                     System.out.println("******************************");

                                                                    break;

                                                                   

                                                       case 2:

                                                      

                                                                     System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");

                                                                    System.out.println("You have choosen Customer Management");

                                                                   

                                                                    System.out.println("Choose any one Option from the followings:\n");

                                                                    System.out.println("    1. Insert New Customer");

                                                                    System.out.println("    2. Remove Existing Customer");

                                                                    System.out.println("    3. Show All Customers");

                                                                    System.out.println("    4. Go Back\n");

                                                                   

                                                                    System.out.print("Your Option: ");

                                                                    int option2 = sc.nextInt();

                                                                   

                                                                    switch(option2)

                                                                    {

                                                                                  case 1:

                                                                                 

                                                                                                System.out.println("\n\n\n");

                                                                                                System.out.println("Insert New Customer");

                                                                                               

                                                                                                System.out.print("Enter Customer NID: ");

                                                                                                int nid1 = sc.nextInt();

                                                                                                System.out.print("Enter Customer Name: ");

                                                                                               String name1 = sc.next();

                                                                                               

                                                                                               

                                                                                                Customer c1 = new Customer();

                                                                                                c1.setNid(nid1);

                                                                                                c1.setName(name1);

                                                                                 

                                                                                                b.insertCustomer(c1);

                                                                                               

                                                                                                System.out.println("\n\n\n");

                                                                                                break;

                                                                                               

 

                                                                                               

                                                                                  case 2:

                                                                                 

                                                                                                System.out.println("Remove Existing Customer");

                                                                                               

                                                                                                System.out.print("Enter Customer NID: ");

                                                                                                int nid3 = sc.nextInt();

                                                                                               

                                                                                                Customer c3 = b.getCustomer(nid3);

                                                                                               

                                                                                                if(c3 != null)

                                                                                                {

                                                                                                             b.removeCustomer(c3);

                                                                                                }

                                                                                                System.out.println("\n\n\n");

                                                                                                break;

                                                                                               

                                                                                  case 3:

                                                                                 

                                                                                                System.out.println("Show All Customers");

                                                                                                b.showAllCustomers();

                                                                                                System.out.println("\n\n\n");

                                                                                                break;

                                                                                               

                                                                                  case 4:

                                                                                 

                                                                                                System.out.println("Going Back......");

                                                                                                System.out.println("\n\n\n");

                                                                                                break;

                                                                                               

                                                                                  default:

                                                                                 

                                                                                                System.out.println("\n\n");

                                                                                                System.out.println("Invalid Option");

                                                                                                System.out.println("\n\n");

                                                                                                break;

                                                                    }

                                                                   

                                                                     System.out.println("***********************************");

                                                                    break;

                                                                   

                                                      

                                                       case 3:

                                                      

                                                                    System.out.println("--------------------------------");

                                                                    System.out.println("You have choosen Account Transactions");

                                                                   

                                                                    System.out.println("Choose any one Option from the followings:\n");

                                                                    System.out.println("    1. Deposit Money");

                                                                    System.out.println("    2. Withdraw Money");

                                                                    System.out.println("    5. Going Back\n");

                                                                   

                                                                    System.out.print("Your Option: ");

                                                                    int option3 = sc.nextInt();

                                                                   

                                                                    switch(option3)

                                                                    {

                                                                                  case 1:

                                                                                                System.out.println("Deposit Money");

                                                                                                System.out.print("Enter Customer NID: ");

                                                                                                int nid1 = sc.nextInt();

                                                                                                System.out.print("Enter Account Number: ");

                                                                                                int an1 = sc.nextInt();

                                                                                                System.out.print("Enter Deposit Amount: ");

                                                                                                double amount1 = sc.nextDouble();

                                                                                               

                                                                                                if(amount1>0)

                                                                                                {

                                                                                                              b.getCustomer(nid1).getAccount(an1).deposit(amount1);

                                                                                                             frwd.writeInFile("$"+amount1+" has been Deposited in Account Number "+ an1);

                                                                                                             frwd.writeInFile("Deposit: $"+amount1+" in "+an1);

                                                                                                }

                                                                                                System.out.println("#########################");

                                                                                                break;

                                                                                               

                                                                                  case 2:

                                                                                 

                                                                                                System.out.println("#########################");

                                                                                                System.out.println("Withdraw Money");

                                                                                                System.out.print("Enter Customer NID: ");

                                                                                                int nid2 = sc.nextInt();

                                                                                                System.out.print("Enter Account Number: ");

                                                                                                int an2 = sc.nextInt();

                                                                                                System.out.print("Enter Withdraw Amount: ");

                                                                                                double amount2 = sc.nextDouble();

                                                                                               

                                                                                                if(amount2>0 && amount2<=b.getCustomer(nid2).getAccount(an2).getBalance())

                                                                                                {

                                                                                                              b.getCustomer(nid2).getAccount(an2).withdraw(amount2);

                                                                                                             frwd.writeInFile("$"+amount2+" has been Withdrawn from Account Number "+ an2);

                                                                                                }

                                                                                                System.out.println("#########################");

                                                                                                break;

                                                                                     

                                                                                  case 3:

                                                                                 

                                                                                                System.out.println("\n\n\n");

                                                                                                System.out.println("Going Back");

                                                                                                System.out.println("\n\n\n");

                                                                                                break;


                                                                                    case 4:

                                                                                 

                                                                                                System.out.println("#########################");

                                                                                                System.out.println("Show Transaction History\n");

                                                                                                frwd.readFromFile();

                                                                                                System.out.println("\n#########################");

                                                                                                break;   

                                                                                  default:

                                                                                 

                                                                                                System.out.println("XXXXXXXXXXXXXXXXXXXXX");

                                                                                                System.out.println("Invalid Option");

                                                                                                System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXX");

                                                                                 

                                                                    }

                                                                   

                                                                    System.out.println("--------------------------------");

                                                                    break;

                                                                   

                                                       case 4:

                                                      

                                                                    System.out.println("--------------------------------");

                                                                    System.out.println("You have choosen to Exit");

                                                                    repeat = false;

                                                                    System.out.println("--------------------------------");

                                                                    break;

                                                                   

                                                       default:

                                                      

                                                                    System.out.println("--------------------------------");

                                                                    System.out.println("Invalid Choice");

                                                                    System.out.println("--------------------------------");

                                                                    break;

                                         }

                                        

                                        

                           }

                          

                          

              }

}