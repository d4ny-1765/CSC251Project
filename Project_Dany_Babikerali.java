import java.util.*; 
import java.io.*;

public class Project_Dany_Babikerali
{
   public static void main(String[] args)
   {
               //Defining The Scanner Class
               //Scanner scnr = new Scanner(System.in);
               
               //Requesting inputs
      //System.out.print("Enter the Policy Number: ");
               //String number = scnr.nextLine();
               //scnr.nextLine();
               
               //System.out.println();
              
               //System.out.print("Enter the Provier's Name: ");
               //String name = scnr.nextLine();
               
               //System.out.println();
               
               //System.out.print("Enter your First Name: ");
               //String fName = scnr.nextLine();
               
               //System.out.println();
               
               //System.out.print("Enter your Last Name: ");
               //String lName = scnr.nextLine();
              
               //System.out.println();
               
               //System.out.print("Enter your age: ");
               //int age = scnr.nextInt();
               //scnr.nextLine();
               
               //System.out.println();
               
               //System.out.print("Do you smoke? (type 'smoker' if yes): ");
               //String smokeStat = scnr.nextLine();
               
               //System.out.println();
               
               //System.out.print("Enter your height (in inches): ");
               //double height = scnr.nextDouble();
               //scnr.nextLine();
               
               //System.out.println();
               
               //System.out.print("Enter your weight (in pounds): ");
               //double weight = scnr.nextDouble();
               //scnr.nextLine();
               
               //System.out.println();
      
      //Defining the Policy Class
      //Policy p = new Policy(number, name, fName, lName, age, smokeStat, height, weight);
      
     try { 
      File file = new File("PolicyInformation.txt");
      Scanner inputFile = new Scanner(file);
      
      
      int noOfSmokers = 0;
      int noOfNonS = 0;
      String pNumber = "";
      String pName = "";
      String pfName = "";
      String plName = "";
      int pAge = 0;
      String sStatus = "";
      double pHeight = 0;
      double pWeight = 0;
      
      while (inputFile.hasNext()) {
         pNumber = inputFile.nextLine();
         pName = inputFile.nextLine();
         pfName = inputFile.nextLine();
         plName = inputFile.nextLine();
         pAge = inputFile.nextInt();
         sStatus = inputFile.nextLine();
         pWeight = inputFile.nextDouble();
         
         if(inputFile.hasNext()) {
            inputFile.nextLine();
            inputFile.nextLine();
         }
         
         Policy policy = new Policy(pNumber, pName, pfName, plName, pAge, sStatus, pHeight, pWeight);
         if (sStatus == "smoker") {
            noOfSmokers += 1;
         }
         if (sStatus == "non-smoker") {
            noOfNonS += 1;
         }
       }
      System.out.println(file);
     }
     catch(IOException ex) {//If something goes wrong, an IOException is "thrown" to us, and we "catch" it and deal with it
     
         //use the getMessage method of the exception we "caught" to print out it's message about what went wrong
         System.out.println("Something went wrong reading the file: " + ex.getMessage());
     }

      System.out.println("Policy Number: " + policy.getNumber());           
      System.out.println("Provider Name: " + policy.getName());
      System.out.println("Policyholder’s First Name: " + policy.getfName());
      System.out.println("Policyholder’s Last Name: " + policy.getlName());
      System.out.println("Policyholder’s Age: " + policy.getAge());
      System.out.println("Policyholder’s Smoking Status: " + policy.getSmokeStatus());
      System.out.println("Policyholder’s Height: " + policy.getHeight());
      System.out.println("Policyholder’s Weight: " + policy.getWeight());
      System.out.println("Policyholder’s BMI: " + String.format("%.2f", policy.getBMI()));
      System.out.println("Policy Price: $" + String.format("%.2f", policy.getPrice()));
      
      //Displaying the Information 
      
      //System.out.println("Policy Number: " + p.getNumber());           
      //System.out.println("Provider Name: " + p.getName());
      //System.out.println("Policyholder’s First Name: " + p.getfName());
      //System.out.println("Policyholder’s Last Name: " + p.getlName());
      //System.out.println("Policyholder’s Age: " + p.getAge());
      //System.out.println("Policyholder’s Smoking Status: " + p.getSmokeStatus());
      //System.out.println("Policyholder’s Height: " + p.getHeight());
      //System.out.println("Policyholder’s Weight: " + p.getWeight());
      //System.out.println("Policyholder’s BMI: " + String.format("%.2f", p.getBMI()));
      //System.out.println("Policy Price: $" + String.format("%.2f", p.getPrice()));
	}
}