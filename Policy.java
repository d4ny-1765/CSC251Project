public class Policy
{
   //Defining all of the class's attributed.
   private String number;
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
      number = "unknown";
      name = "unknown";
      fName = "unknown";
      lName = "unknown";
      age = -1;
      smokeStat = "unknown";
      height = 0.0;
      weight = 0.0;
   }
   
   //constructor with arguments
   public Policy(String number, String name, String fName, String lName, int age, String smokeStat, double height, double weight)
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
   /**
   * @param number - Policy number for displaying
   */
   public void setNumber(String number)
   {
      this.number = number;
   }
   //setter method for name
    /**
   * @param number - Policy name for displaying
   */
   public void setName(String name)
   {
      this.name = name;
   }
   //setter method for first Name
    /**
   * @param number - Policy holder's fisrt Name for displaying
   */
   public void setfName(String fName)
   {
      this.fName = fName;
   } 
   //setter method for last name
   /**
   * @param number - Policy holder's last Name for displaying
   */
   public void setlName(String lName)
   {
      this.lName = lName;
   }  
   //setter method for age
   /**
   * @param number - Policy holder's age for displaying
   */
   public void setAge(int age)
   {
      this.age = age;
   }
   
   //setter method for smoking status
   /**
   * @param number - Policy holder's smokeStatus for displaying
   */
   public void setSmokeStat(String smokeStat)
   {
      this.smokeStat = smokeStat;
   }
   //setter method for height
   /**
   * @param number - Policy holder's height for displaying
   */
   public void setHeight(double height) 
   {
      this.height = height;
   }
   
   //setter method for weight
   /**
   * @param number - Policy holder's weight for displaying
   */
   public void setWeight(double weight)
   {
      this.weight = weight;
   }
   //getter method for number
   /**
   * @return the Policy's number
   */
   public String getNumber(){   
      return number;
   }
   
   //getter method for name
   /**
   * @return the Policy's name
   */
   public String getName() {
      return name;
   }
   
   //getter method for first Name
   /**
   * @return the Policy holder's first name
   */
   public String getfName(){
      return fName;
   }
   //getter method for last name
   /**
   * @return the Policy holder's last name
   */
   public String getlName(){
      return lName;
   }
   //getter method for age
   /**
   * @return the Policy holder's age
   */
   public int getAge() {
      return age;
   }
  
   //getter method for smoking status
   /**
   * @return the Policy holder's smoking status
   */
   public String getSmokeStatus() {
      return smokeStat;
   }
   //getter method for height
   /**
   * @return the Policy holder's height
   */
   public double getHeight(){
      return height;
   }
   //getter method for weight
   /**
   * @return the Policy holder's weight
   */
   public double getWeight() {
      return weight;
   }
   
   //Method that returns BMI of the policyholder BMI = (weight * 703)/(height * height)
   /**
   * @return the Policy holder's BMI
   */
   public double getBMI() {
      return (weight * 703)/(height * height);
   }
   //Method for price of insurace policy:
   /**
   * @return the price of the insurance policy
   */
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