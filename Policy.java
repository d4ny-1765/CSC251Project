public class Policy
{
   //Defining all of the class's attributed.
   private int number;
   private String name;
   private String fName;
   private String lName;
   private int age;
   private String smokeStat;
   private double height;
   private double weight;
   
   //no-arg constructor
   public Policy()
   {
      number = -1;
      name = "unknown";
      fName = "unknown";
      lName = "unknown";
      age = -1;
      smokeStat = "unknown";
      height = 0.0;
      weight = 0.0;
   }
   
   //constructor with arguments
   public Policy(int number, String name, String fName, String lName, int age, String smokeStat, double height, double weight)
   {
      this.number = number;
      this.name = name;
      this.fName = fName;
      this.lName = lName;
      this.age = age;
      this.smokeStat = smokeStat;
      this.height  = height;
      this.weight = weight;
   }
   
   //setter method for number
   public void setNumber(int number)
   {
      this.number = number;
   }
   //setter method for name
   public void setName(String name)
   {
      this.name = name;
   }
   //setter method for first Name
   public void setfName(String fName)
   {
      this.fName = fName;
   } 
   //setter method for last name
   public void setlName(String lName)
   {
      this.lName = lName;
   }  
   //setter method for age
   public void setAge(int age)
   {
      this.age = age;
   }
   
   //setter method for smoking status
   public void setSmokeStat(String smokeStat)
   {
      this.smokeStat = smokeStat;
   }
   //setter method for height
   public void setHeight(double height) 
   {
      this.height = height;
   }
   
   //setter method for weight
   public void setWeight(double weight)
   {
      this.weight = weight;
   }
   //getter method for number
   public int getNumber(){   
      return number;
   }
   
   //getter method for name
   public String getName() {
      return name;
   }
   
   //getter method for first Name
   public String getfName(){
      return fName;
   }
   //getter method for last name
   public String getlName(){
      return lName;
   }
   //getter method for age
   public int getAge() {
      return age;
   }
  
   //getter method for smoking status
   public String getSmokeStatus() {
      return smokeStat;
   }
   //getter method for height
   public double getHeight(){
      return height;
   }
   //getter method for weight
   public double getWeight() {
      return weight;
   }
   
   //Method that returns BMI of the policyholder BMI = (weight * 703)/(height * height)
   public double getBMI() {
      return (weight * 703)/(height * height);
   }
   //Method for price of insurace policy:
   public double getPrice() {
      //define constant for base fee ($600)
      final double BASE_FEE = 600.00;
      //define price and initialize with base fee
      double price = BASE_FEE;
      //if age > 50, add $75 to the price
      if (age>50) {
            price += 75;
      }
      //if smoker, add $100 to the price
      if (smokeStat == "smoker") {
         price += 100;
      }
      //if BMI > 35, additional fee = (BMI - 35)*20. add additional fee to price
      if (getBMI() > 35) {
         double addFee = (getBMI() - 35) * 20;
         price += addFee;
      }
      return price;
   }
      
      
   
   
}