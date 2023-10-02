import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.IOException;

public class Project_Dany_Babikerali
{
   public static void main(String[] args)
   {
                    
     try { 
      File file = new File("PolicyInformation.txt");
      Scanner inputFile = new Scanner(file);
      
      //Creating an arrayList
      ArrayList<Policy> policyList = new ArrayList<>();
      
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
         
         if (sStatus == "smoker") {
            noOfSmokers += 1;
         }
         if (sStatus == "non-smoker") {
            noOfNonS += 1;
         }
         
         policyList.add(new Policy(pNumber, pName, pfName, plName, pAge, sStatus, pHeight, pWeight));
       }
      System.out.println(file);
     }
     catch(IOException ex) {//If something goes wrong, an IOException is "thrown" to us, and we "catch" it and deal with it
     
         //use the getMessage method of the exception we "caught" to print out it's message about what went wrong
         System.out.println("Something went wrong reading the file: " + ex.getMessage());
     }
   for(Policy policy : policyList) {
      

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
      System.out.println("The number of policies with a smoker is: " + noOfSmokers);
      System.out.println("The number of policies with a smoker is: " + noOfNonS);
    }  

	}
}