import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.IOException;

public class Project_Dany_Babikerali
{
   public static void main(String[] args) throws IOException
   {
      String policyNumber;
      String providerName;
      String firstName;
      String lastName;
      int age;
      String smokingStatus;
      double height;
      double weight;
      int numSmokers = 0;
      
      //ArrayList to store Policy Objects
      ArrayList<Policy> policyList = new ArrayList<Policy>();
      
      //Create and open the file
      File file = new File("PolicyInformation.txt");
      Scanner inputFile = new Scanner(file);
      
      //process all information in the file
      while(inputFile.hasNext())
      {
      
         policyNumber = inputFile.nextLine();
         providerName = inputFile.nextLine();
         firstName = inputFile.nextLine();
         lastName = inputFile.nextLine();
         age = inputFile.nextInt();
         inputFile.nextLine();
         smokingStatus = inputFile.nextLine();
         height = inputFile.nextDouble();
         weight = inputFile.nextDouble();
         
         //skip the blank line
         if(inputFile.hasNext())
            inputFile.nextLine();
         if(inputFile.hasNext())
            inputFile.nextLine();
            
         //create a Policy object and add it to our ArrayList
         PolicyHolder ph = new PolicyHolder(firstName, lastName, age, smokingStatus, height, weight);
         policyList.add(new Policy(policyNumber, providerName, ph));
         
      }//End of while loop
      
      //print out information about each Policy object
      for(Policy policy : policyList) {
         
         //display information about Policy
         System.out.println(policy);
         System.out.println();
         
         if(policy.ph.getSmokingStatus().equalsIgnoreCase("smoker"))//keep track of the number of smokers
            numSmokers++;
      }//End of for loop
      
      //print out the number of smokers and non-smokers
      System.out.println("There were " + Policy.policyCreated + " Policy objects created.\n");
      System.out.println("The number of policies with a smoker is: " + numSmokers);
      System.out.println("The number of policies with a non-smoker is: " + (policyList.size() - numSmokers) );  

	}// End of main method
}//End of class