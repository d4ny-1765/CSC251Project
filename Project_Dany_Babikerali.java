import java.util.Scanner;
public class Project_Dany_Babikerali
{
   public static void main(String[] args)
   {
      //Defining The Scanner Class
      Scanner scnr = new Scanner(System.in);
      
      //Requesting inputs
      System.out.print("Enter the Policy Number: ");
      int number = scnr.nextInt();
      scnr.nextLine();
      
      System.out.println();
      
      System.out.print("Enter the Provier's Name: ");
      String name = scnr.nextLine();
      
      System.out.println();
      
      System.out.print("Enter your First Name: ");
      String fName = scnr.nextLine();
      
      System.out.println();
      
      System.out.print("Enter your Last Name: ");
      String lName = scnr.nextLine();
     
      System.out.println();
      
      System.out.print("Enter your age: ");
      int age = scnr.nextInt();
      scnr.nextLine();
      
      System.out.println();
      
      System.out.print("Do you smoke? (type 'smoker' if yes): ");
      String smokeStat = scnr.nextLine();
      
      System.out.println();
      
      System.out.print("Enter your height (in inches): ");
      double height = scnr.nextDouble();
      scnr.nextLine();
      
      System.out.println();
      
      System.out.print("Enter your weight (in pounds): ");
      double weight = scnr.nextDouble();
      scnr.nextLine();
      
      System.out.println();
      
      //Defining the Policy Class
      Policy p = new Policy(number, name, fName, lName, age, smokeStat, height, weight);

      //Displaying the Information 
      System.out.println("Policy Number: " + p.getNumber());           
      System.out.println("Provider Name: " + p.getName());
      System.out.println("Policyholder’s First Name: " + p.getfName());
      System.out.println("Policyholder’s Last Name: " + p.getlName());
      System.out.println("Policyholder’s Age: " + p.getAge());
      System.out.println("Policyholder’s Smoking Status: " + p.getSmokeStatus());
      System.out.println("Policyholder’s Height: " + p.getHeight());
      System.out.println("Policyholder’s Weight: " + p.getWeight());
      System.out.println("Policyholder’s BMI: " + String.format("%.2f", p.getBMI()));
      System.out.println("Policy Price: $" + String.format("%.2f", p.getPrice()));
	}
}