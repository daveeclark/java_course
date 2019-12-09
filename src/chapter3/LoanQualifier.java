package chapter3;

import java.util.Scanner;

public class LoanQualifier {

  public static void main(String[] args) {

    //Initialize what we know
    int requiredSalary = 30000;
    int requiredYearsEmployed =2;


    //Get what we don't
    System.out.println("Enter your salary: ");
    Scanner scanner = new Scanner(System.in);
    double salary = scanner.nextDouble();

    System.out.println("Enter number of years with current employer: ");
    double years = scanner.nextDouble();


    //Make decision
    if(salary >= requiredSalary){
      if(years >= requiredYearsEmployed){
        System.out.println("Requirements met, you qualify for loan!");
        } else {
          System.out.println("Sorry, you must have worked at least " + requiredYearsEmployed + " years at your current job.");
        }
    } else {
      System.out.println("Sorry, you must earn at least " + requiredSalary + " to qualify.");
    }

  }

}
