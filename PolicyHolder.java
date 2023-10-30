public class PolicyHolder {
   private String FirstName;
   private String LastName;
   private int age;
   private String smokingStatus;
   private double height;
   private double weight;
   
   
   /**
   No-Arg Constructor
   */
   public PolicyHolder() {
      FirstName = "";
      LastName = "";
      age = 0;
      smokingStatus = "";
      height = 0;
      weight = 0;
   }
   
   
   /**
   Constructor with arguments
   @param fName The Policyhodler's first name
   @param lName The Policyholder's last name
   @param a The Policyholder's age
   @param sStatus The Policyholder's smoking status
   @param h The Policyholder's height
   @param w The Policytholder's weight
   */
   public PolicyHolder(String FirstName, String LastName, int age, String smokingStatus, double height, double weight) {
      this.FirstName = FirstName;
      this.LastName = LastName;
      this.age = age;
      this.smokingStatus = smokingStatus;
      this.height = height;
      this.weight = weight;
   }
   
   
   /**
      Copy Constructor
      @param obj a PolicyHolder object to copy of
   */
   public PolicyHolder(PolicyHolder obj) {
      FirstName = obj.FirstName;
      LastName = obj.LastName;
      age = obj.age;
      smokingStatus = obj.smokingStatus;
      height = obj.height;
      weight = obj.weight;
   }
   
   
   /**
   @return The Policyholder's first name
   */
   public String getFirstName()
   {
      return FirstName;
   }
   
   /**
   @return The Policyholder's last name
   */
   public String getLastName()
   {
      return LastName;
   }
   
   /**
   @return The Policyholder's age
   */
   public int getAge()
   {
      return age;
   }
   
   /**
   @return The Policyholder's smoking status
   */
   public String getSmokingStatus()
   {
      return smokingStatus;
   }
   
   /**
   @return The Policyholder's height
   */
   public double getHeight()
   {
      return height;
   }
   
   /**
   @return The Policyholder's weight
   */
   public double getWeight()
   {
      return weight;
   }
   
   /**
   @param fName The Policy Provider's first name
   */
   public void setFirstName(String fName)
   {
      FirstName = fName;
   }
   
   /**
   @param lName The Policy Provider's last name
   */
   public void setLastName(String lName)
   {
      LastName = lName;
   }
   
   /**
   @param a The Policy Provider's age
   */
   public void setAge(int a)
   {
      age = a;
   }
   
   /**
   @param sStatus The Policy Provider's smoking status
   */
   public void setSmokingStatus(String sStatus)
   {
      smokingStatus = sStatus;
   }
   
   /**
   @param h The Policy Provider's height
   */
   public void setHeight(double h)
   {
      height = h;
   }
   
   /**
   @param w The Policy Provider's weight
   */
   public void setWeight(double w)
   {
      weight = w;
   }
   
   /**
   Calculates the Policyholder's BMI
   @return The BMI of the Policyholder
   */
   public double getBMI()
   {
      final double CONVFACTOR = 703;
      
      return (weight * CONVFACTOR) / (height * height);
   }

   public String toString() {
      return "Policyholder's First Name: " + FirstName + "\n"
             + "Policyholder's Last Name:  " + LastName + "\n"
             + "Policyholder's Age: " + age + "\n"
             + "Policyholder's Smoking Status: " + smokingStatus + "\n"
             + "Policyholder's Height:  " + height + "\n"
             + "Policyholder's Weight: " + weight + "\n"
             + "Policyholder's BMI: " + getBMI();
   }   
   
}//End of Class